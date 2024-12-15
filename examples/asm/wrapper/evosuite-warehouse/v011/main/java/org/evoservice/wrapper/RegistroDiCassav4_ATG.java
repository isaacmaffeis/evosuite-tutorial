package org.evoservice.wrapper;// RegistroDiCassav4_ATG.java automatically generated from ASM2CODE

/**
* This class is designed to simulate the behavior of an abstract state machine in an automated way.
*
* <p>
* It has been optimized to be used with evosuite in order to automatically generate test scenarios.
* </p>
*/
class RegistroDiCassav4_ATG {
	/** Instance of the asmeta specification translated into a java class.*/
	private final RegistroDiCassav4 execution;
	/** current state. */
	private int state;

	/**
	* Constructor of the {@code RegistroDiCassav4_ATG} class. Creates a private instance of the asm
	* {@link RegistroDiCassav4} and sets the initial state of the state machine to 0.
	*/
	public RegistroDiCassav4_ATG() {
		this.execution = new RegistroDiCassav4();
		this.state = 0;
	}

	/** The step function allows to perform a step of the asm by incrementing the state.
	*/
	public void step() {
		System.out.println("<State " + state + " (controlled)>");
		printControlled();
		// Cover the rules
		coverRules();
		this.execution.updateASM();
		System.out.println("</State " + state + " (controlled)>");
		System.out.println("\n<Current status>");
		printControlled();
		state++;
	}

	/* Cover the Rules */
	/**
	* Calls all rules covering functions.
	*/
	private void coverRules() {
		cover_r_Main_branches();
		cover_r_altraPizzaSelezionata_branches();
		cover_r_scegliTipoDiPizza_branches();
		cover_r_attendiOrdinazioni_branches();
		cover_r_pizzaStandardSelezionata_branches();
		cover_r_aggiungiPizzaStandardAlTotale_branches();
		cover_r_aggiungiAlTotale_branches();
		cover_r_scegliSeAggiungerePizza_branches();
	}

	/**
	* Cover all the branches of the rule r_Main.
	*/
	private void cover_r_Main_branches() {
		if (this.execution.branch_r_Main_master) {
			System.out.println("branch_r_Main_master covered");
		}
	}

	/**
	* Cover all the branches of the rule r_altraPizzaSelezionata.
	*/
	private void cover_r_altraPizzaSelezionata_branches() {
		if (this.execution.branch_r_altraPizzaSelezionata_master) {
			System.out.println("branch_r_altraPizzaSelezionata_master covered");
		}
		if (this.execution.branch_r_altraPizzaSelezionata_1) {
			System.out.println("branch_r_altraPizzaSelezionata_1 covered");
		}
	}

	/**
	* Cover all the branches of the rule r_scegliTipoDiPizza.
	*/
	private void cover_r_scegliTipoDiPizza_branches() {
		if (this.execution.branch_r_scegliTipoDiPizza_master) {
			System.out.println("branch_r_scegliTipoDiPizza_master covered");
		}
		if (this.execution.branch_r_scegliTipoDiPizza_1) {
			System.out.println("branch_r_scegliTipoDiPizza_1 covered");
		}
		if (this.execution.branch_r_scegliTipoDiPizza_2) {
			System.out.println("branch_r_scegliTipoDiPizza_2 covered");
		}
		if (this.execution.branch_r_scegliTipoDiPizza_3) {
			System.out.println("branch_r_scegliTipoDiPizza_3 covered");
		}
	}

	/**
	* Cover all the branches of the rule r_attendiOrdinazioni.
	*/
	private void cover_r_attendiOrdinazioni_branches() {
		if (this.execution.branch_r_attendiOrdinazioni_master) {
			System.out.println("branch_r_attendiOrdinazioni_master covered");
		}
		if (this.execution.branch_r_attendiOrdinazioni_1) {
			System.out.println("branch_r_attendiOrdinazioni_1 covered");
		}
		if (this.execution.branch_r_attendiOrdinazioni_2) {
			System.out.println("branch_r_attendiOrdinazioni_2 covered");
		}
		if (this.execution.branch_r_attendiOrdinazioni_3) {
			System.out.println("branch_r_attendiOrdinazioni_3 covered");
		}
	}

	/**
	* Cover all the branches of the rule r_pizzaStandardSelezionata.
	*/
	private void cover_r_pizzaStandardSelezionata_branches() {
		if (this.execution.branch_r_pizzaStandardSelezionata_master) {
			System.out.println("branch_r_pizzaStandardSelezionata_master covered");
		}
		if (this.execution.branch_r_pizzaStandardSelezionata_1) {
			System.out.println("branch_r_pizzaStandardSelezionata_1 covered");
		}
		if (this.execution.branch_r_pizzaStandardSelezionata_2) {
			System.out.println("branch_r_pizzaStandardSelezionata_2 covered");
		}
		if (this.execution.branch_r_pizzaStandardSelezionata_3) {
			System.out.println("branch_r_pizzaStandardSelezionata_3 covered");
		}
	}

	/**
	* Cover all the branches of the rule r_aggiungiPizzaStandardAlTotale.
	*/
	private void cover_r_aggiungiPizzaStandardAlTotale_branches() {
		if (this.execution.branch_r_aggiungiPizzaStandardAlTotale_master) {
			System.out.println("branch_r_aggiungiPizzaStandardAlTotale_master covered");
		}
	}

