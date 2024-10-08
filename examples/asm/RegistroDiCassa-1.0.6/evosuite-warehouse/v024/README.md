# V024
In this version I added the criterion CBRANCH


## Problems

the operation did not bring the expected results:
- the coverage measured with intelliJ is the same (83%), while evosuite reports a worse coverage (73%).
- we can observe how some rules were not covered. 
- this criterion brings greater complexity in the tests (try-cath structure).

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
* Connecting to master process on port 11299
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.RegistroDiCassa.RegistroDiCassav4
* Test criteria:
  - Line Coverage
  - Branch Coverage
  - Context Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  - Line 232
  - Branch 96
  - CBranchFitnessFactory 96
    [Progress:>                             0%] [Cov:>                                  0%]* Using seed 1728293231919
* Starting evolution
  [Progress:==============================100%] [Cov:==========================>        77%]
* Search finished after 151s and 463 generations, 123555 statements, best individual has fitness: 64.47368421052632
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 84%
* Total number of goals: 232
* Number of covered goals: 195
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 74%
* Total number of goals: 96
* Number of covered goals: 71
* Coverage analysis for criterion CBRANCH
* Coverage of criterion CBRANCH: 74%
* Total number of goals: 96
* Number of covered goals: 71
* Generated 7 tests with total length 30
* Resulting test suite's coverage: 77% (average coverage for all fitness functions)
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
