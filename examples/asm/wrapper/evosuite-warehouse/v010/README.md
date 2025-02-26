# V010

Version with:
- wrapper class with setters, step and getters
- generated by asmetal2java
- options: coverRules=true coverOutputs=false

I made some changes to the RegistroDiCassav4 class (generated class):
- Integrated the signature directly into the class.
- Made the static fields private so that they cannot be used from outside.

I created a single setter for each value of the static function "pizzaInserita", 
in this way I help evosuite not to raise exceptions

I tried to use the evosuite `-Dcatch_undeclared_exceptions=false` option to check if I can solve 
the problem that evosuite stops the generation when a method can throw exceptions 
(checking the exception in a try catch block), through this option I hoped that evosuite would not
consider values that can throw exceptions and would instead focus on normal values.

## Problems

Although in some scenarios evosuite can generate scenarios without problems, in some cases I still
notice the behavior as before, that is, that evosuite stops in the presence of some methods,
but this time without checking the exception (resulting in failing tests as we can see in the logs).
This is not good and decreases the coverage.

This is the block code that has an unhandled exception:
```
registroDiCassav4_ATG0.step();
assertEquals("Inserisci il nome di una nuova pizza:", registroDiCassav4_ATG0.get_outMess());
assertEquals(0, registroDiCassav4_ATG0.get_totale());
assertEquals(RegistroDiCassav4.Stati.ALTRAPIZZA_SELEZIONATA, registroDiCassav4_ATG0.get_statoCassa());

registroDiCassav4_ATG0.step();
```

I think the previous behavior is preferable,
because in this case the generated test throws exceptions, so during the writing phase evosuite 
discards it and the coverage decreases, instead with the try catch block, the test is useful up to
the point where evosuite throws an exception.

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
java -jar evosuite-1.0.6.jar -class org.evoservice.wrapper.RegistroDiCassav4_ATG -criterion LINE:BRANCH:WEAKMUTATION -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=60 -Dcatch_undeclared_exceptions=false
```

### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.wrapper.RegistroDiCassav4_ATG
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\wrapper\evosuite-files\evosuite.properties
* Connecting to master process on port 15238
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.wrapper.RegistroDiCassav4_ATG
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  [Progress:>                             0%] [Cov:>                                  0%]  - Line 107
  - Branch 59
* Using seed 1729543618016
* Starting evolution
  [Progress:==============================100%] [Cov:================================>  92%]
* Search finished after 61s and 863 generations, 247120 statements, best individual has fitness: 6.857142857142858
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 94%
* Total number of goals: 107
* Number of covered goals: 101
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 90%
* Total number of goals: 59
* Number of covered goals: 53
* Generated 11 tests with total length 46
* Resulting test suite's coverage: 92% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
  [MASTER] 22:48:09.844 [logback-1] WARN  JUnitAnalyzer - Found unstable test named test0 -> class java.lang.NullPointerException: null
  [MASTER] 22:48:09.907 [logback-1] WARN  JUnitAnalyzer - Failing test:
  RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
  assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
  assertEquals(0, registroDiCassav4_ATG0.get_totale());
  assertEquals("", registroDiCassav4_ATG0.get_outMess());
  assertNotNull(registroDiCassav4_ATG0);

RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4_Servizio0);
assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
assertEquals(0, registroDiCassav4_ATG0.get_totale());
assertEquals("", registroDiCassav4_ATG0.get_outMess());

RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.SI;
registroDiCassav4_ATG0.set_sceltaDiAggiuntaPizza(registroDiCassav4_AggiungiPizza0);
assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
assertEquals(0, registroDiCassav4_ATG0.get_totale());
assertEquals("", registroDiCassav4_ATG0.get_outMess());

RegistroDiCassav4.SelezioneTipoDiPizza registroDiCassav4_SelezioneTipoDiPizza0 = RegistroDiCassav4.SelezioneTipoDiPizza.STANDARD;
registroDiCassav4_ATG0.set_sceltaDelTipoPizza(registroDiCassav4_SelezioneTipoDiPizza0);
assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
assertEquals(0, registroDiCassav4_ATG0.get_totale());
assertEquals("", registroDiCassav4_ATG0.get_outMess());

registroDiCassav4_ATG0.step();
assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ATG0.get_outMess());
assertEquals(0, registroDiCassav4_ATG0.get_totale());
assertEquals(RegistroDiCassav4.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ATG0.get_statoCassa());

registroDiCassav4_ATG0.step();
assertEquals(RegistroDiCassav4.Stati.PIZZASTANDARD_SELEZIONATA, registroDiCassav4_ATG0.get_statoCassa());
assertEquals(0, registroDiCassav4_ATG0.get_totale());
assertEquals("Inserisci il nome di una pizza dell'elenco:", registroDiCassav4_ATG0.get_outMess());

registroDiCassav4_ATG0.step();

[MASTER] 22:48:10.126 [logback-1] WARN  JUnitAnalyzer - Found unstable test named test0 -> class java.lang.NullPointerException: null
[MASTER] 22:48:10.126 [logback-1] WARN  JUnitAnalyzer - Failing test:
RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
assertEquals(0, registroDiCassav4_ATG0.get_totale());
assertEquals("", registroDiCassav4_ATG0.get_outMess());
assertNotNull(registroDiCassav4_ATG0);

RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4_Servizio0);
assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
assertEquals(0, registroDiCassav4_ATG0.get_totale());
assertEquals("", registroDiCassav4_ATG0.get_outMess());

RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.SI;
RegistroDiCassav4.SelezioneTipoDiPizza registroDiCassav4_SelezioneTipoDiPizza0 = RegistroDiCassav4.SelezioneTipoDiPizza.OTHER;
registroDiCassav4_ATG0.set_sceltaDelTipoPizza(registroDiCassav4_SelezioneTipoDiPizza0);
assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
assertEquals(0, registroDiCassav4_ATG0.get_totale());
assertEquals("", registroDiCassav4_ATG0.get_outMess());

registroDiCassav4_ATG0.set_sceltaDiAggiuntaPizza(registroDiCassav4_AggiungiPizza0);
assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
assertEquals(0, registroDiCassav4_ATG0.get_totale());
assertEquals("", registroDiCassav4_ATG0.get_outMess());

registroDiCassav4_ATG0.step();
assertEquals(0, registroDiCassav4_ATG0.get_totale());
assertEquals(RegistroDiCassav4.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ATG0.get_outMess());

registroDiCassav4_ATG0.step();
assertEquals("Inserisci il nome di una nuova pizza:", registroDiCassav4_ATG0.get_outMess());
assertEquals(0, registroDiCassav4_ATG0.get_totale());
assertEquals(RegistroDiCassav4.Stati.ALTRAPIZZA_SELEZIONATA, registroDiCassav4_ATG0.get_statoCassa());

registroDiCassav4_ATG0.step();

* Writing JUnit test case 'RegistroDiCassav4_ATG_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
```
#### Avalla
```
```
