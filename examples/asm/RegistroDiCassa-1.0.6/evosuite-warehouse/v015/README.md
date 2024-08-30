# V013
I tried to simplify the code by commenting out the controlled functions
from the step function (because them are public and can be used directly by evosuite),
but this led to test cases that are no longer scenarios, so it is better to keep them in 
the step function, even if they are public
```
public void step(...){
...
/*  controlled functions  */
//  getPizzaCorrente();
//  getStatoCassa();
//  getOutMess();
//  getTotale();
...
}
```
## Problems

- Coverage is not 100%.
- Some test cases are not scenario.

It's better to go back to the previous version (v014)

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
java -jar .\evosuite-1.0.6.jar -class org.evoservice.RegistroDiCassa.RegistroDiCassav3_ASM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=150
```

### log
* EvoSuite 1.0.6
* Going to generate test cases for class: org.evoservice.RegistroDiCassa.RegistroDiCassav3_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 13897
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.RegistroDiCassa.RegistroDiCassav3_ASM
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Setting up search algorithm for whole suite generation
* Total number of test goals:
  - Line 54
    [Progress:>                             0%] [Cov:>                                  0%]  - Branch 24
* Using seed 1725004658436
* Starting evolution
  [Progress:==============================100%] [Cov:================================>  94%]
* Search finished after 151s and 1844 generations, 628951 statements, best individual has fitness: 2.5
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 98%
* Total number of goals: 54
* Number of covered goals: 53
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 92%
* Total number of goals: 24
* Number of covered goals: 22
* Generated 5 tests with total length 23
* Resulting test suite's coverage: 95% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
* Writing JUnit test case 'RegistroDiCassav3_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
<State 1 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 0
outMess = null
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = STANDARD
Set pizzaInserita = margherita
Set quantita' = 0
Set prezzo = 1
</State 1 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
totale = 0
outMess = Scegli il tipo di pizza desiderata:
<State 2 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
totale = 0
outMess = Scegli il tipo di pizza desiderata:
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = STANDARD
Set pizzaInserita = marinara
Set quantita' = 0
Set prezzo = 1
</State 2 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = PIZZASTANDARD_SELEZIONATA
totale = 0
outMess = Inserisci il nome di una pizza dell'elenco:
<State 3 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = PIZZASTANDARD_SELEZIONATA
totale = 0
outMess = Inserisci il nome di una pizza dell'elenco:
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = STANDARD
Set pizzaInserita = marinara
Set quantita' = 1
Set prezzo = 1
</State 3 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 3
outMess = prezzo totale aggiornato
pizzaCorrente = marinara
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
outMess = null
Set servizio = NEWORDINE
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = OTHER
Set pizzaInserita = capricciosa
Set quantita' = 2
Set prezzo = 2
</State 1 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 0
outMess = Il totale :0
<State 2 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 0
outMess = Il totale :0
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set pizzaInserita = capricciosa
Set quantita' = 2
Set prezzo = 2
</State 2 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
totale = 0
outMess = Scegli il tipo di pizza desiderata:
<State 3 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_TIPO_DI_PIZZA
totale = 0
outMess = Scegli il tipo di pizza desiderata:
Set servizio = NEWORDINE
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = OTHER
Set pizzaInserita = capricciosa
Set quantita' = 2
Set prezzo = 2
</State 3 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
totale = 0
outMess = Inserisci il nome di una nuova pizza:
<State 4 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
totale = 0
outMess = Inserisci il nome di una nuova pizza:
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set pizzaInserita = capricciosa
Set quantita' = 9
Set prezzo = 9
</State 4 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 81
outMess = prezzo totale aggiornato
```
#### Avalla
```
```
### test2
```
- no output (the asm doesn't perform any step)
```
#### Avalla
```
```
### test3
```
- no output (the asm doesn't perform any step)
```
#### Avalla
```
```
### test4
```
- no output (the asm doesn't perform any step)
```
#### Avalla
```
```