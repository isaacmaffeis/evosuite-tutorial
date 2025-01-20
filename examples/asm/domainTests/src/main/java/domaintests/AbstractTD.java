package domaintests;
// AbstractTD.java automatically generated from ASM2CODE
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.List;

import org.apache.commons.collections4.Bag;

import java.util.function.Function;

class AbstractTD {
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

	//Variabile di tipo astratto
	static class AnotherAbstractDomain {
		private static List<AnotherAbstractDomain> elems = new ArrayList<>();
		private static List<String> val = new ArrayList<>();

		AnotherAbstractDomain(String a) {
			elems.add(this);
			val.add(a);
		}

		static String toString(AnotherAbstractDomain a) {
			if (elems.contains(a)) {
				return val.get(elems.lastIndexOf(a));
			} else
				return null;
		}

		static AnotherAbstractDomain get(String a) {
			if (val.contains(a)) {
				return elems.get(val.lastIndexOf(a));
			} else
				return null;
		}
	}

	List<String> AnotherAbstractDomain_elemsList = new ArrayList<>();
	List<AnotherAbstractDomain> AnotherAbstractDomain_Class = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	enum EnumDomain {
		STATE1, STATE2, STATE3
	}

	List<EnumDomain> EnumDomain_elemsList = new ArrayList<>();

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
	Fun0<AbstractDomain> abstractMonitoredFunction = new Fun0<>();
	//Funzione di tipo monitored
	FunN<EnumDomain, AbstractDomain> enumtoabstractMonitoredFunction = new FunN<>();
	//Funzione di tipo monitored
	Fun0<String> stringMonitoredFunction = new Fun0<>();
	//Funzione di tipo monitored
	FunN<AbstractDomain, Integer> abstracttointegerMonitoredFunction = new FunN<>();
	//Funzione di tipo monitored
	FunN<AbstractDomain, String> abstracttostringMonitoredFunction = new FunN<>();
	//Funzione di tipo monitored
	FunN<AbstractDomain, Boolean> abstracttobooleanMonitoredFunction = new FunN<>();
	//Funzione di tipo monitored
	FunN<AbstractDomain, Double> abstracttorealMonitoredFunction = new FunN<>();
	//Funzione di tipo monitored
	FunN<AbstractDomain, Character> abstracttocharMonitoredFunction = new FunN<>();
	//Funzione di tipo monitored
	FunN<AbstractDomain, EnumDomain> abstracttoenumMonitoredFunction = new FunN<>();
	//Funzione di tipo monitored
	FunN<AbstractDomain, AnotherAbstractDomain> abstracttoabstractMonitoredFunction = new FunN<>();
	//Funzione di tipo monitored
	FunN<AbstractDomain, ConcreteDomain> abstracttoconcreteMonitoredFunction = new FunN<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<AbstractDomain> abstractControlledFunction = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<EnumDomain, AbstractDomain> enumtoabstractControlledFunction = new FunNCtrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<String> stringControlledFunction = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<AbstractDomain, Integer> abstracttointegerControlledFunction = new FunNCtrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<AbstractDomain, String> abstracttostringControlledFunction = new FunNCtrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<AbstractDomain, Boolean> abstracttobooleanControlledFunction = new FunNCtrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<AbstractDomain, Double> abstracttorealControlledFunction = new FunNCtrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<AbstractDomain, Character> abstracttocharControlledFunction = new FunNCtrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<AbstractDomain, EnumDomain> abstracttoenumControlledFunction = new FunNCtrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<AbstractDomain, AnotherAbstractDomain> abstracttoabstractControlledFunction = new FunNCtrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<AbstractDomain, ConcreteDomain> abstracttoconcreteControlledFunction = new FunNCtrl<>();
	//Funzione di tipo statico
	private static AbstractDomain value1;
	//Funzione di tipo statico
	private static AbstractDomain value2;
	//Funzione di tipo statico
	private static AnotherAbstractDomain another1;
	//Funzione di tipo statico
	private static AnotherAbstractDomain another2;

