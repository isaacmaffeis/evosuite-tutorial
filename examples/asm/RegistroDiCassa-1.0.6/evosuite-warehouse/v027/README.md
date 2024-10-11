# V025

Version with:
- signature and the class that extends the signature inside the TestGen class.
- TestGen class with setters, step and getters that interact with an instance of the class that 
extends the signature.

## Problems

- the signature cannot be private, because otherwise I can't see the enum and abstract domains, 
hence evosuite can see this class and use it in tests.
This is not correct and leads to incorrect scenario: 
  ```java
  RegistroDiCassa_TestGen.RegistroDiCassav4Sig.QuantitaDomain registroDiCassa_TestGen_RegistroDiCassav4Sig_QuantitaDomain0 = new RegistroDiCassa_TestGen.RegistroDiCassav4Sig.QuantitaDomain();
  assertNotNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_QuantitaDomain0);
  ```
- if I make the signature private I get errors calling domains because I can't access the 
signature class:
  ```java
  RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI
  ```
- the coverage is not good, the rules are poorly covered, compared to the version with a single 
class with everything private which instead had a good level of coverage.
- errors/warnings while generating the test suite:

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
java -jar evosuite-1.0.6.jar -class org.evoservice.RegistroDiCassa.RegistroDiCassa_TestGen -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=60
```

### log
java -jar .\evosuite-1.0.6.jar -class org.evoservice.RegistroDiCassa.RegistroDiCassa_TestGen -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=60
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.RegistroDiCassa.RegistroDiCassa_TestGen
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 15352
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.RegistroDiCassa.RegistroDiCassa_TestGen
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  [Progress:>                             0%] [Cov:>                                  0%]  - Line 254
  - Branch 119
* Using seed 1728590933108
* Starting evolution
  [Progress:==============================100%] [Cov:=============================>     85%]
* Search finished after 61s and 127 generations, 38717 statements, best individual has fitness: 22.977777777777778
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 83%
* Total number of goals: 254
* Number of covered goals: 210
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 89%
* Total number of goals: 119
* Number of covered goals: 106
* Generated 21 tests with total length 69
* Resulting test suite's coverage: 86% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
  [MASTER] 22:10:17.528 [logback-1] WARN  JUnitAnalyzer - Found unstable test named test0 -> class java.lang.AssertionError: null
  [MASTER] 22:10:17.528 [logback-1] WARN  JUnitAnalyzer - Failing test:
  RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Pizza registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0 = RegistroDiCassa_TestGen.RegistroDiCassav4Sig.margherita;
  assertNotNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0);

RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Pizza registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza1 = registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0.get("n`Lec~V");
assertNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza1);

String string0 = registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0.toString(registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza1);
assertNull(string0);


[MASTER] 22:10:18.028 [logback-1] WARN  JUnitAnalyzer - Found unstable test named test0 -> class java.lang.AssertionError: null
[MASTER] 22:10:18.028 [logback-1] WARN  JUnitAnalyzer - Failing test:
RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Pizza registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0 = RegistroDiCassa_TestGen.RegistroDiCassav4Sig.margherita;
assertNotNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0);

RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Pizza registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza1 = registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0.get("margherita");
assertSame(registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0, registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza1);
assertSame(registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza1, registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0);
assertNotNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza1);


[MASTER] 22:10:21.250 [logback-1] WARN  JUnitAnalyzer - Found unstable test named test12 -> class java.lang.NullPointerException: null
[MASTER] 22:10:21.250 [logback-1] WARN  JUnitAnalyzer - Failing test:
RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Pizza registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0 = RegistroDiCassa_TestGen.RegistroDiCassav4Sig.margherita;
//  // Unstable assertion: assertNotNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0);

RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Pizza registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza1 = registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0.get("margherita");
//  // Unstable assertion: assertSame(registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0, registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza1);
//  // Unstable assertion: assertSame(registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza1, registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0);
//  // Unstable assertion: assertNotNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza1);


[MASTER] 22:10:21.250 [logback-1] WARN  JUnitAnalyzer - Found unstable test named test10 -> class java.lang.NullPointerException: null
[MASTER] 22:10:21.251 [logback-1] WARN  JUnitAnalyzer - Failing test:
RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Pizza registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0 = RegistroDiCassa_TestGen.RegistroDiCassav4Sig.margherita;
//  // Unstable assertion: assertNotNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0);

RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Pizza registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza1 = registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0.get("n`Lec~V");
//  // Unstable assertion: assertNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza1);

String string0 = registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0.toString(registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza1);
//  // Unstable assertion: assertNull(string0);


* Writing JUnit test case 'RegistroDiCassa_TestGen_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
```
#### Avalla
```
```
