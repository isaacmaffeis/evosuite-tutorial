# V001



## Problems

- The ATM3.java class has compilation errors due to a double .value.value attribute.
- The ATM3_ASM.java class has compilation errors due to undefined cover methods.


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
java -jar .\evosuite-1.0.6.jar -class org.evoservice.atm3.ATM3_ASM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=150
```
### log

## Scenario
### test0
```
```
#### Avalla
```
```