	// Inizializzazione di funzioni e domini
	AbstractTD() {
		//Definizione iniziale dei domini statici
		ConcreteDomain.elems = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		ConcreteDomain_elems = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
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
		another1 = new AnotherAbstractDomain("another1");
		AnotherAbstractDomain_elemsList.add("another1");
		AnotherAbstractDomain_Class.add(another1);
		another2 = new AnotherAbstractDomain("another2");
		AnotherAbstractDomain_elemsList.add("another2");
		AnotherAbstractDomain_Class.add(another2);
		//Inizializzazione delle funzioni
		abstractControlledFunction.oldValue = abstractControlledFunction.newValue = AbstractDomain.get("value1");
		stringControlledFunction.oldValue = stringControlledFunction.newValue = "Hello world";
		for (EnumDomain _c : EnumDomain.values()) {
			enumtoabstractControlledFunction.oldValues.put(_c, new Function<Void, AbstractDomain>() {
				@Override
				public AbstractDomain apply(Void input) {
					if (_c == EnumDomain.STATE1)
						return value1;
					else if (_c == EnumDomain.STATE2)
						return value2;
					else if (_c == EnumDomain.STATE3)
						return value1;
					return null;
				}
			}.apply(null));
			enumtoabstractControlledFunction.newValues.put(_c, new Function<Void, AbstractDomain>() {
				@Override
				public AbstractDomain apply(Void input) {
					if (_c == EnumDomain.STATE1)
						return value1;
					else if (_c == EnumDomain.STATE2)
						return value2;
					else if (_c == EnumDomain.STATE3)
						return value1;
					return null;
				}
			}.apply(null));
		}
		for (AbstractDomain _c : AbstractDomain.elems) {
			Integer a = null;
			if (_c.toString(_c).equals("value1"))
				a = 10;
			else if (_c.toString(_c).equals("value2"))
				a = 20;
			;
			abstracttointegerControlledFunction.oldValues.put(_c, a);
			abstracttointegerControlledFunction.newValues.put(_c, a);
		}
		for (AbstractDomain _c : AbstractDomain.elems) {
			Double a = 2.2;
			abstracttorealControlledFunction.oldValues.put(_c, a);
			abstracttorealControlledFunction.newValues.put(_c, a);
		}
		for (AbstractDomain _c : AbstractDomain.elems) {
			String a = "hello world";
			abstracttostringControlledFunction.oldValues.put(_c, a);
			abstracttostringControlledFunction.newValues.put(_c, a);
		}
		for (AbstractDomain _c : AbstractDomain.elems) {
			Boolean a = null;
			if (_c.toString(_c).equals("value1"))
				a = true;
			else if (_c.toString(_c).equals("value2"))
				a = false;
			;
			abstracttobooleanControlledFunction.oldValues.put(_c, a);
			abstracttobooleanControlledFunction.newValues.put(_c, a);
		}
		for (AbstractDomain _c : AbstractDomain.elems) {
			EnumDomain a = null;
			if (_c.toString(_c).equals("value1"))
				a = EnumDomain.STATE1;
			else if (_c.toString(_c).equals("value2"))
				a = EnumDomain.STATE2;
			;
			abstracttoenumControlledFunction.oldValues.put(_c, a);
			abstracttoenumControlledFunction.newValues.put(_c, a);
		}
		for (AbstractDomain _c : AbstractDomain.elems) {
			abstracttoabstractControlledFunction.oldValues.put(_c, new Function<Void, AnotherAbstractDomain>() {
				@Override
				public AnotherAbstractDomain apply(Void input) {
					if (_c == value1)
						return another1;
					else if (_c == value2)
						return another2;
					return null;
				}
			}.apply(null));
			abstracttoabstractControlledFunction.newValues.put(_c, new Function<Void, AnotherAbstractDomain>() {
				@Override
				public AnotherAbstractDomain apply(Void input) {
					if (_c == value1)
						return another1;
					else if (_c == value2)
						return another2;
					return null;
				}
			}.apply(null));
		}
		for (AbstractDomain _c : AbstractDomain.elems) {
			ConcreteDomain a = new ConcreteDomain();
			a.value = 5;
			abstracttoconcreteControlledFunction.oldValues.put(_c, a);
			abstracttoconcreteControlledFunction.newValues.put(_c, a);
		}
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
		abstractControlledFunction.oldValue = abstractControlledFunction.newValue;
		enumtoabstractControlledFunction.oldValues = enumtoabstractControlledFunction.newValues;
		stringControlledFunction.oldValue = stringControlledFunction.newValue;
		abstracttointegerControlledFunction.oldValues = abstracttointegerControlledFunction.newValues;
		abstracttostringControlledFunction.oldValues = abstracttostringControlledFunction.newValues;
		abstracttobooleanControlledFunction.oldValues = abstracttobooleanControlledFunction.newValues;
		abstracttorealControlledFunction.oldValues = abstracttorealControlledFunction.newValues;
		abstracttocharControlledFunction.oldValues = abstracttocharControlledFunction.newValues;
		abstracttoenumControlledFunction.oldValues = abstracttoenumControlledFunction.newValues;
		abstracttoabstractControlledFunction.oldValues = abstracttoabstractControlledFunction.newValues;
		abstracttoconcreteControlledFunction.oldValues = abstracttoconcreteControlledFunction.newValues;
	}

	//Metodo per l'aggiornamento dell'asm
	void updateASM() {
		r_Main();
		fireUpdateSet();
		initControlledWithMonitored();
	}
}
