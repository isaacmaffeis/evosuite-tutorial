# V003
Modified the final state (now is when the vending machine is empty)
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
java -jar .\evosuite-1.0.6.jar -class org.evoservice.coffeeVendingMachineNC.CoffeeVendingMachineFSM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all
```
### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.coffeeVendingMachineNC.CoffeeVendingMachineFSM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\CoffeeVendingMachine-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 7600
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
  [Progress:>                             0%] [Cov:>                                  0%]  - Line 37
  - Branch 14
* Using seed 1724433199333
* Starting evolution
  [Progress:========>                     28%] [Cov:===================================100%]
* Search finished after 18s and 166 generations, 118669 statements, best individual has fitness: 0.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 100%
* Total number of goals: 37
* Number of covered goals: 37
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 100%
* Total number of goals: 14
* Number of covered goals: 14
* Generated 1 tests with total length 39
* Resulting test suite's coverage: 100% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'CoffeeVendingMachineFSM_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
```
<State 1 (controlled)>
coins = 0
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 10
</State 1 (controlled)>

<Stato attuale>
coins = 1
 available =>  (COFFEE)= 9
 available =>  (TEA)= 10
 available =>  (MILK)= 9
<State 2 (controlled)>
coins = 1
 available =>  (COFFEE)= 9
 available =>  (TEA)= 9
 available =>  (MILK)= 8
</State 2 (controlled)>

<Stato attuale>
coins = 2
 available =>  (COFFEE)= 9
 available =>  (TEA)= 9
 available =>  (MILK)= 7
<State 3 (controlled)>
coins = 2
 available =>  (COFFEE)= 9
 available =>  (TEA)= 9
 available =>  (MILK)= 7
</State 3 (controlled)>

<Stato attuale>
coins = 3
 available =>  (COFFEE)= 9
 available =>  (TEA)= 9
 available =>  (MILK)= 6
<State 4 (controlled)>
coins = 3
 available =>  (COFFEE)= 9
 available =>  (TEA)= 9
 available =>  (MILK)= 6
</State 4 (controlled)>

<Stato attuale>
coins = 4
 available =>  (COFFEE)= 9
 available =>  (TEA)= 9
 available =>  (MILK)= 5
<State 5 (controlled)>
coins = 4
 available =>  (COFFEE)= 9
 available =>  (TEA)= 9
 available =>  (MILK)= 5
</State 5 (controlled)>

<Stato attuale>
coins = 5
 available =>  (COFFEE)= 9
 available =>  (TEA)= 9
 available =>  (MILK)= 4
<State 6 (controlled)>
coins = 5
 available =>  (COFFEE)= 9
 available =>  (TEA)= 9
 available =>  (MILK)= 4
</State 6 (controlled)>

<Stato attuale>
coins = 6
 available =>  (COFFEE)= 8
 available =>  (TEA)= 9
 available =>  (MILK)= 4
<State 7 (controlled)>
coins = 6
 available =>  (COFFEE)= 8
 available =>  (TEA)= 9
 available =>  (MILK)= 4
</State 7 (controlled)>

<Stato attuale>
coins = 7
 available =>  (COFFEE)= 8
 available =>  (TEA)= 8
 available =>  (MILK)= 4
<State 8 (controlled)>
coins = 7
 available =>  (COFFEE)= 8
 available =>  (TEA)= 8
 available =>  (MILK)= 4
</State 8 (controlled)>

<Stato attuale>
coins = 8
 available =>  (COFFEE)= 7
 available =>  (TEA)= 8
 available =>  (MILK)= 4
<State 9 (controlled)>
coins = 8
 available =>  (COFFEE)= 7
 available =>  (TEA)= 8
 available =>  (MILK)= 4
</State 9 (controlled)>

<Stato attuale>
coins = 9
 available =>  (COFFEE)= 7
 available =>  (TEA)= 8
 available =>  (MILK)= 3
<State 10 (controlled)>
coins = 9
 available =>  (COFFEE)= 7
 available =>  (TEA)= 8
 available =>  (MILK)= 3
</State 10 (controlled)>

<Stato attuale>
coins = 10
 available =>  (COFFEE)= 7
 available =>  (TEA)= 8
 available =>  (MILK)= 2
<State 11 (controlled)>
coins = 10
 available =>  (COFFEE)= 7
 available =>  (TEA)= 8
 available =>  (MILK)= 2
</State 11 (controlled)>

