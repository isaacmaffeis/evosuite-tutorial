# V006

I have added the CBRANCH criterion to evosuite, now it can generate multiple scenario
and cover all the states.

## Problems

- evosuite can use directly the RegistroDiCassav2 methods, like in this example:
  ```java
  RegistroDiCassav2 registroDiCassav2_0 = new RegistroDiCassav2();
  registroDiCassav2_0.r_aggiungiAlTotale();
  ```
  this is not correct and can lead to inconsistent scenario that can't be parsed to AVALLA
- evosuite has generated 8 test cases but only 2 scenarios.

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
java -jar .\evosuite-1.0.6.jar -class org.evoservice.RegistroDiCassa.RegistroDiCassa_ASM -criterion LINE:BRANCH:CBRANCH -Dminimize=true -Dassertion_strategy=all
```

### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.ASM.RegistroDiCassav2_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 10435
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.ASM.RegistroDiCassav2_ASM
* Test criteria:
  - Line Coverage
  - Branch Coverage
  - Context Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  - Line 48
    [Progress:>                             0%] [Cov:>                                  0%]  - Branch 16
  - CBranchFitnessFactory 16
* Using seed 1724769237529
* Starting evolution
  [Progress:=========>                    30%] [Cov:===================================100%]
* Search finished after 19s and 83 generations, 31787 statements, best individual has fitness: 0.0
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
* Generated 8 tests with total length 35
* Resulting test suite's coverage: 100% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'RegistroDiCassav2_ASM_ESTest' to evosuite-tests
* Done!

## Scenario
### test0
```
<State 1 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 0
Set servizio = EXIT
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set quantita' = 10
Set prezzo = 10
</State 1 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
totale = 0
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
<State 1 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 0
Set servizio = EXIT
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set quantita' = 10
Set prezzo = 10
</State 1 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
totale = 0
<State 2 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
totale = 100
Set servizio = EXIT
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set quantita' = 10
Set prezzo = 10
</State 2 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
totale = 100

<Stato finale>
```
### test7
```
- no output (the asm doesn't perform any step)
```