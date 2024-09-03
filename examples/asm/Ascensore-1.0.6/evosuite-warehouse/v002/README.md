# V002

Added the final state condition:
```java
public boolean isFinalState(){
    return
            this.stato >=10;
}
```
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
java -jar ../../../resources/evosuite-1.0.6.jar -class org.evoservice.ascensore.Ascensore_ASM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=150
```
### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.ascensore.Ascensore_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\Ascensore-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 19760
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.ascensore.Ascensore_ASM
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  - Line 44
    [Progress:>                             0%] [Cov:>                                  0%]  - Branch 25
* Using seed 1725371308624
* Starting evolution
  [Progress:==============================100%] [Cov:=================================> 96%]
* Search finished after 151s and 3229 generations, 1216134 statements, best individual has fitness: 1.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 100%
* Total number of goals: 44
* Number of covered goals: 44
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 92%
* Total number of goals: 25
* Number of covered goals: 23
* Generated 1 tests with total length 12
* Resulting test suite's coverage: 96% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'Ascensore_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
<State 0 (controlled)>
statoPiano = UNO
statoPorta = CHIUSA
Set signalPorta = true
</State 0 (controlled)>

<Stato attuale>
statoPiano = UNO
statoPorta = APERTA
Branch Piano UNO covered
Branch Porta APERTA covered
<State 1 (controlled)>
statoPiano = UNO
statoPorta = APERTA
Set signalPorta = true
</State 1 (controlled)>

<Stato attuale>
statoPiano = UNO
statoPorta = APERTA
Branch Piano UNO covered
Branch Porta APERTA covered
<State 2 (controlled)>
statoPiano = UNO
statoPorta = APERTA
Set signalPorta = true
</State 2 (controlled)>

<Stato attuale>
statoPiano = UNO
statoPorta = APERTA
Branch Piano UNO covered
Branch Porta APERTA covered
<State 3 (controlled)>
statoPiano = UNO
statoPorta = APERTA
Set signalPorta = true
</State 3 (controlled)>

<Stato attuale>
statoPiano = UNO
statoPorta = APERTA
Branch Piano UNO covered
Branch Porta APERTA covered
<State 4 (controlled)>
statoPiano = UNO
statoPorta = APERTA
Set signalPorta = true
</State 4 (controlled)>

<Stato attuale>
statoPiano = UNO
statoPorta = APERTA
Branch Piano UNO covered
Branch Porta APERTA covered
<State 5 (controlled)>
statoPiano = UNO
statoPorta = APERTA
Set signalPorta = true
</State 5 (controlled)>

<Stato attuale>
statoPiano = UNO
statoPorta = APERTA
Branch Piano UNO covered
Branch Porta APERTA covered
<State 6 (controlled)>
statoPiano = UNO
statoPorta = APERTA
Set signalPorta = false
</State 6 (controlled)>

<Stato attuale>
statoPiano = DUE
statoPorta = CHIUSA
Branch Piano DUE covered
Branch Porta CHIUSA covered
<State 7 (controlled)>
statoPiano = DUE
statoPorta = CHIUSA
Set signalPorta = false
</State 7 (controlled)>

<Stato attuale>
statoPiano = UNO
statoPorta = CHIUSA
Branch Piano UNO covered
Branch Porta CHIUSA covered
<State 8 (controlled)>
statoPiano = UNO
statoPorta = CHIUSA
Set signalPorta = true
</State 8 (controlled)>

<Stato attuale>
statoPiano = UNO
statoPorta = APERTA
Branch Piano UNO covered
Branch Porta APERTA covered
<State 9 (controlled)>
statoPiano = UNO
statoPorta = APERTA
Set signalPorta = true
</State 9 (controlled)>

<Stato attuale>
statoPiano = UNO
statoPorta = APERTA
Branch Piano UNO covered
Branch Porta APERTA covered
<State 10 (controlled)>
statoPiano = UNO
statoPorta = APERTA
Set signalPorta = true
</State 10 (controlled)>

<Stato attuale>
statoPiano = UNO
statoPorta = APERTA
Branch Piano UNO covered
Branch Porta APERTA covered

<Stato finale>
```
#### Avalla
```
```