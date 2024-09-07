# V003

Fixed the abstract domain problems, the .value problems and the init problem.

## Problems

I have identified a limit of this project:
- it does not adapt to discrete interval domains, but only ranges.
  For example in this case we have the domain subset of integer
  `domain MoneySize = {10, 20, 40, 50, 100, 150, 200}`
  that is correctly translated in the .java class,
  but the _ASM class cannot handle it correctly


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

## Scenario
### test0
```
```
#### Avalla
```
```