# V007

I added the final state condition (total coins inserted = 25), we can in this way see the power
of evosuite that generates a scenario in which it reaches the expected goal

```java
public boolean isFinalState(){
    return this.get_coins() == 25;
}
```

Then I translated the test scenarios into AVALLA and verified the same response from ASM,
the only difference is due to the fact that in java ASM requires all the monitored 
variables for each step, while in Asmeta it requires only the necessary ones, 
in this way evosuite created scenarios with useless sets that do not bring effective changes and
that can lead the code to be less readable.

## Problems

- Can't reach the 100% of coverage

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
* Connecting to master process on port 17713
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
  - Line 62
    [Progress:>                             0%] [Cov:>                                  0%]  - Branch 32
* Using seed 1725352926596
* Starting evolution
  [Progress:==============================100%] [Cov:=================================> 96%]
* Search finished after 61s and 670 generations, 552683 statements, best individual has fitness: 1.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 100%
* Total number of goals: 62
* Number of covered goals: 62
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 94%
* Total number of goals: 32
* Number of covered goals: 30
* Generated 2 tests with total length 36
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
Set chosenProduct = MILK
</State 0 (controlled)>

<Stato attuale>
coins = 1
 available =>  (COFFEE) = 10
 available =>  (TEA) = 10
 available =>  (MILK) = 9
