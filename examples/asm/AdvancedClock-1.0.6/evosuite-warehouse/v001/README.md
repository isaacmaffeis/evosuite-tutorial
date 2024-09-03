# V001



## Problems

- detected bug in ASM class auto-generation in parameterless method declaration:
  I find the closing parenthesis ')' but not the opening one '('

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
java -jar ../../../resources/evosuite-1.0.6.jar -class org.evoservice.advancedClock.AdvancedClock_ASM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all
```
### log

## Scenario
### test0
```
```
#### Avalla
```
```
### test1
```
```
#### Avalla
```
```