package domaintests;
// SequenceDomain.java automatically generated from ASM2CODE
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.List;

import org.apache.commons.collections4.Bag;

import java.util.function.Function;

class SequenceDomain {
	/////////////////////////////////////////////////
	/// DOMAIN CONTAINERS
	/////////////////////////////////////////////////
	/* Domain containers here */
	//Variabile di tipo astratto
	static class AbstractDomain {
		private static List<AbstractDomain> elems = new ArrayList<>();
		private static List<String> val = new ArrayList<>();

		AbstractDomain(String a) {
			elems.add(this);
			val.add(a);
		}

		static String toString(AbstractDomain a) {
			if (elems.contains(a)) {
				return val.get(elems.lastIndexOf(a));
			} else
				return null;
		}

		static AbstractDomain get(String a) {
			if (val.contains(a)) {
				return elems.get(val.lastIndexOf(a));
			} else
				return null;
		}
	}

	List<String> AbstractDomain_elemsList = new ArrayList<>();
	List<AbstractDomain> AbstractDomain_Class = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	enum EnumDomain {
		STATE1, STATE2, STATE3
	}

	List<EnumDomain> EnumDomain_elemsList = new ArrayList<>();

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
	List<Integer> seqIntegerMonitoredFunction_elem = new ArrayList<>();
	Fun0<List<Integer>> seqIntegerMonitoredFunction = new Fun0<>();
	//Funzione di tipo monitored
	List<Boolean> seqBooleanMonitoredFunction_elem = new ArrayList<>();
	Fun0<List<Boolean>> seqBooleanMonitoredFunction = new Fun0<>();
	//Funzione di tipo monitored
	List<String> seqStringMonitoredFunction_elem = new ArrayList<>();
	Fun0<List<String>> seqStringMonitoredFunction = new Fun0<>();
	//Funzione di tipo monitored
	List<Character> seqCharMonitoredFunction_elem = new ArrayList<>();
	Fun0<List<Character>> seqCharMonitoredFunction = new Fun0<>();
	//Funzione di tipo monitored
	List<Double> seqRealMonitoredFunction_elem = new ArrayList<>();
	Fun0<List<Double>> seqRealMonitoredFunction = new Fun0<>();
	//Funzione di tipo monitored
	List<EnumDomain> seqEnumMonitoredFunction_elem = new ArrayList<>();
	Fun0<List<EnumDomain>> seqEnumMonitoredFunction = new Fun0<>();
	//Funzione di tipo monitored
	List<AbstractDomain> seqAbstractMonitoredFunction_elem = new ArrayList<>();
	Fun0<List<AbstractDomain>> seqAbstractMonitoredFunction = new Fun0<>();
	//Funzione di tipo Controlled
	List<Integer> seqIntegerControlledFunction_elem = new ArrayList<>();
	Fun0Ctrl<List<Integer>> seqIntegerControlledFunction = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	List<Boolean> seqBooleanControlledFunction_elem = new ArrayList<>();
	Fun0Ctrl<List<Boolean>> seqBooleanControlledFunction = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	List<String> seqStringControlledFunction_elem = new ArrayList<>();
	Fun0Ctrl<List<String>> seqStringControlledFunction = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	List<Character> seqCharControlledFunction_elem = new ArrayList<>();
	Fun0Ctrl<List<Character>> seqCharControlledFunction = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	List<Double> seqRealControlledFunction_elem = new ArrayList<>();
	Fun0Ctrl<List<Double>> seqRealControlledFunction = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	List<EnumDomain> seqEnumControlledFunction_elem = new ArrayList<>();
	Fun0Ctrl<List<EnumDomain>> seqEnumControlledFunction = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	List<AbstractDomain> seqAbstractControlledFunction_elem = new ArrayList<>();
	Fun0Ctrl<List<AbstractDomain>> seqAbstractControlledFunction = new Fun0Ctrl<>();
	//Funzione di tipo statico
	private static AbstractDomain value1;
	//Funzione di tipo statico
	private static AbstractDomain value2;

	// Inizializzazione di funzioni e domini
	SequenceDomain() {
		//Definizione iniziale dei domini statici
		EnumDomain_elemsList = Collections
				.unmodifiableList(Arrays.asList(EnumDomain.STATE1, EnumDomain.STATE2, EnumDomain.STATE3));
		//Definizione iniziale dei domini dinamici
		//Definizione iniziale dei domini astratti con funzini statiche
		value1 = new AbstractDomain("value1");
		AbstractDomain_elemsList.add("value1");
		AbstractDomain_Class.add(value1);
		value2 = new AbstractDomain("value2");
		AbstractDomain_elemsList.add("value2");
		AbstractDomain_Class.add(value2);
		//Inizializzazione delle funzioni
		seqIntegerControlledFunction.set(new ArrayList<>(Arrays.asList(2, 2)));
		seqEnumControlledFunction.set(new ArrayList<>(Arrays.asList(EnumDomain.STATE1, EnumDomain.STATE2)));
		seqAbstractControlledFunction.set(new ArrayList<>(Arrays.asList(value1, value2)));
		seqBooleanControlledFunction.set(new ArrayList<>(Arrays.asList(true, false)));
		seqStringControlledFunction.set(new ArrayList<>(Arrays.asList("Hello", " ", "world", "!")));
		seqCharControlledFunction.set(new ArrayList<>(Arrays.asList('a', 'b', 'c')));
		seqRealControlledFunction.set(new ArrayList<>(Arrays.asList(5.5, 2.2, 7.6)));
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
		seqIntegerControlledFunction.oldValue = seqIntegerControlledFunction.newValue;
		seqBooleanControlledFunction.oldValue = seqBooleanControlledFunction.newValue;
		seqStringControlledFunction.oldValue = seqStringControlledFunction.newValue;
		seqCharControlledFunction.oldValue = seqCharControlledFunction.newValue;
		seqRealControlledFunction.oldValue = seqRealControlledFunction.newValue;
		seqEnumControlledFunction.oldValue = seqEnumControlledFunction.newValue;
		seqAbstractControlledFunction.oldValue = seqAbstractControlledFunction.newValue;
	}

	//Metodo per l'aggiornamento dell'asm
	void updateASM() {
		r_Main();
		fireUpdateSet();
		initControlledWithMonitored();
	}
}
