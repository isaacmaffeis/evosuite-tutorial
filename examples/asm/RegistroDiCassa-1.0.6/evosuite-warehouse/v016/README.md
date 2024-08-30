# V016

This time I removed the final state condition to see the behavior of Evosuite
without a predefined goal

```
public void step(...){
...
/*final state condition */
//  if(isFinalState()){
//    System.out.println("\n<Stato finale>");
//  }
//	else
  stato++;
}

//  public boolean isFinalState() {
//    return this.getTotale() >= 50 &&
//      this.stato>=5 &&
//      this.esecuzione.statoCassa.oldValue.equals(Stati.CHIUSO);
//  }
```
The result is not bad, Evosuite has generated a single scenario in which it reaches 100% coverage
of branches and lines of code, giving a final goal is better but even so evosuite manages to create
a consistent scenario, now we can try to add the condition branch criterion (CBRANCH).

## Problems

- only a single scenario generated.

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
* Connecting to master process on port 21196
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
  [Progress:>                             0%] [Cov:>                                  0%]  - Line 58
  - Branch 19
* Using seed 1725022097726
* Starting evolution
  [Progress:=============>                44%] [Cov:===================================100%]
* Search finished after 66s and 1679 generations, 301725 statements, best individual has fitness: 0.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 100%
* Total number of goals: 58
* Number of covered goals: 58
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 100%
* Total number of goals: 19
* Number of covered goals: 19
* Generated 1 tests with total length 7
* Resulting test suite's coverage: 100% (average coverage for all fitness functions)
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
Set pizzaInserita = capricciosa
Set quantita' = 2
Set prezzo = 2
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
Set pizzaInserita = capricciosa
Set quantita' = 2
Set prezzo = 2
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
Set pizzaInserita = capricciosa
Set quantita' = 2
Set prezzo = 11
</State 3 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 10
outMess = prezzo totale aggiornato
pizzaCorrente = capricciosa
```
#### Avalla:
```
```
