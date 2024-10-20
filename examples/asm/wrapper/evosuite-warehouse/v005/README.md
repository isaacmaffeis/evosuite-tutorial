# V005

Version with:
- wrapper class with setters, step and getters
- PROS: I don't have to change the generated java class
- generated by asmetal2java
- options: coverRules=true coverOutputs=false

Added a new way to make assertions for abstract domain types:
```java
public String get_pizzaCorrente() {
    return RegistroDiCassav4.Pizza.toString(this.execution.pizzaCorrente.get());
}
```
needs to make static th toString inside the Pizza class:
```java
static String toString(Pizza a) {
    if (elems.contains(a)) {
        return val.get(elems.lastIndexOf(a));
    } else
        return null;
}
```

## Problems
evosuite has generated this code block,
directly using static methods of the signature and compromising the scenario.

```java
LinkedList<RegistroDiCassav4Sig.Pizza> linkedList0 = new LinkedList<RegistroDiCassav4Sig.Pizza>();
assertNotNull(linkedList0);
assertEquals(0, linkedList0.size());

RegistroDiCassav4Sig.Pizza.elems = (List<RegistroDiCassav4Sig.Pizza>) linkedList0;
assertEquals(0, linkedList0.size());
assertEquals(0, RegistroDiCassav4Sig.Pizza.elems.size());
assertTrue(RegistroDiCassav4Sig.Pizza.elems.isEmpty());
```
This is not a problem due to the change made but somehow using a static method (toString) 
evosuite also uses the others that it did not use before.

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
java -jar evosuite-1.0.6.jar -class org.evoservice.wrapper.RegistroDiCassav4_ATG -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=60
```

### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.wrapper.RegistroDiCassav4_ATG
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\wrapper\evosuite-files\evosuite.properties
* Connecting to master process on port 17578
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
* Using seed 1729428172740
* Starting evolution
  [Progress:==============================100%] [Cov:==============================>    88%]
* Search finished after 61s and 1342 generations, 278654 statements, best individual has fitness: 8.3
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 96%
* Total number of goals: 107
* Number of covered goals: 103
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 81%
* Total number of goals: 59
* Number of covered goals: 48
* Generated 10 tests with total length 43
* Resulting test suite's coverage: 89% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
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