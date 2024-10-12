# V001

Version with:
- wrapper class with setters, step and getters
- PROS: I don't have to change the generated java class

## Problems
evosuite doesn't cover the rules because it cannot see them

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
java -jar ../../../resources/evosuite-1.0.6.jar -class org.evoservice.wrapper.ATM3v2_ASM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=60
```

### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.wrapper.ATM3v2_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\wrapper-atm3\evosuite-files\evosuite.properties
* Connecting to master process on port 18118
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.wrapper.ATM3v2_ASM
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  [Progress:>                             0%] [Cov:>                                  0%]  - Line 61
  - Branch 22
* Using seed 1728734625664
* Starting evolution
  [Progress:====>                         15%] [Cov:===================================100%]
* Search finished after 10s and 18 generations, 3909 statements, best individual has fitness: 0.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 100%
* Total number of goals: 61
* Number of covered goals: 61
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 100%
* Total number of goals: 22
* Number of covered goals: 22
* Generated 17 tests with total length 37
* Resulting test suite's coverage: 100% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'ATM3v2_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
```
#### Avalla
```
```
