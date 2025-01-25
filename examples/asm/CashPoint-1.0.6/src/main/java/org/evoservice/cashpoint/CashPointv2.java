package org.evoservice.cashpoint;
// CashPointv2.java automatically generated from ASM2CODE
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.List;

import org.apache.commons.collections4.Bag;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;

class CashPointv2 {
	/////////////////////////////////////////////////
	/// DOMAIN CONTAINERS
	/////////////////////////////////////////////////
	/* Domain containers here */
	//Variabile di tipo astratto
	static class Account {
		private static List<Account> elems = new ArrayList<>();
		private static List<String> val = new ArrayList<>();

		Account(String a) {
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

		static Account get(String a) {
			if (val.contains(a)) {
				return elems.get(val.lastIndexOf(a));
			} else
				return null;
		}
	}

	List<String> Account_elemsList = new ArrayList<>();
	List<Account> Account_Class = new ArrayList<>();

	//Variabile di tipo astratto
	static class Card {
		private static List<Card> elems = new ArrayList<>();
		private static List<String> val = new ArrayList<>();

		Card(String a) {
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

		static Card get(String a) {
			if (val.contains(a)) {
				return elems.get(val.lastIndexOf(a));
			} else
				return null;
		}
	}

	List<String> Card_elemsList = new ArrayList<>();
	List<Card> Card_Class = new ArrayList<>();

	//Variabile di tipo astratto
	static class Till {
		private static List<Till> elems = new ArrayList<>();
		private static List<String> val = new ArrayList<>();

		Till(String a) {
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

		static Till get(String a) {
			if (val.contains(a)) {
				return elems.get(val.lastIndexOf(a));
			} else
				return null;
		}
	}

	List<String> Till_elemsList = new ArrayList<>();
	List<Till> Till_Class = new ArrayList<>();

	//Variabile di tipo astratto
	static class Date {
		private static List<Date> elems = new ArrayList<>();
		private static List<String> val = new ArrayList<>();

		Date(String a) {
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

//		static public Date get(Date a){
//			if (val.contains(a.toString())) {
//				return elems.get(val.lastIndexOf(a.toString()));
//			} else
//				return null;
//		}

		static Date get(String a) {
			if (val.contains(a)) {
				return elems.get(val.lastIndexOf(a));
			} else
				return null;
		}
	}

	List<String> Date_elemsList = new ArrayList<>();
	List<Date> Date_Class = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	enum TillState {
		WAITCARD, WAITPIN, VALIDPIN
	}

	List<TillState> TillState_elemsList = new ArrayList<>();

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
	FunNCtrl<Till, TillState> tillState = new FunNCtrl<>();
	//Controlled Function
	FunNCtrl<Account, Integer> balance = new FunNCtrl<>();
	//Controlled Function
	FunNCtrl<Card, Boolean> legalCard = new FunNCtrl<>();
	//Controlled Function
	FunNCtrl<Card, Integer> daily_withdraw_sum = new FunNCtrl<>();
	//Controlled Function
	FunNCtrl<Till, Card> insertedCard = new FunNCtrl<>();
	//Monitored Function
	FunN<Till, Integer> enteredPin = new FunN<>();
	//Monitored Function
	FunN<Till, Integer> amount = new FunN<>();
	//Funzione di tipo statico
	//Funzione di tipo statico
	//Funzione di tipo statico
	//Monitored Function
	Fun0<Date> currentDate = new Fun0<>();
	//Controlled Function
	FunNCtrl<Card, Date> cardLastUseDate = new FunNCtrl<>();
	//Funzione di tipo statico
	private static Card card1;
	//Funzione di tipo statico
	private static Card card2;
	//Funzione di tipo statico
	private static Till till1;
	//Funzione di tipo statico
	private static Account account1;
	//Funzione di tipo statico
	private static Date monday;
	//Funzione di tipo statico
	private static Date tuesday;

	// Inizializzazione di funzioni e domini
	CashPointv2() {
		//Definizione iniziale dei domini statici
		TillState_elemsList = Collections
				.unmodifiableList(Arrays.asList(TillState.WAITCARD, TillState.WAITPIN, TillState.VALIDPIN));
		//Definizione iniziale dei domini dinamici
		//Definizione iniziale dei domini astratti con funzini statiche
		card1 = new Card("card1");
		Card_elemsList.add("card1");
		Card_Class.add(card1);
		card2 = new Card("card2");
		Card_elemsList.add("card2");
		Card_Class.add(card2);
		till1 = new Till("till1");
		Till_elemsList.add("till1");
		Till_Class.add(till1);
		account1 = new Account("account1");
		Account_elemsList.add("account1");
		Account_Class.add(account1);
		monday = new Date("monday");
		Date_elemsList.add("monday");
		Date_Class.add(monday);
		tuesday = new Date("tuesday");
		Date_elemsList.add("tuesday");
		Date_Class.add(tuesday);
		//Inizializzazione delle funzioni
		for (Till _m : Till.elems) {
			TillState a = TillState.WAITCARD;
			tillState.init(_m, a);
		}
		for (Card _m : Card.elems) {
			Boolean a = true;
			legalCard.init(_m, a);
		}
		for (Account _a : Account.elems) {
			Integer a = 2000;
			balance.init(_a, a);
		}
		for (Card _c : Card.elems) {
			Integer a = 0;
			daily_withdraw_sum.init(_c, a);
		}
		for (Card _c : Card.elems) {
			Date monday = new Date("monday");
			cardLastUseDate.init(_c, monday);
		}
	}

