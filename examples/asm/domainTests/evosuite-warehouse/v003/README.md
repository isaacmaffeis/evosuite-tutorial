# V003


## Problems

Init error for the **[] -> Abstract Domain** functions.
For instance, this code block (inside the constructor) doesn't compile for an error on line 1 and 2:
```
AbstractDomain AbstractDomain_elem = new AbstractDomain();
AbstractDomain_elem.value = value1;
abstractControlledFunction.oldValue = abstractControlledFunction.newValue = AbstractDomain_elem;
```
while this proposed solution does:
```
abstractControlledFunction.oldValue = abstractControlledFunction.newValue = value1;
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