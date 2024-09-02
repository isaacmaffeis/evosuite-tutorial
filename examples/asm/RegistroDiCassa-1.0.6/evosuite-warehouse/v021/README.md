# V020

I was able to automatically generate the ASM class and obtain correlation between
this and the target class.

## Problems

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
* Connecting to master process on port 10471
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
  [Progress:>                             0%] [Cov:>                                  0%]  - Line 111
  - Branch 64
* Using seed 1725269294317
* Starting evolution
  [Progress:==============================100%] [Cov:================================>  94%]
* Search finished after 151s and 2230 generations, 733076 statements, best individual has fitness: 4.5
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 99%
* Total number of goals: 111
* Number of covered goals: 110
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 91%
* Total number of goals: 64
* Number of covered goals: 58
* Generated 3 tests with total length 27
* Resulting test suite's coverage: 95% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'RegistroDiCassav3_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
<State 0 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = null
totale = 0
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 2
Set sceltaDiAggiuntaPizza = SI
Set sceltaDelTipoPizza = STANDARD
Set insertQuantita = 2
Set insertPrezzo = 2
</State 0 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
outMess = Scegli il tipo di pizza desiderata:
totale = 0
Branch Servizio NEWORDINE covered
Branch AggiungiPizza SI covered
Branch SelezioneTipoDiPizza STANDARD covered
Branch Stati SCEGLI_TIPO_DI_PIZZA covered
<State 1 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
outMess = Scegli il tipo di pizza desiderata:
totale = 0
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 2
Set sceltaDiAggiuntaPizza = NO
Set sceltaDelTipoPizza = STANDARD
Set insertQuantita = 2
Set insertPrezzo = 2
</State 1 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = PIZZASTANDARD_SELEZIONATA
outMess = Inserisci il nome di una pizza dell'elenco:
totale = 0
Branch Servizio NEWORDINE covered
Branch AggiungiPizza NO covered
Branch SelezioneTipoDiPizza STANDARD covered
Branch Stati PIZZASTANDARD_SELEZIONATA covered
<State 2 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = PIZZASTANDARD_SELEZIONATA
outMess = Inserisci il nome di una pizza dell'elenco:
totale = 0
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 2
Set sceltaDiAggiuntaPizza = NO
Set sceltaDelTipoPizza = STANDARD
Set insertQuantita = 2
Set insertPrezzo = 2
</State 2 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
outMess = prezzo totale aggiornato
totale = 10
Branch Servizio NEWORDINE covered
Branch AggiungiPizza NO covered
Branch SelezioneTipoDiPizza STANDARD covered
Branch Stati SCEGLI_SE_AGGIUNGERE_PIZZA covered
<State 3 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
outMess = prezzo totale aggiornato
totale = 10
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 2
Set sceltaDiAggiuntaPizza = SI
Set sceltaDelTipoPizza = STANDARD
Set insertQuantita = 2
Set insertPrezzo = 2
</State 3 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
outMess = Scegli il tipo di pizza desiderata:
totale = 10
Branch Servizio NEWORDINE covered
Branch AggiungiPizza SI covered
Branch SelezioneTipoDiPizza STANDARD covered
Branch Stati SCEGLI_TIPO_DI_PIZZA covered
<State 4 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
outMess = Scegli il tipo di pizza desiderata:
totale = 10
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 2
Set sceltaDiAggiuntaPizza = SI
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 2
Set insertPrezzo = 2
</State 4 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
outMess = Inserisci il nome di una nuova pizza:
totale = 10
Branch Servizio NEWORDINE covered
Branch AggiungiPizza SI covered
Branch SelezioneTipoDiPizza OTHER covered
Branch Stati ALTRAPIZZA_SELEZIONATA covered
<State 5 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
outMess = Inserisci il nome di una nuova pizza:
totale = 10
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 2
Set sceltaDiAggiuntaPizza = NO
Set sceltaDelTipoPizza = STANDARD
Set insertQuantita = 2
Set insertPrezzo = 20
</State 5 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
outMess = prezzo totale aggiornato
totale = 50
Branch Servizio NEWORDINE covered
Branch AggiungiPizza NO covered
Branch SelezioneTipoDiPizza STANDARD covered
Branch Stati SCEGLI_SE_AGGIUNGERE_PIZZA covered
```
#### Avalla
```
```
### test1
```
<State 0 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = null
totale = 0
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 2
Set sceltaDiAggiuntaPizza = NO
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 2
Set insertPrezzo = 2
</State 0 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = Totale aggiornato
totale = 0
Branch Servizio NEWORDINE covered
Branch AggiungiPizza NO covered
Branch SelezioneTipoDiPizza OTHER covered
Branch Stati ATTENDI_ORDINAZIONI covered
<State 1 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = Totale aggiornato
totale = 0
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 2
Set sceltaDiAggiuntaPizza = NO
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 2
Set insertPrezzo = 2
</State 1 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = Totale aggiornato
totale = 0
Branch Servizio NEWORDINE covered
Branch AggiungiPizza NO covered
Branch SelezioneTipoDiPizza OTHER covered
Branch Stati ATTENDI_ORDINAZIONI covered
<State 2 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = Totale aggiornato
totale = 0
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 2
Set sceltaDiAggiuntaPizza = NO
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 2
Set insertPrezzo = 2
</State 2 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = Totale aggiornato
totale = 0
Branch Servizio NEWORDINE covered
Branch AggiungiPizza NO covered
Branch SelezioneTipoDiPizza OTHER covered
Branch Stati ATTENDI_ORDINAZIONI covered
<State 3 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = Totale aggiornato
totale = 0
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 2
Set sceltaDiAggiuntaPizza = NO
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 2
Set insertPrezzo = 2
</State 3 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = Totale aggiornato
totale = 0
Branch Servizio NEWORDINE covered
Branch AggiungiPizza NO covered
Branch SelezioneTipoDiPizza OTHER covered
Branch Stati ATTENDI_ORDINAZIONI covered
<State 4 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = Totale aggiornato
totale = 0
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 2
Set sceltaDiAggiuntaPizza = NO
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 2
Set insertPrezzo = 2
</State 4 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = Totale aggiornato
totale = 0
Branch Servizio NEWORDINE covered
Branch AggiungiPizza NO covered
Branch SelezioneTipoDiPizza OTHER covered
Branch Stati ATTENDI_ORDINAZIONI covered
<State 5 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = Totale aggiornato
totale = 0
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 2
Set sceltaDiAggiuntaPizza = NO
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 2
Set insertPrezzo = 2
</State 5 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = Totale aggiornato
totale = 0
Branch Servizio NEWORDINE covered
Branch AggiungiPizza NO covered
Branch SelezioneTipoDiPizza OTHER covered
Branch Stati ATTENDI_ORDINAZIONI covered
```
#### Avalla
```
```
### test2
```
<State 0 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = null
totale = 0
Set servizioSelezionato = EXIT
Set pizzaInserita = 2
Set sceltaDiAggiuntaPizza = SI
Set sceltaDelTipoPizza = STANDARD
Set insertQuantita = 2
Set insertPrezzo = 2
</State 0 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
outMess = Registro di cassa chiuso!
totale = 0
Branch Servizio EXIT covered
Branch AggiungiPizza SI covered
Branch SelezioneTipoDiPizza STANDARD covered
Branch Stati CHIUSO covered
```
#### Avalla
```
```