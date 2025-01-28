package org.evoservice.registrodicassa;
// RegistroDiCassav4.java automatically generated from ASM2CODE
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.List;

import org.apache.commons.collections4.Bag;

import java.util.function.Function;

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

		@Override
		public String toString() {
			if (elems.contains(this)) {
				return val.get(elems.lastIndexOf(this));
			} else
				return null;
		}

		static Pizza get(String a) {
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
			if (elems.contains(val)) {
				PrezzoDomain n = new PrezzoDomain();
				n.value = elems.get(elems.indexOf(val));
				return n;
			}
			return null;
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

	// TODO do not use this object to init - remove this line in the translation
	PrezzoDomain PrezzoDomain_elem = new PrezzoDomain();
	List<Integer> PrezzoDomain_elems = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	static class QuantitaDomain {
		static List<Integer> elems = new ArrayList<>();
		Integer value;

		static QuantitaDomain valueOf(Integer val) {
			if (elems.contains(val)) {
				QuantitaDomain n = new QuantitaDomain();
				n.value = elems.get(elems.indexOf(val));
				return n;
			}
			return null;
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

	// TODO do not use this object to init - remove this line in the translation
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

	//Support methods for implementing controlled functions
	/**
	* A generic controlled function class with null domain and codomain D.
	* 
	* @param <D> the type of the value to be managed, represents the Codomain of the function.
	*/
	class Fun0Ctrl<D> {
		private D currValue; // the current value
		private D newValue; // the new value to be assigned

		/**
		* Sets the new value for this function.
		* 
		* <p>The provided value is stored as {@code newValue}, representing the value 
		* that will replace the current value {@code oldValue} in the next step.</p>
		*
		* @param d the new value to be prepared for assignment
		*/
		void set(D d) {
			newValue = d;
		}

		/**
		* Retrieves the function current value.
		* 
		* <p>The {@code currValue} represents the current state of the function before 
		* any pending updates to {@code newValue} are applied.</p>
		* 
		* @return the current value
		*/
		D get() {
			return currValue;
		}

		/**
		* Initializes both the current and new values with the provided value.
		* 
		* <p>This method is meant to be used to set the initial state of the function</p>
		* 
		* @param d the value to initialize both the current and new states
		*/
		void init(D d) {
			currValue = newValue = d;
		}

		/**
		* Updates the current value with the new value.
		* 
		* <p>This method copies the {@code newValue} into {@code currValue}, 
		* effectively promoting the new value to the current value.</p>
		*/
		void update() {
			currValue = newValue;
		}
	}

	/**
	* A generic class for controlled functions with domain (not null) and codomain D -> C
	*
	*
	* @param <D> the type of the key in the mappings, represents the Domain of the function.
	* @param <C> the type of the value in the mappings, represents the Codomain of the function.
	*/
	static class FunNCtrl<D, C> {
		private Map<D, C> currValues = new HashMap<>(); // The current value map
		private Map<D, C> newValues = new HashMap<>(); // The new value map to be assigned

		/**
		* Sets a new value for a given key in the new values map.
		* 
		* <p>The provided key-value pair is stored in the {@code newValues} map, 
		* representing the new state that will replace the current state in the next step.</p>
		* 
		* @param d the key for the new value
		* @param c the new value to be associated with the key
		*/
		void set(D d, C c) {
			newValues.put(d, c);
		}

		/**
		* Retrieves the current value associated with a given key.
		* 
		* <p>The {@code currValues} map holds the current state of the key-value mappings.
		* This method returns the value associated with the specified key in the current state.</p>
		* 
		* @param d the key whose associated value is to be returned
		* @return the current value associated with the given key, or {@code null} if the key is not found
		*/
		C get(D d) {
			return currValues.get(d);
		}

		/**
		* Initializes both the current and new maps with a single key-value pair.
		* 
		* <p>This method is meant to be used to set the initial state of the function.</p>
		* 
		* @param d the key to be added to both maps
		* @param c the value to be associated with the key in both maps
		*/
		void init(D d, C c) {
			currValues.put(d, c);
			newValues.put(d, c);
		}

		/**
		* Updates the current value with the new value.
		* 
		* <p>This method copies the {@code newValues} into {@code currValues}, 
		* effectively promoting the new value to the current value.</p>
		*/
		void update() {
			currValues = newValues;
		}
	}

	//Support methods for the implementation of non-controlled functions
	/**
	* A generic function class with null domain and codomain D.
	* 
	* @param <D> the type of the value to be managed, represents the Codomain of the function.
	*/
	class Fun0<D> {
		D value; // the current value

		/**
		* Sets the new value for this function.
		*
		* @param d the new value to be assigned
		*/
		void set(D d) {
			value = d;
		}

		/**
		* Retrieves the function current value.
		* 
		* @return the current value
		*/
		D get() {
			return value;
		}
	}

	/**
	* A generic class for functions with domain (not null) and codomain D -> C
	*
	*
	* @param <D> the type of the key in the mappings, represents the Domain of the function.
	* @param <C> the type of the value in the mappings, represents the Codomain of the function.
	*/
	class FunN<D, C> {
		Map<D, C> values = new HashMap<>();

		/**
		* Sets a new value for a given key in the new values map.
		* 
		* @param d the key for the new value
		* @param c the new value to be associated with the key
		*/
		void set(D d, C c) {
			values.put(d, c);
		}

		/**
		* Retrieves the current value associated with a given key.
		* 
		* @param d the key whose associated value is to be returned
		* @return the current value associated with the given key, or {@code null} if the key is not found
		*/
		C get(D d) {
			return values.get(d);
		}
	}

	/////////////////////////////////////////////////
	/// FUNCTIONS
	/////////////////////////////////////////////////
	//Controlled Function
	Fun0Ctrl<Pizza> pizzaCorrente = new Fun0Ctrl<>();
	//Controlled Function
	Fun0Ctrl<Stati> statoCassa = new Fun0Ctrl<>();
	//Controlled Function
	Fun0Ctrl<String> outMess = new Fun0Ctrl<>();

	//Static Function
	abstract Integer getPrezzo(Pizza param0_getPrezzo);

	//Monitored Function
	Fun0<Servizio> servizioSelezionato = new Fun0<>();
	//Monitored Function
	Fun0<Pizza> pizzaInserita = new Fun0<>();
	//Monitored Function
	Fun0<AggiungiPizza> sceltaDiAggiuntaPizza = new Fun0<>();
	//Monitored Function
	Fun0<SelezioneTipoDiPizza> sceltaDelTipoPizza = new Fun0<>();
	//Monitored Function
	Fun0<QuantitaDomain> insertQuantita = new Fun0<>();
	QuantitaDomain insertQuantita_supporto = new QuantitaDomain();
	//Monitored Function
	Fun0<PrezzoDomain> insertPrezzo = new Fun0<>();
	PrezzoDomain insertPrezzo_supporto = new PrezzoDomain();
	//Static Function
	static Pizza margherita;
	//Static Function
	static Pizza marinara;
	//Static Function
	static Pizza capricciosa;
	//Controlled Function
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
		totale.init(0);
		statoCassa.init(Stati.ATTENDI_ORDINAZIONI);
		outMess.init("");
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
	@Override
	void r_aggiungiPizzaStandardAlTotale() {
		//{ //seq
		totale.set((totale.get() + (getPrezzo(pizzaCorrente.get()) * insertQuantita.get().value)));
		totale.update();
		fireUpdateSet();
		outMess.set("prezzo totale aggiornato");
		outMess.update();
		fireUpdateSet();
		//} //endseq
	}

	@Override
	void r_aggiungiAlTotale() {
		//{ //seq
		totale.set((totale.get() + (insertQuantita.get().value * insertPrezzo.get().value)));
		totale.update();
		fireUpdateSet();
		outMess.set("prezzo totale aggiornato");
		outMess.update();
		fireUpdateSet();
		//} //endseq
	}

	@Override
	void r_attendiOrdinazioni() {
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

	@Override
	void r_scegliSeAggiungerePizza() {
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
				outMess.update();
				fireUpdateSet();
				statoCassa.set(Stati.ATTENDI_ORDINAZIONI);
				statoCassa.update();
				fireUpdateSet();
				//} //endseq
			}
			//} //endpar
		}
	}

	@Override
	void r_scegliTipoDiPizza() {
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

	@Override
	void r_pizzaStandardSelezionata() {
		if (Boolean.TRUE.equals((statoCassa.get() == Stati.PIZZASTANDARD_SELEZIONATA))) {
			if (Boolean.TRUE
					.equals(Pizza.elems.stream().anyMatch(c -> c.toString().equals(pizzaInserita.get().toString())))) {
				//{ //seq
				pizzaCorrente.set(pizzaInserita.get());
				pizzaCorrente.update();
				fireUpdateSet();
				r_aggiungiPizzaStandardAlTotale();
				fireUpdateSet();
				statoCassa.set(Stati.SCEGLI_SE_AGGIUNGERE_PIZZA);
				statoCassa.update();
				fireUpdateSet();
				//} //endseq
			} else {
				//{ //seq
				outMess.set("Questa pizza non  presente in elenco!");
				outMess.update();
				fireUpdateSet();
				statoCassa.set(Stati.SCEGLI_SE_AGGIUNGERE_PIZZA);
				statoCassa.update();
				fireUpdateSet();
				//} //endseq
			}
		}
	}

	@Override
	void r_altraPizzaSelezionata() {
		if (Boolean.TRUE.equals((statoCassa.get() == Stati.ALTRAPIZZA_SELEZIONATA))) {
			//{ //seq
			r_aggiungiAlTotale();
			fireUpdateSet();
			statoCassa.set(Stati.SCEGLI_SE_AGGIUNGERE_PIZZA);
			statoCassa.update();
			fireUpdateSet();
			//} //endseq
		}
	}

	@Override
	void r_Main() {
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
		pizzaCorrente.update();
		statoCassa.update();
		outMess.update();
		totale.update();
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
