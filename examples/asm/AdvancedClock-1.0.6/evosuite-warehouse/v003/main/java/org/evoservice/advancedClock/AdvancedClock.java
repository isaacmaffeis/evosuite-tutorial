package org.evoservice.advancedClock;
// AdvancedClock.java automatically generated from ASM2CODE

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


abstract class AdvancedClockSig {
	
	/////////////////////////////////////////////////
	/// DOMAIN CONTAINERS
	/////////////////////////////////////////////////
	/* Domain containers here */
	//Variabile di tipo Concreto o Enumerativo
	
	static class  Second {
					static List<Integer> elems = new ArrayList<>();
	                Integer value;
	                
	                static Second valueOf(Integer val) {
	                	Second n = new Second();
	                	n.value = val;
	                	return n;
					}
					
					static Second valueOf(Second val) {
					                	return val;
									}
					
					@Override
						public boolean equals(Object obj) {
							if (!(obj instanceof Second)) return false;
							return value.equals(((Second)obj).value);
						}
					
					
					@Override
							public int hashCode() {
								return value.hashCode();
							}
							
					}
					
					Second Second_elem = new Second();
					List<Integer> Second_elems = new ArrayList<>();
	
	//Variabile di tipo Concreto o Enumerativo
	
	static class  Minute {
					static List<Integer> elems = new ArrayList<>();
	                Integer value;
	                
	                static Minute valueOf(Integer val) {
	                	Minute n = new Minute();
	                	n.value = val;
	                	return n;
					}
					
					static Minute valueOf(Minute val) {
					                	return val;
									}
					
					@Override
						public boolean equals(Object obj) {
							if (!(obj instanceof Minute)) return false;
							return value.equals(((Minute)obj).value);
						}
					
					
					@Override
							public int hashCode() {
								return value.hashCode();
							}
							
					}
					
					Minute Minute_elem = new Minute();
					List<Integer> Minute_elems = new ArrayList<>();
	
	//Variabile di tipo Concreto o Enumerativo
	
	static class  Hour {
					static List<Integer> elems = new ArrayList<>();
	                Integer value;
	                
	                static Hour valueOf(Integer val) {
	                	Hour n = new Hour();
	                	n.value = val;
	                	return n;
					}
					
					static Hour valueOf(Hour val) {
					                	return val;
									}
					
					@Override
						public boolean equals(Object obj) {
							if (!(obj instanceof Hour)) return false;
							return value.equals(((Hour)obj).value);
						}
					
					
					@Override
							public int hashCode() {
								return value.hashCode();
							}
							
					}
					
					Hour Hour_elem = new Hour();
					List<Integer> Hour_elems = new ArrayList<>();
	
	
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
	Fun0Ctrl <Second> seconds = new Fun0Ctrl<>();
	
	
	//Funzione di tipo Controlled
	Fun0Ctrl <Minute> minutes = new Fun0Ctrl<>();
	
	
	//Funzione di tipo Controlled
	Fun0Ctrl <Hour> hours = new Fun0Ctrl<>();
	
	
	
	////////////////////////////////////////////////
	/// RULE DEFINITION
	/////////////////////////////////////////////////
	/* Rule definition here */
	
	abstract void r_IncMinHours_seq();
	
	abstract void r_IncMinHours();
	
	abstract void r_Main_seq();
	
	abstract void r_Main();
	
}



class AdvancedClock extends AdvancedClockSig {
	
	// Inizializzazione di funzioni e domini
	
	AdvancedClock(){
	
	//Definizione iniziale dei domini statici
	    
	 Second.elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59));
	 Second_elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59));
	 Minute.elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59));
	 Minute_elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59));
	 Hour.elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23));
	 Hour_elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23));
	 
	
	 //Definizione iniziale dei domini dinamici
	 
	
	 //Definizione iniziale dei domini astratti con funzini statiche
	 
	
	 //Inizializzazione delle funzioni
	 
	 
	 Second_elem.value = 0;
	 
	 seconds.oldValue = seconds.newValue = Second_elem;
	 
	 
	 Minute_elem.value = 0;
	 
	 minutes.oldValue = minutes.newValue = Minute_elem;
	 
	 
	 Hour_elem.value = 0;
	 
	 hours.oldValue = hours.newValue = Hour_elem;
	 
	
	}
	
	   // Definizione delle funzioni statiche
	
	// Conversione delle regole ASM in metodi java
	
	@Override
	void r_IncMinHours_seq(){
		//{ //par
			if (Boolean.TRUE.equals((minutes.get()
			.value == 59))){ 
				Hour Hour685558284_s = new Hour();
				Hour685558284_s.value = (//hours.get().value
				((hours.get()
				.value + 1) % 24));
								   hours.set(Hour685558284_s);
			}
			Minute Minute426960147_s = new Minute();
			Minute426960147_s.value = (//minutes.get().value
			((minutes.get()
			.value + 1) % 60));
							   minutes.set(Minute426960147_s);
		//} //endpar
	}
	
	@Override
	void r_IncMinHours(){
		//{ //par
			if (Boolean.TRUE.equals((minutes.get()
			.value == 59))){ 
				Hour Hour685558284_s = new Hour();
				Hour685558284_s.value = (//hours.get().value
				((hours.get()
				.value + 1) % 24));
								   hours.set(Hour685558284_s);
			}
			Minute Minute426960147_s = new Minute();
			Minute426960147_s.value = (//minutes.get().value
			((minutes.get()
			.value + 1) % 60));
							   minutes.set(Minute426960147_s);
		//} //endpar
	}
	
	@Override
	void r_Main_seq(){
		//{ //par
			if (Boolean.TRUE.equals((seconds.get()
			.value == 59))){ 
				r_IncMinHours();
			}
			Second Second1896305732_s = new Second();
			Second1896305732_s.value = (//seconds.get().value
			((seconds.get()
			.value + 1) % 60));
							   seconds.set(Second1896305732_s);
		//} //endpar
	}
	
	@Override
	void r_Main(){
		//{ //par
			if (Boolean.TRUE.equals((seconds.get()
			.value == 59))){ 
				r_IncMinHours();
			}
			Second Second1896305732_s = new Second();
			Second1896305732_s.value = (//seconds.get().value
			((seconds.get()
			.value + 1) % 60));
							   seconds.set(Second1896305732_s);
		//} //endpar
	}
	
	
	// inizializazzione delle funzioni controllate che contengono metodi monitorati nei temini iniziali
	void initControlledWithMonitored(){
	  // No controlled functions initialized with monitored ones have been found
	   }
	
	// applicazione dell'aggiornamento del set
	void fireUpdateSet(){
		
		 seconds.oldValue = seconds.newValue;
		 minutes.oldValue = minutes.newValue;
		 hours.oldValue = hours.newValue;
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


