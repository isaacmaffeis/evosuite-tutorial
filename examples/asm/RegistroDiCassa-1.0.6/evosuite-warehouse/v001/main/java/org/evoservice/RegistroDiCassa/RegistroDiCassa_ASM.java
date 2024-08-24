package org.evoservice.RegistroDiCassa;// RegistroDiCassa_Exe.java automatically generated from ASM2CODE
//Classe per l'esecuzione dei file java generati dalla traduzione di un programma ASM

import org.evoservice.RegistroDiCassa.RegistroDiCassaSig.AggiungiPizza;
import org.evoservice.RegistroDiCassa.RegistroDiCassaSig.SelezioneTipoDiPizza;
import org.evoservice.RegistroDiCassa.RegistroDiCassaSig.Servizio;

class RegistroDiCassa_ASM {

	private final RegistroDiCassa esecuzione;
	private int stato;

	public RegistroDiCassa_ASM(RegistroDiCassa esecuzione) {
		this.esecuzione = esecuzione;
		this.stato = 1;
	}

	public void stepFSM(
			RegistroDiCassa esecuzione,
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
		getServizio();
		getStatoCassa();
		getTotale();
		getPizza_elemsList_0();
		getPizza_elemsList_1();
		getPizza_elemsList_2();
		if(isFinalState()){
			System.out.println("\n<Stato finale>");
		}
		else
			stato++;
	}

	public boolean isFinalState() {
    return this.stato >= 10;
	}


	public Servizio getServizio() {
		return esecuzione.servizioSelezionato.value;
	}

	public String getStatoCassa(){
		return esecuzione.statoCassa.oldValue.name();
	}

	public int getTotale(){
		return esecuzione.totale.get();
	}

	public String getPizza_elemsList_0(){
		return esecuzione.Pizza_elemsList.get(0);
	}

	public String getPizza_elemsList_1(){
		return esecuzione.Pizza_elemsList.get(1);
	}

	public String getPizza_elemsList_2(){
		return esecuzione.Pizza_elemsList.get(2);
	}
	
	static void printControlled(RegistroDiCassa esecuzione) {
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
			RegistroDiCassa esecuzione,
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

		esecuzione.insertQuantita.set(quantita);
		System.out.println("Set quantita' = " + quantita);

		esecuzione.insertPrezzo.set(prezzo);
		System.out.println("Set prezzo = " + prezzo);

		}

}
