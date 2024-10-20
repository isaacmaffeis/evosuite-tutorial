# V002

Version with:
- wrapper class with setters, step and getters
- PROS: I don't have to change the generated java class

created the cover branches functions in order to let evosuite see the branches of the rules.

## Problems


## How to
```shell
mvn compile
```
```shell
mvn dependency:copy-dependencies -DincludeScope=runtime
```
```shell
java -jar ../../../resources/evosuite-1.0.6.jar -setup target/classes target/dependency/commons-collections-3.2.2.jar
```
```shell
java -jar ../../../resources/evosuite-1.0.6.jar -class org.evoservice.wrapper.RegistroDiCassav4_ASM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=60
```

### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.wrapper.RegistroDiCassav4_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\wrapper\evosuite-files\evosuite.properties
* Connecting to master process on port 12927
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.wrapper.RegistroDiCassav4_ASM
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
  [Progress:>                             0%] [Cov:>                                  0%]* Total number of test goals:
  - Line 53
  - Branch 22
* Using seed 1728652623236
* Starting evolution
  [Progress:==============================100%] [Cov:============================>      80%]
* Search finished after 61s and 2969 generations, 190295 statements, best individual has fitness: 6.857142857142857
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 89%
* Total number of goals: 53
* Number of covered goals: 47
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 73%
* Total number of goals: 22
* Number of covered goals: 16
* Generated 11 tests with total length 25
* Resulting test suite's coverage: 81% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'RegistroDiCassav4_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
```
#### Avalla
```
```
