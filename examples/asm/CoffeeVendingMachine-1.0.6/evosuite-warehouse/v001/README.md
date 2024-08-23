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
java -jar .\evosuite-1.0.6.jar -class org.evoservice.coffeeVendingMachineNC.CoffeeVendingMachineFSM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all
```
### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.coffeeVendingMachineNC.CoffeeVendingMachineFSM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\CoffeeVendingMachine-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 16490
* Analyzing classpath:
    - target/classes
    - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.coffeeVendingMachineNC.CoffeeVendingMachineFSM
* Test criteria:
    - Line Coverage
    - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
    - Line 40
      [Progress:>                             0%] [Cov:>                                  0%]  - Branch 20
* Using seed 1724416666227
* Starting evolution
  [Progress:=======>                      26%] [Cov:===================================100%]
* Search finished after 17s and 68 generations, 38035 statements, best individual has fitness: 0.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 100%
* Total number of goals: 40
* Number of covered goals: 40
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 100%
* Total number of goals: 20
* Number of covered goals: 20
* Generated 5 tests with total length 24
* Resulting test suite's coverage: 100% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'CoffeeVendingMachineFSM_ESTest' to evosuite-tests
* Done!

* Computation finished