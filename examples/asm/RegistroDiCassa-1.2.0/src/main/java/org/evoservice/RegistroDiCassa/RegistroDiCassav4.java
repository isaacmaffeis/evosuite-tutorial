package org.evoservice.RegistroDiCassa;
// RegistroDiCassa_TestGen.java automatically generated from ASM2CODE
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.List;

import org.apache.commons.collections4.Bag;

public class RegistroDiCassav4 {
	/////////////////////////////////////////////////
	/// DOMAIN CONTAINERS
	/////////////////////////////////////////////////
	/* Domain containers here */
	//Variabile di tipo astratto
	private static class Pizza {
		static List<Pizza> elems = new ArrayList<>();
		static List<String> val = new ArrayList<>();

		Pizza(String a) {
			elems.add(this);
			val.add(a);
		}

		String toString(Pizza a) {
			if (elems.contains(a)) {
				return val.get(elems.lastIndexOf(a));
			} else
				return null;
		}

		Pizza get(String a) {
			if (val.contains(a)) {
				return elems.get(val.lastIndexOf(a));
			} else
				return null;
		}
	}

	private List<String> Pizza_elemsList = new ArrayList<>();
	private List<Pizza> Pizza_Class = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	private static class PrezzoDomain {
		static List<Integer> elems = new ArrayList<>();
		Integer value;

		static PrezzoDomain valueOf(Integer val) {
			PrezzoDomain n = new PrezzoDomain();
			n.value = val;
			return n;
		}

		static PrezzoDomain valueOf(PrezzoDomain val) {
			return val;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof PrezzoDomain))
				return false;
			return value.equals(((PrezzoDomain) obj).value);
		}

		@Override
		public int hashCode() {
			return value.hashCode();
		}
	}

	private PrezzoDomain PrezzoDomain_elem = new PrezzoDomain();
	private List<Integer> PrezzoDomain_elems = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	private static class QuantitaDomain {
		static List<Integer> elems = new ArrayList<>();
		Integer value;

		static QuantitaDomain valueOf(Integer val) {
			QuantitaDomain n = new QuantitaDomain();
			n.value = val;
			return n;
		}

		static QuantitaDomain valueOf(QuantitaDomain val) {
			return val;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof QuantitaDomain))
				return false;
			return value.equals(((QuantitaDomain) obj).value);
		}

		@Override
		public int hashCode() {
			return value.hashCode();
		}
	}

	private QuantitaDomain QuantitaDomain_elem = new QuantitaDomain();
	private List<Integer> QuantitaDomain_elems = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	enum Stati {
		ATTENDI_ORDINAZIONI, SCEGLI_SE_AGGIUNGERE_PIZZA, CHIUSO, SCEGLI_TIPO_DI_PIZZA, PIZZASTANDARD_SELEZIONATA,
		ALTRAPIZZA_SELEZIONATA
	}

	private List<Stati> Stati_elemsList = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	enum Servizio {
		NEWORDINE, EXIT
	}

	private List<Servizio> Servizio_elemsList = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	enum AggiungiPizza {
		SI, NO
	}

	private List<AggiungiPizza> AggiungiPizza_elemsList = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	enum SelezioneTipoDiPizza {
		STANDARD, OTHER
	}

	private List<SelezioneTipoDiPizza> SelezioneTipoDiPizza_elemsList = new ArrayList<>();

	//Metodi di supporto per l'implementazione delle funzioni controlled
	private class Fun0Ctrl<D> {
		D oldValue;
		D newValue;

		void set(D d) {
			newValue = d;
		}

		D get() {
			return oldValue;
		}
	}

	private static class FunNCtrl<D, C> {
		Map<D, C> oldValues = new HashMap<>();
		Map<D, C> newValues = new HashMap<>();

		void set(D d, C c) {
			newValues.put(d, c);
		}

		C get(D d) {
			return oldValues.get(d);
		}
	}

	//Metodi di supporto per l'implementazione delle funzioni non controlled
	private class Fun0<D> {
		D value;

		void set(D d) {
			value = d;
		}

		D get() {
			return value;
		}
	}

	private class FunN<D, C> {
		Map<D, C> values = new HashMap<>();

		void set(D d, C c) {
			values.put(d, c);
		}

		C get(D d) {
			return values.get(d);
		}
	}

	/////////////////////////////////////////////////
	/// FUNCTIONS
	/////////////////////////////////////////////////
	//Funzione di tipo Controlled
	private Fun0Ctrl<Pizza> pizzaCorrente = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	private Fun0Ctrl<Stati> statoCassa = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	private Fun0Ctrl<String> outMess = new Fun0Ctrl<>();

	//Funzione di tipo statico
	//abstract Integer getPrezzo(Pizza param0_getPrezzo);

	//Funzione di tipo monitored
	private Fun0<Servizio> servizioSelezionato = new Fun0<>();
	//Funzione di tipo monitored
	private Fun0<Pizza> pizzaInserita = new Fun0<>();
	//Funzione di tipo monitored
	private Fun0<AggiungiPizza> sceltaDiAggiuntaPizza = new Fun0<>();
	//Funzione di tipo monitored
	private Fun0<SelezioneTipoDiPizza> sceltaDelTipoPizza = new Fun0<>();
	//Funzione di tipo monitored
	private Fun0<QuantitaDomain> insertQuantita = new Fun0<>();
	private QuantitaDomain insertQuantita_supporto = new QuantitaDomain();
	//Funzione di tipo monitored
	private Fun0<PrezzoDomain> insertPrezzo = new Fun0<>();
	private PrezzoDomain insertPrezzo_supporto = new PrezzoDomain();
	//Funzione di tipo statico
	private static Pizza margherita;
	//Funzione di tipo statico
	private static Pizza marinara;
	//Funzione di tipo statico
	private static Pizza capricciosa;
	//Funzione di tipo Controlled
	private Fun0Ctrl<Integer> totale = new Fun0Ctrl<>();

	// Inizializzazione di funzioni e domini
	public RegistroDiCassav4() {
		//Definizione iniziale dei domini statici
		PrezzoDomain.elems = Collections
				.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
		PrezzoDomain_elems = Collections
				.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
		QuantitaDomain.elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		QuantitaDomain_elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		Stati_elemsList = Collections.unmodifiableList(
				Arrays.asList(Stati.ATTENDI_ORDINAZIONI, Stati.SCEGLI_SE_AGGIUNGERE_PIZZA, Stati.CHIUSO,
						Stati.SCEGLI_TIPO_DI_PIZZA, Stati.PIZZASTANDARD_SELEZIONATA, Stati.ALTRAPIZZA_SELEZIONATA));
		Servizio_elemsList = Collections.unmodifiableList(Arrays.asList(Servizio.NEWORDINE, Servizio.EXIT));
		AggiungiPizza_elemsList = Collections.unmodifiableList(Arrays.asList(AggiungiPizza.SI, AggiungiPizza.NO));
		SelezioneTipoDiPizza_elemsList = Collections
				.unmodifiableList(Arrays.asList(SelezioneTipoDiPizza.STANDARD, SelezioneTipoDiPizza.OTHER));
		//Definizione iniziale dei domini dinamici
		//Definizione iniziale dei domini astratti con funzini statiche
		margherita = new Pizza("margherita");
		Pizza_elemsList.add("margherita");
		Pizza_Class.add(margherita);
		marinara = new Pizza("marinara");
		Pizza_elemsList.add("marinara");
		Pizza_Class.add(marinara);
		capricciosa = new Pizza("capricciosa");
		Pizza_elemsList.add("capricciosa");
		Pizza_Class.add(capricciosa);
		//Inizializzazione delle funzioni
		totale.oldValue = totale.newValue = 0;
		statoCassa.oldValue = statoCassa.newValue = Stati.ATTENDI_ORDINAZIONI;
		outMess.oldValue = outMess.newValue = "";
	}

	// Definizione delle funzioni statiche
	private Integer getPrezzo(Pizza _c) {
		if (_c == margherita)
			return 4;
		else if (_c == marinara)
			return 3;
		else if (_c == capricciosa)
			return 5;
		return null;
	}

	// Conversione delle regole ASM in metodi java
	private void r_aggiungiPizzaStandardAlTotale() {
		//{ //seq
		totale.set((totale.get() + (getPrezzo(pizzaCorrente.get()) * insertQuantita.get().value)));
		totale.oldValue = totale.newValue;
		fireUpdateSet();
		outMess.set("prezzo totale aggiornato");
		outMess.oldValue = outMess.newValue;
		fireUpdateSet();
		//} //endseq
	}

	private void r_aggiungiAlTotale() {
		//{ //seq
		totale.set((totale.get() + (insertQuantita.get().value * insertPrezzo.get().value)));
		totale.oldValue = totale.newValue;
		fireUpdateSet();
		outMess.set("prezzo totale aggiornato");
		outMess.oldValue = outMess.newValue;
		fireUpdateSet();
		//} //endseq
	}

	private void r_attendiOrdinazioni() {
		if (Boolean.TRUE.equals((statoCassa.get() == Stati.ATTENDI_ORDINAZIONI))) {
			//{ //par
			if (Boolean.TRUE.equals((servizioSelezionato.get() == Servizio.EXIT))) {
				//{ //par
				statoCassa.set(Stati.CHIUSO);
				outMess.set("Registro di cassa chiuso!");
				//} //endpar
			}
			if (Boolean.TRUE.equals((servizioSelezionato.get() == Servizio.NEWORDINE))) {
				//{ //par
				totale.set(0);
				statoCassa.set(Stati.SCEGLI_SE_AGGIUNGERE_PIZZA);
				outMess.set("Scegli se aggiungere una nuova pizza");
				//} //endpar
			}
			//} //endpar
		}
	}

	private void r_scegliSeAggiungerePizza() {
		if (Boolean.TRUE.equals((statoCassa.get() == Stati.SCEGLI_SE_AGGIUNGERE_PIZZA))) {
			//{ //par
			if (Boolean.TRUE.equals((sceltaDiAggiuntaPizza.get() == AggiungiPizza.SI))) {
				//{ //par
				statoCassa.set(Stati.SCEGLI_TIPO_DI_PIZZA);
				outMess.set("Scegli il tipo di pizza desiderata:");
				//} //endpar
			}
			if (Boolean.TRUE.equals((sceltaDiAggiuntaPizza.get() == AggiungiPizza.NO))) {
				//{ //seq
				outMess.set("prezzo totale aggiornato");
				outMess.oldValue = outMess.newValue;
				fireUpdateSet();
				statoCassa.set(Stati.ATTENDI_ORDINAZIONI);
				statoCassa.oldValue = statoCassa.newValue;
				fireUpdateSet();
				//} //endseq
			}
			//} //endpar
		}
	}

	private void r_scegliTipoDiPizza() {
		if (Boolean.TRUE.equals((statoCassa.get() == Stati.SCEGLI_TIPO_DI_PIZZA))) {
			//{ //par
			if (Boolean.TRUE.equals((sceltaDelTipoPizza.get() == SelezioneTipoDiPizza.STANDARD))) {
				//{ //par
				statoCassa.set(Stati.PIZZASTANDARD_SELEZIONATA);
				outMess.set("Inserisci il nome di una pizza dell'elenco:");
				//} //endpar
			}
			if (Boolean.TRUE.equals((sceltaDelTipoPizza.get() == SelezioneTipoDiPizza.OTHER))) {
				//{ //par
				statoCassa.set(Stati.ALTRAPIZZA_SELEZIONATA);
				outMess.set("Inserisci il nome di una nuova pizza:");
				//} //endpar
			}
			//} //endpar
		}
	}

	private void r_pizzaStandardSelezionata() {
		if (Boolean.TRUE.equals((statoCassa.get() == Stati.PIZZASTANDARD_SELEZIONATA))) {
			if (Boolean.TRUE.equals(
					Pizza.elems.stream().anyMatch(c -> c.toString(c).equals(pizzaInserita.get().toString(c))))) {
				//{ //seq
				pizzaCorrente.set(pizzaInserita.get());
				pizzaCorrente.oldValue = pizzaCorrente.newValue;
				fireUpdateSet();
				r_aggiungiPizzaStandardAlTotale();
				fireUpdateSet();
				statoCassa.set(Stati.SCEGLI_SE_AGGIUNGERE_PIZZA);
				statoCassa.oldValue = statoCassa.newValue;
				fireUpdateSet();
				//} //endseq
			} else {
				//{ //seq
				outMess.set("Questa pizza non  presente in elenco!");
				outMess.oldValue = outMess.newValue;
				fireUpdateSet();
				statoCassa.set(Stati.SCEGLI_SE_AGGIUNGERE_PIZZA);
				statoCassa.oldValue = statoCassa.newValue;
				fireUpdateSet();
				//} //endseq
			}
		}
	}

	private void r_altraPizzaSelezionata() {
		if (Boolean.TRUE.equals((statoCassa.get() == Stati.ALTRAPIZZA_SELEZIONATA))) {
			//{ //seq
			r_aggiungiAlTotale();
			fireUpdateSet();
			statoCassa.set(Stati.SCEGLI_SE_AGGIUNGERE_PIZZA);
			statoCassa.oldValue = statoCassa.newValue;
			fireUpdateSet();
			//} //endseq
		}
	}

	private void r_Main() {
		//{ //seq
		r_attendiOrdinazioni();
		fireUpdateSet();
		//{ //par
		r_scegliSeAggiungerePizza();
		r_scegliTipoDiPizza();
		r_pizzaStandardSelezionata();
		r_altraPizzaSelezionata();
		//} //endpar
		fireUpdateSet();
		//} //endseq
	}

	// inizializazzione delle funzioni controllate che contengono metodi monitorati nei temini iniziali
	private void initControlledWithMonitored() {
		// No controlled functions initialized with monitored ones have been found
	}

	// applicazione dell'aggiornamento del set
	private void fireUpdateSet() {
		pizzaCorrente.oldValue = pizzaCorrente.newValue;
		statoCassa.oldValue = statoCassa.newValue;
		outMess.oldValue = outMess.newValue;
		totale.oldValue = totale.newValue;
	}

	//Metodo per l'aggiornamento dell'asm
	private void updateASM() {
		r_Main();
		fireUpdateSet();
		initControlledWithMonitored();
	}

	private int stato = 0;

	/** The step function is the only public method of the ASM,
	 * it receives as parameters the values ​​of the monitored functions to be updated
	 * and allows to perform a step of the asm by incrementing the state.
	 */
	public void step() {
		System.out.println("<State " + stato + " (controlled)>");
		printControlled();
		updateASM();
		System.out.println("</State " + stato + " (controlled)>");
		System.out.println("\n<Stato attuale>");
		printControlled();
		stato++;
	}

	private void printControlled() {
		System.out.print("Pizza" + " = {");
		for (int i = 0; i < Pizza_elemsList.size(); i++)
			if (i != Pizza_elemsList.size() - 1)
				System.out.print(Pizza_elemsList.get(i) + ", ");
			else
				System.out.print(Pizza_elemsList.get(i));
		System.out.println("}");
		System.out.println("statoCassa = " + statoCassa.oldValue.name());
		System.out.println("outMess = " + outMess.get());
		System.out.println("totale = " + totale.get());
	}


	// Controlled getters
	public Pizza get_pizzaCorrente() {
		return pizzaCorrente.get();
	}

	public Stati get_statoCassa() {
		return statoCassa.get();
	}

	public String get_outMess() {
		return outMess.get();
	}

	public int get_totale() {
		return totale.get();
	}


	// Monitored Setters

	public void set_servizioSelezionato(Servizio servizioSelezionato){
		this.servizioSelezionato.set(servizioSelezionato);
		System.out.println("Set servizioSelezionato = " + servizioSelezionato);
	}

	public void set_pizzaInserita(String pizzaInserita){
		this.pizzaInserita
				.set(this.Pizza_Class.get(this.Pizza_elemsList.indexOf(pizzaInserita)));
		System.out.println("Set pizzaInserita = " + pizzaInserita);
	}

	public void set_sceltaDiAggiuntaPizza(AggiungiPizza sceltaDiAggiuntaPizza){
		this.sceltaDiAggiuntaPizza.set(sceltaDiAggiuntaPizza);
		System.out.println("Set sceltaDiAggiuntaPizza = " + sceltaDiAggiuntaPizza);
	}

	public void set_sceltaDelTipoDiPizza(SelezioneTipoDiPizza sceltaDelTipoPizza){
		this.sceltaDelTipoPizza.set(sceltaDelTipoPizza);
		System.out.println("Set sceltaDelTipoPizza = " + sceltaDelTipoPizza);
	}

	public void set_insertQuantita(int insertQuantita){
		this.insertQuantita.set(QuantitaDomain.valueOf(this.QuantitaDomain_elems
				.get(insertQuantita - this.QuantitaDomain_elems.get(0))));
		System.out.println("Set insertQuantita = " + insertQuantita);
	}

	public void set_insertPrezzo(int insertPrezzo){
		this.insertPrezzo.set(PrezzoDomain.valueOf(
				this.PrezzoDomain_elems.get(insertPrezzo - this.PrezzoDomain_elems.get(0))));
		System.out.println("Set insertPrezzo = " + insertPrezzo);
	}

}
