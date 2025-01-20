# V002

Version after the bug fix #105

## Problems



## How to
```shell
mvn compile
```
```shell
mvn dependency:copy-dependencies -DincludeScope=runtime
```
```shell
java -jar ..\..\..\resources\evosuite-1.0.6.jar -setup target/classes target/dependency/commons-collections-3.2.2.jar
```
```shell
java -jar ..\..\..\resources\evosuite-1.0.6.jar -class org.evoservice.initTest.InitTest_ATG -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=10
```

### log
java -jar ..\..\..\resources\evosuite-1.0.6.jar -class org.evoservice.pillbox.Pillbox_1_ATG -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=10
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.pillbox.Pillbox_1_ATG
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\pillbox\evosuite-files\evosuite.properties
* Connecting to master process on port 18134
* Analyzing classpath:
    - target/classes
    - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.pillbox.Pillbox_1_ATG
* Test criteria:
    - Line Coverage
    - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
    - Line 116
    - Branch 77
      [Progress:>                             0%] [Cov:>                                  0%]* Using seed 1734269978036
* Starting evolution
  [Progress:==============================100%] [Cov:================================>  93%]
* Search finished after 11s and 30 generations, 13399 statements, best individual has fitness: 5.666666666666666
  [MASTER] 14:39:52.750 [logback-1] WARN  TimeController - Phase SEARCH lasted too long, 1 seconds more than allowed.
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 98%
* Total number of goals: 116
* Number of covered goals: 114
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 90%
* Total number of goals: 77
* Number of covered goals: 69
* Generated 11 tests with total length 35
* Resulting test suite's coverage: 94% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'Pillbox_1_ATG_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test00
```
Set openSwitch = false
<State 0 (controlled)>
opened = false
redLed = OFF
outMess = NONE
logMess = NONE
time_consumption = 0
requestSatisfied = false
systemTime = 0
drawerTimer = 0
</State 0 (controlled)>

<Current status>
opened = false
redLed = ON
outMess = TAKE_PILL
logMess = NONE
time_consumption = 0
requestSatisfied = false
systemTime = 1
drawerTimer = 0
branch_r_pillToBeTaken_master covered
branch_r_pillToBeTaken_1 covered
branch_r_Main_master covered
branch_r_Main_1 covered
branch_r_Main_4 covered
branch_r_Main_5 covered
<State 1 (controlled)>
opened = false
redLed = ON
outMess = TAKE_PILL
logMess = NONE
time_consumption = 0
requestSatisfied = false
systemTime = 1
drawerTimer = 0
</State 1 (controlled)>

<Current status>
opened = false
redLed = BLINKING
outMess = TAKE_PILL_IN_10_MIN
logMess = NONE
time_consumption = 0
requestSatisfied = false
systemTime = 2
drawerTimer = 1
branch_r_pillToBeTaken_master covered
branch_r_pillToBeTaken_1 covered
branch_r_Main_master covered
branch_r_Main_1 covered
branch_r_Main_4 covered
branch_r_Main_5 covered
branch_r_Main_8 covered
branch_r_Main_9 covered
branch_r_Main_11 covered
branch_r_Main_12 covered
branch_r_takeInTimeout_master covered
branch_r_takeInTimeout_1 covered
<State 2 (controlled)>
opened = false
redLed = BLINKING
outMess = TAKE_PILL_IN_10_MIN
logMess = NONE
time_consumption = 0
requestSatisfied = false
systemTime = 2
drawerTimer = 1
</State 2 (controlled)>

<Current status>
opened = false
redLed = BLINKING
outMess = TAKE_PILL_IN_10_MIN
logMess = NONE
time_consumption = 0
requestSatisfied = false
systemTime = 3
drawerTimer = 1
branch_r_pillToBeTaken_master covered
branch_r_pillToBeTaken_1 covered
branch_r_Main_master covered
branch_r_Main_1 covered
branch_r_Main_4 covered
branch_r_Main_5 covered
branch_r_Main_8 covered
branch_r_Main_9 covered
branch_r_Main_11 covered
branch_r_Main_12 covered
branch_r_Main_13 covered
branch_r_Main_15 covered
branch_r_Main_19 covered
branch_r_takeInTimeout_master covered
branch_r_takeInTimeout_1 covered
<State 3 (controlled)>
opened = false
redLed = BLINKING
outMess = TAKE_PILL_IN_10_MIN
logMess = NONE
time_consumption = 0
requestSatisfied = false
systemTime = 3
drawerTimer = 1
</State 3 (controlled)>

<Current status>
opened = false
redLed = OFF
outMess = NONE
logMess = PILL_MISSED
time_consumption = 0
requestSatisfied = true
systemTime = 4
drawerTimer = 3
branch_r_pillToBeTaken_master covered
branch_r_pillToBeTaken_1 covered
branch_r_Main_master covered
branch_r_Main_1 covered
branch_r_Main_4 covered
branch_r_Main_5 covered
branch_r_Main_8 covered
branch_r_Main_9 covered
branch_r_Main_11 covered
branch_r_Main_12 covered
branch_r_Main_13 covered
branch_r_Main_15 covered
branch_r_Main_16 covered
branch_r_Main_18 covered
branch_r_Main_19 covered
branch_r_writeToFile_master covered
branch_r_takeInTimeout_master covered
branch_r_takeInTimeout_1 covered
branch_r_timeOutExpired_missedPill_master covered
```
#### Avalla
```
```
