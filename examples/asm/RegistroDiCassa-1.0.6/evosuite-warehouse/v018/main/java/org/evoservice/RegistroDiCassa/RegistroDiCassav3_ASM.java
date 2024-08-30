package org.evoservice.RegistroDiCassa;// RegistroDiCassa_Exe.java automatically generated from ASM2CODE
//Classe per l'esecuzione dei file java generati dalla traduzione di un programma ASM

import org.evoservice.RegistroDiCassa.RegistroDiCassav3Sig.AggiungiPizza;
import org.evoservice.RegistroDiCassa.RegistroDiCassav3Sig.Pizza;
import org.evoservice.RegistroDiCassa.RegistroDiCassav3Sig.PrezzoDomain;
import org.evoservice.RegistroDiCassa.RegistroDiCassav3Sig.QuantitaDomain;
import org.evoservice.RegistroDiCassa.RegistroDiCassav3Sig.SelezioneTipoDiPizza;
import org.evoservice.RegistroDiCassa.RegistroDiCassav3Sig.Servizio;
import org.evoservice.RegistroDiCassa.RegistroDiCassav3Sig.Stati;

class RegistroDiCassav3_ASM {

	private final RegistroDiCassav3 esecuzione;
	private int stato;

	public RegistroDiCassav3_ASM() {
		this.esecuzione = new RegistroDiCassav3();
		this.stato = 1;
	}

	public void step(
			Servizio servizio,
			AggiungiPizza aggiungiPizza,
			SelezioneTipoDiPizza selezioneTipoDiPizza,
			int pizza,
			int quantita,
			int prezzo) {
		System.out.println("<State " + stato + " (controlled)>");
		printControlled();
		askMonitored(servizio, aggiungiPizza, selezioneTipoDiPizza, pizza, quantita, prezzo);
		this.esecuzione.updateASM();
		System.out.println("</State " + stato + " (controlled)>");
		System.out.println("\n<Stato attuale>");
		printControlled();
		//monitored
		coverMonitored();
		// controlled
		coverControlled();
		//final state condition
//		if(isFinalState()){
//			System.out.println("\n<Stato finale>");
//		}
//		else
		stato++;
	}

	//final state condition

//	public boolean isFinalState() {
//		return this.getTotale() >= 50 &&
//				this.stato>=5 &&
//				this.esecuzione.statoCassa.oldValue.equals(Stati.CHIUSO);
//	}

	// Monitored functions

	private Servizio getServizioSelezionato(){
		return this.esecuzione.servizioSelezionato.get();
	}

	private Pizza getPizzaInserita(){
		return this.esecuzione.pizzaInserita.get();
	}

	private AggiungiPizza getSceltaDiAggiuntaPizza(){
		return this.esecuzione.sceltaDiAggiuntaPizza.get();
	}

	private SelezioneTipoDiPizza getSceltaDelTipoPizza(){
		return this.esecuzione.sceltaDelTipoPizza.get();
	}

	private QuantitaDomain getInsertQuantita(){
		return this.esecuzione.insertQuantita.get();
	}

	private PrezzoDomain getInsertPrezzo(){
		return this.esecuzione.insertPrezzo.get();
	}

	// Controlled functions

	public Pizza getPizzaCorrente(){
		return this.esecuzione.pizzaCorrente.get();
	}

	public Stati getStatoCassa(){
		return this.esecuzione.statoCassa.get();
	}

	public String getOutMess(){
		return this.esecuzione.outMess.get();
	}

	public int getTotale(){
		return this.esecuzione.totale.get();
	}

	// Cover functions

	private void coverMonitored(){
		coverServizioSelezionato();
		coverPizzaInserita();
		coverSceltaDiAggiuntaPizza();
		coverSceltaDelTipoPizza();
		coverInsertQuantita();
		coverInsertPrezzo();
	}

	private void coverControlled(){
		coverPizzaCorrente();
		coverStatoCassa();
		coverOutMess();
		coverTotale();
	}

	// Monitored functions branches

	private void coverServizioSelezionato(){
		switch (this.getServizioSelezionato()){
			case NEWORDINE:
				System.out.println("Servizio NEWORDINE covered");
				break;
			case EXIT:
				System.out.println("Servizio EXIT covered");
				break;
		}
	}

