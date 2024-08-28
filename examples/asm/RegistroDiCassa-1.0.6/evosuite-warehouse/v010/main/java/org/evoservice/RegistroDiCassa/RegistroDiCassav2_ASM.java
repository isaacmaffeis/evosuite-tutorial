package org.evoservice.RegistroDiCassa;// RegistroDiCassa_Exe.java automatically generated from ASM2CODE
//Classe per l'esecuzione dei file java generati dalla traduzione di un programma ASM

import org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig.AggiungiPizza;
import org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig.PrezzoDomain;
import org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig.QuantitaDomain;
import org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig.SelezioneTipoDiPizza;
import org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig.Servizio;
import org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig.Stati;

class RegistroDiCassav2_ASM {

	private final RegistroDiCassav2 esecuzione;
	private int stato;

	public RegistroDiCassav2_ASM() {
		this.esecuzione = new RegistroDiCassav2();
		this.stato = 1;
	}

	public void step(
			Servizio servizio,
			AggiungiPizza aggiungiPizza,
			SelezioneTipoDiPizza selezioneTipoDiPizza,
			int quantita,
			int prezzo) {
		System.out.println("<State " + stato + " (controlled)>");
		printControlled();
		askMonitored(servizio, aggiungiPizza, selezioneTipoDiPizza, quantita, prezzo);
		this.esecuzione.updateASM();
		System.out.println("</State " + stato + " (controlled)>");
		System.out.println("\n<Stato attuale>");
		printControlled();
		getStato();
		getAggiungiPizza();
		getSelezioneTipoDiPizza();
		getServizio();
		getStatoCassa();
		getTotale();
//		getPizza_elemsList_0();
//		getPizza_elemsList_1();
//		getPizza_elemsList_2();
		if(isFinalState()){
			System.out.println("\n<Stato finale>");
		}
		else
			stato++;
	}

	public boolean isFinalState() {
		return this.getTotale() >= 50 &&
				this.stato>=5 &&
				this.esecuzione.statoCassa.oldValue.equals(Stati.CHIUSO);
	}

	// Enum Domain assertions

	public Stati getStato(){
		return esecuzione.statoCassa.oldValue;
	}

	public AggiungiPizza getAggiungiPizza(){
		return esecuzione.sceltaDiAggiuntaPizza.value;
	}

	public SelezioneTipoDiPizza getSelezioneTipoDiPizza(){
		return esecuzione.sceltaDelTipoPizza.value;
	}

	public Servizio getServizio() {
		return esecuzione.servizioSelezionato.value;
	}

	// Function assertions

	public String getStatoCassa(){
		return esecuzione.statoCassa.oldValue.name();
	}

	public int getTotale(){
		return esecuzione.totale.get();
	}

//	public String getPizza_elemsList_0(){
//		return esecuzione.Pizza_elemsList.get(0);
//	}
//
//	public String getPizza_elemsList_1(){
//		return esecuzione.Pizza_elemsList.get(1);
//	}
//
//	public String getPizza_elemsList_2(){
//		return esecuzione.Pizza_elemsList.get(2);
//	}


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
	}

	private void askMonitored(
			Servizio servizio,
			AggiungiPizza aggiungiPizza,
			SelezioneTipoDiPizza selezioneTipoDiPizza,
			int quantita,
			int prezzo) {

		this.esecuzione.servizioSelezionato.set(servizio);
		System.out.println("Set servizio = " + servizio);

		this.esecuzione.sceltaDiAggiuntaPizza.set(aggiungiPizza);
		System.out.println("Set aggiungiPizza = " + aggiungiPizza);

		this.esecuzione.sceltaDelTipoPizza.set(selezioneTipoDiPizza);
		System.out.println("Set selezioneTipoDiPizza = " + selezioneTipoDiPizza);

		this.esecuzione.insertQuantita.set(QuantitaDomain.valueOf(this.esecuzione.QuantitaDomain_elems.get(quantita)));
		System.out.println("Set quantita' = " + quantita);

		this.esecuzione.insertPrezzo.set(PrezzoDomain.valueOf(this.esecuzione.PrezzoDomain_elems.get(prezzo-1)));
		System.out.println("Set prezzo = " + prezzo);

	}

}
