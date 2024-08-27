# V004

I have reduced the number of unnecessary checks, but it is not easy for an automatic program 
to understand which ones they are.

## Problems

- There are still checks that cannot be converted into AVALLA scenarios, 
but they can simply be ignored.
- The scenario fails in AVALLA:
```
  check succeeded: totale<50
  check succeeded: totale=0
  check succeeded: totale<50
  check succeeded: servizioSelezionato = NEWORDINE
  check succeeded: totale = 0
  check succeeded: totale<50
  check succeeded: servizioSelezionato = NEWORDINE
  check succeeded: totale = 0
  CHECK FAILED: totale>50 at step 3
  check succeeded: servizioSelezionato = NEWORDINE
  CHECK FAILED: totale = 56 at step 3
  some checks failed
```
The `totale` is correctly `49` but evosuite set it `56`, hence the final state condition is not 
satisfied (`totale` >= `50`), 
this problem might be caused by the asm conversion in java, in particular by this line of code:
```java
esecuzione.insertPrezzo.set(PrezzoDomain.valueOf(esecuzione.PrezzoDomain_elems.get(prezzo)));
```
That takes values from this array:
```java
PrezzoDomain_elems = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
```
Because the array starts with 1, we need to subtract 1 element:
```java
esecuzione.insertPrezzo.set(PrezzoDomain.valueOf(esecuzione.PrezzoDomain_elems.get(prezzo-1)));
```

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
java -jar .\evosuite-1.0.6.jar -class org.evoservice.RegistroDiCassa.RegistroDiCassa_ASM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all
```

### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.ASM.RegistroDiCassav2_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 8427
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.ASM.RegistroDiCassav2_ASM
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  - Line 42
    [Progress:>                             0%] [Cov:>                                  0%]  - Branch 13
* Using seed 1724707994317
* Starting evolution
  [Progress:====>                         16%] [Cov:===================================100%]
* Search finished after 11s and 114 generations, 34686 statements, best individual has fitness: 0.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 100%
* Total number of goals: 42
* Number of covered goals: 42
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 100%
* Total number of goals: 13
* Number of covered goals: 13
* Generated 1 tests with total length 9
* Resulting test suite's coverage: 100% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'RegistroDiCassav2_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
```
<State 1 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 0
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = STANDARD
Set quantita' = 7
Set prezzo = 7
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
Set quantita' = 7
Set prezzo = 7
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
Set quantita' = 7
Set prezzo = 7
</State 3 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 56

<Stato finale>
```