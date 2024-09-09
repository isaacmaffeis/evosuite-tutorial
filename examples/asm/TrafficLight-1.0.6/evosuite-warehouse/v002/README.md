# V002
I tried to force evosuite by setting a final state condition
and increasing the search budget time (`-Dsearch_budget=2000`).

## Problems
Evosuite still fails to reach the goal and I also get an exception
```
Permissions denied during test execution:
  - java.lang.RuntimePermission:
    writeFileDescriptor: 6
```
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
java -jar ../../../resources/evosuite-1.0.6.jar -class org.evoservice.trafficLight.TrafficLight_ASM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=2000
```
### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.trafficLight.TrafficLight_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\TrafficLight\evosuite-files\evosuite.properties
* Connecting to master process on port 3599
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.trafficLight.TrafficLight_ASM
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  - Line 45
  - Branch 24
    [Progress:>                             0%] [Cov:>                                  0%]* Using seed 1725790985879
* Starting evolution
  [Progress:==============================100%] [Cov:===========================>       78%]
* Search finished after 2001s and 56517 generations, 30123472 statements, best individual has fitness: 8.67142857142857
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 87%
* Total number of goals: 45
* Number of covered goals: 39
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 71%
* Total number of goals: 24
* Number of covered goals: 17
* Generated 1 tests with total length 2
* Resulting test suite's coverage: 79% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Permissions denied during test execution:
  - java.lang.RuntimePermission:
    writeFileDescriptor: 6
* Writing JUnit test case 'TrafficLight_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
```
#### Avalla
```
```