<Stato attuale>
coins = 11
 available =>  (COFFEE)= 6
 available =>  (TEA)= 8
 available =>  (MILK)= 2
<State 12 (controlled)>
coins = 11
 available =>  (COFFEE)= 6
 available =>  (TEA)= 8
 available =>  (MILK)= 2
</State 12 (controlled)>

<Stato attuale>
coins = 12
 available =>  (COFFEE)= 5
 available =>  (TEA)= 8
 available =>  (MILK)= 2
<State 13 (controlled)>
coins = 12
 available =>  (COFFEE)= 5
 available =>  (TEA)= 8
 available =>  (MILK)= 2
</State 13 (controlled)>

<Stato attuale>
coins = 13
 available =>  (COFFEE)= 5
 available =>  (TEA)= 7
 available =>  (MILK)= 2
<State 14 (controlled)>
coins = 13
 available =>  (COFFEE)= 5
 available =>  (TEA)= 6
 available =>  (MILK)= 2
</State 14 (controlled)>

<Stato attuale>
coins = 14
 available =>  (COFFEE)= 4
 available =>  (TEA)= 6
 available =>  (MILK)= 2
<State 15 (controlled)>
coins = 16
 available =>  (COFFEE)= 1
 available =>  (TEA)= 6
 available =>  (MILK)= 2
</State 15 (controlled)>

<Stato attuale>
coins = 17
 available =>  (COFFEE)= 1
 available =>  (TEA)= 5
 available =>  (MILK)= 2
<State 16 (controlled)>
coins = 17
 available =>  (COFFEE)= 1
 available =>  (TEA)= 5
 available =>  (MILK)= 2
</State 16 (controlled)>

<Stato attuale>
coins = 18
 available =>  (COFFEE)= 1
 available =>  (TEA)= 5
 available =>  (MILK)= 1
<State 17 (controlled)>
coins = 18
 available =>  (COFFEE)= 1
 available =>  (TEA)= 5
 available =>  (MILK)= 1
</State 17 (controlled)>

<Stato attuale>
coins = 19
 available =>  (COFFEE)= 1
 available =>  (TEA)= 4
 available =>  (MILK)= 1
<State 18 (controlled)>
coins = 19
 available =>  (COFFEE)= 1
 available =>  (TEA)= 4
 available =>  (MILK)= 1
</State 18 (controlled)>

<Stato attuale>
coins = 20
 available =>  (COFFEE)= 1
 available =>  (TEA)= 4
 available =>  (MILK)= 0
<State 19 (controlled)>
coins = 20
 available =>  (COFFEE)= 1
 available =>  (TEA)= 4
 available =>  (MILK)= 0
</State 19 (controlled)>

<Stato attuale>
coins = 21
 available =>  (COFFEE)= 1
 available =>  (TEA)= 3
 available =>  (MILK)= 0
<State 20 (controlled)>
coins = 21
 available =>  (COFFEE)= 1
 available =>  (TEA)= 3
 available =>  (MILK)= 0
</State 20 (controlled)>

<Stato attuale>
coins = 22
 available =>  (COFFEE)= 1
 available =>  (TEA)= 2
 available =>  (MILK)= 0
<State 21 (controlled)>
coins = 22
 available =>  (COFFEE)= 1
 available =>  (TEA)= 2
 available =>  (MILK)= 0
</State 21 (controlled)>

<Stato attuale>
coins = 23
 available =>  (COFFEE)= 1
 available =>  (TEA)= 1
 available =>  (MILK)= 0
<State 22 (controlled)>
coins = 23
 available =>  (COFFEE)= 1
 available =>  (TEA)= 1
 available =>  (MILK)= 0
</State 22 (controlled)>

<Stato attuale>
coins = 24
 available =>  (COFFEE)= 0
 available =>  (TEA)= 1
 available =>  (MILK)= 0
<State 23 (controlled)>
coins = 24
 available =>  (COFFEE)= 0
 available =>  (TEA)= 1
 available =>  (MILK)= 0
</State 23 (controlled)>

<Stato attuale>
coins = 25
 available =>  (COFFEE)= 0
 available =>  (TEA)= 0
 available =>  (MILK)= 0

<Stato finale>
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.689 s -- in org.evoservice.coffeeVendingMachineNC.CoffeeVendingMachineFSM_ESTest
[INFO] 
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.352 s
[INFO] Finished at: 2024-08-23T19:15:18+02:00
[INFO] ------------------------------------------------------------------------
```