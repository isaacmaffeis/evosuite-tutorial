# V019

I added the final state condition to make the scenarios more interesting.

```
public boolean isFinalState() {
    return this.getTotale() >= 50 &&
            this.stato>=5 &&
            this.esecuzione.statoCassa.oldValue.equals(Stati.CHIUSO);
}
```

We can notice that adding the final state condition helps evosuite to generate more 
interesting scenarios, even if it's not strictly necessary.

In this way evosuite has generated 1 less scenario, but the other 3 are more interesting. 
The coverage percentage is practically identical.

In conclusion, we can leave the choice to the user to insert a final state condition in case he
wants to force evosuite to follow a specific goal, otherwise he can leave it by default without 
a final state condition.

## Problems

- There are still test cases that are not scenarios
- This system is more complicated and for now only handles enumerative values
- Evosuite does not reach 100% coverage
- Asm on java works differently from Asmeta, in fact at each step it requires the value of all 
the monitored functions, instead Asmeta only does it with those that are needed in that state,
it follows that we have many useless sets that influence the readability of the scenario,
but not its functionality which remains correct. 
  - another thing that comes from this is the coverage, in fact evosuite with these sets is able to
  access the various branches but in fact they are sets that do not always materialize


## How to
```shell
mvn compile
```
```shell
mvn dependency:copy-dependencies -DincludeScope=runtime
```
```shell
java -jar evosuite-1.0.6.jar -setup target/classes target/dependency/commons-collections-3.2.2.jar
```
```shell
java -jar .\evosuite-1.0.6.jar -class org.evoservice.RegistroDiCassa.RegistroDiCassav3_ASM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=150
```

### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.RegistroDiCassa.RegistroDiCassav3_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 20743
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.RegistroDiCassa.RegistroDiCassav3_ASM
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  - Line 100
  - Branch 66
    [Progress:>                             0%] [Cov:>                                  0%]* Using seed 1725035495316
* Starting evolution
  [Progress:==============================100%] [Cov:================================>  93%]
