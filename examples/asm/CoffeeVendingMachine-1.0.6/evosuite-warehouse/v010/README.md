# V010
In this version I tested the generated class directly:
- I incorporated the abstract signature class directly into the main class,
  in this way I could make all the methods private except the set, step and get methods which are
  the only public ones and visible from evosuite
- Criterion LINE:BRANCH
- version with monitored sets 
- coverage: evosuite 60%
- all the reachable rules covered, improved the main rule conditions

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
java -jar .\evosuite-1.0.6.jar -class org.evoservice.coffeeVendingMachineNC.coffeeVendingMachineNC -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all
```
### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.coffeeVendingMachineNC.coffeeVendingMachineNC
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\CoffeeVendingMachine-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 8009
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.coffeeVendingMachineNC.coffeeVendingMachineNC
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  [Progress:>                             0%] [Cov:>                                  0%]  - Line 133
  - Branch 90
* Using seed 1728407195011
* Starting evolution
  [Progress:==============================100%] [Cov:=====================>             60%]
* Search finished after 61s and 155 generations, 61321 statements, best individual has fitness: 77.1826923076923
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 71%
* Total number of goals: 133
* Number of covered goals: 95
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 50%
* Total number of goals: 90
* Number of covered goals: 45
* Generated 9 tests with total length 46
* Resulting test suite's coverage: 61% (average coverage for all fitness functions)
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