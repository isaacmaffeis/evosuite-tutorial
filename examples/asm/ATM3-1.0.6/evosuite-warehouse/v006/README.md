# V006

This example is much more complicated than the previous ones and evosuite struggles
to manage all the parameters, resulting in a generation of tests that does not
reach the maximum coverage and the eventual final state, 
by doing more tests we get different results with different coverage levels.
Nevertheless, it has produced various test cases, but not all are scenarios, 
some are interesting others less.

## Problems

- does not reach a good number of coverage. I even increased the search budget to 500
but the coverage doesn't increase (`Coverage of criterion BRANCH: 83%`)
- evosuite creates many useless assertions, in particular only the `assertEquals` are of interest, 
the rest can be ignored.

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
* Connecting to master process on port 15949
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
  [Progress:>                             0%] [Cov:>                                  0%]  - Line 138
  - Branch 69
* Using seed 1725480656640
* Starting evolution
  [Progress:==============================100%] [Cov:==============================>    87%]
* Search finished after 151s and 92 generations, 18419 statements, best individual has fitness: 16.116666666666667
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
  [MASTER] 22:14:35.638 [logback-1] WARN  TestSuiteMinimizer - Minimization timeout. Roll back to original test suite
* Coverage of criterion LINE: 92%
* Total number of goals: 138
* Number of covered goals: 127
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 83%
* Total number of goals: 69
* Number of covered goals: 57
* Generated 20 tests with total length 165
* Resulting test suite's coverage: 87% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'ATM3v2_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test00
```
<State 0 (controlled)>
NumCard = {card1, card2, card3}
atmState = AWAITCARD
moneyLeft = 1000
numOfBalanceChecks = 0
Set insertedCard = card1
Set insertedPin = 0
Set selectedService = BALANCE
Set insertMoneySizeStandard = 46
Set insertMoneySizeOther = 0
Set standardOrOther = STANDARD
</State 0 (controlled)>

<Stato attuale>
NumCard = {card1, card2, card3}
atmState = AWAITPIN
moneyLeft = 1000
numOfBalanceChecks = 0
Branch Service BALANCE covered
Branch MoneySizeSelection STANDARD covered
Branch State AWAITPIN covered
<State 1 (controlled)>
NumCard = {card1, card2, card3}
atmState = AWAITPIN
moneyLeft = 1000
numOfBalanceChecks = 0
Set insertedCard = card1
Set insertedPin = 0
Set selectedService = BALANCE
Set insertMoneySizeStandard = 31
Set insertMoneySizeOther = 46
Set standardOrOther = STANDARD
</State 1 (controlled)>

<Stato attuale>
NumCard = {card1, card2, card3}
atmState = AWAITCARD
moneyLeft = 1000
numOfBalanceChecks = 0
Branch Service BALANCE covered
Branch MoneySizeSelection STANDARD covered
Branch State AWAITCARD covered
```
#### Avalla
```
```
### test01
```
<State 0 (controlled)>
NumCard = {card1, card2, card3}
atmState = AWAITCARD
moneyLeft = 1000
numOfBalanceChecks = 0
Set insertedCard = card1
Set insertedPin = -824
Set selectedService = WITHDRAWAL
Set insertMoneySizeStandard = 189
Set insertMoneySizeOther = -824
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
### test02
```
<State 0 (controlled)>
NumCard = {card1, card2, card3}
atmState = AWAITCARD
moneyLeft = 1000
numOfBalanceChecks = 0
Set insertedCard = card3
Set insertedPin = 162
Set selectedService = EXIT
Set insertMoneySizeStandard = 162
Set insertMoneySizeOther = 162
Set standardOrOther = OTHER
</State 0 (controlled)>

<Stato attuale>
NumCard = {card1, card2, card3}
atmState = AWAITPIN
moneyLeft = 1000
numOfBalanceChecks = 0
Branch Service EXIT covered
Branch MoneySizeSelection OTHER covered
Branch State AWAITPIN covered
```
#### Avalla
```
```
### test03
```
<State 0 (controlled)>
NumCard = {card1, card2, card3}
atmState = AWAITCARD
moneyLeft = 1000
numOfBalanceChecks = 0
Set insertedCard = card1
Set insertedPin = 0
Set selectedService = BALANCE
Set insertMoneySizeStandard = 46
Set insertMoneySizeOther = 0
Set standardOrOther = STANDARD
</State 0 (controlled)>

<Stato attuale>
NumCard = {card1, card2, card3}
atmState = AWAITPIN
moneyLeft = 1000
numOfBalanceChecks = 0
Branch Service BALANCE covered
Branch MoneySizeSelection STANDARD covered
Branch State AWAITPIN covered
```
#### Avalla
```
```
### test04
```
<State 0 (controlled)>
NumCard = {card1, card2, card3}
atmState = AWAITCARD
moneyLeft = 1000
numOfBalanceChecks = 0
Set insertedCard = card1
Set insertedPin = -465
Set selectedService = WITHDRAWAL
```
#### Avalla
```
```
### test05
```
No sceario found
```
### test06
```
No sceario found
```
### test07
```
No sceario found
```
### test08
```
No sceario found
```
### test09
```
No sceario found
```
### test10
```
No sceario found
```
### test11
```
No sceario found
```
### test12
```
<State 0 (controlled)>
NumCard = {card1, card2, card3}
atmState = AWAITCARD
moneyLeft = 1000
numOfBalanceChecks = 0
```
### test13
```
No sceario found
```
### test14
```
<State 0 (controlled)>
NumCard = {card1, card2, card3}
atmState = AWAITCARD
moneyLeft = 1000
numOfBalanceChecks = 0
Set insertedCard = card3
Set insertedPin = 162
Set selectedService = EXIT
Set insertMoneySizeStandard = 162
Set insertMoneySizeOther = 162
Set standardOrOther = OTHER
</State 0 (controlled)>

<Stato attuale>
NumCard = {card1, card2, card3}
atmState = AWAITPIN
moneyLeft = 1000
numOfBalanceChecks = 0
Branch Service EXIT covered
Branch MoneySizeSelection OTHER covered
Branch State AWAITPIN covered
```
### test15
```
<State 0 (controlled)>
NumCard = {card1, card2, card3}
atmState = AWAITCARD
moneyLeft = 1000
numOfBalanceChecks = 0
Set insertedCard = card3
Set insertedPin = 162
Set selectedService = WITHDRAWAL
Set insertMoneySizeStandard = 162
Set insertMoneySizeOther = 162
Set standardOrOther = OTHER
</State 0 (controlled)>

<Stato attuale>
NumCard = {card1, card2, card3}
atmState = AWAITPIN
moneyLeft = 1000
numOfBalanceChecks = 0
Branch Service WITHDRAWAL covered
Branch MoneySizeSelection OTHER covered
Branch State AWAITPIN covered
<State 1 (controlled)>
NumCard = {card1, card2, card3}
atmState = AWAITPIN
moneyLeft = 1000
numOfBalanceChecks = 0
```