# V003
I created a new version in which I reduced the number of steps needed, 
I considered 60 seconds as 6 steps of the machine

We can see how even without the final state condition evosuite in this case does well,
generating 2 consistent scenarios comparable with that of evoMBT

## Problems
- Evosuite unlike evoMBT stops as soon as it has covered the branches(formed by the semaphore state),
while evoMBT also covers the final transition that brings us back to the initial state, 
we can try to force this behavior by adding the final state condition

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
java -jar ../../../resources/evosuite-1.0.6.jar -class org.evoservice.trafficLight.TrafficLightv2_ASM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all
```
### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.trafficLight.TrafficLightv2_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\TrafficLight\evosuite-files\evosuite.properties
* Connecting to master process on port 8393
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.trafficLight.TrafficLightv2_ASM
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  - Line 42
    [Progress:>                             0%] [Cov:>                                  0%]  - Branch 21
* Using seed 1725794951767
* Starting evolution
  [Progress:==============================100%] [Cov:=================================> 97%]
* Search finished after 61s and 1768 generations, 617322 statements, best individual has fitness: 0.5
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 100%
* Total number of goals: 42
* Number of covered goals: 42
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 95%
* Total number of goals: 21
* Number of covered goals: 20
* Generated 2 tests with total length 24
* Resulting test suite's coverage: 98% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'TrafficLightv2_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
<State 0 (controlled)>
count = 0
status = RED
Set pedestrian = true
</State 0 (controlled)>

<Stato attuale>
count = 1
status = RED
Branch States RED covered
<State 1 (controlled)>
count = 1
status = RED
Set pedestrian = true
</State 1 (controlled)>

<Stato attuale>
count = 2
status = RED
Branch States RED covered
<State 2 (controlled)>
count = 2
status = RED
Set pedestrian = true
</State 2 (controlled)>

<Stato attuale>
count = 3
status = RED
Branch States RED covered
<State 3 (controlled)>
count = 3
status = RED
Set pedestrian = true
</State 3 (controlled)>

<Stato attuale>
count = 4
status = RED
Branch States RED covered
<State 4 (controlled)>
count = 4
status = RED
Set pedestrian = true
</State 4 (controlled)>

<Stato attuale>
count = 5
status = RED
Branch States RED covered
<State 5 (controlled)>
count = 5
status = RED
Set pedestrian = true
</State 5 (controlled)>

<Stato attuale>
count = 6
status = RED
Branch States RED covered
<State 6 (controlled)>
count = 6
status = RED
Set pedestrian = true
</State 6 (controlled)>

<Stato attuale>
count = 0
status = GREEN
Branch States GREEN covered
<State 7 (controlled)>
count = 0
status = GREEN
Set pedestrian = true
</State 7 (controlled)>

<Stato attuale>
count = 0
status = PENDING
Branch States PENDING covered
```
#### Avalla
```
```
### test1
```
<State 0 (controlled)>
count = 0
status = RED
Set pedestrian = false
</State 0 (controlled)>

<Stato attuale>
count = 1
status = RED
Branch States RED covered
<State 1 (controlled)>
count = 1
status = RED
Set pedestrian = false
</State 1 (controlled)>

<Stato attuale>
count = 2
status = RED
Branch States RED covered
<State 2 (controlled)>
count = 2
status = RED
Set pedestrian = false
</State 2 (controlled)>

<Stato attuale>
count = 3
status = RED
Branch States RED covered
<State 3 (controlled)>
count = 3
status = RED
Set pedestrian = false
</State 3 (controlled)>

<Stato attuale>
count = 4
status = RED
Branch States RED covered
<State 4 (controlled)>
count = 4
status = RED
Set pedestrian = false
</State 4 (controlled)>

<Stato attuale>
count = 5
status = RED
Branch States RED covered
<State 5 (controlled)>
count = 5
status = RED
Set pedestrian = false
</State 5 (controlled)>

<Stato attuale>
count = 6
status = RED
Branch States RED covered
<State 6 (controlled)>
count = 6
status = RED
Set pedestrian = false
</State 6 (controlled)>

<Stato attuale>
count = 0
status = GREEN
Branch States GREEN covered
<State 7 (controlled)>
count = 0
status = GREEN
Set pedestrian = false
</State 7 (controlled)>

<Stato attuale>
count = 1
status = GREEN
Branch States GREEN covered
<State 8 (controlled)>
count = 1
status = GREEN
Set pedestrian = false
</State 8 (controlled)>

<Stato attuale>
count = 2
status = GREEN
Branch States GREEN covered
<State 9 (controlled)>
count = 2
status = GREEN
Set pedestrian = false
</State 9 (controlled)>

<Stato attuale>
count = 3
status = GREEN
Branch States GREEN covered
<State 10 (controlled)>
count = 3
status = GREEN
Set pedestrian = false
</State 10 (controlled)>

<Stato attuale>
count = 4
status = GREEN
Branch States GREEN covered
<State 11 (controlled)>
count = 4
status = GREEN
Set pedestrian = false
</State 11 (controlled)>

<Stato attuale>
count = 5
status = GREEN
Branch States GREEN covered
<State 12 (controlled)>
count = 5
status = GREEN
Set pedestrian = false
</State 12 (controlled)>

<Stato attuale>
count = 6
status = GREEN
Branch States GREEN covered
<State 13 (controlled)>
count = 6
status = GREEN
Set pedestrian = false
</State 13 (controlled)>

<Stato attuale>
count = 0
status = YELLOW
Branch States YELLOW covered
```
#### Avalla
```
```