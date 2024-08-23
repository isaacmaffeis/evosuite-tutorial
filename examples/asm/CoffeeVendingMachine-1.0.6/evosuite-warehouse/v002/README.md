# V002
I used enumeratives instead of integers to simplify the number of test cases and get a scenario
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
* Connecting to master process on port 19635
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
  - Line 34
    [Progress:>                             0%] [Cov:>                                  0%]  - Branch 12
* Using seed 1724430833221
* Starting evolution
  [Progress:=>                            6%] [Cov:===================================100%]
* Search finished after 4s and 5 generations, 6861 statements, best individual has fitness: 0.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 100%
* Total number of goals: 34
* Number of covered goals: 34
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 100%
* Total number of goals: 12
* Number of covered goals: 12
* Generated 1 tests with total length 14
* Resulting test suite's coverage: 100% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'CoffeeVendingMachineFSM_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### A
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
 available =>  (MILK)= 10
<State 2 (controlled)>
coins = 1
 available =>  (COFFEE)= 9
 available =>  (TEA)= 10
 available =>  (MILK)= 10
</State 2 (controlled)>

<Stato attuale>
coins = 2
 available =>  (COFFEE)= 8
 available =>  (TEA)= 10
 available =>  (MILK)= 10
<State 3 (controlled)>
coins = 2
 available =>  (COFFEE)= 8
 available =>  (TEA)= 10
 available =>  (MILK)= 10
</State 3 (controlled)>

<Stato attuale>
coins = 3
 available =>  (COFFEE)= 7
 available =>  (TEA)= 10
 available =>  (MILK)= 10
<State 4 (controlled)>
coins = 3
 available =>  (COFFEE)= 7
 available =>  (TEA)= 10
 available =>  (MILK)= 10
</State 4 (controlled)>

<Stato attuale>
coins = 4
 available =>  (COFFEE)= 6
 available =>  (TEA)= 10
 available =>  (MILK)= 10
<State 5 (controlled)>
coins = 4
 available =>  (COFFEE)= 6
 available =>  (TEA)= 10
 available =>  (MILK)= 10
</State 5 (controlled)>

<Stato attuale>
coins = 5
 available =>  (COFFEE)= 5
 available =>  (TEA)= 10
 available =>  (MILK)= 10
<State 6 (controlled)>
coins = 5
 available =>  (COFFEE)= 5
 available =>  (TEA)= 10
 available =>  (MILK)= 10
</State 6 (controlled)>

<Stato attuale>
coins = 6
 available =>  (COFFEE)= 4
 available =>  (TEA)= 10
 available =>  (MILK)= 10
<State 7 (controlled)>
coins = 6
 available =>  (COFFEE)= 4
 available =>  (TEA)= 10
 available =>  (MILK)= 10
</State 7 (controlled)>

<Stato attuale>
coins = 7
 available =>  (COFFEE)= 3
 available =>  (TEA)= 10
 available =>  (MILK)= 10
<State 8 (controlled)>
coins = 7
 available =>  (COFFEE)= 3
 available =>  (TEA)= 10
 available =>  (MILK)= 10
</State 8 (controlled)>

<Stato attuale>
coins = 8
 available =>  (COFFEE)= 2
 available =>  (TEA)= 10
 available =>  (MILK)= 10
<State 9 (controlled)>
coins = 8
 available =>  (COFFEE)= 2
 available =>  (TEA)= 10
 available =>  (MILK)= 10
</State 9 (controlled)>

<Stato attuale>
coins = 9
 available =>  (COFFEE)= 1
 available =>  (TEA)= 10
 available =>  (MILK)= 10
<State 10 (controlled)>
coins = 9
 available =>  (COFFEE)= 1
 available =>  (TEA)= 10
 available =>  (MILK)= 10
</State 10 (controlled)>

<Stato attuale>
coins = 10
 available =>  (COFFEE)= 0
 available =>  (TEA)= 10
 available =>  (MILK)= 10

<Stato finale>
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.635 s -- in org.evoservice.coffeeVendingMachineNC.CoffeeVendingMachineFSM_ESTest
[INFO] 
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.526 s
[INFO] Finished at: 2024-08-23T18:21:19+02:00
[INFO] ------------------------------------------------------------------------
```
### B
```
<State 1 (controlled)>
coins = 0
available =>  (COFFEE)= 10
available =>  (TEA)= 10
available =>  (MILK)= 10
</State 1 (controlled)>

<Stato attuale>
coins = 1
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 9
<State 2 (controlled)>
coins = 1
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 9
</State 2 (controlled)>

<Stato attuale>
coins = 2
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 8
<State 3 (controlled)>
coins = 2
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 8
</State 3 (controlled)>

<Stato attuale>
coins = 3
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 7
<State 4 (controlled)>
coins = 3
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 7
</State 4 (controlled)>

<Stato attuale>
coins = 4
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 6
<State 5 (controlled)>
coins = 4
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 6
</State 5 (controlled)>

<Stato attuale>
coins = 5
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 5
<State 6 (controlled)>
coins = 5
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 5
</State 6 (controlled)>

<Stato attuale>
coins = 6
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 4
<State 7 (controlled)>
coins = 6
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 4
</State 7 (controlled)>

<Stato attuale>
coins = 7
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 3
<State 8 (controlled)>
coins = 7
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 3
</State 8 (controlled)>

<Stato attuale>
coins = 8
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 2
<State 9 (controlled)>
coins = 8
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 2
</State 9 (controlled)>

<Stato attuale>
coins = 9
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 1
<State 10 (controlled)>
coins = 9
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 1
</State 10 (controlled)>

<Stato attuale>
coins = 10
 available =>  (COFFEE)= 10
 available =>  (TEA)= 10
 available =>  (MILK)= 0

<Stato finale>
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.257 s -- in org.evoservice.coffeeVendingMachineNC.CoffeeVendingMachineFSM_ESTest
[INFO] 
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.234 s
[INFO] Finished at: 2024-08-23T18:35:45+02:00
[INFO] ------------------------------------------------------------------------
```