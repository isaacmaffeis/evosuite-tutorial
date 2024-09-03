# V006

In the auto-generation of the ASM class process I've considered the concrete Domain as 
Integer, so now Evosuite can make assertions.

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
java -jar .\evosuite-1.0.6.jar -class org.evoservice.coffeeVendingMachineNC.coffeeVendingMachineNC_ASM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all
```
### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.coffeeVendingMachineNC.coffeeVendingMachineNC_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\CoffeeVendingMachine-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 3417
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.coffeeVendingMachineNC.coffeeVendingMachineNC_ASM
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  [Progress:>                             0%] [Cov:>                                  0%]  - Line 58
  - Branch 29
* Using seed 1725351496483
* Starting evolution
  [Progress:==============================100%] [Cov:=================================> 96%]
* Search finished after 61s and 838 generations, 258264 statements, best individual has fitness: 1.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 100%
* Total number of goals: 58
* Number of covered goals: 58
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 93%
* Total number of goals: 29
* Number of covered goals: 27
* Generated 3 tests with total length 12
* Resulting test suite's coverage: 97% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'coffeeVendingMachineNC_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished
## Scenario
### test0
```
<State 0 (controlled)>
coins = 0
 available =>  (COFFEE) = 10
 available =>  (TEA) = 10
 available =>  (MILK) = 10
Set insertedCoin = HALF
Set chosenProduct = TEA
</State 0 (controlled)>

<Stato attuale>
coins = 1
 available =>  (COFFEE) = 10
 available =>  (TEA) = 10
 available =>  (MILK) = 9
Branch CoinType HALF covered
Branch Product TEA covered
```
#### Avalla
```
```
### test1
```
coins = 0
 available =>  (COFFEE) = 10
 available =>  (TEA) = 10
 available =>  (MILK) = 10
Set insertedCoin = HALF
Set chosenProduct = COFFEE
</State 0 (controlled)>

<Stato attuale>
coins = 1
 available =>  (COFFEE) = 10
 available =>  (TEA) = 10
 available =>  (MILK) = 9
Branch CoinType HALF covered
Branch Product COFFEE covered
```
#### Avalla
```
```
### test2
```
<State 0 (controlled)>
coins = 0
 available =>  (COFFEE) = 10
 available =>  (TEA) = 10
 available =>  (MILK) = 10
Set insertedCoin = ONE
Set chosenProduct = MILK
</State 0 (controlled)>

<Stato attuale>
coins = 0
 available =>  (COFFEE) = 10
 available =>  (TEA) = 10
 available =>  (MILK) = 10
Branch CoinType ONE covered
Branch Product MILK covered
```
#### Avalla
```
```