# V001

In this project I want to compare the behavior of Evosuite (random search) applied to an abstract 
state machine (ASM) and that of evoMBT (MOSA search) on an extended finite state machine (EFSM).

The project we are going to consider is a simple traffic light with a pedestrian crossing.
Here there is the link to the evoMBT example:
https://github.com/iv4xr-project/iv4xr-mbt/wiki#traffic-light-example-

The first difference is that in Asm we do not have temporal instants,
but we can simulate them considering different steps of the machine. 
For example 60 seconds are translated into 60 steps

In order to achieve satisfactory branch coverage evosuite must simulate at least about 130 steps 
(60 steps to go from RED to GREEN, 5 steps to wait for the pedestrian interrupt, 
60 steps to go from PENDING to YELLOW and another 5 to go from YELLOW to RED)
## Problems
- Evosuite is unable to generate such a high number of steps to achieve the goal 

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
java -jar ../../../resources/evosuite-1.0.6.jar -class org.evoservice.trafficLight.TrafficLight_ASM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=150
```
### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.trafficLight.TrafficLight_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\TrafficLight\evosuite-files\evosuite.properties
* Connecting to master process on port 8347
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
    - Line 42
    - Branch 21
      [Progress:>                             0%] [Cov:>                                  0%]* Using seed 1725789566437
* Starting evolution
  [Progress:==============================100%] [Cov:============================>      82%]
* Search finished after 151s and 7011 generations, 769595 statements, best individual has fitness: 5.666666666666666
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 88%
* Total number of goals: 42
* Number of covered goals: 37
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 76%
* Total number of goals: 21
* Number of covered goals: 16
* Generated 1 tests with total length 2
* Resulting test suite's coverage: 82% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
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