	/**
	* Cover all the branches of the rule r_aggiungiAlTotale.
	*/
	private void cover_r_aggiungiAlTotale_branches() {
		if (this.execution.branch_r_aggiungiAlTotale_master) {
			System.out.println("branch_r_aggiungiAlTotale_master covered");
		}
	}

	/**
	* Cover all the branches of the rule r_scegliSeAggiungerePizza.
	*/
	private void cover_r_scegliSeAggiungerePizza_branches() {
		if (this.execution.branch_r_scegliSeAggiungerePizza_master) {
			System.out.println("branch_r_scegliSeAggiungerePizza_master covered");
		}
		if (this.execution.branch_r_scegliSeAggiungerePizza_1) {
			System.out.println("branch_r_scegliSeAggiungerePizza_1 covered");
		}
		if (this.execution.branch_r_scegliSeAggiungerePizza_2) {
			System.out.println("branch_r_scegliSeAggiungerePizza_2 covered");
		}
		if (this.execution.branch_r_scegliSeAggiungerePizza_3) {
			System.out.println("branch_r_scegliSeAggiungerePizza_3 covered");
		}
	}

	/* ASM Methods */
	// Print controlled
	private void printControlled() {
		System.out.print("Pizza" + " = {");
		for (int i = 0; i < execution.Pizza_elemsList.size(); i++)
			if (i != execution.Pizza_elemsList.size() - 1)
				System.out.print(execution.Pizza_elemsList.get(i) + ", ");
			else
				System.out.print(execution.Pizza_elemsList.get(i));
		System.out.println("}");
		System.out.println("statoCassa = " + execution.statoCassa.oldValue.name());
		System.out.println("outMess = " + execution.outMess.get());
		System.out.println("totale = " + execution.totale.get());
	}

	// Controlled getters
	public String get_pizzaCorrente() {
		return RegistroDiCassav4.Pizza.toString(this.execution.pizzaCorrente.get());
	}

	public RegistroDiCassav4.Stati get_statoCassa() {
		return this.execution.statoCassa.get();
	}

	public String get_outMess() {
		return this.execution.outMess.get();
	}

	public int get_totale() {
		return this.execution.totale.get();
	}

	// Monitored setters
	public void set_servizioSelezionato(RegistroDiCassav4.Servizio servizioSelezionato) {
		this.execution.servizioSelezionato.set(servizioSelezionato);
		System.out.println("Set servizioSelezionato = " + servizioSelezionato);
	}


	public void set_pizzaInserita(String pizzaInserita) {
		this.execution.pizzaInserita
				.set(this.execution.Pizza_Class.get(this.execution.Pizza_elemsList.indexOf(pizzaInserita)));
		System.out.println("Set pizzaInserita = " + pizzaInserita);
	}

//	public void set_pizzaInserita(RegistroDiCassav4.Pizza pizzaInserita) {
//		this.execution.pizzaInserita.set(pizzaInserita);
//		System.out.println("Set pizzaInserita = " + pizzaInserita);
//	}

	public void set_pizzaInserita_margherita() {
		this.execution.pizzaInserita.set(RegistroDiCassav4.margherita);
		System.out.println("Set pizzaInserita = " + "margherita");
	}

	public void set_pizzaInserita_capricciosa() {
		this.execution.pizzaInserita.set(RegistroDiCassav4.capricciosa);
		System.out.println("Set pizzaInserita = " + "capricciosa");
	}

	public void set_pizzaInserita_marinara() {
		this.execution.pizzaInserita.set(RegistroDiCassav4.marinara);
		System.out.println("Set pizzaInserita = " + "marinara");
	}

	public void set_sceltaDiAggiuntaPizza(RegistroDiCassav4.AggiungiPizza sceltaDiAggiuntaPizza) {
		this.execution.sceltaDiAggiuntaPizza.set(sceltaDiAggiuntaPizza);
		System.out.println("Set sceltaDiAggiuntaPizza = " + sceltaDiAggiuntaPizza);
	}

	public void set_sceltaDelTipoPizza(RegistroDiCassav4.SelezioneTipoDiPizza sceltaDelTipoPizza) {
		this.execution.sceltaDelTipoPizza.set(sceltaDelTipoPizza);
		System.out.println("Set sceltaDelTipoPizza = " + sceltaDelTipoPizza);
	}

	public void set_insertQuantita(int insertQuantita) {
		this.execution.insertQuantita.set(RegistroDiCassav4.QuantitaDomain.valueOf(
				this.execution.QuantitaDomain_elems.get(insertQuantita - this.execution.QuantitaDomain_elems.get(0))));
		System.out.println("Set insertQuantita = " + insertQuantita);
	}

	public void set_insertPrezzo(int insertPrezzo) {
		this.execution.insertPrezzo.set(RegistroDiCassav4.PrezzoDomain.valueOf(
				this.execution.PrezzoDomain_elems.get(insertPrezzo - this.execution.PrezzoDomain_elems.get(0))));
		System.out.println("Set insertPrezzo = " + insertPrezzo);
	}
}
