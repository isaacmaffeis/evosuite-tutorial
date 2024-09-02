# V020

This version was automatically generated by the asmetal2java generator,
also the line coverage was increased to 100%

## Problems

- problem with concrete domains subset of integer, they accept values beyond the limit

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
* Connecting to master process on port 7498
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
  [Progress:>                             0%] [Cov:>                                  0%]  - Line 107
  - Branch 64
* Using seed 1725264076056
* Starting evolution
  [Progress:==============================100%] [Cov:=================================> 96%]
* Search finished after 151s and 2254 generations, 961179 statements, best individual has fitness: 2.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 100%
* Total number of goals: 107
* Number of covered goals: 107
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 94%
* Total number of goals: 64
* Number of covered goals: 60
* Generated 2 tests with total length 25
* Resulting test suite's coverage: 97% (average coverage for all fitness functions)
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
Set pizzaInserita = 0
Set sceltaDiAggiuntaPizza = SI
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 0
Set insertPrezzo = 0
</State 0 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
outMess = Scegli il tipo di pizza desiderata:
totale = 0
Branch Servizio NEWORDINE covered
Branch AggiungiPizza SI covered
Branch SelezioneTipoDiPizza OTHER covered
Branch Stati SCEGLI_TIPO_DI_PIZZA covered
<State 1 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
outMess = Scegli il tipo di pizza desiderata:
totale = 0
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 0
Set sceltaDiAggiuntaPizza = SI
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 0
Set insertPrezzo = 0
</State 1 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
outMess = Inserisci il nome di una nuova pizza:
totale = 0
Branch Servizio NEWORDINE covered
Branch AggiungiPizza SI covered
Branch SelezioneTipoDiPizza OTHER covered
Branch Stati ALTRAPIZZA_SELEZIONATA covered
<State 2 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
outMess = Inserisci il nome di una nuova pizza:
totale = 0
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 0
Set sceltaDiAggiuntaPizza = SI
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 0
Set insertPrezzo = 0
</State 2 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
outMess = prezzo totale aggiornato
totale = 0
Branch Servizio NEWORDINE covered
Branch AggiungiPizza SI covered
Branch SelezioneTipoDiPizza OTHER covered
Branch Stati SCEGLI_SE_AGGIUNGERE_PIZZA covered
<State 3 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
outMess = prezzo totale aggiornato
totale = 0
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 0
Set sceltaDiAggiuntaPizza = SI
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 0
Set insertPrezzo = 0
</State 3 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
outMess = Scegli il tipo di pizza desiderata:
totale = 0
Branch Servizio NEWORDINE covered
Branch AggiungiPizza SI covered
Branch SelezioneTipoDiPizza OTHER covered
Branch Stati SCEGLI_TIPO_DI_PIZZA covered
<State 4 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
outMess = Scegli il tipo di pizza desiderata:
totale = 0
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 0
Set sceltaDiAggiuntaPizza = SI
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 0
Set insertPrezzo = 0
</State 4 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
outMess = Inserisci il nome di una nuova pizza:
totale = 0
Branch Servizio NEWORDINE covered
Branch AggiungiPizza SI covered
Branch SelezioneTipoDiPizza OTHER covered
Branch Stati ALTRAPIZZA_SELEZIONATA covered
<State 5 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
outMess = Inserisci il nome di una nuova pizza:
totale = 0
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 0
Set sceltaDiAggiuntaPizza = SI
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 0
Set insertPrezzo = 0
</State 5 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
outMess = prezzo totale aggiornato
totale = 0
Branch Servizio NEWORDINE covered
Branch AggiungiPizza SI covered
Branch SelezioneTipoDiPizza OTHER covered
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
Set pizzaInserita = 0
Set sceltaDiAggiuntaPizza = SI
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 0
Set insertPrezzo = 0
</State 0 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
outMess = Scegli il tipo di pizza desiderata:
totale = 0
Branch Servizio NEWORDINE covered
Branch AggiungiPizza SI covered
Branch SelezioneTipoDiPizza OTHER covered
Branch Stati SCEGLI_TIPO_DI_PIZZA covered
<State 1 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
outMess = Scegli il tipo di pizza desiderata:
totale = 0
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 0
Set sceltaDiAggiuntaPizza = SI
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 0
Set insertPrezzo = 0
</State 1 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
outMess = Inserisci il nome di una nuova pizza:
totale = 0
Branch Servizio NEWORDINE covered
Branch AggiungiPizza SI covered
Branch SelezioneTipoDiPizza OTHER covered
Branch Stati ALTRAPIZZA_SELEZIONATA covered
<State 2 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
outMess = Inserisci il nome di una nuova pizza:
totale = 0
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 0
Set sceltaDiAggiuntaPizza = SI
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 0
Set insertPrezzo = 0
</State 2 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
outMess = prezzo totale aggiornato
totale = 0
Branch Servizio NEWORDINE covered
Branch AggiungiPizza SI covered
Branch SelezioneTipoDiPizza OTHER covered
Branch Stati SCEGLI_SE_AGGIUNGERE_PIZZA covered
<State 3 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
outMess = prezzo totale aggiornato
totale = 0
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 0
Set sceltaDiAggiuntaPizza = SI
Set sceltaDelTipoPizza = STANDARD
Set insertQuantita = 0
Set insertPrezzo = 0
</State 3 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
outMess = Scegli il tipo di pizza desiderata:
totale = 0
Branch Servizio NEWORDINE covered
Branch AggiungiPizza SI covered
Branch SelezioneTipoDiPizza STANDARD covered
Branch Stati SCEGLI_TIPO_DI_PIZZA covered
<State 4 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
outMess = Scegli il tipo di pizza desiderata:
totale = 0
Set servizioSelezionato = EXIT
Set pizzaInserita = 0
Set sceltaDiAggiuntaPizza = NO
Set sceltaDelTipoPizza = STANDARD
Set insertQuantita = 0
Set insertPrezzo = 0
</State 4 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = PIZZASTANDARD_SELEZIONATA
outMess = Inserisci il nome di una pizza dell'elenco:
totale = 0
Branch Servizio EXIT covered
Branch AggiungiPizza NO covered
Branch SelezioneTipoDiPizza STANDARD covered
Branch Stati PIZZASTANDARD_SELEZIONATA covered
<State 5 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = PIZZASTANDARD_SELEZIONATA
outMess = Inserisci il nome di una pizza dell'elenco:
totale = 0
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 0
Set sceltaDiAggiuntaPizza = NO
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 8392
Set insertPrezzo = 0
</State 5 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
outMess = prezzo totale aggiornato
totale = 33568
Branch Servizio NEWORDINE covered
Branch AggiungiPizza NO covered
Branch SelezioneTipoDiPizza OTHER covered
Branch Stati SCEGLI_SE_AGGIUNGERE_PIZZA covered
<State 6 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
outMess = prezzo totale aggiornato
totale = 33568
Set servizioSelezionato = NEWORDINE
Set pizzaInserita = 0
Set sceltaDiAggiuntaPizza = NO
Set sceltaDelTipoPizza = STANDARD
Set insertQuantita = 0
Set insertPrezzo = 8392
</State 6 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = Totale aggiornato
totale = 33568
Branch Servizio NEWORDINE covered
Branch AggiungiPizza NO covered
Branch SelezioneTipoDiPizza STANDARD covered
Branch Stati ATTENDI_ORDINAZIONI covered
<State 7 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = Totale aggiornato
totale = 33568
Set servizioSelezionato = EXIT
Set pizzaInserita = 0
Set sceltaDiAggiuntaPizza = SI
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 8392
Set insertPrezzo = 8392
</State 7 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
outMess = Registro di cassa chiuso!
totale = 33568
Branch Servizio EXIT covered
Branch AggiungiPizza SI covered
Branch SelezioneTipoDiPizza OTHER covered
Branch Stati CHIUSO covered

<Stato finale>
```
#### Avalla
```
```