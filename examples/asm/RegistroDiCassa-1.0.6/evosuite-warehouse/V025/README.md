# V025
I included the set methods directly in the step function to force the behavior as a state machine.

The coverage is the same as before, but if we look at the tests we notice that the rules are better 
covered and the complexity has reduced.

## Problems

It seems that evosuite is not able to cover the conditions well and therefore some branches are not
reached. We could try to change the algorithm because it could be the fault of random generation,
but we have to change the version of evosuite

UPDATE:
- generation with version 1.2.0 using DynaMosa algorithm produced the same result as version 1.0.6
  with random search, in this example we had no positive effects using the 1.2.0 version,
  but instead the test generation threw several exceptions making the process unstable.

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
