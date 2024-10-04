package org.evoservice.RegistroDiCassa;// RegistroDiCassav4_ASM.java automatically generated from ASM2CODE

/**
* This class allows you to simulate the behavior of an Abstract State Machine (ASM)
* without asking the user for input values ​​of the monitored functions.
*
* <p>
* It has been optimized to be used with evosuite in order to automatically generate test scenarios.
* </p>
*/
class RegistroDiCassav4_ASM {
	private final RegistroDiCassav4 esecuzione;
	private int stato;

	/**
	* Constructor of the {@code RegistroDiCassav4_ASM} class. Creates a private instance of the asm
	* {@link RegistroDiCassav4} and sets the initial state of the state machine to 1.
	*/
	public RegistroDiCassav4_ASM() {
		this.esecuzione = new RegistroDiCassav4();
		this.stato = 0;
	}

	/** The step function is the only public method of the ASM,
	* it receives as parameters the values ​​of the monitored functions to be updated 
	* and allows to perform a step of the asm by incrementing the state.
	*/
	public void step() {
		System.out.println("<State " + stato + " (controlled)>");
		printControlled();
		this.esecuzione.updateASM();
		System.out.println("</State " + stato + " (controlled)>");
		System.out.println("\n<Stato attuale>");
		printControlled();
		/* monitored */
		coverMonitored();
		/* controlled */
		coverControlled();
		stato++;
	}

	// Monitored getters
	private RegistroDiCassav4.Servizio get_servizioSelezionato() {
		return this.esecuzione.servizioSelezionato.get();
	}

	private RegistroDiCassav4.Pizza get_pizzaInserita() {
		return this.esecuzione.pizzaInserita.get();
	}

	private RegistroDiCassav4.AggiungiPizza get_sceltaDiAggiuntaPizza() {
		return this.esecuzione.sceltaDiAggiuntaPizza.get();
	}

	private RegistroDiCassav4.SelezioneTipoDiPizza get_sceltaDelTipoPizza() {
		return this.esecuzione.sceltaDelTipoPizza.get();
	}

	private int get_insertQuantita() {
		return this.esecuzione.insertQuantita.get().value;
	}

	private int get_insertPrezzo() {
		return this.esecuzione.insertPrezzo.get().value;
	}

	// Controlled getters
	public RegistroDiCassav4.Pizza get_pizzaCorrente() {
		return this.esecuzione.pizzaCorrente.get();
	}

	public RegistroDiCassav4.Stati get_statoCassa() {
		return this.esecuzione.statoCassa.get();
	}

	public String get_outMess() {
		return this.esecuzione.outMess.get();
	}

	public int get_totale() {
		return this.esecuzione.totale.get();
	}

	// Cover functions
	private void coverMonitored() {
		cover_servizioSelezionato();
		cover_pizzaInserita();
		cover_sceltaDiAggiuntaPizza();
		cover_sceltaDelTipoPizza();
		cover_insertQuantita();
		cover_insertPrezzo();
	}

	private void coverControlled() {
		cover_pizzaCorrente();
		cover_statoCassa();
		cover_outMess();
		cover_totale();
	}

	private void cover_pizzaCorrente() {
		this.get_pizzaCorrente();
		//1 Branch covered
	}

	private void cover_statoCassa() {
		switch (this.get_statoCassa()) {
		case ATTENDI_ORDINAZIONI:
			System.out.println("Branch Stati ATTENDI_ORDINAZIONI covered");
			// Branch Stati ATTENDI_ORDINAZIONI covered
			break;
		case SCEGLI_SE_AGGIUNGERE_PIZZA:
			System.out.println("Branch Stati SCEGLI_SE_AGGIUNGERE_PIZZA covered");
			// Branch Stati SCEGLI_SE_AGGIUNGERE_PIZZA covered
			break;
		case CHIUSO:
			System.out.println("Branch Stati CHIUSO covered");
			// Branch Stati CHIUSO covered
			break;
		case SCEGLI_TIPO_DI_PIZZA:
			System.out.println("Branch Stati SCEGLI_TIPO_DI_PIZZA covered");
			// Branch Stati SCEGLI_TIPO_DI_PIZZA covered
			break;
		case PIZZASTANDARD_SELEZIONATA:
			System.out.println("Branch Stati PIZZASTANDARD_SELEZIONATA covered");
			// Branch Stati PIZZASTANDARD_SELEZIONATA covered
			break;
		case ALTRAPIZZA_SELEZIONATA:
			System.out.println("Branch Stati ALTRAPIZZA_SELEZIONATA covered");
			// Branch Stati ALTRAPIZZA_SELEZIONATA covered
			break;
		}
	}

