package initerrors;
// ConcreteD.java automatically generated from ASM2CODE
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.List;

import org.apache.commons.collections4.Bag;

import java.util.function.Function;

class ConcreteD {
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

	//Variabile di tipo Concreto o Enumerativo
	static class ConcreteDomain {
		private static List<Integer> elems = new ArrayList<>();
		Integer value;

		static ConcreteDomain valueOf(Integer val) {
			if (elems.contains(val)) {
				ConcreteDomain n = new ConcreteDomain();
				n.value = elems.get(elems.indexOf(val));
				return n;
			}
			return null;
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

	//Variabile di tipo Concreto o Enumerativo
	static class ConcreteDomain2 {
		private static List<Integer> elems = new ArrayList<>();
		Integer value;

		static ConcreteDomain2 valueOf(Integer val) {
			if (elems.contains(val)) {
				ConcreteDomain2 n = new ConcreteDomain2();
				n.value = elems.get(elems.indexOf(val));
				return n;
			}
			return null;
		}

		static ConcreteDomain2 valueOf(ConcreteDomain2 val) {
			return val;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof ConcreteDomain2))
				return false;
			return value.equals(((ConcreteDomain2) obj).value);
		}

		@Override
		public int hashCode() {
			return value.hashCode();
		}
	}

	// TODO do not use this object to init - remove this line in the translation
	ConcreteDomain2 ConcreteDomain2_elem = new ConcreteDomain2();
	List<Integer> ConcreteDomain2_elems = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	static class ConcreteEnumDomain {
		private static List<EnumDomain> elems = new ArrayList<>();
		EnumDomain value;

		static ConcreteEnumDomain valueOf(EnumDomain val) {
			if (elems.contains(val)) {
				ConcreteEnumDomain n = new ConcreteEnumDomain();
				n.value = elems.get(elems.indexOf(val));
				return n;
			}
			return null;
		}

		static ConcreteEnumDomain valueOf(ConcreteEnumDomain val) {
			return val;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof ConcreteEnumDomain))
				return false;
			return value.equals(((ConcreteEnumDomain) obj).value);
		}

		@Override
		public int hashCode() {
			return value.hashCode();
		}
	}

	// TODO do not use this object to init - remove this line in the translation
	ConcreteEnumDomain ConcreteEnumDomain_elem = new ConcreteEnumDomain();
	List<EnumDomain> ConcreteEnumDomain_elems = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	static class ConcreteAbstractDomain {
		private static List<AbstractDomain> elems = new ArrayList<>();
		AbstractDomain value;

		static ConcreteAbstractDomain valueOf(AbstractDomain val) {
			if (elems.contains(val)) {
				ConcreteAbstractDomain n = new ConcreteAbstractDomain();
				n.value = elems.get(elems.indexOf(val));
				return n;
			}
			return null;
		}

		static ConcreteAbstractDomain valueOf(ConcreteAbstractDomain val) {
			return val;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof ConcreteAbstractDomain))
				return false;
			return value.equals(((ConcreteAbstractDomain) obj).value);
		}

		@Override
		public int hashCode() {
			return value.hashCode();
		}
	}

	// TODO do not use this object to init - remove this line in the translation
	ConcreteAbstractDomain ConcreteAbstractDomain_elem = new ConcreteAbstractDomain();
	List<AbstractDomain> ConcreteAbstractDomain_elems = new ArrayList<>();

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

        void init(Map<D, C> initMap) {
            oldValues = newValues = initMap;
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
	Fun0<ConcreteDomain> concreteDomainMonitoredFunction = new Fun0<>();
	ConcreteDomain concreteDomainMonitoredFunction_supporto = new ConcreteDomain();
	//Funzione di tipo monitored
	Fun0<ConcreteDomain2> concreteDomain2MonitoredFunction = new Fun0<>();
	ConcreteDomain2 concreteDomain2MonitoredFunction_supporto = new ConcreteDomain2();
	//Funzione di tipo monitored
	Fun0<ConcreteEnumDomain> concreteEnumDomainMonitoredFunction = new Fun0<>();
	ConcreteEnumDomain concreteEnumDomainMonitoredFunction_supporto = new ConcreteEnumDomain();
	//Funzione di tipo monitored
	FunN<ConcreteDomain, EnumDomain> contreteToEnumMonitoredFunction = new FunN<>();
	//Funzione di tipo monitored
	FunN<ConcreteEnumDomain, EnumDomain> enumContreteToEnumMonitoredFunction = new FunN<>();
	//Funzione di tipo monitored
	FunN<ConcreteEnumDomain, Integer> enumContreteToIntegerMonitoredFunction = new FunN<>();
	//Funzione di tipo monitored
	FunN<ConcreteEnumDomain, AbstractDomain> enumContreteToAbstractMonitoredFunction = new FunN<>();
	//Funzione di tipo monitored
	FunN<ConcreteDomain, ConcreteDomain2> concreteToConcrete2MonitoredFunction = new FunN<>();
	//Funzione di tipo monitored
	FunN<ConcreteDomain, AbstractDomain> concretetoAbstractMonitoredFunction = new FunN<>();
	//Funzione di tipo monitored
	FunN<ConcreteDomain2, Boolean> concrete2toBooleanMonitoredFunction = new FunN<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<ConcreteDomain> concreteDomainControlledFunction = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<ConcreteDomain2> concreteDomain2ControlledFunction = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<ConcreteEnumDomain> concreteEnumDomainControlledFunction = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<ConcreteDomain, EnumDomain> concreteToEnumControlledFunction = new FunNCtrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<ConcreteEnumDomain, EnumDomain> enumConcreteToEnumControlledFunction = new FunNCtrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<ConcreteEnumDomain, Integer> enumConcreteToIntegerControlledFunction = new FunNCtrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<ConcreteEnumDomain, AbstractDomain> enumContreteToAbstractControlledFunction = new FunNCtrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<ConcreteDomain, ConcreteDomain2> concreteToConcrete2ControlledFunction = new FunNCtrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<ConcreteDomain, AbstractDomain> concretetoAbstractControlledFunction = new FunNCtrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<ConcreteDomain2, Boolean> concrete2toBooleanControlledFunction = new FunNCtrl<>();
	//Funzione di tipo statico
	private static AbstractDomain value1;
	//Funzione di tipo statico
	private static AbstractDomain value2;

	// Inizializzazione di funzioni e domini
	ConcreteD() {
		//Definizione iniziale dei domini statici
		ConcreteDomain.elems = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5));
		ConcreteDomain_elems = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5));
		ConcreteDomain2.elems = Collections.unmodifiableList(Arrays.asList(1, 5, 10));
		ConcreteDomain2_elems = Collections.unmodifiableList(Arrays.asList(1, 5, 10));
		ConcreteEnumDomain.elems = Collections.unmodifiableList(Arrays.asList(EnumDomain.STATE1, EnumDomain.STATE2));
		ConcreteEnumDomain_elems = Collections.unmodifiableList(Arrays.asList(EnumDomain.STATE1, EnumDomain.STATE2));
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
		ConcreteDomain ConcreteDomain_elem = new ConcreteDomain();
		ConcreteDomain_elem.value = 5;
		concreteDomainControlledFunction.oldValue = concreteDomainControlledFunction.newValue = ConcreteDomain_elem;
		ConcreteDomain2 ConcreteDomain2_elem = new ConcreteDomain2();
		ConcreteDomain2_elem.value = 5;
		concreteDomain2ControlledFunction.oldValue = concreteDomain2ControlledFunction.newValue = ConcreteDomain2_elem;
		ConcreteEnumDomain ConcreteEnumDomain_elem = new ConcreteEnumDomain();
		ConcreteEnumDomain_elem.value = EnumDomain.STATE1;
		concreteEnumDomainControlledFunction.oldValue = concreteEnumDomainControlledFunction.newValue = ConcreteEnumDomain_elem;
		for (int _c = 0; _c < ConcreteDomain.elems.size(); _c++) {
			ConcreteDomain_elem.value = ConcreteDomain.elems.get(_c);
			EnumDomain a = null;
			if (ConcreteDomain_elem.value.equals(1))
				a = EnumDomain.STATE1;
			else if (ConcreteDomain_elem.value.equals(2))
				a = EnumDomain.STATE2;
			else if (ConcreteDomain_elem.value.equals(3))
				a = EnumDomain.STATE3;
			else if (ConcreteDomain_elem.value.equals(4))
				a = EnumDomain.STATE1;
			else if (ConcreteDomain_elem.value.equals(5))
				a = EnumDomain.STATE2;
			;
			concreteToEnumControlledFunction.oldValues.put(_c, a);
			concreteToEnumControlledFunction.newValues.put(_c, a);
		}
		for (int _c = 0; _c < ConcreteEnumDomain.elems.size(); _c++) {
			ConcreteEnumDomain_elem.value = ConcreteEnumDomain.elems.get(_c);
			EnumDomain a = EnumDomain.STATE1;
			enumConcreteToEnumControlledFunction.oldValues.put(_c, a);
			enumConcreteToEnumControlledFunction.newValues.put(_c, a);
		}
		for (int _c = 0; _c < ConcreteEnumDomain.elems.size(); _c++) {
			ConcreteEnumDomain_elem.value = ConcreteEnumDomain.elems.get(_c);
			Integer a = null;
			if (ConcreteEnumDomain_elem.value.equals(EnumDomain.STATE1))
				a = 1;
			else if (ConcreteEnumDomain_elem.value.equals(EnumDomain.STATE2))
				a = 5;
			else if (ConcreteEnumDomain_elem.value.equals(EnumDomain.STATE3))
				a = 10;
			;
			enumConcreteToIntegerControlledFunction.oldValues.put(ConcreteEnumDomain_elem, a);
			enumConcreteToIntegerControlledFunction.newValues.put(ConcreteEnumDomain_elem, a);
		}
		for (int _c = 0; _c < ConcreteEnumDomain.elems.size(); _c++) {
			ConcreteEnumDomain_elem.value = ConcreteEnumDomain.elems.get(_c);
			enumContreteToAbstractControlledFunction.oldValues.put(_c, new Function<Void, AbstractDomain>() {
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
			enumContreteToAbstractControlledFunction.newValues.put(_c, new Function<Void, AbstractDomain>() {
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
		for (int _c = 0; _c < ConcreteDomain.elems.size(); _c++) {
			ConcreteDomain_elem.value = ConcreteDomain.elems.get(_c);
			ConcreteDomain2 a = new ConcreteDomain2();
			a.value = 2;
			concreteToConcrete2ControlledFunction.oldValues.put(_c, a);
			concreteToConcrete2ControlledFunction.newValues.put(_c, a);
		}
		for (int _c = 0; _c < ConcreteDomain.elems.size(); _c++) {
			ConcreteDomain_elem.value = ConcreteDomain.elems.get(_c);
			AbstractDomain value1 = new AbstractDomain("value1");
			concretetoAbstractControlledFunction.oldValues.put(_c, value1);
			concretetoAbstractControlledFunction.newValues.put(_c, value1);
		}
		for (int _c = 0; _c < ConcreteDomain2.elems.size(); _c++) {
			ConcreteDomain2_elem.value = ConcreteDomain2.elems.get(_c);
			Boolean a = null;
			if (ConcreteDomain2_elem.value.equals(1))
				a = true;
			else if (ConcreteDomain2_elem.value.equals(5))
				a = false;
			else if (ConcreteDomain2_elem.value.equals(10))
				a = true;
			;
			concrete2toBooleanControlledFunction.oldValues.put(ConcreteDomain2_elem, a);
			concrete2toBooleanControlledFunction.newValues.put(ConcreteDomain2_elem, a);
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
		concreteDomainControlledFunction.oldValue = concreteDomainControlledFunction.newValue;
		concreteDomain2ControlledFunction.oldValue = concreteDomain2ControlledFunction.newValue;
		concreteEnumDomainControlledFunction.oldValue = concreteEnumDomainControlledFunction.newValue;
		concreteToEnumControlledFunction.oldValues = concreteToEnumControlledFunction.newValues;
		enumConcreteToEnumControlledFunction.oldValues = enumConcreteToEnumControlledFunction.newValues;
		enumConcreteToIntegerControlledFunction.oldValues = enumConcreteToIntegerControlledFunction.newValues;
		enumContreteToAbstractControlledFunction.oldValues = enumContreteToAbstractControlledFunction.newValues;
		concreteToConcrete2ControlledFunction.oldValues = concreteToConcrete2ControlledFunction.newValues;
		concretetoAbstractControlledFunction.oldValues = concretetoAbstractControlledFunction.newValues;
		concrete2toBooleanControlledFunction.oldValues = concrete2toBooleanControlledFunction.newValues;
	}

	//Metodo per l'aggiornamento dell'asm
	void updateASM() {
		r_Main();
		fireUpdateSet();
		initControlledWithMonitored();
	}
}
