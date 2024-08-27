# V008

This time I've used only LINE and BRANCH criterion, but added more conditions to the 
final state.
```java
public boolean isFinalState() {
    return this.getTotale() >= 50 &&
            this.stato>=5 && 
            this.esecuzione.statoCassa.oldValue.equals(Stati.CHIUSO);
}
```
In this way evosuite generates 2 scenarios that are consistent.

## Problems

- Evosuite can use directly the RegistroDiCassav2 methods, as we can see in `test1`:
  ```
  registroDiCassav2_0.r_aggiungiAlTotale_seq();
  ```
  This means that the scenario is incorrect and cannot be converted to AVALLA.
  
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
java -jar .\evosuite-1.0.6.jar -class org.evoservice.RegistroDiCassa.RegistroDiCassav2_ASM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=150
```

### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.RegistroDiCassa.RegistroDiCassav2_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 19370
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.RegistroDiCassa.RegistroDiCassav2_ASM
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  [Progress:>                             0%] [Cov:>                                  0%]  - Line 48
  - Branch 20
* Using seed 1724794560501
* Starting evolution
  [Progress:==>                           8%] [Cov:===================================100%]
* Search finished after 13s and 103 generations, 53648 statements, best individual has fitness: 0.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 100%
* Total number of goals: 48
* Number of covered goals: 48
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 100%
* Total number of goals: 20
* Number of covered goals: 20
* Generated 2 tests with total length 21
* Resulting test suite's coverage: 100% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'RegistroDiCassav2_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
<State 1 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 0
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set quantita' = 9
Set prezzo = 9
</State 1 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
totale = 0
<State 2 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
totale = 0
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set quantita' = 9
Set prezzo = 9
</State 2 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
totale = 0
<State 3 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
totale = 0
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set quantita' = 9
Set prezzo = 9
</State 3 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 81
<State 4 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 81
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set quantita' = 9
Set prezzo = 9
</State 4 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
totale = 81
<State 5 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
totale = 81
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set quantita' = 9
Set prezzo = 9
</State 5 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
totale = 81
```
#### Avalla:
```
check succeeded: statoCassa = ATTENDI_ORDINAZIONI 
check succeeded: totale=0 
check succeeded: sceltaDiAggiuntaPizza = SI 
check succeeded: statoCassa = SCEGLI_TIPO_DI_PIZZA 
check succeeded: servizioSelezionato = NEWORDINE 
check succeeded: totale = 0 
check succeeded: sceltaDelTipoPizza = OTHER 
check succeeded: sceltaDiAggiuntaPizza = SI 
check succeeded: statoCassa = ALTRAPIZZA_SELEZIONATA 
check succeeded: servizioSelezionato = NEWORDINE 
check succeeded: totale=0 
check succeeded: sceltaDelTipoPizza = OTHER 
check succeeded: sceltaDiAggiuntaPizza = SI 
check succeeded: statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA 
check succeeded: servizioSelezionato = NEWORDINE 
check succeeded: totale=81 
check succeeded: sceltaDelTipoPizza = OTHER 
check succeeded: sceltaDiAggiuntaPizza = SI 
check succeeded: statoCassa = SCEGLI_TIPO_DI_PIZZA 
check succeeded: servizioSelezionato = NEWORDINE 
check succeeded: totale=81 
check succeeded: sceltaDelTipoPizza = OTHER 
check succeeded: sceltaDiAggiuntaPizza = SI 
check succeeded: statoCassa = ALTRAPIZZA_SELEZIONATA 
check succeeded: servizioSelezionato = NEWORDINE 
check succeeded: totale=81 
check succeeded: sceltaDelTipoPizza = OTHER 
```
### test1
```
<State 1 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 0
Set servizio = EXIT
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set quantita' = 9
Set prezzo = 9
</State 1 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
totale = 0
<State 2 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
totale = 81
Set servizio = EXIT
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set quantita' = 9
Set prezzo = 9
</State 2 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
totale = 81
<State 3 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
totale = 81
Set servizio = EXIT
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set quantita' = 9
Set prezzo = 9
</State 3 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
totale = 81
<State 4 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
totale = 81
Set servizio = EXIT
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set quantita' = 9
Set prezzo = 9
</State 4 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
totale = 81
<State 5 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
totale = 81
Set servizio = EXIT
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set quantita' = 9
Set prezzo = 9
</State 5 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
totale = 81

<Stato finale>
```
#### Avalla
```
check succeeded: statoCassa = ATTENDI_ORDINAZIONI 
check succeeded: totale=0 
check succeeded: statoCassa = CHIUSO 
check succeeded: sceltaDiAggiuntaPizza = SI 
check succeeded: totale = 0 
check succeeded: sceltaDelTipoPizza = OTHER 
check succeeded: servizioSelezionato = EXIT 
check succeeded: statoCassa = CHIUSO 
check succeeded: sceltaDiAggiuntaPizza = SI 
CHECK FAILED: totale=81 at step 2 
some checks failed
```
