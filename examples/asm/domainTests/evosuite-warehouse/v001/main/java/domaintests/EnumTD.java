package domaintests;
// EnumTD.java automatically generated from ASM2CODE
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.List;

import org.apache.commons.collections4.Bag;

import java.util.function.Function;

class EnumTD {
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

		AbstractDomain get(String a) {
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

	//Variabile di tipo Concreto o Enumerativo
	enum AnotherEnumDomain {
		ON, OFF
	}

	List<AnotherEnumDomain> AnotherEnumDomain_elemsList = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	static class ConcreteDomain {
		private static List<Integer> elems = new ArrayList<>();
		Integer value;

		static ConcreteDomain valueOf(Integer val) {
			ConcreteDomain n = new ConcreteDomain();
			n.value = val;
			return n;
		}

		static ConcreteDomain valueOf(ConcreteDomain val) {
			return val;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof ConcreteDomain))
				return false;
			return value.equals(((ConcreteDomain) obj).value);
		}

		@Override
		public int hashCode() {
			return value.hashCode();
		}
	}

	// TODO do not use this object to init - remove this line in the translation
	ConcreteDomain ConcreteDomain_elem = new ConcreteDomain();
	List<Integer> ConcreteDomain_elems = new ArrayList<>();

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
	Fun0<EnumDomain> enumMonitoredFunction = new Fun0<>();
	//Funzione di tipo monitored
	FunN<EnumDomain, EnumDomain> enumtoenumMonitoredFunction = new FunN<>();
	//Funzione di tipo monitored
	FunN<AnotherEnumDomain, EnumDomain> anotherEnumtoenumMonitoredFunction = new FunN<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<EnumDomain> enumControlledFunction = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<EnumDomain, EnumDomain> enumtoenumControlledFunction = new FunNCtrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<EnumDomain, AnotherEnumDomain> anotherEnumtoenumControlledFunction = new FunNCtrl<>();
	//Funzione di tipo statico
	private static AbstractDomain value1;
	//Funzione di tipo statico
	private static AbstractDomain value2;

	// Inizializzazione di funzioni e domini
	EnumTD() {
		//Definizione iniziale dei domini statici
		ConcreteDomain.elems = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		ConcreteDomain_elems = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		EnumDomain_elemsList = Collections
				.unmodifiableList(Arrays.asList(EnumDomain.STATE1, EnumDomain.STATE2, EnumDomain.STATE3));
		AnotherEnumDomain_elemsList = Collections
				.unmodifiableList(Arrays.asList(AnotherEnumDomain.ON, AnotherEnumDomain.OFF));
		//Definizione iniziale dei domini dinamici
		//Definizione iniziale dei domini astratti con funzini statiche
		value1 = new AbstractDomain("value1");
		AbstractDomain_elemsList.add("value1");
		AbstractDomain_Class.add(value1);
		value2 = new AbstractDomain("value2");
		AbstractDomain_elemsList.add("value2");
		AbstractDomain_Class.add(value2);
		//Inizializzazione delle funzioni
		enumControlledFunction.oldValue = enumControlledFunction.newValue = EnumDomain.STATE1;
		enumtoenumControlledFunction.set(EnumDomain.STATE1, EnumDomain.STATE2);
		anotherEnumtoenumControlledFunction.set(EnumDomain.STATE1, AnotherEnumDomain.ON);
	  this.fireUpdateSet();
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
		enumControlledFunction.oldValue = enumControlledFunction.newValue;
		enumtoenumControlledFunction.oldValues = enumtoenumControlledFunction.newValues;
		anotherEnumtoenumControlledFunction.oldValues = anotherEnumtoenumControlledFunction.newValues;
	}

	//Metodo per l'aggiornamento dell'asm
	void updateASM() {
		r_Main();
		fireUpdateSet();
		initControlledWithMonitored();
	}
}
