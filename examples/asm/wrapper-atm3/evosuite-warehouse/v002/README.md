# V001

Version with:
- wrapper class with setters, step and getters
- PROS: I don't have to change the generated java class
- cover rules functions: in this way evosuite can see the rules and tries to cover them
- Cover data: evosuite 75%, intelliJ 56% branch and 85% lines in the _ASM class

## Problems
this example is more complex and evosuite struggles to cover all the branches, 
but it is not because of the wrapper class that works well instead.

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
* Connecting to master process on port 6469
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
  [Progress:>                             0%] [Cov:>                                  0%]  - Line 151
  - Branch 91
* Using seed 1728736447037
* Starting evolution
  [Progress:==============================100%] [Cov:==========================>        75%]
* Search finished after 152s and 69 generations, 12309 statements, best individual has fitness: 27.456521739130437
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
  [MASTER] 14:37:44.739 [logback-1] WARN  TestSuiteMinimizer - Minimization timeout. Roll back to original test suite
* Coverage of criterion LINE: 85%
* Total number of goals: 151
* Number of covered goals: 129
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 66%
* Total number of goals: 91
* Number of covered goals: 60
* Generated 19 tests with total length 137
* Resulting test suite's coverage: 76% (average coverage for all fitness functions)
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
