# V008
In this version I tested the generated class directly:
- I incorporated the abstract signature class directly into the main class,
  in this way I could make all the methods private except the set, step and get methods which are
  the only public ones and visible from evosuite
- Criterion LINE:BRANCH
- version with monitored setters
- low rules coverage


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
java -jar ../../../resources/evosuite-1.0.6.jar -class org.evoservice.atm3.ATM3v2 -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=150
```
### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.atm3.ATM3v2
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 11099
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.atm3.ATM3v2
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  - Line 300
    [Progress:>                             0%] [Cov:>                                  0%]  - Branch 232
* Using seed 1728423936541
* Starting evolution
  [Progress:==============================100%] [Cov:===============>                   45%]
* Search finished after 61s and 45 generations, 8739 statements, best individual has fitness: 276.8222188776265
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
  [MASTER] 23:47:44.963 [logback-1] WARN  TestSuiteMinimizer - Minimization timeout. Roll back to original test suite
* Coverage of criterion LINE: 62%
* Total number of goals: 300
* Number of covered goals: 185
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 30%
* Total number of goals: 232
* Number of covered goals: 70
* Generated 21 tests with total length 143
* Resulting test suite's coverage: 46% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'ATM3v2_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test00
```
```
#### Avalla
```
```