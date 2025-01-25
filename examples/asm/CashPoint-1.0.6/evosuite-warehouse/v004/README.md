# V002
Created a new version with no choose rules

## Problems

- if I change the type of the getter from String to the specific abstract type,
  evosuite will try to create a new object, like this:
  ```
  CashPointv2.Date cashPointv2_Date0 = new CashPointv2.Date("^l");
  assertNotNull(cashPointv2_Date0);
  cashPointv2_ATG0.set_abstract_currentDate(cashPointv2_Date0);
  ```
  that is incorrect because it has to use the same abstract type object declared
  in the translation: 
  ```
  static Date monday;
  static Date tuesday;
  ```
- I have added a get method in the abstract type class that can accept a different 
  object and return the current object:
  ```
  static public Date get(Date a){
  if (val.contains(a.toString())) {
      return elems.get(val.lastIndexOf(a.toString()));
  } else
      return null;
  }
  ```
  so I'll expect evosuite to do this type of get:
  ```
  CashPointv2.Date monday = new CashPointv2.Date("monday");
  cashPointv2_ATG0.set_abstract_currentDate(monday);
  ```
  but it didn't
- I tried to add a new type of set, directly setting the abstract type without
  passing the argument, but even so the coverage does not increase
  ```
  public void set_abstract_currentDate_monday() {
      this.execution.currentDate.set(CashPointv2.Date.get("monday"));
      System.out.println("Set currentDate = " + "monday");
  }
  ```
I suspect that in addition to the difficulty of setting the abstract type, 
this specification is complicated because in the second step it requires three 
consecutive sets and evosuite cannot understand it

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
java -jar ../../../resources/evosuite-1.0.6.jar -class org.evoservice.cashpoint.CashPointv2_ATG -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=150
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