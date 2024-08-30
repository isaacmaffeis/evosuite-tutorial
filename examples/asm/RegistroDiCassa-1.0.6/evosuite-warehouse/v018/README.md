# V018

I added a new method to increase coverage,
the idea is to create switch cases for enumerative types inside the step() function 
in order to create new branches inside the code and force evosuite to follow them.
For example:

```
private void coverServizioSelezionato(){
    switch (this.getServizioSelezionato()){
        case NEWORDINE:
            System.out.println("Servizio NEWORDINE covered");
            break;
        case EXIT:
            System.out.println("Servizio EXIT covered");
            break;
    }
}
```

In this way (using only the LINE and BRANCH criterion) evosuite generated 7 test cases 
and 4 of them are scenarios.


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
* Connecting to master process on port 8644
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
  [Progress:>                             0%] [Cov:>                                  0%]  - Line 96
  - Branch 59
* Using seed 1725026906695
* Starting evolution
  [Progress:==============================100%] [Cov:================================>  92%]
* Search finished after 152s and 1890 generations, 425525 statements, best individual has fitness: 5.75
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 97%
* Total number of goals: 96
* Number of covered goals: 93
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 88%
* Total number of goals: 59
* Number of covered goals: 52
* Generated 7 tests with total length 30
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
Set selezioneTipoDiPizza = STANDARD
Set pizzaInserita = capricciosa
Set quantita' = 2
Set prezzo = 2
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
Set prezzo = 2
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
Set quantita' = 2
Set prezzo = 2
</State 3 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 10
outMess = prezzo totale aggiornato
pizzaCorrente = capricciosa
Servizio NEWORDINE covered
AggiungiPizza NO covered
SelezioneTipoDiPizza STANDARD covered
Stato SCEGLI_SE_AGGIUNGERE_PIZZA covered
```
#### Avalla
```
check succeeded: statoCassa = ATTENDI_ORDINAZIONI 
check succeeded: totale = 0 
check succeeded: statoCassa = SCEGLI_TIPO_DI_PIZZA 
check succeeded: totale = 0 
check succeeded: outMess = \"Scegli il tipo di pizza desiderata:\" 
check succeeded: statoCassa = PIZZASTANDARD_SELEZIONATA 
check succeeded: totale = 0 
check succeeded: outMess = \"Inserisci il nome di una pizza dell'elenco:\" 
check succeeded: statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA 
check succeeded: totale = 10 
check succeeded: outMess = \"prezzo totale aggiornato\" 
```
### test1
```
<State 1 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 0
outMess = null
Set servizio = NEWORDINE
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = STANDARD
Set pizzaInserita = capricciosa
Set quantita' = 2
Set prezzo = 2
</State 1 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 0
outMess = Il totale :0
Servizio NEWORDINE covered
AggiungiPizza NO covered
SelezioneTipoDiPizza STANDARD covered
Stato ATTENDI_ORDINAZIONI covered
```
#### Avalla
```
check succeeded: statoCassa = ATTENDI_ORDINAZIONI 
check succeeded: totale = 0 
check succeeded: statoCassa = ATTENDI_ORDINAZIONI 
check succeeded: totale = 0 
check succeeded: outMess = \"Il totale :0\" 
```
### test2
```
<State 1 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 0
outMess = null
Set servizio = EXIT
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = STANDARD
Set pizzaInserita = margherita
Set quantita' = 0
Set prezzo = 7
</State 1 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
totale = 0
outMess = Registro di cassa chiuso!
Servizio EXIT covered
AggiungiPizza SI covered
SelezioneTipoDiPizza STANDARD covered
Stato CHIUSO covered
```
#### Avalla
```
check succeeded: statoCassa = ATTENDI_ORDINAZIONI 
check succeeded: totale = 0 
check succeeded: statoCassa = CHIUSO 
check succeeded: totale = 0 
check succeeded: outMess = \"Registro di cassa chiuso!\" 
```
### test3
```
- no output (the asm doesn't perform any step)
```
### test4
```
- no output (the asm doesn't perform any step)
```
### test5
```
- no output (the asm doesn't perform any step)
```
### test6
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
#### Avalla:
```
check succeeded: statoCassa = ATTENDI_ORDINAZIONI 
check succeeded: totale = 0 
check succeeded: statoCassa = SCEGLI_TIPO_DI_PIZZA 
check succeeded: totale = 0 
check succeeded: outMess = \"Scegli il tipo di pizza desiderata:\" 
check succeeded: statoCassa = ALTRAPIZZA_SELEZIONATA 
check succeeded: totale = 0 
check succeeded: outMess = \"Inserisci il nome di una nuova pizza:\" 
```