package initerrors;// BasicTD.java automatically generated from ASM2CODE

import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.List;

import org.apache.commons.collections4.Bag;

import java.util.function.Function;

class BasicTD {
	/////////////////////////////////////////////////
	/// DOMAIN CONTAINERS
	/////////////////////////////////////////////////
	/* Domain containers here */
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
	//Funzione di tipo monitored
	Fun0<Double> realMonitoredFunction = new Fun0<>();
	//Funzione di tipo monitored
	Fun0<Integer> integerMonitoredFunction = new Fun0<>();
	//Funzione di tipo monitored
	Fun0<String> stringMonitoredFunction = new Fun0<>();
	//Funzione di tipo monitored
	Fun0<Character> charMonitoredFunction = new Fun0<>();
	//Funzione di tipo monitored
	Fun0<Boolean> booleanMonitoredFunction = new Fun0<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<Double> realControlledFunction = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<Integer> integerControlledFunction = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<String> stringControlledFunction = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<Character> charControlledFunction = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<Boolean> booleanControlledFunction = new Fun0Ctrl<>();

	// Inizializzazione di funzioni e domini
	BasicTD() {
		//Definizione iniziale dei domini statici
		//Definizione iniziale dei domini dinamici
		//Definizione iniziale dei domini astratti con funzini statiche
		//Inizializzazione delle funzioni
		realControlledFunction.oldValue = realControlledFunction.newValue = 3.4;
		integerControlledFunction.oldValue = integerControlledFunction.newValue = -5;
		stringControlledFunction.oldValue = stringControlledFunction.newValue = "hello world";
		Char Char_elem = new Char();
		Char_elem.value = 'a';
		charControlledFunction.oldValue = charControlledFunction.newValue = Char_elem;
		booleanControlledFunction.oldValue = booleanControlledFunction.newValue = true;
	}

	// Definizione delle funzioni statiche
	// Conversione delle regole ASM in metodi java
	boolean branch_r_Main_master = false;

	void r_Main() {
		branch_r_Main_master = true;
		// Empty rule 
	}

	// inizializazzione delle funzioni controllate che contengono metodi monitorati nei temini iniziali
	void initControlledWithMonitored() {
		// No controlled functions initialized with monitored ones have been found
	}

	// applicazione dell'aggiornamento del set
	void fireUpdateSet() {
		realControlledFunction.oldValue = realControlledFunction.newValue;
		integerControlledFunction.oldValue = integerControlledFunction.newValue;
		stringControlledFunction.oldValue = stringControlledFunction.newValue;
		charControlledFunction.oldValue = charControlledFunction.newValue;
		booleanControlledFunction.oldValue = booleanControlledFunction.newValue;
	}

	//Metodo per l'aggiornamento dell'asm
	void updateASM() {
		r_Main();
		fireUpdateSet();
		initControlledWithMonitored();
	}
}
