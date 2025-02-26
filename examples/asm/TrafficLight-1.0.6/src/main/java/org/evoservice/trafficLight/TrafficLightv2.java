package org.evoservice.trafficLight;
// TrafficLightv2.java automatically generated from ASM2CODE
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.List;

import org.apache.commons.collections4.Bag;

import java.util.function.Function;

class TrafficLightv2 {
	/////////////////////////////////////////////////
	/// DOMAIN CONTAINERS
	/////////////////////////////////////////////////
	/* Domain containers here */
	//Variabile di tipo Concreto o Enumerativo
	enum States {
		RED, GREEN, YELLOW, PENDING
	}

	List<States> States_elemsList = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	static class TimerDomain {
		private static List<Integer> elems = new ArrayList<>();
		Integer value;

		static TimerDomain valueOf(Integer val) {
			if (elems.contains(val)) {
				TimerDomain n = new TimerDomain();
				n.value = elems.get(elems.indexOf(val));
				return n;
			}
			return null;
		}

		static TimerDomain valueOf(TimerDomain val) {
			return val;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof TimerDomain))
				return false;
			return value.equals(((TimerDomain) obj).value);
		}

		@Override
		public int hashCode() {
			return value.hashCode();
		}
	}

	// TODO do not use this object to init - remove this line in the translation
	TimerDomain TimerDomain_elem = new TimerDomain();
	List<Integer> TimerDomain_elems = new ArrayList<>();

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
	Fun0Ctrl<TimerDomain> count = new Fun0Ctrl<>();
	//Controlled Function
	Fun0Ctrl<States> status = new Fun0Ctrl<>();
	//Monitored Function
	Fun0<Boolean> pedestrian = new Fun0<>();

	//Funzione di tipo statico
	//Funzione di tipo statico
	//Funzione di tipo statico
	// Inizializzazione di funzioni e domini
	TrafficLightv2() {
		//Definizione iniziale dei domini statici
		TimerDomain.elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6));
		TimerDomain_elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6));
		States_elemsList = Collections
				.unmodifiableList(Arrays.asList(States.RED, States.GREEN, States.YELLOW, States.PENDING));
		//Definizione iniziale dei domini dinamici
		//Definizione iniziale dei domini astratti con funzini statiche
		//Inizializzazione delle funzioni
		status.init(States.RED);
		TimerDomain TimerDomain_elem = new TimerDomain();
		TimerDomain_elem.value = 0;
		count.init(TimerDomain_elem);
	}

	// Definizione delle funzioni statiche
	Boolean timeOut() {
		return (count.get().value >= 6);
	}

	Boolean yellow_timeOut() {
		return (count.get().value >= 1);
	}

	Boolean interupt() {
		return (pedestrian.get() == true) && (count.get().value < 6);
	}

	// Conversione delle regole ASM in metodi java
	boolean branch_r_red_master = false;
	boolean branch_r_red_1 = false;
	boolean branch_r_red_2 = false;

	void r_red() {
		branch_r_red_master = true;
		if (Boolean.TRUE.equals(timeOut())) {
			branch_r_red_1 = true;
			//{ //par
			status.set(States.GREEN);
			TimerDomain TimerDomain1751403001_s = new TimerDomain();
			TimerDomain1751403001_s.value = (//count.get().value
			0);
			count.set(TimerDomain1751403001_s);
			//} //endpar
		} else {
			branch_r_red_2 = true;
			TimerDomain TimerDomain1543518287_s = new TimerDomain();
			TimerDomain1543518287_s.value = (//count.get().value
			(count.get().value + 1));
			count.set(TimerDomain1543518287_s);
		}
	}

	boolean branch_r_green_master = false;
	boolean branch_r_green_1 = false;
	boolean branch_r_green_2 = false;
	boolean branch_r_green_3 = false;
	boolean branch_r_green_4 = false;

	void r_green() {
		branch_r_green_master = true;
		if (Boolean.TRUE.equals(interupt())) {
			branch_r_green_1 = true;
			//{ //par
			status.set(States.PENDING);
			TimerDomain TimerDomain1765702_s = new TimerDomain();
			TimerDomain1765702_s.value = (//count.get().value
			0);
			count.set(TimerDomain1765702_s);
			//} //endpar
		} else {
			branch_r_green_2 = true;
			if (Boolean.TRUE.equals(timeOut())) {
				branch_r_green_3 = true;
				//{ //par
				status.set(States.YELLOW);
				TimerDomain TimerDomain1618984457_s = new TimerDomain();
				TimerDomain1618984457_s.value = (//count.get().value
				0);
				count.set(TimerDomain1618984457_s);
				//} //endpar
			} else {
				branch_r_green_4 = true;
				TimerDomain TimerDomain1979080261_s = new TimerDomain();
				TimerDomain1979080261_s.value = (//count.get().value
				(count.get().value + 1));
				count.set(TimerDomain1979080261_s);
			}
		}
	}

	boolean branch_r_yellow_master = false;
	boolean branch_r_yellow_1 = false;
	boolean branch_r_yellow_2 = false;

	void r_yellow() {
		branch_r_yellow_master = true;
		if (Boolean.TRUE.equals(yellow_timeOut())) {
			branch_r_yellow_1 = true;
			//{ //par
			status.set(States.RED);
			TimerDomain TimerDomain376725601_s = new TimerDomain();
			TimerDomain376725601_s.value = (//count.get().value
			0);
			count.set(TimerDomain376725601_s);
			//} //endpar
		} else {
			branch_r_yellow_2 = true;
			TimerDomain TimerDomain1552870927_s = new TimerDomain();
			TimerDomain1552870927_s.value = (//count.get().value
			(count.get().value + 1));
			count.set(TimerDomain1552870927_s);
		}
	}

	boolean branch_r_pending_master = false;
	boolean branch_r_pending_1 = false;
	boolean branch_r_pending_2 = false;

	void r_pending() {
		branch_r_pending_master = true;
		if (Boolean.TRUE.equals(timeOut())) {
			branch_r_pending_1 = true;
			//{ //par
			status.set(States.RED);
			TimerDomain TimerDomain379124840_s = new TimerDomain();
			TimerDomain379124840_s.value = (//count.get().value
			0);
			count.set(TimerDomain379124840_s);
			//} //endpar
		} else {
			branch_r_pending_2 = true;
			TimerDomain TimerDomain1475192960_s = new TimerDomain();
			TimerDomain1475192960_s.value = (//count.get().value
			(count.get().value + 1));
			count.set(TimerDomain1475192960_s);
		}
	}

	boolean branch_r_Main_master = false;
	boolean branch_r_Main_1 = false;
	boolean branch_r_Main_2 = false;
	boolean branch_r_Main_3 = false;
	boolean branch_r_Main_4 = false;

	void r_Main() {
		branch_r_Main_master = true;
		if (status.get() == States.RED) {
			branch_r_Main_1 = true;
			r_red();
		} else if (status.get() == States.GREEN) {
			branch_r_Main_2 = true;
			r_green();
		} else if (status.get() == States.YELLOW) {
			branch_r_Main_3 = true;
			r_yellow();
		} else if (status.get() == States.PENDING) {
			branch_r_Main_4 = true;
			r_pending();
		}
	}

	// inizializazzione delle funzioni controllate che contengono metodi monitorati nei temini iniziali
	void initControlledWithMonitored() {
		// No controlled functions initialized with monitored ones have been found
	}

	// applicazione dell'aggiornamento del set
	void fireUpdateSet() {
		count.update();
		status.update();
	}

	//Metodo per l'aggiornamento dell'asm
	void updateASM() {
		r_Main();
		fireUpdateSet();
		initControlledWithMonitored();
	}
}
