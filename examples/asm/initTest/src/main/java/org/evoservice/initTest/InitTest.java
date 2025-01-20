package org.evoservice.initTest;
// InitTest.java automatically generated from ASM2CODE
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.List;

import org.apache.commons.collections4.Bag;

class InitTest {
	/////////////////////////////////////////////////
/// DOMAIN CONTAINERS
/////////////////////////////////////////////////
	/* Domain containers here */
	//Variabile di tipo Concreto o Enumerativo
	static class Time {
		private static List<Integer> elems = new ArrayList<>();
		Integer value;

		static Time valueOf(Integer val) {
			Time n = new Time();
			n.value = val;
			return n;
		}

		static Time valueOf(Time val) {
			return val;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof Time))
				return false;
			return value.equals(((Time) obj).value);
		}

		@Override
		public int hashCode() {
			return value.hashCode();
		}
	}

	// do not use this object to init TODO remove this line in the translation
	// Time Time_elem = new Time();
	List<Integer> Time_elems = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	enum State {
		OFF, ON, RESTARTED
	}

	List<State> State_elemsList = new ArrayList<>();

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
	Fun0Ctrl<Time> seconds = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<Time> minutes = new Fun0Ctrl<>();
	//Funzione di tipo monitored
	Fun0<Boolean> signal = new Fun0<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<State> status = new Fun0Ctrl<>();

	// Inizializzazione di funzioni e domini
	InitTest() {
		//Definizione iniziale dei domini statici
		Time.elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
				16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41,
				42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60));
		Time_elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
				16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41,
				42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60));
		State_elemsList = Collections.unmodifiableList(Arrays.asList(State.OFF, State.ON, State.RESTARTED));
		//Definizione iniziale dei domini dinamici
		//Definizione iniziale dei domini astratti con funzini statiche
		//Inizializzazione delle funzioni
		Time Time_elem = new Time();
		Time_elem.value = 3;
		seconds.oldValue = seconds.newValue = Time_elem;
		Time_elem.value = 0;
		minutes.oldValue = minutes.newValue = Time_elem;
		status.oldValue = status.newValue = State.OFF;
	}

	// Definizione delle funzioni statiche
	// Conversione delle regole ASM in metodi java
	boolean branch_r_timeRule_master = false;
	boolean branch_r_timeRule_1 = false;
	boolean branch_r_timeRule_2 = false;

	void r_timeRule() {
		branch_r_timeRule_master = true;
		if (Boolean.TRUE.equals((seconds.get().value < 5))) {
			branch_r_timeRule_1 = true;
			Time Time882471736_s = new Time();
			Time882471736_s.value = (//seconds.get().value
			(seconds.get().value + 1));
			seconds.set(Time882471736_s);
		} else {
			branch_r_timeRule_2 = true;
			//{ //par
			Time Time576894497_s = new Time();
			Time576894497_s.value = (//seconds.get().value
			0);
			seconds.set(Time576894497_s);
			Time Time2123533871_s = new Time();
			Time2123533871_s.value = (//minutes.get().value
			(minutes.get().value + 1));
			minutes.set(Time2123533871_s);
			//} //endpar
		}
	}

	boolean branch_r_restartRule_master = false;
	boolean branch_r_restartRule_1 = false;
	boolean branch_r_restartRule_2 = false;

	void r_restartRule() {
		branch_r_restartRule_master = true;
		if (Boolean.TRUE.equals((minutes.get().value < 6))) {
			branch_r_restartRule_1 = true;
			// Empty rule 
		} else {
			branch_r_restartRule_2 = true;
			//{ //par
			Time Time406749219_s = new Time();
			Time406749219_s.value = (//minutes.get().value
			0);
			minutes.set(Time406749219_s);
			status.set(State.RESTARTED);
			//} //endpar
		}
	}

	boolean branch_r_Main_master = false;
	boolean branch_r_Main_1 = false;

	void r_Main() {
		branch_r_Main_master = true;
		//{ //par
		if (Boolean.TRUE.equals(signal.get())) {
			branch_r_Main_1 = true;
			//{ //par
			r_timeRule();
			status.set(State.ON);
			//} //endpar
		}
		r_restartRule();
		//} //endpar
	}

	// inizializazzione delle funzioni controllate che contengono metodi monitorati nei temini iniziali
	void initControlledWithMonitored() {
		// No controlled functions initialized with monitored ones have been found
	}

	// applicazione dell'aggiornamento del set
	void fireUpdateSet() {
		seconds.oldValue = seconds.newValue;
		minutes.oldValue = minutes.newValue;
		status.oldValue = status.newValue;
	}

	//Metodo per l'aggiornamento dell'asm
	void updateASM() {
		r_Main();
		fireUpdateSet();
		initControlledWithMonitored();
	}
}
