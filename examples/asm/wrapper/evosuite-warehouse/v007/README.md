# V007

Version with:
- wrapper class with setters, step and getters
- generated by asmetal2java
- options: coverRules=true coverOutputs=false

I made some changes to the RegistroDiCassav4 class (generated class):
- Integrated the signature directly into the class.
- Made the static fields private so that they cannot be used from outside.

If I place the coverRules function after the update in this example 
it seems to not test the exception behavior

```java
  public void step() {
  ...
  this.execution.updateASM();
  ...
  // Cover the rules
  coverRules();
  ...
```

## Problems


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
java -jar evosuite-1.0.6.jar -class org.evoservice.wrapper.RegistroDiCassav4_ATG -criterion LINE:BRANCH:WEAKMUTATION -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=60
```

### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.wrapper.RegistroDiCassav4_ATG
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\wrapper\evosuite-files\evosuite.properties
* Connecting to master process on port 14085
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.wrapper.RegistroDiCassav4_ATG
* Test criteria:
  - Line Coverage
  - Branch Coverage
  - Mutation testing (weak)
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  - Line 107
  - Branch 59
  - MutationFactory 140
    [Progress:>                             0%] [Cov:>                                  0%]* Using seed 1729432273743
* Starting evolution
  [Progress:==============================100%] [Cov:================================>  93%]
* Search finished after 61s and 827 generations, 241198 statements, best individual has fitness: 16.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 99%
* Total number of goals: 107
* Number of covered goals: 106
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 86%
* Total number of goals: 59
* Number of covered goals: 51
* Coverage analysis for criterion WEAKMUTATION
* Coverage of criterion WEAKMUTATION: 96%
* Total number of goals: 140
* Number of covered goals: 135
* Generated 8 tests with total length 42
* Resulting test suite's coverage: 94% (average coverage for all fitness functions)
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