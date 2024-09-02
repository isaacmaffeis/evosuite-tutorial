package org.evoservice.coffeeVendingMachineNC;// coffeeVendingMachineNC.java automatically generated from ASM2CODE

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.Scanner;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.Bag;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.javatuples.Decade;
import org.javatuples.Ennead;
import org.javatuples.Octet;
import org.javatuples.Pair;
import org.javatuples.Quartet;
import org.javatuples.Quintet;
import org.javatuples.Septet;
import org.javatuples.Sextet;
import org.javatuples.Triplet;


abstract class coffeeVendingMachineNCSig {
	
	/////////////////////////////////////////////////
	/// DOMAIN CONTAINERS
	/////////////////////////////////////////////////
	/* Domain containers here */
	//Variabile di tipo Concreto o Enumerativo
	
	enum CoinType {HALF, ONE}
	
	//Variabile di tipo Concreto o Enumerativo
	
	enum Product {COFFEE, TEA, MILK}
	
	//Variabile di tipo Concreto o Enumerativo
	
	static class  QuantityDomain {
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
							if (!(obj instanceof QuantityDomain)) return false;
							return value.equals(((QuantityDomain)obj).value);
						}
					
					
					@Override
							public int hashCode() {
								return value.hashCode();
							}
							
					}
					
					QuantityDomain QuantityDomain_elem = new QuantityDomain();
					List<Integer> QuantityDomain_elems = new ArrayList<>();

					List<Product> Product_elemsList = new ArrayList<>();
	
	//Variabile di tipo Concreto o Enumerativo
	
	static class  CoinDomain {
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
							if (!(obj instanceof CoinDomain)) return false;
							return value.equals(((CoinDomain)obj).value);
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
	Fun0Ctrl <CoinDomain> coins = new Fun0Ctrl<>();
	
	
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
	
	abstract void r_serveProduct_seq (Product _p);
	
	abstract void r_serveProduct (Product _p);
	
	abstract void r_Main_seq();
	
	abstract void r_Main();
	
}



class coffeeVendingMachineNC extends coffeeVendingMachineNCSig {
	
	// Inizializzazione di funzioni e domini
	
	coffeeVendingMachineNC(){
	
	    //Definizione iniziale dei domini statici
	    
	 QuantityDomain.elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	 QuantityDomain_elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	 CoinDomain.elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25));
	 CoinDomain_elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25));

	 Product_elemsList = Collections.unmodifiableList(Arrays.asList(Product.COFFEE, Product.TEA, Product.MILK));
	
	 //Definizione iniziale dei domini dinamici
	 
	
	 //Definizione iniziale dei domini astratti con funzini statiche
	 
	
	 //Inizializzazione delle funzioni
	 
	 
	 CoinDomain_elem.value = 0;
	 
	 coins.oldValue = coins.newValue = CoinDomain_elem;
	 
	 for(Product _p: Product.values()){
	 QuantityDomain a = new QuantityDomain();
	 			    
	 			           a.value  = 10;
	 available.oldValues.put(_p,a);
	 available.newValues.put(_p,a);
	 }
	
	}
	
	   // Definizione delle funzioni statiche
	
	// Conversione delle regole ASM in metodi java
	
	@Override
	void r_serveProduct_seq (Product _p){
		//{ //par
			QuantityDomain QuantityDomain214187874_s = new QuantityDomain();
			QuantityDomain214187874_s.value = (//available.get(_p).value
			(available.get(_p)
			.value - 1));
							   available.set(_p, QuantityDomain214187874_s);
			CoinDomain CoinDomain1528923159_s = new CoinDomain();
			CoinDomain1528923159_s.value = (//coins.get().value
			(coins.get()
			.value + 1));
							   coins.set(CoinDomain1528923159_s);
		//} //endpar
	}
	
	@Override
	void r_serveProduct (Product _p){
		//{ //par
			QuantityDomain QuantityDomain214187874_s = new QuantityDomain();
			QuantityDomain214187874_s.value = (//available.get(_p).value
			(available.get(_p)
			.value - 1));
							   available.set(_p, QuantityDomain214187874_s);
			CoinDomain CoinDomain1528923159_s = new CoinDomain();
			CoinDomain1528923159_s.value = (//coins.get().value
			(coins.get()
			.value + 1));
							   coins.set(CoinDomain1528923159_s);
		//} //endpar
	}
	
	@Override
	void r_Main_seq(){
		if (Boolean.TRUE.equals((coins.get()
		.value < 25))){ 
			if (Boolean.TRUE.equals((insertedCoin.get() == CoinType.HALF))){ 
				if (Boolean.TRUE.equals((available.get(Product.MILK)
				.value > 0))){ 
					r_serveProduct(Product.MILK);
				}
			} else {
					if (Boolean.TRUE.equals((chosenProduct.get() != Product.MILK))){ 
						if (Boolean.TRUE.equals((chosenProduct.get() == Product.TEA) && (available.get(Product.TEA)
						.value > 0))){ 
							r_serveProduct(Product.TEA);
						} else {
								if (Boolean.TRUE.equals((chosenProduct.get() == Product.COFFEE) && (available.get(Product.COFFEE)
								.value > 0))){ 
									r_serveProduct(Product.COFFEE);
								}
						}
					}
			}
		}
	}
	
	@Override
	void r_Main(){
		if (Boolean.TRUE.equals((coins.get()
		.value < 25))){ 
			if (Boolean.TRUE.equals((insertedCoin.get() == CoinType.HALF))){ 
				if (Boolean.TRUE.equals((available.get(Product.MILK)
				.value > 0))){ 
					r_serveProduct(Product.MILK);
				}
			} else {
					if (Boolean.TRUE.equals((chosenProduct.get() != Product.MILK))){ 
						if (Boolean.TRUE.equals((chosenProduct.get() == Product.TEA) && (available.get(Product.TEA)
						.value > 0))){ 
							r_serveProduct(Product.TEA);
						} else {
								if (Boolean.TRUE.equals((chosenProduct.get() == Product.COFFEE) && (available.get(Product.COFFEE)
								.value > 0))){ 
									r_serveProduct(Product.COFFEE);
								}
						}
					}
			}
		}
	}
	
	
	// inizializazzione delle funzioni controllate che contengono metodi monitorati nei temini iniziali
	void initControlledWithMonitored(){
	  // No controlled functions initialized with monitored ones have been found
	   }
	
	// applicazione dell'aggiornamento del set
	void fireUpdateSet(){
		
		 coins.oldValue = coins.newValue;
		 available.oldValues = available.newValues;
	}
	
	//Metodo per l'aggiornamento dell'asm
	void updateASM()
	{
		r_Main();
		fireUpdateSet();
		initControlledWithMonitored();
	}
	
	public static void main(String[] args) {
		// TODO: auto-generated main method by Asmeta2Java 
	}
	
}