	private void coverPizzaInserita(){
		// TODO: Abstract domain
	}

	private void coverSceltaDiAggiuntaPizza(){
		switch (this.getSceltaDiAggiuntaPizza()){
			case SI:
				System.out.println("AggiungiPizza SI covered");
				break;
			case NO:
				System.out.println("AggiungiPizza NO covered");
		}
	}

	private void coverSceltaDelTipoPizza(){
		switch (this.getSceltaDelTipoPizza()){
			case OTHER:
				System.out.println("SelezioneTipoDiPizza OTHER covered");
				break;
			case STANDARD:
				System.out.println("SelezioneTipoDiPizza STANDARD covered");
				break;
		}
	}

	private void coverInsertQuantita(){
		// TODO: Subset of Integer domain
	}

	private void coverInsertPrezzo(){
		// TODO: Subset of Integer domain
	}

	// Controlled functions branches

	private void coverPizzaCorrente() {
		// TODO: Abstract domain
	}

	private void coverStatoCassa() {
		switch (getStatoCassa()) {
			case ATTENDI_ORDINAZIONI:
				System.out.println("Stato ATTENDI_ORDINAZIONI covered");
				break;
			case SCEGLI_SE_AGGIUNGERE_PIZZA:
				System.out.println("Stato SCEGLI_SE_AGGIUNGERE_PIZZA covered");
				break;
			case PIZZASTANDARD_SELEZIONATA:
				System.out.println("Stato PIZZASTANDARD_SELEZIONATA covered");
				break;
			case SCEGLI_TIPO_DI_PIZZA:
				System.out.println("Stato SCEGLI_TIPO_DI_PIZZA covered");
				break;
			case ALTRAPIZZA_SELEZIONATA:
				System.out.println("Stato ALTRAPIZZA_SELEZIONATA covered");
				break;
			case CHIUSO:
				System.out.println("Stato CHIUSO covered");
				break;
		}
	}

	private void coverOutMess() {
		// TODO: String
	}

	private void coverTotale() {
		// TODO: Integer
	}

	// ASM Methods

	private void printControlled() {
		System.out.print("Pizza"+ " = {");
		for(int i=0 ; i< this.esecuzione.Pizza_elemsList.size(); i++)
			if(i!= this.esecuzione.Pizza_elemsList.size()-1)
				System.out.print(this.esecuzione.Pizza_elemsList.get(i) +", ");
			else
				System.out.print(this.esecuzione.Pizza_elemsList.get(i));
		System.out.println("}");
		System.out.println("statoCassa = " + this.esecuzione.statoCassa.oldValue.name());
		System.out.println("totale = " + this.esecuzione.totale.get());
		System.out.println("outMess = " + this.esecuzione.outMess.get());
		if(this.esecuzione.pizzaCorrente.get()!=null)
			System.out.println("pizzaCorrente = " + this.esecuzione.pizzaCorrente.get().toString(this.esecuzione.pizzaCorrente.get()));
	}

	private void askMonitored(
			Servizio servizio,
			AggiungiPizza aggiungiPizza,
			SelezioneTipoDiPizza selezioneTipoDiPizza,
			int pizza,
			int quantita,
			int prezzo) {

		this.esecuzione.servizioSelezionato.set(servizio);
		System.out.println("Set servizio = " + servizio);

		this.esecuzione.sceltaDiAggiuntaPizza.set(aggiungiPizza);
		System.out.println("Set aggiungiPizza = " + aggiungiPizza);

		this.esecuzione.sceltaDelTipoPizza.set(selezioneTipoDiPizza);
		System.out.println("Set selezioneTipoDiPizza = " + selezioneTipoDiPizza);

		this.esecuzione.pizzaInserita.set(this.esecuzione.Pizza_Class.get(pizza));
		System.out.println("Set pizzaInserita = " + this.esecuzione.Pizza_elemsList.get(pizza));

		this.esecuzione.insertQuantita.set(QuantitaDomain.valueOf(this.esecuzione.QuantitaDomain_elems.get(quantita)));
		System.out.println("Set quantita' = " + quantita);

		this.esecuzione.insertPrezzo.set(PrezzoDomain.valueOf(this.esecuzione.PrezzoDomain_elems.get(prezzo-1)));
		System.out.println("Set prezzo = " + prezzo);

	}

}