Branch CoinType HALF covered
Branch Product MILK covered
```
#### Avalla
```
check succeeded: available(MILK) = 10 
check succeeded: available(TEA) = 10 
check succeeded: available(COFFEE) = 10 
check succeeded: coins = 0 
check succeeded: available(MILK) = 9 
check succeeded: available(TEA) = 10 
check succeeded: available(COFFEE) = 10 
check succeeded: coins = 1 
```
### test1
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
<State 1 (controlled)>
coins = 1
 available =>  (COFFEE) = 10
 available =>  (TEA) = 10
 available =>  (MILK) = 9
Set insertedCoin = ONE
Set chosenProduct = COFFEE
</State 1 (controlled)>

<Stato attuale>
coins = 2
 available =>  (COFFEE) = 9
 available =>  (TEA) = 10
 available =>  (MILK) = 9
Branch CoinType ONE covered
Branch Product COFFEE covered
<State 2 (controlled)>
coins = 2
 available =>  (COFFEE) = 9
 available =>  (TEA) = 10
 available =>  (MILK) = 9
Set insertedCoin = ONE
Set chosenProduct = TEA
</State 2 (controlled)>

<Stato attuale>
coins = 3
 available =>  (COFFEE) = 9
 available =>  (TEA) = 9
 available =>  (MILK) = 9
Branch CoinType ONE covered
Branch Product TEA covered
<State 3 (controlled)>
coins = 3
 available =>  (COFFEE) = 9
 available =>  (TEA) = 9
 available =>  (MILK) = 9
Set insertedCoin = HALF
Set chosenProduct = TEA
</State 3 (controlled)>

<Stato attuale>
coins = 4
 available =>  (COFFEE) = 9
 available =>  (TEA) = 9
 available =>  (MILK) = 8
Branch CoinType HALF covered
Branch Product TEA covered
<State 4 (controlled)>
coins = 4
 available =>  (COFFEE) = 9
 available =>  (TEA) = 9
 available =>  (MILK) = 8
Set insertedCoin = HALF
Set chosenProduct = TEA
</State 4 (controlled)>

<Stato attuale>
coins = 5
 available =>  (COFFEE) = 9
 available =>  (TEA) = 9
 available =>  (MILK) = 7
Branch CoinType HALF covered
Branch Product TEA covered
<State 5 (controlled)>
coins = 5
 available =>  (COFFEE) = 9
 available =>  (TEA) = 9
 available =>  (MILK) = 7
Set insertedCoin = HALF
Set chosenProduct = TEA
</State 5 (controlled)>

<Stato attuale>
coins = 6
 available =>  (COFFEE) = 9
 available =>  (TEA) = 9
 available =>  (MILK) = 6
Branch CoinType HALF covered
Branch Product TEA covered
<State 6 (controlled)>
coins = 6
 available =>  (COFFEE) = 9
 available =>  (TEA) = 9
 available =>  (MILK) = 6
Set insertedCoin = ONE
Set chosenProduct = COFFEE
</State 6 (controlled)>

<Stato attuale>
coins = 7
 available =>  (COFFEE) = 8
 available =>  (TEA) = 9
 available =>  (MILK) = 6
Branch CoinType ONE covered
Branch Product COFFEE covered
<State 7 (controlled)>
coins = 7
 available =>  (COFFEE) = 8
 available =>  (TEA) = 9
 available =>  (MILK) = 6
Set insertedCoin = ONE
Set chosenProduct = COFFEE
</State 7 (controlled)>

<Stato attuale>
coins = 8
 available =>  (COFFEE) = 7
 available =>  (TEA) = 9
 available =>  (MILK) = 6
Branch CoinType ONE covered
Branch Product COFFEE covered
<State 8 (controlled)>
coins = 8
 available =>  (COFFEE) = 7
 available =>  (TEA) = 9
 available =>  (MILK) = 6
Set insertedCoin = ONE
Set chosenProduct = TEA
</State 8 (controlled)>

<Stato attuale>
coins = 9
 available =>  (COFFEE) = 7
 available =>  (TEA) = 8
 available =>  (MILK) = 6
Branch CoinType ONE covered
Branch Product TEA covered
<State 9 (controlled)>
coins = 9
 available =>  (COFFEE) = 7
 available =>  (TEA) = 8
 available =>  (MILK) = 6
Set insertedCoin = HALF
Set chosenProduct = COFFEE
</State 9 (controlled)>

<Stato attuale>
coins = 10
 available =>  (COFFEE) = 7
 available =>  (TEA) = 8
 available =>  (MILK) = 5
Branch CoinType HALF covered
Branch Product COFFEE covered
<State 10 (controlled)>
coins = 10
 available =>  (COFFEE) = 7
 available =>  (TEA) = 8
 available =>  (MILK) = 5
Set insertedCoin = ONE
Set chosenProduct = TEA
</State 10 (controlled)>

<Stato attuale>
coins = 11
 available =>  (COFFEE) = 7
 available =>  (TEA) = 7
 available =>  (MILK) = 5
Branch CoinType ONE covered
Branch Product TEA covered
<State 11 (controlled)>
coins = 11
 available =>  (COFFEE) = 7
 available =>  (TEA) = 7
 available =>  (MILK) = 5
Set insertedCoin = ONE
Set chosenProduct = COFFEE
</State 11 (controlled)>

<Stato attuale>
coins = 12
 available =>  (COFFEE) = 6
 available =>  (TEA) = 7
 available =>  (MILK) = 5
Branch CoinType ONE covered
Branch Product COFFEE covered
<State 12 (controlled)>
coins = 12
 available =>  (COFFEE) = 6
 available =>  (TEA) = 7
 available =>  (MILK) = 5
Set insertedCoin = HALF
Set chosenProduct = TEA
</State 12 (controlled)>

<Stato attuale>
coins = 13
 available =>  (COFFEE) = 6
 available =>  (TEA) = 7
 available =>  (MILK) = 4
Branch CoinType HALF covered
Branch Product TEA covered
<State 13 (controlled)>
coins = 13
 available =>  (COFFEE) = 6
 available =>  (TEA) = 7
 available =>  (MILK) = 4
Set insertedCoin = ONE
Set chosenProduct = TEA
</State 13 (controlled)>

<Stato attuale>
coins = 14
 available =>  (COFFEE) = 6
 available =>  (TEA) = 6
 available =>  (MILK) = 4
Branch CoinType ONE covered
Branch Product TEA covered
<State 14 (controlled)>
coins = 14
 available =>  (COFFEE) = 6
 available =>  (TEA) = 6
 available =>  (MILK) = 4
Set insertedCoin = ONE
Set chosenProduct = COFFEE
</State 14 (controlled)>

<Stato attuale>
coins = 15
 available =>  (COFFEE) = 5
 available =>  (TEA) = 6
 available =>  (MILK) = 4
Branch CoinType ONE covered
Branch Product COFFEE covered
<State 15 (controlled)>
coins = 15
 available =>  (COFFEE) = 5
 available =>  (TEA) = 6
 available =>  (MILK) = 4
Set insertedCoin = HALF
Set chosenProduct = TEA
</State 15 (controlled)>

<Stato attuale>
coins = 16
 available =>  (COFFEE) = 5
 available =>  (TEA) = 6
 available =>  (MILK) = 3
Branch CoinType HALF covered
Branch Product TEA covered
<State 16 (controlled)>
coins = 16
 available =>  (COFFEE) = 5
 available =>  (TEA) = 6
 available =>  (MILK) = 3
Set insertedCoin = ONE
Set chosenProduct = TEA
</State 16 (controlled)>

<Stato attuale>
coins = 17
 available =>  (COFFEE) = 5
 available =>  (TEA) = 5
 available =>  (MILK) = 3
Branch CoinType ONE covered
Branch Product TEA covered
<State 17 (controlled)>
coins = 17
 available =>  (COFFEE) = 5
 available =>  (TEA) = 5
 available =>  (MILK) = 3
Set insertedCoin = HALF
Set chosenProduct = COFFEE
</State 17 (controlled)>

<Stato attuale>
coins = 18
 available =>  (COFFEE) = 5
 available =>  (TEA) = 5
 available =>  (MILK) = 2
Branch CoinType HALF covered
Branch Product COFFEE covered
<State 18 (controlled)>
coins = 18
 available =>  (COFFEE) = 5
 available =>  (TEA) = 5
 available =>  (MILK) = 2
Set insertedCoin = ONE
Set chosenProduct = COFFEE
</State 18 (controlled)>

<Stato attuale>
coins = 19
 available =>  (COFFEE) = 4
 available =>  (TEA) = 5
 available =>  (MILK) = 2
Branch CoinType ONE covered
Branch Product COFFEE covered
<State 19 (controlled)>
coins = 19
 available =>  (COFFEE) = 4
 available =>  (TEA) = 5
 available =>  (MILK) = 2
Set insertedCoin = HALF
Set chosenProduct = COFFEE
</State 19 (controlled)>

<Stato attuale>
coins = 20
 available =>  (COFFEE) = 4
 available =>  (TEA) = 5
 available =>  (MILK) = 1
Branch CoinType HALF covered
Branch Product COFFEE covered
<State 20 (controlled)>
coins = 20
 available =>  (COFFEE) = 4
 available =>  (TEA) = 5
 available =>  (MILK) = 1
Set insertedCoin = ONE
Set chosenProduct = COFFEE
</State 20 (controlled)>

<Stato attuale>
coins = 21
 available =>  (COFFEE) = 3
 available =>  (TEA) = 5
 available =>  (MILK) = 1
Branch CoinType ONE covered
Branch Product COFFEE covered
<State 21 (controlled)>
coins = 21
 available =>  (COFFEE) = 3
 available =>  (TEA) = 5
 available =>  (MILK) = 1
Set insertedCoin = HALF
Set chosenProduct = TEA
</State 21 (controlled)>

<Stato attuale>
coins = 22
 available =>  (COFFEE) = 3
 available =>  (TEA) = 5
 available =>  (MILK) = 0
Branch CoinType HALF covered
Branch Product TEA covered
<State 22 (controlled)>
coins = 22
 available =>  (COFFEE) = 3
 available =>  (TEA) = 5
 available =>  (MILK) = 0
Set insertedCoin = ONE
Set chosenProduct = COFFEE
</State 22 (controlled)>

<Stato attuale>
coins = 23
 available =>  (COFFEE) = 2
 available =>  (TEA) = 5
 available =>  (MILK) = 0
Branch CoinType ONE covered
Branch Product COFFEE covered
<State 23 (controlled)>
coins = 23
 available =>  (COFFEE) = 2
 available =>  (TEA) = 5
 available =>  (MILK) = 0
Set insertedCoin = ONE
Set chosenProduct = COFFEE
</State 23 (controlled)>

<Stato attuale>
coins = 24
 available =>  (COFFEE) = 1
 available =>  (TEA) = 5
 available =>  (MILK) = 0
Branch CoinType ONE covered
Branch Product COFFEE covered
<State 24 (controlled)>
coins = 24
 available =>  (COFFEE) = 1
 available =>  (TEA) = 5
 available =>  (MILK) = 0
Set insertedCoin = ONE
Set chosenProduct = COFFEE
</State 24 (controlled)>

<Stato attuale>
coins = 25
 available =>  (COFFEE) = 0
 available =>  (TEA) = 5
 available =>  (MILK) = 0
Branch CoinType ONE covered
Branch Product COFFEE covered

```
#### Avalla
```
check succeeded: available(MILK) = 10 
check succeeded: available(TEA) = 10 
check succeeded: available(COFFEE) = 10 
check succeeded: coins = 0 
check succeeded: available(MILK) = 9 
check succeeded: available(TEA) = 10 
check succeeded: available(COFFEE) = 10 
check succeeded: coins = 1 
check succeeded: available(MILK) = 9 
check succeeded: available(TEA) = 10 
check succeeded: available(COFFEE) = 9 
check succeeded: coins = 2 
check succeeded: available(MILK) = 9 
check succeeded: available(TEA) = 9 
check succeeded: available(COFFEE) = 9 
check succeeded: coins = 3 
check succeeded: available(MILK) = 8 
check succeeded: available(TEA) = 9 
check succeeded: available(COFFEE) = 9 
check succeeded: coins = 4 
check succeeded: available(MILK) = 7 
check succeeded: available(TEA) = 9 
check succeeded: available(COFFEE) = 9 
check succeeded: coins = 5 
check succeeded: available(MILK) = 6 
check succeeded: available(TEA) = 9 
check succeeded: available(COFFEE) = 9 
check succeeded: coins = 6 
check succeeded: available(MILK) = 6 
check succeeded: available(TEA) = 9 
check succeeded: available(COFFEE) = 8 
check succeeded: coins = 7 
check succeeded: available(MILK) = 6 
check succeeded: available(TEA) = 9 
check succeeded: available(COFFEE) = 7 
check succeeded: coins = 8 
check succeeded: available(MILK) = 6 
check succeeded: available(TEA) = 8 
check succeeded: available(COFFEE) = 7 
check succeeded: coins = 9 
check succeeded: available(MILK) = 5 
check succeeded: available(TEA) = 8 
check succeeded: available(COFFEE) = 7 
check succeeded: coins = 10 
check succeeded: available(MILK) = 5 
check succeeded: available(TEA) = 7 
check succeeded: available(COFFEE) = 7 
check succeeded: coins = 11 
check succeeded: available(MILK) = 5 
check succeeded: available(TEA) = 7 
check succeeded: available(COFFEE) = 6 
check succeeded: coins = 12 
check succeeded: available(MILK) = 4 
check succeeded: available(TEA) = 7 
check succeeded: available(COFFEE) = 6 
check succeeded: coins = 13 
check succeeded: available(MILK) = 4 
check succeeded: available(TEA) = 6 
check succeeded: available(COFFEE) = 6 
check succeeded: coins = 14 
check succeeded: available(MILK) = 4 
check succeeded: available(TEA) = 6 
check succeeded: available(COFFEE) = 5 
check succeeded: coins = 15 
check succeeded: available(MILK) = 3 
check succeeded: available(TEA) = 6 
check succeeded: available(COFFEE) = 5 
check succeeded: coins = 16 
check succeeded: available(MILK) = 3 
check succeeded: available(TEA) = 5 
check succeeded: available(COFFEE) = 5 
check succeeded: coins = 17 
check succeeded: available(MILK) = 2 
check succeeded: available(TEA) = 5 
check succeeded: available(COFFEE) = 5 
check succeeded: coins = 18 
check succeeded: available(MILK) = 2 
check succeeded: available(TEA) = 5 
check succeeded: available(COFFEE) = 4 
check succeeded: coins = 19 
check succeeded: available(MILK) = 1 
check succeeded: available(TEA) = 5 
check succeeded: available(COFFEE) = 4 
check succeeded: coins = 20 
check succeeded: available(MILK) = 1 
check succeeded: available(TEA) = 5 
check succeeded: available(COFFEE) = 3 
check succeeded: coins = 21 
check succeeded: available(MILK) = 0 
check succeeded: available(TEA) = 5 
check succeeded: available(COFFEE) = 3 
check succeeded: coins = 22 
check succeeded: available(MILK) = 0 
check succeeded: available(TEA) = 5 
check succeeded: available(COFFEE) = 2 
check succeeded: coins = 23 
check succeeded: available(MILK) = 0 
check succeeded: available(TEA) = 5 
check succeeded: available(COFFEE) = 1 
check succeeded: coins = 24 
check succeeded: available(MILK) = 0 
check succeeded: available(TEA) = 5 
check succeeded: available(COFFEE) = 0 
check succeeded: coins = 25 
```