package org.evoservice.wrapper;
// coffeeVendingMachineNC.java automatically generated from ASM2CODE
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.List;

import org.apache.commons.collections4.Bag;

abstract class coffeeVendingMachineNCSig {
	/////////////////////////////////////////////////
	/// DOMAIN CONTAINERS
	/////////////////////////////////////////////////
	/* Domain containers here */
	//Variabile di tipo Concreto o Enumerativo
	enum CoinType {
		HALF, ONE
	}

	List<CoinType> CoinType_elemsList = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	enum Product {
		COFFEE, TEA, MILK
	}

	List<Product> Product_elemsList = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	static class QuantityDomain {
		static List<Integer> elems = new ArrayList<>();
		Integer value;

		static QuantityDomain valueOf(Integer val) {
			QuantityDomain n = new QuantityDomain();
			n.value = val;
			return n;
		}

		static QuantityDomain valueOf(QuantityDomain val) {
			return val;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof QuantityDomain))
				return false;
			return value.equals(((QuantityDomain) obj).value);
		}

		@Override
		public int hashCode() {
			return value.hashCode();
		}
	}

	QuantityDomain QuantityDomain_elem = new QuantityDomain();
	List<Integer> QuantityDomain_elems = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	static class CoinDomain {
		static List<Integer> elems = new ArrayList<>();
		Integer value;

		static CoinDomain valueOf(Integer val) {
			CoinDomain n = new CoinDomain();
			n.value = val;
			return n;
		}

		static CoinDomain valueOf(CoinDomain val) {
			return val;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof CoinDomain))
				return false;
			return value.equals(((CoinDomain) obj).value);
		}

		@Override
		public int hashCode() {
			return value.hashCode();
		}
	}

	CoinDomain CoinDomain_elem = new CoinDomain();
	List<Integer> CoinDomain_elems = new ArrayList<>();

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
	Fun0Ctrl<CoinDomain> coins = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<Product, QuantityDomain> available = new FunNCtrl<>();
	//Funzione di tipo monitored
	Fun0<CoinType> insertedCoin = new Fun0<>();
	//Funzione di tipo monitored
	Fun0<Product> chosenProduct = new Fun0<>();

	////////////////////////////////////////////////
	/// RULE DEFINITION
	/////////////////////////////////////////////////
	/* Rule definition here */
	abstract void r_serveProduct(Product _p);

	abstract void r_Main();
}

class coffeeVendingMachineNC extends coffeeVendingMachineNCSig {
	// Inizializzazione di funzioni e domini
	coffeeVendingMachineNC() {
		//Definizione iniziale dei domini statici
		QuantityDomain.elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		QuantityDomain_elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		CoinDomain.elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
				15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25));
		CoinDomain_elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
				15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25));
		CoinType_elemsList = Collections.unmodifiableList(Arrays.asList(CoinType.HALF, CoinType.ONE));
		Product_elemsList = Collections.unmodifiableList(Arrays.asList(Product.COFFEE, Product.TEA, Product.MILK));
		//Definizione iniziale dei domini dinamici
		//Definizione iniziale dei domini astratti con funzini statiche
		//Inizializzazione delle funzioni
		CoinDomain_elem.value = 0;
		coins.oldValue = coins.newValue = CoinDomain_elem;
		for (Product _p : Product.values()) {
			QuantityDomain a = new QuantityDomain();
			a.value = 10;
			available.oldValues.put(_p, a);
			available.newValues.put(_p, a);
		}
	}

	boolean cover_r_serveProduct = false;

	@Override
	void r_serveProduct(Product _p) {
		cover_r_serveProduct = true;
		//{ //par
		QuantityDomain QuantityDomain1574877131_s = new QuantityDomain();
		QuantityDomain1574877131_s.value = (//available.get(_p).value
		(available.get(_p).value - 1));
		available.set(_p, QuantityDomain1574877131_s);
		CoinDomain CoinDomain1894601438_s = new CoinDomain();
		CoinDomain1894601438_s.value = (//coins.get().value
		(coins.get().value + 1));
		coins.set(CoinDomain1894601438_s);
		//} //endpar
	}

	boolean cover_r_main = false;
	boolean cover_r_main_1 = false;
	boolean cover_r_main_2 = false;
	boolean cover_r_main_3 = false;
	boolean cover_r_main_4 = false;
	boolean cover_r_main_5 = false;
	boolean cover_r_main_6 = false;
	boolean cover_r_main_7 = false;
	boolean cover_r_main_8 = false;

	@Override
	void r_Main() {
		cover_r_main = true;
		if (Boolean.TRUE.equals((coins.get().value < 25))) {
			cover_r_main_1 = true;
			if (Boolean.TRUE.equals((insertedCoin.get() == CoinType.HALF))) {
				cover_r_main_2 = true;
				if (Boolean.TRUE.equals((available.get(Product.MILK).value > 0))) {
					cover_r_main_3 = true;
					r_serveProduct(Product.MILK);
				}
			} else {
				cover_r_main_4 = true;
				if (Boolean.TRUE.equals((chosenProduct.get() != Product.MILK))) {
					cover_r_main_5 = true;
					if (Boolean.TRUE
							.equals((chosenProduct.get() == Product.TEA) && (available.get(Product.TEA).value > 0))) {
						cover_r_main_6 = true;
						r_serveProduct(Product.TEA);
					} else {
						cover_r_main_7 = true;
						if (Boolean.TRUE.equals(
								(chosenProduct.get() == Product.COFFEE) && (available.get(Product.COFFEE).value > 0))) {
							cover_r_main_8 = true;
							r_serveProduct(Product.COFFEE);
						}
					}
				}
			}
		}
	}

	// inizializazzione delle funzioni controllate che contengono metodi monitorati nei temini iniziali
	void initControlledWithMonitored() {
		// No controlled functions initialized with monitored ones have been found
	}

	// applicazione dell'aggiornamento del set
	void fireUpdateSet() {
		coins.oldValue = coins.newValue;
		available.oldValues = available.newValues;
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
