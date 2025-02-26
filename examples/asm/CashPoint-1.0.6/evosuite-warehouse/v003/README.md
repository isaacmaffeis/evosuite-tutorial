# V003
version with no choose rules

## Problems
I generated a manual test scenario to verify that the translation was correct 
and indeed it is, one of the problems of evosuite is that it seems to be unable
to do the set of a function with abstract codomain

for example, evosuite generated this set which is not correct:
```
cashPointv2_ATG0.set_abstract_currentDate("org.evoservice.cashpoint.CashPointv2$Fun0");
```
while it should have generated this:
```
cashPointv2_ATG0.set_abstract_currentDate("monday"); 
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
java -jar ../../../resources/evosuite-1.0.6.jar -class org.evoservice.cashpoint.CashPointv2_ATG -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=10
```
### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.cashpoint.CashPointv2_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\CashPoint-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 11105
* Analyzing classpath:
    - target/classes
    - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.cashpoint.CashPointv2_ASM
* Test criteria:
    - Line Coverage
    - Branch Coverage
* Setting up search algorithm for whole suite generation
  [Progress:>                             0%] [Cov:>                                  0%]* Total number of test goals:
    - Line 110
    - Branch 42
* Using seed 1725723115634
* Starting evolution
  [Progress:==============================100%] [Cov:=================================> 96%]
* Search finished after 66s and 165 generations, 58320 statements, best individual has fitness: 2.6666666666666665
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 98%
* Total number of goals: 110
* Number of covered goals: 108
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 95%
* Total number of goals: 42
* Number of covered goals: 40
* Generated 1 tests with total length 8
* Resulting test suite's coverage: 97% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'CashPointv2_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished
## Scenario
### test0
```
```
#### Avalla
```
```