# V013
I fixed the problem with the getOutMess modifying the Asmeta code and 
generated a new version RegistroDiCassav3.java, now it is a String and 
in fact evosuite recognizes it and can generate assertions based on it.

In this version we have 3 consist scenarios, we have checks only on the controlled functions
and evosuite correctly explores the various options.

## Problems

- Evosuite still can't generate assertions for getPizzaCorrente, but that's because
Pizza domain is abstract and even the Asmeta Animator can't
- the monitored function `pizzaInserita` will be difficult to parse,
because in the java code it's an index to an array, while in Asmeta is a static function, 
for example:
  - `pizza = 2;` need to be parsed as `set pizzaInserita := capricciosa;`

  And this applies to every function that has an abstract domain.

In conclusion, managing abstract domains can be complicated.

- Asm on java works differently from Asmeta, 
in fact at each step it requires the value of all the monitored functions, 
instead Asmeta only does it with those that are needed in that state, 
it follows that we have many useless sets that influence the readability of the scenario,
but not its functionality which remains correct.

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
* Going to generate test cases for class: org.evoservice.RegistroDiCassa.RegistroDiCassav3_ASM
* Starting client
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.0.6\evosuite-files\evosuite.properties
* Connecting to master process on port 20805
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
  - Branch 24
* Using seed 1724957118514
* Starting evolution
  [Progress:====================>         68%] [Cov:===================================100%]
* Search finished after 104s and 2274 generations, 779820 statements, best individual has fitness: 0.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 100%
* Total number of goals: 58
* Number of covered goals: 58
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 100%
* Total number of goals: 24
* Number of covered goals: 24
* Generated 3 tests with total length 28
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
Set prezzo = 2
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
check succeeded: statoCassa = ATTENDI_ORDINAZIONI 
check succeeded: totale = 0 
check succeeded: statoCassa = SCEGLI_TIPO_DI_PIZZA 
check succeeded: totale = 0 
check succeeded: outMess = \"Scegli il tipo di pizza desiderata:\" 
check succeeded: statoCassa = PIZZASTANDARD_SELEZIONATA 
check succeeded: totale = 0 
check succeeded: outMess = \"Inserisci il nome di una pizza dell'elenco:\" 
check succeeded: statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA 
check succeeded: totale = 10 
check succeeded: outMess = \"prezzo totale aggiornato\" 
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
Set prezzo = 5
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
Set prezzo = 13
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
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = OTHER
Set pizzaInserita = capricciosa
Set quantita' = 5
Set prezzo = 13
</State 4 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 65
outMess = prezzo totale aggiornato
```
#### Avalla
```
check succeeded: statoCassa = ATTENDI_ORDINAZIONI 
check succeeded: totale = 0 
check succeeded: statoCassa = ATTENDI_ORDINAZIONI 
check succeeded: totale = 0 
check succeeded: outMess = \"Il totale :0\" 
check succeeded: statoCassa = SCEGLI_TIPO_DI_PIZZA 
check succeeded: totale = 0 
check succeeded: outMess = \"Scegli il tipo di pizza desiderata:\" 
check succeeded: statoCassa = ALTRAPIZZA_SELEZIONATA 
check succeeded: totale = 0 
check succeeded: outMess = \"Inserisci il nome di una nuova pizza:\" 
check succeeded: statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA 
check succeeded: totale = 65 
check succeeded: outMess = \"prezzo totale aggiornato\" 
check succeeded: totale >= 50 
check succeeded: statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA 
check succeeded: totale = 65 
check succeeded: outMess = \"prezzo totale aggiornato\" 
```
### test2
```
<State 1 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 0
outMess = null
Set servizio = NEWORDINE
Set aggiungiPizza = SI
Set selezioneTipoDiPizza = OTHER
Set pizzaInserita = capricciosa
Set quantita' = 2
Set prezzo = 5
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
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = OTHER
Set pizzaInserita = capricciosa
Set quantita' = 2
Set prezzo = 13
</State 2 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
totale = 0
outMess = Inserisci il nome di una nuova pizza:
<State 3 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ALTRAPIZZA_SELEZIONATA
totale = 0
outMess = Inserisci il nome di una nuova pizza:
Set servizio = NEWORDINE
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = OTHER
Set pizzaInserita = capricciosa
Set quantita' = 5
Set prezzo = 13
</State 3 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 65
outMess = prezzo totale aggiornato
<State 4 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA
totale = 65
outMess = prezzo totale aggiornato
Set servizio = NEWORDINE
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = OTHER
Set pizzaInserita = capricciosa
Set quantita' = 6
Set prezzo = 5
</State 4 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 65
outMess = Il totale :65
<State 5 (controlled)>
Pizza = {margherita, marinara, capricciosa}
statoCassa = ATTENDI_ORDINAZIONI
totale = 65
outMess = Il totale :65
Set servizio = EXIT
Set aggiungiPizza = NO
Set selezioneTipoDiPizza = OTHER
Set pizzaInserita = capricciosa
Set quantita' = 5
Set prezzo = 5
</State 5 (controlled)>

<Stato attuale>
Pizza = {margherita, marinara, capricciosa}
statoCassa = CHIUSO
totale = 65
outMess = Registro di cassa chiuso!

<Stato finale>
```
#### Avalla
```
check succeeded: statoCassa = ATTENDI_ORDINAZIONI 
check succeeded: totale = 0 
check succeeded: statoCassa = SCEGLI_TIPO_DI_PIZZA 
check succeeded: totale = 0 
check succeeded: outMess = \"Scegli il tipo di pizza desiderata:\" 
check succeeded: statoCassa = ALTRAPIZZA_SELEZIONATA 
check succeeded: totale = 0 
check succeeded: outMess = \"Inserisci il nome di una nuova pizza:\" 
check succeeded: statoCassa = SCEGLI_SE_AGGIUNGERE_PIZZA 
check succeeded: totale = 65 
check succeeded: outMess = \"prezzo totale aggiornato\" 
check succeeded: statoCassa = ATTENDI_ORDINAZIONI 
check succeeded: totale = 65 
check succeeded: outMess = \"Il totale :65\" 
check succeeded: statoCassa = CHIUSO 
check succeeded: totale = 65 
check succeeded: outMess = \"Registro di cassa chiuso!\" 
```