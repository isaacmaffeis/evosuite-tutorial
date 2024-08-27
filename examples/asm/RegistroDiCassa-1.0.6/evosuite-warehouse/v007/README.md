# V006

I've extended the search budget `-Dsearch_budget=150` (instead of 60) in order to help evosuite,
in this way evosuite doesn't use private methods and it's a good thing, 
but the generated scenarios are not so interesting: from 8 test cases only 1 is a parsable scenario 
to AVALA, and even in this one there are useless checks.
### scenario test7
```
check succeeded: totale<50
check succeeded: totale=0
check succeeded: statoCassa = ATTENDI_ORDINAZIONI
check succeeded: sceltaDelTipoPizza = OTHER
check succeeded: totale<50
check succeeded: sceltaDiAggiuntaPizza = SI
check succeeded: totale = 0
check succeeded: statoCassa = SCEGLI_TIPO_DI_PIZZA
check succeeded: servizioSelezionato = NEWORDINE
check succeeded: sceltaDelTipoPizza = OTHER
check succeeded: statoCassa = ALTRAPIZZA_SELEZIONATA
check succeeded: totale<50
check succeeded: sceltaDiAggiuntaPizza = SI
check succeeded: totale=0
check succeeded: servizioSelezionato = NEWORDINE
check succeeded: statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
check succeeded: sceltaDelTipoPizza = OTHER
check succeeded: totale>=50
check succeeded: sceltaDiAggiuntaPizza = SI
check succeeded: totale=153
check succeeded: servizioSelezionato = NEWORDINE
check succeeded: statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
check succeeded: sceltaDelTipoPizza = OTHER
check succeeded: totale>=50
check succeeded: sceltaDiAggiuntaPizza = SI
check succeeded: totale=153
check succeeded: servizioSelezionato = NEWORDINE
check succeeded: totale>=50
```
the last 8 lines are useless and repeated checks 
## Problems

- evosuite has generated 8 test cases but only 1 scenario with repeated checks.

I think it is better to continue using only the LINE and BRANCH criterion, even if they do not cover
all the states as CBRANCH does, but they create more consistent scenarios, rather it is preferable
to change the condition of the final state to have different scenarios and cover as many situations 
as possible.

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
java -jar .\evosuite-1.0.6.jar -class org.evoservice.RegistroDiCassa.RegistroDiCassav2_ASM -criterion LINE:BRANCH:CBRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=150
```

### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.RegistroDiCassa.RegistroDiCassav2_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 16323
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.RegistroDiCassa.RegistroDiCassav2_ASM
* Test criteria:
  - Line Coverage
  - Branch Coverage
  - Context Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  [Progress:>                             0%] [Cov:>                                  0%]  - Line 48
  - Branch 16
  - CBranchFitnessFactory 16
* Using seed 1724788020241
* Starting evolution
  [Progress:======>                       20%] [Cov:===================================100%]
* Search finished after 30s and 170 generations, 52380 statements, best individual has fitness: 0.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 100%
* Total number of goals: 48
* Number of covered goals: 48
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 100%
* Total number of goals: 16
* Number of covered goals: 16
* Coverage analysis for criterion CBRANCH
* Coverage of criterion CBRANCH: 100%
* Total number of goals: 16
* Number of covered goals: 16
* Generated 8 tests with total length 30
* Resulting test suite's coverage: 100% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'RegistroDiCassav2_ASM_ESTest' to evosuite-tests
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
- no output (the asm doesn't perform any step)
```
### test5
```
- no output (the asm doesn't perform any step)
```
### test6
```
- no output (the asm doesn't perform any step)

```
### test7
```
<State 1 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 0
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set quantita' = 9
Set prezzo = 9
</State 1 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
totale = 0
<State 2 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
totale = 0
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set quantita' = 9
Set prezzo = 9
</State 2 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
totale = 0
<State 3 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
totale = 0
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set quantita' = 9
Set prezzo = 17
</State 3 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 153

<Stato finale>
```