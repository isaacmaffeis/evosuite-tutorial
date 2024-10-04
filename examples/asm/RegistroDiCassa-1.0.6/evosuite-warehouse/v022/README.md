# V022
I tried to solve the problem that the ASM requires all the values of the monitored variables 
at each step, now the step function has no arguments and is used to update the ASM,
the values of the monitored variables can be set with public setters.


## Problems

the coverage is increased in this way, this solution simplifies the parsing of the step function,
but introduces other problems: 
- evosuite makes assertions after each set (which are irrelevant, as you have to wait for the step
function)
- it executes sets that are not useful, in order to cover the set branches.

However, it is noted how evosuite in certain steps manages to set
only the function that is needed and then execute the step which is the expected behavior.


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
java -jar .\evosuite-1.0.6.jar -class org.evoservice.RegistroDiCassa.RegistroDiCassav4_ASM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=150
```

### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.RegistroDiCassa.RegistroDiCassav4_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 4434
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.RegistroDiCassa.RegistroDiCassav4_ASM
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  - Line 107
  - Branch 62
    [Progress:>                             0%] [Cov:>                                  0%]* Using seed 1728035522109
* Starting evolution
  [Progress:==============================100%] [Cov:=================================> 96%]
* Search finished after 152s and 3875 generations, 1058426 statements, best individual has fitness: 2.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 100%
* Total number of goals: 107
* Number of covered goals: 107
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 94%
* Total number of goals: 62
* Number of covered goals: 58
* Generated 4 tests with total length 40
* Resulting test suite's coverage: 97% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'RegistroDiCassav4_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
Set sceltaDelTipoPizza = OTHER
Set servizioSelezionato = NEWORDINE
Set insertQuantita = 0
Set sceltaDiAggiuntaPizza = SI
Set insertPrezzo = 2
<State 0 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = 
totale = 0
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
Set sceltaDelTipoPizza = STANDARD
<State 1 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
outMess = Scegli il tipo di pizza desiderata:
totale = 0
</State 1 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = PIZZASTANDARD_SELEZIONATA
outMess = Inserisci il nome di una pizza dell'elenco:
totale = 0
Branch Servizio NEWORDINE covered
Branch AggiungiPizza SI covered
Branch SelezioneTipoDiPizza STANDARD covered
Branch Stati PIZZASTANDARD_SELEZIONATA covered

```
#### Avalla
```
```
### test1
```
Set sceltaDelTipoPizza = OTHER
Set servizioSelezionato = NEWORDINE
Set insertQuantita = 2
Set sceltaDiAggiuntaPizza = SI
Set insertPrezzo = 2
<State 0 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = 
totale = 0
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
Set sceltaDiAggiuntaPizza = NO
<State 2 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
outMess = Inserisci il nome di una nuova pizza:
totale = 0
</State 2 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
outMess = prezzo totale aggiornato
totale = 4
Branch Servizio NEWORDINE covered
Branch AggiungiPizza NO covered
Branch SelezioneTipoDiPizza OTHER covered
Branch Stati SCEGLI_SE_AGGIUNGERE_PIZZA covered
<State 3 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
outMess = prezzo totale aggiornato
totale = 4
</State 3 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = prezzo totale aggiornato
totale = 4
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
Set pizzaInserita = marinara
```
#### Avalla
```
```
### test3
```
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 7
Set sceltaDiAggiuntaPizza = NO
Set servizioSelezionato = EXIT
Set insertPrezzo = 7
<State 0 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = 
totale = 0
</State 0 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
outMess = Registro di cassa chiuso!
totale = 0
Branch Servizio EXIT covered
Branch AggiungiPizza NO covered
Branch SelezioneTipoDiPizza OTHER covered
Branch Stati CHIUSO covered
```
#### Avalla
```
```