* Search finished after 152s and 1757 generations, 504254 statements, best individual has fitness: 5.75
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 97%
* Total number of goals: 100
* Number of covered goals: 97
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 89%
* Total number of goals: 66
* Number of covered goals: 59
* Generated 5 tests with total length 31
* Resulting test suite's coverage: 93% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'RegistroDiCassav3_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
<State 1 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 0
outMess = null
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set pizzaInserita = marinara
Set quantita' = 1
Set prezzo = 1
</State 1 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
totale = 0
outMess = Scegli il tipo di pizza desiderata:
Servizio NEWORDINE covered
AggiungiPizza SI covered
SelezioneTipoDiPizza OTHER covered
Stato SCEGLI_TIPO_DI_PIZZA covered
<State 2 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
totale = 0
outMess = Scegli il tipo di pizza desiderata:
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set pizzaInserita = marinara
Set quantita' = 1
Set prezzo = 1
</State 2 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
totale = 0
outMess = Inserisci il nome di una nuova pizza:
Servizio NEWORDINE covered
AggiungiPizza SI covered
SelezioneTipoDiPizza OTHER covered
Stato ALTRAPIZZA_SELEZIONATA covered
```
#### Avalla
```
```
### test1
```
<State 1 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 0
outMess = null
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = STANDARD
Set pizzaInserita = marinara
Set quantita' = 1
Set prezzo = 1
</State 1 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
totale = 0
outMess = Scegli il tipo di pizza desiderata:
Servizio NEWORDINE covered
AggiungiPizza SI covered
SelezioneTipoDiPizza STANDARD covered
Stato SCEGLI_TIPO_DI_PIZZA covered
<State 2 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
totale = 0
outMess = Scegli il tipo di pizza desiderata:
Set servizio = NEWORDINE
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = STANDARD
Set pizzaInserita = capricciosa
Set quantita' = 2
Set prezzo = 1
</State 2 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = PIZZASTANDARD_SELEZIONATA
totale = 0
outMess = Inserisci il nome di una pizza dell'elenco:
Servizio NEWORDINE covered
AggiungiPizza NO covered
SelezioneTipoDiPizza STANDARD covered
Stato PIZZASTANDARD_SELEZIONATA covered
<State 3 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = PIZZASTANDARD_SELEZIONATA
totale = 0
outMess = Inserisci il nome di una pizza dell'elenco:
Set servizio = NEWORDINE
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = STANDARD
Set pizzaInserita = capricciosa
Set quantita' = 10
Set prezzo = 1
</State 3 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 50
outMess = prezzo totale aggiornato
pizzaCorrente = capricciosa
Servizio NEWORDINE covered
AggiungiPizza NO covered
SelezioneTipoDiPizza STANDARD covered
Stato SCEGLI_SE_AGGIUNGERE_PIZZA covered
<State 4 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 50
outMess = prezzo totale aggiornato
pizzaCorrente = capricciosa
Set servizio = NEWORDINE
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = STANDARD
Set pizzaInserita = marinara
Set quantita' = 1
Set prezzo = 1
</State 4 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 50
outMess = Il totale :50
pizzaCorrente = capricciosa
Servizio NEWORDINE covered
AggiungiPizza NO covered
SelezioneTipoDiPizza STANDARD covered
Stato ATTENDI_ORDINAZIONI covered
```
#### Avalla
```
```
### test2
```
<State 1 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 0
outMess = null
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = STANDARD
Set pizzaInserita = marinara
Set quantita' = 1
Set prezzo = 1
</State 1 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
totale = 0
outMess = Scegli il tipo di pizza desiderata:
Servizio NEWORDINE covered
AggiungiPizza SI covered
SelezioneTipoDiPizza STANDARD covered
Stato SCEGLI_TIPO_DI_PIZZA covered
<State 2 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
totale = 0
outMess = Scegli il tipo di pizza desiderata:
Set servizio = NEWORDINE
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = STANDARD
Set pizzaInserita = capricciosa
Set quantita' = 2
Set prezzo = 1
</State 2 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = PIZZASTANDARD_SELEZIONATA
totale = 0
outMess = Inserisci il nome di una pizza dell'elenco:
Servizio NEWORDINE covered
AggiungiPizza NO covered
SelezioneTipoDiPizza STANDARD covered
Stato PIZZASTANDARD_SELEZIONATA covered
<State 3 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = PIZZASTANDARD_SELEZIONATA
totale = 0
outMess = Inserisci il nome di una pizza dell'elenco:
Set servizio = NEWORDINE
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = STANDARD
Set pizzaInserita = capricciosa
Set quantita' = 10
Set prezzo = 1
</State 3 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 50
outMess = prezzo totale aggiornato
pizzaCorrente = capricciosa
Servizio NEWORDINE covered
AggiungiPizza NO covered
SelezioneTipoDiPizza STANDARD covered
Stato SCEGLI_SE_AGGIUNGERE_PIZZA covered
<State 4 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 50
outMess = prezzo totale aggiornato
pizzaCorrente = capricciosa
Set servizio = NEWORDINE
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = STANDARD
Set pizzaInserita = marinara
Set quantita' = 1
Set prezzo = 1
</State 4 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 50
outMess = Il totale :50
pizzaCorrente = capricciosa
Servizio NEWORDINE covered
AggiungiPizza NO covered
SelezioneTipoDiPizza STANDARD covered
Stato ATTENDI_ORDINAZIONI covered
<State 5 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 50
outMess = Il totale :50
pizzaCorrente = capricciosa
Set servizio = EXIT
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = STANDARD
Set pizzaInserita = marinara
Set quantita' = 2
Set prezzo = 10
</State 5 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
totale = 50
outMess = Registro di cassa chiuso!
pizzaCorrente = capricciosa
Servizio EXIT covered
AggiungiPizza SI covered
SelezioneTipoDiPizza STANDARD covered
Stato CHIUSO covered

<Stato finale>
```
#### Avalla
```
```
### test3
```
- no output (the asm doesn't perform any step)
```
### test4
```
- no output (the asm doesn't perform any step)
```
