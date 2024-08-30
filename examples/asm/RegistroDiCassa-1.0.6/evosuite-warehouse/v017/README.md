# V016

I've added the CBRANCH criterion to compare it with the previous one which has only LINE and BRANCH.

```
-criterion LINE:BRANCH:CBRANCH
```

Evosuite now generates 5 test cases but only 1 is an interesting scenario,
the other 4 cannot be parsed into Avalla.

As a result I have to ignore 4 test cases and the remaining is equivalent to the one
generated with the previous version with only LINE and BRANCH criterion.

So adding CBANCH turned out to be unnecessary, at least for this example.

## Problems

- 5 test cases generated but only 1 is an interesting scenario.

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
java -jar .\evosuite-1.0.6.jar -class org.evoservice.RegistroDiCassa.RegistroDiCassav3_ASM -criterion LINE:BRANCH:CBRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=150
```

### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.RegistroDiCassa.RegistroDiCassav3_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 21705
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.RegistroDiCassa.RegistroDiCassav3_ASM
* Test criteria:
  - Line Coverage
  - Branch Coverage
  - Context Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  - Line 58
  - Branch 19
  - CBranchFitnessFactory 19
    [Progress:>                             0%] [Cov:>                                  0%]* Using seed 1725022477929
* Starting evolution
  [Progress:====>                         15%] [Cov:===================================100%]
* Search finished after 23s and 175 generations, 32830 statements, best individual has fitness: 0.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 100%
* Total number of goals: 58
* Number of covered goals: 58
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 100%
* Total number of goals: 19
* Number of covered goals: 19
* Coverage analysis for criterion CBRANCH
* Coverage of criterion CBRANCH: 100%
* Total number of goals: 19
* Number of covered goals: 19
* Generated 5 tests with total length 15
* Resulting test suite's coverage: 100% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'RegistroDiCassav3_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
- no output (the asm doesn't perform any step)
```
### test1
```
- no output (the asm doesn't perform any step)
```
### test2
```
- no output (the asm doesn't perform any step)
```
### test3
```
- no output (the asm doesn't perform any step)
```
### test4
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
<State 2 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
totale = 0
outMess = Scegli il tipo di pizza desiderata:
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = STANDARD
Set pizzaInserita = capricciosa
Set quantita' = 1
Set prezzo = 2
</State 2 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = PIZZASTANDARD_SELEZIONATA
totale = 0
outMess = Inserisci il nome di una pizza dell'elenco:
<State 3 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = PIZZASTANDARD_SELEZIONATA
totale = 0
outMess = Inserisci il nome di una pizza dell'elenco:
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = STANDARD
Set pizzaInserita = marinara
Set quantita' = 1
Set prezzo = 1
</State 3 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 3
outMess = prezzo totale aggiornato
pizzaCorrente = marinara
```
#### Avalla:
```
```