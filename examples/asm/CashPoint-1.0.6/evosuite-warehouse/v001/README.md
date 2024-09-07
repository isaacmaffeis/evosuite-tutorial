# V001

problem with non-deterministic behavior of the ASM, 
rules like `choose` or `chooseone` of Asmeta put evosuite in difficulty in generating scenarios,
because it fails to generate consistent assertions, 
since each time the rule may select a different value.
example:
1. **choose**<p>
    asmeta rule:
    ```
   rule r_insertCard($t in Till) =
   choose $c in Card with true do r_insertedCard[$t,$c]
    ```
   test:
    ```
    cashPointv2_ASM0.step(enteredPin_till1:1,amount_till1:100,currentDate:"monday");
    ```
   I can't perform the step operation correctly,
    because I'm not able to choose the correct pin for the selected card
2. **choose one**<p>
    asmeta rule:
    ```
    function balance($a in Account) = chooseone({1000,2000,3000})
    ```
    test assertion:
    ```
    assertEquals(cashPoint_ASM0.get_balance_account1(), 1000);
    ```
    This condition is not always true and in general it is not possible to make an a priori assertion


## Problems

In this way evosuite generates test cases reaching a good coverage, 
but in the final phase when it generates assertions and tests them it does not find a match with
what has just been generated and creates an empty test file.
```java
@Test(timeout = 4000)
public void test0()  throws Throwable  {
CashPoint_ASM cashPoint_ASM0 = new CashPoint_ASM();
assertNotNull(cashPoint_ASM0);
}
```
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
java -jar ../../../resources/evosuite-1.0.6.jar -class org.evoservice.cashpoint.CashPoint -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=150
```
### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.cashpoint.CashPoint_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\CashPoint-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 16993
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.cashpoint.CashPoint_ASM
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  - Line 119
    [Progress:>                             0%] [Cov:>                                  0%]  - Branch 42
* Using seed 1725717030686
* Starting evolution
  [Progress:==============================100%] [Cov:=================================> 96%]
* Search finished after 151s and 884 generations, 35187 statements, best individual has fitness: 2.6666666666666665
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 2%
* Total number of goals: 119
* Number of covered goals: 2
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 2%
* Total number of goals: 42
* Number of covered goals: 1
* Generated 1 tests with total length 1
* Resulting test suite's coverage: 97% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'CashPoint_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished
## Scenario
### test0
```
```
#### Avalla
```
```