	private void cover_outMess() {
		this.get_outMess();
		//1 Branch covered
	}

	private void cover_servizioSelezionato() {
		switch (this.get_servizioSelezionato()) {
		case NEWORDINE:
			System.out.println("Branch Servizio NEWORDINE covered");
			// Branch Servizio NEWORDINE covered
			break;
		case EXIT:
			System.out.println("Branch Servizio EXIT covered");
			// Branch Servizio EXIT covered
			break;
		}
	}

	private void cover_pizzaInserita() {
		this.get_pizzaInserita();
		//1 Branch covered
	}

	private void cover_sceltaDiAggiuntaPizza() {
		switch (this.get_sceltaDiAggiuntaPizza()) {
		case SI:
			System.out.println("Branch AggiungiPizza SI covered");
			// Branch AggiungiPizza SI covered
			break;
		case NO:
			System.out.println("Branch AggiungiPizza NO covered");
			// Branch AggiungiPizza NO covered
			break;
		}
	}

	private void cover_sceltaDelTipoPizza() {
		switch (this.get_sceltaDelTipoPizza()) {
		case STANDARD:
			System.out.println("Branch SelezioneTipoDiPizza STANDARD covered");
			// Branch SelezioneTipoDiPizza STANDARD covered
			break;
		case OTHER:
			System.out.println("Branch SelezioneTipoDiPizza OTHER covered");
			// Branch SelezioneTipoDiPizza OTHER covered
			break;
		}
	}

	private void cover_insertQuantita() {
		this.get_insertQuantita();
		//1 Branch covered
	}

	private void cover_insertPrezzo() {
		this.get_insertPrezzo();
		//1 Branch covered
	}

	private void cover_totale() {
		this.get_totale();
		//1 Branch covered
	}

	// ASM Methods

	private void printControlled() {
		System.out.print("Pizza" + " = {");
		for (int i = 0; i < esecuzione.Pizza_elemsList.size(); i++)
			if (i != esecuzione.Pizza_elemsList.size() - 1)
				System.out.print(esecuzione.Pizza_elemsList.get(i) + ", ");
			else
				System.out.print(esecuzione.Pizza_elemsList.get(i));
		System.out.println("}");
		System.out.println("statoCassa = " + esecuzione.statoCassa.oldValue.name());
		System.out.println("outMess = " + esecuzione.outMess.get());
		System.out.println("totale = " + esecuzione.totale.get());
	}

	// Monitored Setters

	public void set_servizioSelezionato(RegistroDiCassav4.Servizio servizioSelezionato){
		this.esecuzione.servizioSelezionato.set(servizioSelezionato);
		System.out.println("Set servizioSelezionato = " + servizioSelezionato);
	}

	public void set_pizzaInserita(String pizzaInserita){
		this.esecuzione.pizzaInserita
				.set(this.esecuzione.Pizza_Class.get(this.esecuzione.Pizza_elemsList.indexOf(pizzaInserita)));
		System.out.println("Set pizzaInserita = " + pizzaInserita);
	}

	public void set_sceltaDiAggiuntaPizza(RegistroDiCassav4.AggiungiPizza sceltaDiAggiuntaPizza){
		this.esecuzione.sceltaDiAggiuntaPizza.set(sceltaDiAggiuntaPizza);
		System.out.println("Set sceltaDiAggiuntaPizza = " + sceltaDiAggiuntaPizza);
	}

	public void set_sceltaDelTipoDiPizza(RegistroDiCassav4.SelezioneTipoDiPizza sceltaDelTipoPizza){
		this.esecuzione.sceltaDelTipoPizza.set(sceltaDelTipoPizza);
		System.out.println("Set sceltaDelTipoPizza = " + sceltaDelTipoPizza);
	}

	public void set_insertQuantita(int insertQuantita){
		this.esecuzione.insertQuantita.set(RegistroDiCassav4.QuantitaDomain.valueOf(this.esecuzione.QuantitaDomain_elems
				.get(insertQuantita - this.esecuzione.QuantitaDomain_elems.get(0))));
		System.out.println("Set insertQuantita = " + insertQuantita);
	}

	public void set_insertPrezzo(int insertPrezzo){
		this.esecuzione.insertPrezzo.set(RegistroDiCassav4.PrezzoDomain.valueOf(
				this.esecuzione.PrezzoDomain_elems.get(insertPrezzo - this.esecuzione.PrezzoDomain_elems.get(0))));
		System.out.println("Set insertPrezzo = " + insertPrezzo);
	}

}
