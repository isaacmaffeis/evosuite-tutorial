# V009
To prevent evosuite from using methods of the RegistroDiCassav2 class, I made sure that the class
under test creates an instance of RegistroDiCassa and accesses it privately, in this way evosuite 
is forced to use the asm methods to achieve the goal.

```java
public RegistroDiCassav2_ASM() {
  this.esecuzione = new RegistroDiCassav2();
  this.stato = 1;
}
```

I also made the ASM class methods private and non-static.

## Problems

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
* Connecting to master process on port 11086
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
  - Line 49
    [Progress:>                             0%] [Cov:>                                  0%]  - Branch 20
* Using seed 1724839130218
* Starting evolution
  [Progress:==>                           8%] [Cov:===================================100%]
* Search finished after 12s and 160 generations, 79288 statements, best individual has fitness: 0.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 100%
* Total number of goals: 49
* Number of covered goals: 49
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
Set prezzo = 10
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
Set quantita' = 10
Set prezzo = 10
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
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = OTHER
Set quantita' = 10
Set prezzo = 10
</State 3 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 100
<State 4 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 100
Set servizio = NEWORDINE
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = OTHER
Set quantita' = 10
Set prezzo = 10
</State 4 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 100
<State 5 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 100
Set servizio = EXIT
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = OTHER
Set quantita' = 10
Set prezzo = 10
</State 5 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
totale = 100

<Stato finale>
```
#### Avalla:
```
```
### test1
```
<State 1 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 0
Set servizio = NEWORDINE
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = OTHER
Set quantita' = 10
Set prezzo = 10
</State 1 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 0
<State 2 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 0
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set quantita' = 9
Set prezzo = 10
</State 2 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
totale = 0
<State 3 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
totale = 0
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set quantita' = 10
Set prezzo = 10
</State 3 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
totale = 0
<State 4 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
totale = 0
Set servizio = NEWORDINE
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = OTHER
Set quantita' = 10
Set prezzo = 10
</State 4 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 100
<State 5 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 100
Set servizio = NEWORDINE
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = OTHER
Set quantita' = 10
Set prezzo = 10
</State 5 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 100

```
#### Avalla
```
```