	// Definizione delle funzioni statiche
	Integer encodedPin(Card _c) {
		if (_c == card1)
			return 1;
		else if (_c == card2)
			return 2;
		return null;
	}

	Account cardAccount(Card _c) {
		if (_c == card1)
			return account1;
		else if (_c == card2)
			return account1;
		return null;
	}

	Integer withdrawLimit() {
		return 1000;
	}

	// Conversione delle regole ASM in metodi java
	boolean branch_r_insertedCard_master = false;
	boolean branch_r_insertedCard_1 = false;

	void r_insertedCard(Till _t, Card _c) {
		branch_r_insertedCard_master = true;
		if (Boolean.TRUE.equals((tillState.get(_t) == TillState.WAITCARD))) {
			branch_r_insertedCard_1 = true;
			//{ //par
			tillState.set(_t, TillState.WAITPIN);
			insertedCard.set(_t, _c);
			//} //endpar
		}
	}

	boolean branch_r_insertCard_master = false;

	void r_insertCard(Till _t) {
		branch_r_insertCard_master = true;
		r_insertedCard(_t, card1);
	}

	boolean branch_r_enterPin_master = false;
	boolean branch_r_enterPin_1 = false;
	boolean branch_r_enterPin_2 = false;
	boolean branch_r_enterPin_3 = false;
	boolean branch_r_enterPin_4 = false;

	void r_enterPin(Till _t) {
		branch_r_enterPin_master = true;
		if (Boolean.TRUE.equals((tillState.get(_t) == TillState.WAITPIN))) {
			branch_r_enterPin_1 = true;
			if (Boolean.TRUE.equals(legalCard.get(insertedCard.get(_t)))) {
				branch_r_enterPin_2 = true;
				if (Boolean.TRUE.equals((enteredPin.get(_t) == encodedPin(insertedCard.get(_t))))) {
					branch_r_enterPin_3 = true;
					//{ //par
					if (Boolean.TRUE.equals((cardLastUseDate.get(insertedCard.get(_t)) != currentDate.get()))) {
						branch_r_enterPin_4 = true;
						//{ //par
						daily_withdraw_sum.set(insertedCard.get(_t), 0);
						cardLastUseDate.set(insertedCard.get(_t), currentDate.get());
						//} //endpar
					}
					tillState.set(_t, TillState.VALIDPIN);
					//} //endpar
				}
			}
		}
	}

	boolean branch_r_validPin_master = false;
	boolean branch_r_validPin_1 = false;
	boolean branch_r_validPin_2 = false;

	void r_validPin(Till _t) {
		branch_r_validPin_master = true;
		if (Boolean.TRUE.equals((tillState.get(_t) == TillState.VALIDPIN))) {
			branch_r_validPin_1 = true;
			{
				Account _acc = cardAccount(insertedCard.get(_t));
				if (Boolean.TRUE.equals((amount.get(_t) > 0) && (amount.get(_t) <= balance.get(_acc))
						&& (daily_withdraw_sum.get(insertedCard.get(_t)) < (withdrawLimit() - amount.get(_t))))) {
					branch_r_validPin_2 = true;
					//{ //par
					balance.set(_acc, (balance.get(_acc) - amount.get(_t)));
					daily_withdraw_sum.set(insertedCard.get(_t),
							(daily_withdraw_sum.get(insertedCard.get(_t)) - amount.get(_t)));
					//} //endpar
				}
			}
		}
	}

	boolean branch_r_main_master = false;

	void r_main() {
		branch_r_main_master = true;
		List<Till> point0 = new ArrayList<>();
		for (Till _till : Till.elems)
			if (true) {
				point0.add(_till);
			}
		int rndm = ThreadLocalRandom.current().nextInt(0, point0.size());
		{
			Till _till = point0.get(rndm);
			if (!point0.isEmpty()) {
				//{ //par
				r_insertCard(_till);
				r_enterPin(_till);
				r_validPin(_till);
				//} //endpar
			}
		}
	}

	// inizializazzione delle funzioni controllate che contengono metodi monitorati nei temini iniziali
	void initControlledWithMonitored() {
		// No controlled functions initialized with monitored ones have been found
	}

	// applicazione dell'aggiornamento del set
	void fireUpdateSet() {
		tillState.update();
		balance.update();
		legalCard.update();
		daily_withdraw_sum.update();
		insertedCard.update();
		cardLastUseDate.update();
	}

	//Metodo per l'aggiornamento dell'asm
	void updateASM() {
		r_main();
		fireUpdateSet();
		initControlledWithMonitored();
	}
}
