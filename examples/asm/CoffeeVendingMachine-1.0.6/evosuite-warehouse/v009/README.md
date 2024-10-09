# V009
In this version I tested the generated class directly:
- I incorporated the abstract signature class directly into the main class,
  in this way I could make all the methods private except the set, step and get methods which are
  the only public ones and visible from evosuite
- Criterion LINE:BRANCH:CBRANCH
- version with the step functions args
- coverage: evosuite 55%
- all the reachable rules covered, not all the main rule conditions

## Problems

- CBRANCH criterion did not increase the coverage

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
java -jar .\evosuite-1.0.6.jar -class org.evoservice.coffeeVendingMachineNC.coffeeVendingMachineNC -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all
```
### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.coffeeVendingMachineNC.coffeeVendingMachineNC
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\CoffeeVendingMachine-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 10493
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.coffeeVendingMachineNC.coffeeVendingMachineNC
* Test criteria:
  - Line Coverage
  - Branch Coverage
  - Context Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  - Line 133
  - Branch 89
  - CBranchFitnessFactory 89
    [Progress:>                             0%] [Cov:>                                  0%]* Using seed 1728406492947
* Starting evolution
  [Progress:==============================100%] [Cov:===================>               55%]
* Search finished after 62s and 153 generations, 47827 statements, best individual has fitness: 125.85435897435897
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 71%
* Total number of goals: 133
* Number of covered goals: 95
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 47%
* Total number of goals: 89
* Number of covered goals: 42
* Coverage analysis for criterion CBRANCH
* Coverage of criterion CBRANCH: 47%
* Total number of goals: 89
* Number of covered goals: 42
* Generated 9 tests with total length 27
* Resulting test suite's coverage: 55% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'coffeeVendingMachineNC_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```

```
#### Avalla
```
```
### test1
```
```
#### Avalla
```
```