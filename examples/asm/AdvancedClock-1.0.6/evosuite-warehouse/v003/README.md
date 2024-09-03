# V003

I've added a final state condition:

```java
// final state condition
public boolean isFinalState(){
    return this.stato >=30;
}
```

## Problems

- if I increase the final state condition to 60 I can't reach it because 
the search budget time runs out, max search budget used: `-Dsearch_budget=300`

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
java -jar ../../../resources/evosuite-1.0.6.jar -class org.evoservice.advancedClock.AdvancedClock_ASM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=150
```
### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.advancedClock.AdvancedClock_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\AdvancedClock-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 6916
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.advancedClock.AdvancedClock_ASM
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  - Line 37
    [Progress:>                             0%] [Cov:>                                  0%]  - Branch 15
* Using seed 1725369363982
* Starting evolution
  [Progress:>                             3%] [Cov:===================================100%]
* Search finished after 6s and 7 generations, 10581 statements, best individual has fitness: 0.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 100%
* Total number of goals: 37
* Number of covered goals: 37
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 100%
* Total number of goals: 15
* Number of covered goals: 15
* Generated 1 tests with total length 32
* Resulting test suite's coverage: 100% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'AdvancedClock_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
<State 0 (controlled)>
seconds = 0
minutes = 0
hours = 0
</State 0 (controlled)>

<Stato attuale>
seconds = 1
minutes = 0
hours = 0
<State 1 (controlled)>
seconds = 1
minutes = 0
hours = 0
</State 1 (controlled)>

<Stato attuale>
seconds = 2
minutes = 0
hours = 0
<State 2 (controlled)>
seconds = 2
minutes = 0
hours = 0
</State 2 (controlled)>

<Stato attuale>
seconds = 3
minutes = 0
hours = 0
<State 3 (controlled)>
seconds = 3
minutes = 0
hours = 0
</State 3 (controlled)>

<Stato attuale>
seconds = 4
minutes = 0
hours = 0
<State 4 (controlled)>
seconds = 4
minutes = 0
hours = 0
</State 4 (controlled)>

<Stato attuale>
seconds = 5
minutes = 0
hours = 0
<State 5 (controlled)>
seconds = 5
minutes = 0
hours = 0
</State 5 (controlled)>

<Stato attuale>
seconds = 6
minutes = 0
hours = 0
<State 6 (controlled)>
seconds = 6
minutes = 0
hours = 0
</State 6 (controlled)>

<Stato attuale>
seconds = 7
minutes = 0
hours = 0
<State 7 (controlled)>
seconds = 7
minutes = 0
hours = 0
</State 7 (controlled)>

<Stato attuale>
seconds = 8
minutes = 0
hours = 0
<State 8 (controlled)>
seconds = 8
minutes = 0
hours = 0
</State 8 (controlled)>

<Stato attuale>
seconds = 9
minutes = 0
hours = 0
<State 9 (controlled)>
seconds = 9
minutes = 0
hours = 0
</State 9 (controlled)>

<Stato attuale>
seconds = 10
minutes = 0
hours = 0
<State 10 (controlled)>
seconds = 10
minutes = 0
hours = 0
</State 10 (controlled)>

<Stato attuale>
seconds = 11
minutes = 0
hours = 0
<State 11 (controlled)>
seconds = 11
minutes = 0
hours = 0
</State 11 (controlled)>

<Stato attuale>
seconds = 12
minutes = 0
hours = 0
<State 12 (controlled)>
seconds = 12
minutes = 0
hours = 0
</State 12 (controlled)>

<Stato attuale>
seconds = 13
minutes = 0
hours = 0
<State 13 (controlled)>
seconds = 13
minutes = 0
hours = 0
</State 13 (controlled)>

<Stato attuale>
seconds = 14
minutes = 0
hours = 0
<State 14 (controlled)>
seconds = 14
minutes = 0
hours = 0
</State 14 (controlled)>

<Stato attuale>
seconds = 15
minutes = 0
hours = 0
<State 15 (controlled)>
seconds = 15
minutes = 0
hours = 0
</State 15 (controlled)>

<Stato attuale>
seconds = 16
minutes = 0
hours = 0
<State 16 (controlled)>
seconds = 16
minutes = 0
hours = 0
</State 16 (controlled)>

<Stato attuale>
seconds = 17
minutes = 0
hours = 0
<State 17 (controlled)>
seconds = 17
minutes = 0
hours = 0
</State 17 (controlled)>

<Stato attuale>
seconds = 18
minutes = 0
hours = 0
<State 18 (controlled)>
seconds = 18
minutes = 0
hours = 0
</State 18 (controlled)>

<Stato attuale>
seconds = 19
minutes = 0
hours = 0
<State 19 (controlled)>
seconds = 19
minutes = 0
hours = 0
</State 19 (controlled)>

<Stato attuale>
seconds = 20
minutes = 0
hours = 0
<State 20 (controlled)>
seconds = 20
minutes = 0
hours = 0
</State 20 (controlled)>

<Stato attuale>
seconds = 21
minutes = 0
hours = 0
<State 21 (controlled)>
seconds = 21
minutes = 0
hours = 0
</State 21 (controlled)>

<Stato attuale>
seconds = 22
minutes = 0
hours = 0
<State 22 (controlled)>
seconds = 22
minutes = 0
hours = 0
</State 22 (controlled)>

<Stato attuale>
seconds = 23
minutes = 0
hours = 0
<State 23 (controlled)>
seconds = 23
minutes = 0
hours = 0
</State 23 (controlled)>

<Stato attuale>
seconds = 24
minutes = 0
hours = 0
<State 24 (controlled)>
seconds = 24
minutes = 0
hours = 0
</State 24 (controlled)>

<Stato attuale>
seconds = 25
minutes = 0
hours = 0
<State 25 (controlled)>
seconds = 25
minutes = 0
hours = 0
</State 25 (controlled)>

<Stato attuale>
seconds = 26
minutes = 0
hours = 0
<State 26 (controlled)>
seconds = 26
minutes = 0
hours = 0
</State 26 (controlled)>

<Stato attuale>
seconds = 27
minutes = 0
hours = 0
<State 27 (controlled)>
seconds = 27
minutes = 0
hours = 0
</State 27 (controlled)>

<Stato attuale>
seconds = 28
minutes = 0
hours = 0
<State 28 (controlled)>
seconds = 28
minutes = 0
hours = 0
</State 28 (controlled)>

<Stato attuale>
seconds = 29
minutes = 0
hours = 0
<State 29 (controlled)>
seconds = 29
minutes = 0
hours = 0
</State 29 (controlled)>

<Stato attuale>
seconds = 30
minutes = 0
hours = 0
<State 30 (controlled)>
seconds = 30
minutes = 0
hours = 0
</State 30 (controlled)>

<Stato attuale>
seconds = 31
minutes = 0
hours = 0
```
#### Avalla
```
```
