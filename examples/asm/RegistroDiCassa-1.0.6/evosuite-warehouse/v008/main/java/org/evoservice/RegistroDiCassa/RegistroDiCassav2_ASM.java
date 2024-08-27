package org.evoservice.RegistroDiCassa;// RegistroDiCassa_Exe.java automatically generated from ASM2CODE
//Classe per l'esecuzione dei file java generati dalla traduzione di un programma ASM

import java.util.HashSet;
import java.util.Set;
import org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig.AggiungiPizza;
import org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig.PrezzoDomain;
import org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig.QuantitaDomain;
import org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig.SelezioneTipoDiPizza;
import org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig.Servizio;
import org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig.Stati;

class RegistroDiCassav2_ASM {

	private final RegistroDiCassav2 esecuzione;
	private int stato;

	public RegistroDiCassav2_ASM(RegistroDiCassav2 esecuzione) {
		this.esecuzione = esecuzione;
		this.stato = 1;
	}

	public void step(
			RegistroDiCassav2 esecuzione,
			Servizio servizio,
			AggiungiPizza aggiungiPizza,
			SelezioneTipoDiPizza selezioneTipoDiPizza,
			int quantita,
			int prezzo) {
		System.out.println("<State " + stato + " (controlled)>");
		printControlled(esecuzione);
		askMonitored(esecuzione, servizio, aggiungiPizza, selezioneTipoDiPizza, quantita, prezzo);
		esecuzione.updateASM();
		System.out.println("</State " + stato + " (controlled)>");
		System.out.println("\n<Stato attuale>");
		printControlled(esecuzione);
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
		return this.getTotale() >= 50 && this.stato>=5 && this.esecuzione.statoCassa.oldValue.equals(Stati.CHIUSO);
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


	static void printControlled(RegistroDiCassav2 esecuzione) {
		System.out.print("Pizza"+ " = {");
		for(int i=0 ; i< esecuzione.Pizza_elemsList.size(); i++)
			if(i!= esecuzione.Pizza_elemsList.size()-1)
				System.out.print(esecuzione.Pizza_elemsList.get(i) +", ");
			else
				System.out.print(esecuzione.Pizza_elemsList.get(i));
		System.out.println("}");
		System.out.println("statoCassa = " + esecuzione.statoCassa.oldValue.name());
		System.out.println("totale = " + esecuzione.totale.get());
	}

	static void askMonitored(
			RegistroDiCassav2 esecuzione,
			Servizio servizio,
			AggiungiPizza aggiungiPizza,
			SelezioneTipoDiPizza selezioneTipoDiPizza,
			int quantita,
			int prezzo) {

		esecuzione.servizioSelezionato.set(servizio);
		System.out.println("Set servizio = " + servizio);

		esecuzione.sceltaDiAggiuntaPizza.set(aggiungiPizza);
		System.out.println("Set aggiungiPizza = " + aggiungiPizza);

		esecuzione.sceltaDelTipoPizza.set(selezioneTipoDiPizza);
		System.out.println("Set selezioneTipoDiPizza = " + selezioneTipoDiPizza);

		esecuzione.insertQuantita.set(QuantitaDomain.valueOf(esecuzione.QuantitaDomain_elems.get(quantita)));
		System.out.println("Set quantita' = " + quantita);

		esecuzione.insertPrezzo.set(PrezzoDomain.valueOf(esecuzione.PrezzoDomain_elems.get(prezzo-1)));
		System.out.println("Set prezzo = " + prezzo);

	}

}
