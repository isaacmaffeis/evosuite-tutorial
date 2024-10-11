package org.evoservice.wrapper;// RegistroDiCassav4_ASM.java automatically generated from ASM2CODE

/**
* This class allows you to simulate the behavior of an Abstract State Machine (ASM)
* without asking the user for input values â€‹â€‹of the monitored functions.
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
	* it receives as parameters the values â€‹â€‹of the monitored functions to be updated 
	* and allows to perform a step of the asm by incrementing the state.
	*/
	public void step() {
		System.out.println("<State " + stato + " (controlled)>");
		printControlled();
		this.esecuzione.updateASM();
		System.out.println("</State " + stato + " (controlled)>");
		System.out.println("\n<Stato attuale>");
		printControlled();
		cover_rules();
		stato++;
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

	private void cover_rules(){
		cover_r_main();
		cover_r_altraPizzaSelezionata();
		cover_r_pizzaStandardSelezionata();
		cover_r_scegliTipoDiPizza();
		cover_r_scegliSeAggiungerePizza();
		cover_r_attendiOrdinazioni();
		cover_r_aggiungiAlTotale();
		cover_r_aggiungiPizzaStandardAlTotale();
	}

	private void cover_r_aggiungiPizzaStandardAlTotale() {
		if(this.esecuzione.cover_r_aggiungiPizzaStandardAlTotale){
			System.out.println("r_aggiungiPizzaStandardAlTotale covered");
		}
	}

	private void cover_r_aggiungiAlTotale() {
		if(this.esecuzione.cover_r_aggiungiAlTotale){
			System.out.println("r_aggiungiAlTotale covered");
		}
	}

	private void cover_r_attendiOrdinazioni() {
		if(this.esecuzione.cover_r_attendiOrdinazioni){
			System.out.println("r_attendiOrdinazioni covered");
		}
		if(this.esecuzione.cover_r_attendiOrdinazioni_1){
			System.out.println("r_attendiOrdinazioni_1 covered");
		}
		if(this.esecuzione.cover_r_attendiOrdinazioni_2){
			System.out.println("r_attendiOrdinazioni_2 covered");
		}
		if(this.esecuzione.cover_r_attendiOrdinazioni_3){
			System.out.println("r_attendiOrdinazioni_3 covered");
		}
	}

	private void cover_r_scegliSeAggiungerePizza() {
		if(this.esecuzione.cover_r_scegliSeAggiungerePizza){
			System.out.println("r_scegliSeAggiungerePizza covered");
		}
		if(this.esecuzione.cover_r_scegliSeAggiungerePizza_1){
			System.out.println("r_scegliSeAggiungerePizza_1 covered");
		}
		if(this.esecuzione.cover_r_scegliSeAggiungerePizza_2){
			System.out.println("r_scegliSeAggiungerePizza_2 covered");
		}
		if(this.esecuzione.cover_r_scegliSeAggiungerePizza_3){
			System.out.println("r_scegliSeAggiungerePizza_3 covered");
		}
	}

	private void cover_r_scegliTipoDiPizza() {
		if(this.esecuzione.cover_r_scegliTipoDiPizza){
			System.out.println("r_scegliTipoDiPizza covered");
		}
		if(this.esecuzione.cover_r_scegliTipoDiPizza_1){
			System.out.println("r_scegliTipoDiPizza_1 covered");
		}
		if(this.esecuzione.cover_r_scegliTipoDiPizza_2){
			System.out.println("r_scegliTipoDiPizza_2 covered");
		}
		if(this.esecuzione.cover_r_scegliTipoDiPizza_3){
			System.out.println("r_scegliTipoDiPizza_3 covered");
		}
	}

	private void cover_r_pizzaStandardSelezionata() {
		if(this.esecuzione.cover_r_pizzaStandardSelezionata){
			System.out.println("r_pizzaStandardSelezionata covered");
		}
		if(this.esecuzione.cover_r_pizzaStandardSelezionata_1){
			System.out.println("r_pizzaStandardSelezionata_1 covered");
		}
		if(this.esecuzione.cover_r_pizzaStandardSelezionata_2){
			System.out.println("r_pizzaStandardSelezionata_2 covered");
		}
		if(this.esecuzione.cover_r_pizzaStandardSelezionata_3){
			System.out.println("r_pizzaStandardSelezionata_3 covered");
		}
	}

	private void cover_r_altraPizzaSelezionata() {
		if(this.esecuzione.cover_r_altraPizzaSelezionata){
			System.out.println("r_altraPizzaSelezionata covered");
		}
		if(this.esecuzione.cover_r_altraPizzaSelezionata_1){
			System.out.println("r_altraPizzaSelezionata_1 covered");
		}
	}

	private void cover_r_main() {
		if(this.esecuzione.cover_r_Main){
			System.out.println("r_main covered");
		}
	}




}
