# V005
In this version I tested the generated class directly:
- I incorporated the abstract signature class directly into the main class, in this way I could make 
all the methods private except the set, step and get methods which are the only public ones and
visible from evosuite

## Problems

The generated texts are meaningful and interesting, only the coverage is not very satisfying at 56%

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
java -jar ../../../resources/evosuite-1.0.6.jar -class org.evoservice.trafficLight.TrafficLightv2 -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all
```
### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.trafficLight.TrafficLightv2
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\TrafficLight-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 9444
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.trafficLight.TrafficLightv2
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  - Line 180
    [Progress:>                             0%] [Cov:>                                  0%]  - Branch 64
* Using seed 1728073023189
* Starting evolution
  [Progress:=>                            5%] [Cov:===============>                   44%][MASTER] 22:17:09.418 [logback-2] ERROR TestCluster - Failed to check cache for java.util.function.Function<T, R> : Type points to itself
  [Progress:==============================100%] [Cov:===================>               56%]
* Search finished after 61s and 392 generations, 201734 statements, best individual has fitness: 53.48717948717949
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 57%
* Total number of goals: 180
* Number of covered goals: 103
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 56%
* Total number of goals: 64
* Number of covered goals: 36
* Generated 4 tests with total length 54
* Resulting test suite's coverage: 57% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'TrafficLightv2_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
```
#### Avalla
```
```