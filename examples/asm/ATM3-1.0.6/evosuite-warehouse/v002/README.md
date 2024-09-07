# V001

All the monitored function in the ASM must be initialized!

The `numOfBalanceChecks` function is not initialized in the .asm file 
and that caused an exception at the execution of the java class.

## Problems

- Execution exception: numOfBalanceChecks not initialized in the asm
    ```
    java.lang.NullPointerException
    at org.evoservice.atm3.ATM3_ASM.get_numOfBalanceChecks(ATM3_ASM.java:139)
    at org.evoservice.atm3.ATM3_ASM.cover_numOfBalanceChecks(ATM3_ASM.java:220)
    at org.evoservice.atm3.ATM3_ASM.coverControlled(ATM3_ASM.java:159)
    at org.evoservice.atm3.ATM3_ASM.step(ATM3_ASM.java:60)
    at org.evoservice.atm3.ATM3_ASM_ESTest.test0(ATM3_ASM_ESTest.java:26)
    at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke(Method.java:498)
    at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
    at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
    at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
    at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
    at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:298)
    at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:292)
    at java.util.concurrent.FutureTask.run(FutureTask.java:266)
    at java.lang.Thread.run(Thread.java:750)`
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
java -jar ../../../resources/evosuite-1.0.6.jar -class org.evoservice.atm3.ATM3_ASM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=150
```
### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.atm3.ATM3_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 21451
* Analyzing classpath:
    - target/classes
    - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.atm3.ATM3_ASM
* Test criteria:
    - Line Coverage
    - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
    - Line 132
      [Progress:>                             0%] [Cov:>                                  0%]  - Branch 64
* Using seed 1725441765455
* Starting evolution
  [Progress:==============================100%] [Cov:==============================>    86%]
* Search finished after 151s and 69 generations, 14476 statements, best individual has fitness: 11.0375
* Minimizing test suite
  [MASTER] 11:26:20.517 [logback-1] WARN  TestSuiteMinimizer - Minimization timeout. Roll back to original test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 89%
* Total number of goals: 132
* Number of covered goals: 117
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 84%
* Total number of goals: 64
* Number of covered goals: 54
* Generated 5 tests with total length 66
* Resulting test suite's coverage: 87% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'ATM3_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
<State 0 (controlled)>
NumCard = {card1, card2, card3}
atmState = AWAITCARD
moneyLeft = 1000
numOfBalanceChecks = null
Set insertedCard = 0
Set insertedPin = 1
Set selectedService = BALANCE
Set insertMoneySizeStandard = 10
Set insertMoneySizeOther = 50
Set standardOrOther = OTHER
</State 0 (controlled)>

<Stato attuale>
NumCard = {card1, card2, card3}
atmState = AWAITPIN
moneyLeft = 1000
numOfBalanceChecks = null
Branch Service BALANCE covered
Branch MoneySizeSelection OTHER covered
Branch State AWAITPIN covered

java.lang.NullPointerException
	at org.evoservice.atm3.ATM3_ASM.get_numOfBalanceChecks(ATM3_ASM.java:139)
	at org.evoservice.atm3.ATM3_ASM.cover_numOfBalanceChecks(ATM3_ASM.java:220)
	at org.evoservice.atm3.ATM3_ASM.coverControlled(ATM3_ASM.java:159)
	at org.evoservice.atm3.ATM3_ASM.step(ATM3_ASM.java:60)
	at org.evoservice.atm3.ATM3_ASM_ESTest.test0(ATM3_ASM_ESTest.java:26)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:298)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:292)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.lang.Thread.run(Thread.java:750)
```
#### Avalla
```
```