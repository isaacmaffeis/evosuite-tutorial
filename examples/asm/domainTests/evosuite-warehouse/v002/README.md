# V002
Complete test case for the Enum Domain functions


## Problems

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
java -jar ../../../resources/evosuite-1.0.6.jar -class domaintests.AbstractTD_ATG -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=10
```
### log

## Scenario
### test00
```
```
#### Avalla
```
```