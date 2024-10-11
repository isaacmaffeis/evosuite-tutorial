# V023
In this version I tested the generated class directly:
- I incorporated the abstract signature class directly into the main class, 
in this way I could make all the methods private except the set, step and get methods which are
the only public ones and visible from evosuite

I have generated the tests with the criterion LINE:BRANCH, the coverage (81%) is not bad, 
in the next version we can try to add the criterion CBRANCH

## Problems

Abstract types treated this way are not tested correctly

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
java -jar .\evosuite-1.0.6.jar -class org.evoservice.RegistroDiCassa.RegistroDiCassav4 -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=60
```

### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.RegistroDiCassa.RegistroDiCassav4
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 16804
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.RegistroDiCassa.RegistroDiCassav4
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  - Line 232
  - Branch 101
    [Progress:>                             0%] [Cov:>                                  0%]* Using seed 1728119790918
* Starting evolution
  [Progress:==============================100%] [Cov:============================>      81%]
* Search finished after 151s and 764 generations, 196094 statements, best individual has fitness: 35.30555555555556
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 85%
* Total number of goals: 232
* Number of covered goals: 197
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 77%
* Total number of goals: 101
* Number of covered goals: 78
* Generated 7 tests with total length 40
* Resulting test suite's coverage: 81% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'RegistroDiCassav4_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
Set pizzaInserita = capricciosa
Set sceltaDiAggiuntaPizza = SI
Set sceltaDelTipoPizza = STANDARD
Set insertQuantita = 0
Set servizioSelezionato = NEWORDINE
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
<State 2 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = PIZZASTANDARD_SELEZIONATA
outMess = Inserisci il nome di una pizza dell'elenco:
totale = 0
</State 2 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
outMess = prezzo totale aggiornato
totale = 0
```
#### Avalla
```
check succeeded: statoCassa = ATTENDI_ORDINAZIONI 
check succeeded: totale = 0 
check succeeded: outMess = \"\" 
check succeeded: statoCassa = SCEGLI_TIPO_DI_PIZZA 
check succeeded: totale = 0 
check succeeded: outMess = \"Scegli il tipo di pizza desiderata:\" 
check succeeded: statoCassa = PIZZASTANDARD_SELEZIONATA 
check succeeded: totale = 0 
check succeeded: outMess = \"Inserisci il nome di una pizza dell'elenco:\" 
check succeeded: statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA 
check succeeded: totale = 0 
check succeeded: outMess = \"prezzo totale aggiornato\" 
```

### test1
```
Set insertPrezzo = 5
Set sceltaDiAggiuntaPizza = SI
Set sceltaDelTipoPizza = OTHER
Set insertQuantita = 0
Set servizioSelezionato = NEWORDINE
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
totale = 0
```
#### Avalla
```
check succeeded: statoCassa = ATTENDI_ORDINAZIONI 
check succeeded: totale = 0 
check succeeded: outMess = \"\" 
check succeeded: statoCassa = SCEGLI_TIPO_DI_PIZZA 
check succeeded: totale = 0 
check succeeded: outMess = \"Scegli il tipo di pizza desiderata:\" 
check succeeded: statoCassa = ALTRAPIZZA_SELEZIONATA 
check succeeded: totale = 0 
check succeeded: outMess = \"Inserisci il nome di una nuova pizza:\" 
check succeeded: statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA 
check succeeded: totale = 0 
check succeeded: outMess = \"prezzo totale aggiornato\" 
```

### test2
```
Set sceltaDiAggiuntaPizza = NO
Set servizioSelezionato = NEWORDINE
<State 0 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = 
totale = 0
</State 0 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
outMess = prezzo totale aggiornato
totale = 0
```
#### Avalla
```
check succeeded: statoCassa = ATTENDI_ORDINAZIONI 
check succeeded: totale = 0 
check succeeded: outMess = \"\" 
check succeeded: statoCassa = ATTENDI_ORDINAZIONI 
check succeeded: totale = 0 
check succeeded: outMess = \"prezzo totale aggiornato\" 
```

### test3
```
Set servizioSelezionato = EXIT
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
```
#### Avalla
```
check succeeded: statoCassa = ATTENDI_ORDINAZIONI 
check succeeded: totale = 0 
check succeeded: outMess = \"\" 
check succeeded: statoCassa = CHIUSO 
check succeeded: totale = 0 
check succeeded: outMess = \"Registro di cassa chiuso!\" 
```

### test4 - test5 -test6
```
No scenario found
```
#### Avalla
```

```
