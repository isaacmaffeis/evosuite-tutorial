# V025

I updated the java class in order to create assertion for abstract types:
- made abstract the toString() method of the abstract type inner class.
- chanced the return value of the getter to String

example:
```java
private static class Pizza {
  ...
  static String toString(Pizza a) {
    if (elems.contains(a)) {
      return val.get(elems.lastIndexOf(a));
    } else
      return null;
  }
  ...
}


public String get_pizzaCorrente() {
  return Pizza.toString(pizzaCorrente.get());
}
```

## Problems

The change didn't bring the expected result, in fact evosuite doesn't use these getters, 
if not only for one case where it checks if the value is null:
```java
  String string0 = registroDiCassav4_0.get_pizzaCorrente();
  assertNull(string0);
```
Instead, it could have done this:
```
assertEquals("margherita", registroDiCassav4_0.get_pizzaCorrente());
```
This is only true when we are in the state PIZZASTANDARD_SELEZIONATA, and we select a pizza in the 
next step, in all other cases this value is null, maybe it is because of this. 
For this reason we have to test the behaviour in other cases.
However, it does not cause any malfunctions.

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
java -jar .\evosuite-1.0.6.jar -class org.evoservice.RegistroDiCassa.RegistroDiCassav4 -criterion LINE:BRANCH:CBRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=60
```

### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.RegistroDiCassa.RegistroDiCassav4
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 20681
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
  [Progress:>                             0%] [Cov:>                                  0%]  - Line 232
  - Branch 96
* Using seed 1728314510371
* Starting evolution
  [Progress:==============================100%] [Cov:============================>      82%]
* Search finished after 152s and 836 generations, 208647 statements, best individual has fitness: 33.970588235294116
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 86%
* Total number of goals: 232
* Number of covered goals: 199
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 79%
* Total number of goals: 96
* Number of covered goals: 76
* Generated 9 tests with total length 39
* Resulting test suite's coverage: 82% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'RegistroDiCassav4_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
```
#### Avalla
```
```
