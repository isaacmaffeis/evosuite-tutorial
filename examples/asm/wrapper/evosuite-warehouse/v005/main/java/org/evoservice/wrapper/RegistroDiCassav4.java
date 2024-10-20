package org.evoservice.wrapper;
// RegistroDiCassav4.java automatically generated from ASM2CODE
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.List;

import org.apache.commons.collections4.Bag;

abstract class RegistroDiCassav4Sig {
	/////////////////////////////////////////////////
	/// DOMAIN CONTAINERS
	/////////////////////////////////////////////////
	/* Domain containers here */
	//Variabile di tipo astratto
	static class Pizza {
		static List<Pizza> elems = new ArrayList<>();
		static List<String> val = new ArrayList<>();

		Pizza(String a) {
			elems.add(this);
			val.add(a);
		}

		static String toString(Pizza a) {
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

	List<String> Pizza_elemsList = new ArrayList<>();
	List<Pizza> Pizza_Class = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	static class PrezzoDomain {
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

	PrezzoDomain PrezzoDomain_elem = new PrezzoDomain();
	List<Integer> PrezzoDomain_elems = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	static class QuantitaDomain {
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

	QuantitaDomain QuantitaDomain_elem = new QuantitaDomain();
	List<Integer> QuantitaDomain_elems = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	enum Stati {
		ATTENDI_ORDINAZIONI, SCEGLI_SE_AGGIUNGERE_PIZZA, CHIUSO, SCEGLI_TIPO_DI_PIZZA, PIZZASTANDARD_SELEZIONATA,
		ALTRAPIZZA_SELEZIONATA
	}

	List<Stati> Stati_elemsList = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	enum Servizio {
		NEWORDINE, EXIT
	}

	List<Servizio> Servizio_elemsList = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	enum AggiungiPizza {
		SI, NO
	}

	List<AggiungiPizza> AggiungiPizza_elemsList = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	enum SelezioneTipoDiPizza {
		STANDARD, OTHER
	}

	List<SelezioneTipoDiPizza> SelezioneTipoDiPizza_elemsList = new ArrayList<>();

	//Metodi di supporto per l'implementazione delle funzioni controlled
	class Fun0Ctrl<D> {
		D oldValue;
		D newValue;

		void set(D d) {
			newValue = d;
		}

		D get() {
			return oldValue;
		}
	}

	static class FunNCtrl<D, C> {
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
	class Fun0<D> {
		D value;

		void set(D d) {
			value = d;
		}

		D get() {
			return value;
		}
	}

	class FunN<D, C> {
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
	Fun0Ctrl<Pizza> pizzaCorrente = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<Stati> statoCassa = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<String> outMess = new Fun0Ctrl<>();

	//Funzione di tipo statico
	abstract Integer getPrezzo(Pizza param0_getPrezzo);

	//Funzione di tipo monitored
	Fun0<Servizio> servizioSelezionato = new Fun0<>();
	//Funzione di tipo monitored
	Fun0<Pizza> pizzaInserita = new Fun0<>();
	//Funzione di tipo monitored
	Fun0<AggiungiPizza> sceltaDiAggiuntaPizza = new Fun0<>();
	//Funzione di tipo monitored
	Fun0<SelezioneTipoDiPizza> sceltaDelTipoPizza = new Fun0<>();
	//Funzione di tipo monitored
	Fun0<QuantitaDomain> insertQuantita = new Fun0<>();
	QuantitaDomain insertQuantita_supporto = new QuantitaDomain();
	//Funzione di tipo monitored
	Fun0<PrezzoDomain> insertPrezzo = new Fun0<>();
	PrezzoDomain insertPrezzo_supporto = new PrezzoDomain();
	//Funzione di tipo statico
	static Pizza margherita;
	//Funzione di tipo statico
	static Pizza marinara;
	//Funzione di tipo statico
	static Pizza capricciosa;
	//Funzione di tipo Controlled
	Fun0Ctrl<Integer> totale = new Fun0Ctrl<>();

	////////////////////////////////////////////////
	/// RULE DEFINITION
	/////////////////////////////////////////////////
	/* Rule definition here */
	abstract void r_aggiungiPizzaStandardAlTotale();

	abstract void r_aggiungiAlTotale();

	abstract void r_attendiOrdinazioni();

	abstract void r_scegliSeAggiungerePizza();

	abstract void r_scegliTipoDiPizza();

	abstract void r_pizzaStandardSelezionata();

	abstract void r_altraPizzaSelezionata();

	abstract void r_Main();
}

class RegistroDiCassav4 extends RegistroDiCassav4Sig {
	// Inizializzazione di funzioni e domini
	RegistroDiCassav4() {
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
	Integer getPrezzo(Pizza _c) {
		if (_c == margherita)
			return 4;
		else if (_c == marinara)
			return 3;
		else if (_c == capricciosa)
			return 5;
		return null;
	}

	// Conversione delle regole ASM in metodi java
	boolean branch_r_aggiungiPizzaStandardAlTotale_master = false;

	@Override
	void r_aggiungiPizzaStandardAlTotale() {
		branch_r_aggiungiPizzaStandardAlTotale_master = true;
		//{ //seq
		totale.set((totale.get() + (getPrezzo(pizzaCorrente.get()) * insertQuantita.get().value)));
		totale.oldValue = totale.newValue;
		fireUpdateSet();
		outMess.set("prezzo totale aggiornato");
		outMess.oldValue = outMess.newValue;
		fireUpdateSet();
		//} //endseq
	}

	boolean branch_r_aggiungiAlTotale_master = false;

	@Override
	void r_aggiungiAlTotale() {
		branch_r_aggiungiAlTotale_master = true;
		//{ //seq
		totale.set((totale.get() + (insertQuantita.get().value * insertPrezzo.get().value)));
		totale.oldValue = totale.newValue;
		fireUpdateSet();
		outMess.set("prezzo totale aggiornato");
		outMess.oldValue = outMess.newValue;
		fireUpdateSet();
		//} //endseq
	}

	boolean branch_r_attendiOrdinazioni_master = false;
	boolean branch_r_attendiOrdinazioni_1 = false;
	boolean branch_r_attendiOrdinazioni_2 = false;
	boolean branch_r_attendiOrdinazioni_3 = false;

	@Override
	void r_attendiOrdinazioni() {
		branch_r_attendiOrdinazioni_master = true;
		if (Boolean.TRUE.equals((statoCassa.get() == Stati.ATTENDI_ORDINAZIONI))) {
			branch_r_attendiOrdinazioni_1 = true;
			//{ //par
			if (Boolean.TRUE.equals((servizioSelezionato.get() == Servizio.EXIT))) {
				branch_r_attendiOrdinazioni_2 = true;
				//{ //par
				statoCassa.set(Stati.CHIUSO);
				outMess.set("Registro di cassa chiuso!");
				//} //endpar
			}
			if (Boolean.TRUE.equals((servizioSelezionato.get() == Servizio.NEWORDINE))) {
				branch_r_attendiOrdinazioni_3 = true;
				//{ //par
				totale.set(0);
				statoCassa.set(Stati.SCEGLI_SE_AGGIUNGERE_PIZZA);
				outMess.set("Scegli se aggiungere una nuova pizza");
				//} //endpar
			}
			//} //endpar
		}
	}

	boolean branch_r_scegliSeAggiungerePizza_master = false;
	boolean branch_r_scegliSeAggiungerePizza_1 = false;
	boolean branch_r_scegliSeAggiungerePizza_2 = false;
	boolean branch_r_scegliSeAggiungerePizza_3 = false;

	@Override
	void r_scegliSeAggiungerePizza() {
		branch_r_scegliSeAggiungerePizza_master = true;
		if (Boolean.TRUE.equals((statoCassa.get() == Stati.SCEGLI_SE_AGGIUNGERE_PIZZA))) {
			branch_r_scegliSeAggiungerePizza_1 = true;
			//{ //par
			if (Boolean.TRUE.equals((sceltaDiAggiuntaPizza.get() == AggiungiPizza.SI))) {
				branch_r_scegliSeAggiungerePizza_2 = true;
				//{ //par
				statoCassa.set(Stati.SCEGLI_TIPO_DI_PIZZA);
				outMess.set("Scegli il tipo di pizza desiderata:");
				//} //endpar
			}
			if (Boolean.TRUE.equals((sceltaDiAggiuntaPizza.get() == AggiungiPizza.NO))) {
				branch_r_scegliSeAggiungerePizza_3 = true;
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

	boolean branch_r_scegliTipoDiPizza_master = false;
	boolean branch_r_scegliTipoDiPizza_1 = false;
	boolean branch_r_scegliTipoDiPizza_2 = false;
	boolean branch_r_scegliTipoDiPizza_3 = false;

	@Override
	void r_scegliTipoDiPizza() {
		branch_r_scegliTipoDiPizza_master = true;
		if (Boolean.TRUE.equals((statoCassa.get() == Stati.SCEGLI_TIPO_DI_PIZZA))) {
			branch_r_scegliTipoDiPizza_1 = true;
			//{ //par
			if (Boolean.TRUE.equals((sceltaDelTipoPizza.get() == SelezioneTipoDiPizza.STANDARD))) {
				branch_r_scegliTipoDiPizza_2 = true;
				//{ //par
				statoCassa.set(Stati.PIZZASTANDARD_SELEZIONATA);
				outMess.set("Inserisci il nome di una pizza dell'elenco:");
				//} //endpar
			}
			if (Boolean.TRUE.equals((sceltaDelTipoPizza.get() == SelezioneTipoDiPizza.OTHER))) {
				branch_r_scegliTipoDiPizza_3 = true;
				//{ //par
				statoCassa.set(Stati.ALTRAPIZZA_SELEZIONATA);
				outMess.set("Inserisci il nome di una nuova pizza:");
				//} //endpar
			}
			//} //endpar
		}
	}

	boolean branch_r_pizzaStandardSelezionata_master = false;
	boolean branch_r_pizzaStandardSelezionata_1 = false;
	boolean branch_r_pizzaStandardSelezionata_2 = false;
	boolean branch_r_pizzaStandardSelezionata_3 = false;

	@Override
	void r_pizzaStandardSelezionata() {
		branch_r_pizzaStandardSelezionata_master = true;
		if (Boolean.TRUE.equals((statoCassa.get() == Stati.PIZZASTANDARD_SELEZIONATA))) {
			branch_r_pizzaStandardSelezionata_1 = true;
			if (Boolean.TRUE.equals(
					Pizza.elems.stream().anyMatch(c -> c.toString(c).equals(pizzaInserita.get().toString(c))))) {
				branch_r_pizzaStandardSelezionata_2 = true;
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
				branch_r_pizzaStandardSelezionata_3 = true;
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

	boolean branch_r_altraPizzaSelezionata_master = false;
	boolean branch_r_altraPizzaSelezionata_1 = false;

	@Override
	void r_altraPizzaSelezionata() {
		branch_r_altraPizzaSelezionata_master = true;
		if (Boolean.TRUE.equals((statoCassa.get() == Stati.ALTRAPIZZA_SELEZIONATA))) {
			branch_r_altraPizzaSelezionata_1 = true;
			//{ //seq
			r_aggiungiAlTotale();
			fireUpdateSet();
			statoCassa.set(Stati.SCEGLI_SE_AGGIUNGERE_PIZZA);
			statoCassa.oldValue = statoCassa.newValue;
			fireUpdateSet();
			//} //endseq
		}
	}

	boolean branch_r_Main_master = false;

	@Override
	void r_Main() {
		branch_r_Main_master = true;
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
	void initControlledWithMonitored() {
		// No controlled functions initialized with monitored ones have been found
	}

	// applicazione dell'aggiornamento del set
	void fireUpdateSet() {
		pizzaCorrente.oldValue = pizzaCorrente.newValue;
		statoCassa.oldValue = statoCassa.newValue;
		outMess.oldValue = outMess.newValue;
		totale.oldValue = totale.newValue;
	}

	//Metodo per l'aggiornamento dell'asm
	void updateASM() {
		r_Main();
		fireUpdateSet();
		initControlledWithMonitored();
	}

	public static void main(String[] args) {
		// TODO: auto-generated main method by Asmeta2Java 
	}
}
