# V005

I changed the set of abstract functions, now they are string instead of int, 
this way it is more readable and easier to translate into AVALLA.

## Problems

- the generation without goals correctly explores the state space,
but does not reach a good number of coverage, 
we can try to introduce a final state condition.

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
java -jar ../../../resources/evosuite-1.0.6.jar -class org.evoservice.atm3.ATM3_ASM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=150
```
### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.atm3.ATM3v2_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 13512
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.atm3.ATM3v2_ASM
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  - Line 134
  - Branch 64
    [Progress:>                             0%] [Cov:>                                  0%]* Using seed 1725467688080
* Starting evolution
  [Progress:==============================100%] [Cov:===============================>   90%]
* Search finished after 152s and 145 generations, 23241 statements, best individual has fitness: 9.5
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
  [MASTER] 18:38:24.557 [logback-1] WARN  TestSuiteMinimizer - Minimization timeout. Roll back to original test suite
* Coverage of criterion LINE: 93%
* Total number of goals: 134
* Number of covered goals: 125
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 88%
* Total number of goals: 64
* Number of covered goals: 56
* Generated 18 tests with total length 198
* Resulting test suite's coverage: 90% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'ATM3v2_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
<State 0 (controlled)>
NumCard = {card1, card2, card3}
atmState = AWAITCARD
moneyLeft = 1000
numOfBalanceChecks = 0
Set insertedCard = 0
Set insertedPin = 0
Set selectedService = WITHDRAWAL
Set insertMoneySizeStandard = 24
Set insertMoneySizeOther = -2859
Set standardOrOther = STANDARD
</State 0 (controlled)>

<Stato attuale>
NumCard = {card1, card2, card3}
atmState = AWAITPIN
moneyLeft = 1000
numOfBalanceChecks = 0
Branch Service WITHDRAWAL covered
Branch MoneySizeSelection STANDARD covered
Branch State AWAITPIN covered
```
#### Avalla
```
```
### test1
```
<State 0 (controlled)>
NumCard = {card1, card2, card3}
atmState = AWAITCARD
moneyLeft = 1000
numOfBalanceChecks = 0
Set insertedCard = 0
Set insertedPin = 0
Set selectedService = EXIT
Set insertMoneySizeStandard = 56
Set insertMoneySizeOther = -2859
Set standardOrOther = STANDARD
</State 0 (controlled)>

<Stato attuale>
NumCard = {card1, card2, card3}
atmState = AWAITPIN
moneyLeft = 1000
numOfBalanceChecks = 0
Branch Service EXIT covered
Branch MoneySizeSelection STANDARD covered
Branch State AWAITPIN covered

```
#### Avalla
```
```
### test2
```
<State 0 (controlled)>
NumCard = {card1, card2, card3}
atmState = AWAITCARD
moneyLeft = 1000
numOfBalanceChecks = 0
Set insertedCard = 0
Set insertedPin = 0
Set selectedService = WITHDRAWAL
Set insertMoneySizeStandard = 24
Set insertMoneySizeOther = -2859
Set standardOrOther = STANDARD
</State 0 (controlled)>

<Stato attuale>
NumCard = {card1, card2, card3}
atmState = AWAITPIN
moneyLeft = 1000
numOfBalanceChecks = 0
Branch Service WITHDRAWAL covered
Branch MoneySizeSelection STANDARD covered
Branch State AWAITPIN covered
<State 1 (controlled)>
NumCard = {card1, card2, card3}
atmState = AWAITPIN
moneyLeft = 1000
numOfBalanceChecks = 0
Set insertedCard = 0
Set insertedPin = 24
Set selectedService = WITHDRAWAL
Set insertMoneySizeStandard = 24
Set insertMoneySizeOther = 3000
Set standardOrOther = STANDARD
</State 1 (controlled)>

<Stato attuale>
NumCard = {card1, card2, card3}
atmState = AWAITCARD
moneyLeft = 1000
numOfBalanceChecks = 0
Branch Service WITHDRAWAL covered
Branch MoneySizeSelection STANDARD covered
Branch State AWAITCARD covered
```
#### Avalla
```
```
### test3
```
<State 0 (controlled)>
NumCard = {card1, card2, card3}
atmState = AWAITCARD
moneyLeft = 1000
numOfBalanceChecks = 0
Set insertedCard = 0
Set insertedPin = 0
Set selectedService = BALANCE
Set insertMoneySizeStandard = 52
Set insertMoneySizeOther = 52
Set standardOrOther = OTHER
</State 0 (controlled)>

<Stato attuale>
NumCard = {card1, card2, card3}
atmState = AWAITPIN
moneyLeft = 1000
numOfBalanceChecks = 0
Branch Service BALANCE covered
Branch MoneySizeSelection OTHER covered
Branch State AWAITPIN covered
```
#### Avalla
```
```
### test4
```
<State 0 (controlled)>
NumCard = {card1, card2, card3}
atmState = AWAITCARD
moneyLeft = 1000
numOfBalanceChecks = 0
Set insertedCard = 0
Set insertedPin = 0
Set selectedService = EXIT
Set insertMoneySizeStandard = 56
Set insertMoneySizeOther = 56
Set standardOrOther = STANDARD
</State 0 (controlled)>

<Stato attuale>
NumCard = {card1, card2, card3}
atmState = AWAITPIN
moneyLeft = 1000
numOfBalanceChecks = 0
Branch Service EXIT covered
Branch MoneySizeSelection STANDARD covered
Branch State AWAITPIN covered
```
#### Avalla
```
```