package org.evoservice.trafficLight;
// TrafficLight.java automatically generated from ASM2CODE

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


abstract class TrafficLightSig {
	
	/////////////////////////////////////////////////
	/// DOMAIN CONTAINERS
	/////////////////////////////////////////////////
	/* Domain containers here */
	//Variabile di tipo Concreto o Enumerativo
	
	enum States {RED, GREEN, YELLOW, PENDING}
	
	List<States> States_elemsList = new ArrayList<>();
	//Variabile di tipo Concreto o Enumerativo
	
	static class  TimerDomain {
					static List<Integer> elems = new ArrayList<>();
	                Integer value;
	                
	                static TimerDomain valueOf(Integer val) {
	                	TimerDomain n = new TimerDomain();
	                	n.value = val;
	                	return n;
					}
					
					static TimerDomain valueOf(TimerDomain val) {
					                	return val;
									}
					
					@Override
						public boolean equals(Object obj) {
							if (!(obj instanceof TimerDomain)) return false;
							return value.equals(((TimerDomain)obj).value);
						}
					
					
					@Override
							public int hashCode() {
								return value.hashCode();
							}
							
					}
					
					TimerDomain TimerDomain_elem = new TimerDomain();
					List<Integer> TimerDomain_elems = new ArrayList<>();
	
	
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
	Fun0Ctrl <TimerDomain> count = new Fun0Ctrl<>();
	
	
	//Funzione di tipo Controlled
	Fun0Ctrl <States> status = new Fun0Ctrl<>();
	
	
	//Funzione di tipo monitored
	Fun0<Boolean> pedestrian = new Fun0<>();
	
	
	//Funzione di tipo statico
	abstract Boolean timeOut();
	
	//Funzione di tipo statico
	abstract Boolean yellow_timeOut();
	
	//Funzione di tipo statico
	abstract Boolean interupt();
	
	
	////////////////////////////////////////////////
	/// RULE DEFINITION
	/////////////////////////////////////////////////
	/* Rule definition here */
	
	abstract void r_red_seq();
	
	abstract void r_red();
	
	abstract void r_green_seq();
	
	abstract void r_green();
	
	abstract void r_yellow_seq();
	
	abstract void r_yellow();
	
	abstract void r_pending_seq();
	
	abstract void r_pending();
	
	abstract void r_Main_seq();
	
	abstract void r_Main();
	
}



class TrafficLight extends TrafficLightSig {
	
	// Inizializzazione di funzioni e domini
	
	TrafficLight(){
	
	//Definizione iniziale dei domini statici
	    
	 TimerDomain.elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60));
	 TimerDomain_elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60));
	 
	 States_elemsList = Collections.unmodifiableList(Arrays.asList(States.RED, States.GREEN, States.YELLOW, States.PENDING));
	 
	
	 //Definizione iniziale dei domini dinamici
	 
	
	 //Definizione iniziale dei domini astratti con funzini statiche
	 
	
	 //Inizializzazione delle funzioni
	 
	 status.oldValue = status.newValue = States.RED;
	 
	 TimerDomain_elem.value = 0;
	 
	 count.oldValue = count.newValue = TimerDomain_elem;
	 
	
	}
	
	   // Definizione delle funzioni statiche
	Boolean timeOut(){return (count.get()
	.value >= 60);}
	Boolean yellow_timeOut(){return (count.get()
	.value >= 5);}
	Boolean interupt(){return (pedestrian.get() == true) && (count.get()
	.value < 60);}
	
	// Conversione delle regole ASM in metodi java
	
	@Override
	void r_red_seq(){
		if (Boolean.TRUE.equals(timeOut())){ 
			//{ //par
				status.set(States.GREEN);
				TimerDomain TimerDomain1314838582_s = new TimerDomain();
				TimerDomain1314838582_s.value = (//count.get().value
				0);
								   count.set(TimerDomain1314838582_s);
			//} //endpar
		} else {
				TimerDomain TimerDomain713312506_s = new TimerDomain();
				TimerDomain713312506_s.value = (//count.get().value
				(count.get()
				.value + 1));
								   count.set(TimerDomain713312506_s);
		}
	}
	
	@Override
	void r_red(){
		if (Boolean.TRUE.equals(timeOut())){ 
			//{ //par
				status.set(States.GREEN);
				TimerDomain TimerDomain1314838582_s = new TimerDomain();
				TimerDomain1314838582_s.value = (//count.get().value
				0);
								   count.set(TimerDomain1314838582_s);
			//} //endpar
		} else {
				TimerDomain TimerDomain713312506_s = new TimerDomain();
				TimerDomain713312506_s.value = (//count.get().value
				(count.get()
				.value + 1));
								   count.set(TimerDomain713312506_s);
		}
	}
	
	@Override
	void r_green_seq(){
		if (Boolean.TRUE.equals(interupt())){ 
			//{ //par
				status.set(States.PENDING);
				TimerDomain TimerDomain865059288_s = new TimerDomain();
				TimerDomain865059288_s.value = (//count.get().value
				0);
								   count.set(TimerDomain865059288_s);
			//} //endpar
		} else {
				if (Boolean.TRUE.equals(timeOut())){ 
					//{ //par
						status.set(States.YELLOW);
						TimerDomain TimerDomain120360571_s = new TimerDomain();
						TimerDomain120360571_s.value = (//count.get().value
						0);
										   count.set(TimerDomain120360571_s);
					//} //endpar
				} else {
						TimerDomain TimerDomain2030937207_s = new TimerDomain();
						TimerDomain2030937207_s.value = (//count.get().value
						(count.get()
						.value + 1));
										   count.set(TimerDomain2030937207_s);
				}
		}
	}
	
	@Override
	void r_green(){
		if (Boolean.TRUE.equals(interupt())){ 
			//{ //par
				status.set(States.PENDING);
				TimerDomain TimerDomain865059288_s = new TimerDomain();
				TimerDomain865059288_s.value = (//count.get().value
				0);
								   count.set(TimerDomain865059288_s);
			//} //endpar
		} else {
				if (Boolean.TRUE.equals(timeOut())){ 
					//{ //par
						status.set(States.YELLOW);
						TimerDomain TimerDomain120360571_s = new TimerDomain();
						TimerDomain120360571_s.value = (//count.get().value
						0);
										   count.set(TimerDomain120360571_s);
					//} //endpar
				} else {
						TimerDomain TimerDomain2030937207_s = new TimerDomain();
						TimerDomain2030937207_s.value = (//count.get().value
						(count.get()
						.value + 1));
										   count.set(TimerDomain2030937207_s);
				}
		}
	}
	
	@Override
	void r_yellow_seq(){
		if (Boolean.TRUE.equals(yellow_timeOut())){ 
			//{ //par
				status.set(States.RED);
				TimerDomain TimerDomain1072377306_s = new TimerDomain();
				TimerDomain1072377306_s.value = (//count.get().value
				0);
								   count.set(TimerDomain1072377306_s);
			//} //endpar
		} else {
				TimerDomain TimerDomain231202600_s = new TimerDomain();
				TimerDomain231202600_s.value = (//count.get().value
				(count.get()
				.value + 1));
								   count.set(TimerDomain231202600_s);
		}
	}
	
	@Override
	void r_yellow(){
		if (Boolean.TRUE.equals(yellow_timeOut())){ 
			//{ //par
				status.set(States.RED);
				TimerDomain TimerDomain1072377306_s = new TimerDomain();
				TimerDomain1072377306_s.value = (//count.get().value
				0);
								   count.set(TimerDomain1072377306_s);
			//} //endpar
		} else {
				TimerDomain TimerDomain231202600_s = new TimerDomain();
				TimerDomain231202600_s.value = (//count.get().value
				(count.get()
				.value + 1));
								   count.set(TimerDomain231202600_s);
		}
	}
	
	@Override
	void r_pending_seq(){
		if (Boolean.TRUE.equals(timeOut())){ 
			//{ //par
				status.set(States.RED);
				TimerDomain TimerDomain1485089044_s = new TimerDomain();
				TimerDomain1485089044_s.value = (//count.get().value
				0);
								   count.set(TimerDomain1485089044_s);
			//} //endpar
		} else {
				TimerDomain TimerDomain441001942_s = new TimerDomain();
				TimerDomain441001942_s.value = (//count.get().value
				(count.get()
				.value + 1));
								   count.set(TimerDomain441001942_s);
		}
	}
	
	@Override
	void r_pending(){
		if (Boolean.TRUE.equals(timeOut())){ 
			//{ //par
				status.set(States.RED);
				TimerDomain TimerDomain1485089044_s = new TimerDomain();
				TimerDomain1485089044_s.value = (//count.get().value
				0);
								   count.set(TimerDomain1485089044_s);
			//} //endpar
		} else {
				TimerDomain TimerDomain441001942_s = new TimerDomain();
				TimerDomain441001942_s.value = (//count.get().value
				(count.get()
				.value + 1));
								   count.set(TimerDomain441001942_s);
		}
	}
	
	@Override
	void r_Main_seq(){
		if(status.get()==States.RED){
			r_red();
		}else if(status.get()==States.GREEN){
			r_green();
		}else if(status.get()==States.YELLOW){
			r_yellow();
		}else if(status.get()==States.PENDING){
			r_pending();
		}
	}
	
	@Override
	void r_Main(){
		if(status.get()==States.RED){
			r_red();
		}else if(status.get()==States.GREEN){
			r_green();
		}else if(status.get()==States.YELLOW){
			r_yellow();
		}else if(status.get()==States.PENDING){
			r_pending();
		}
	}
	
	
	// inizializazzione delle funzioni controllate che contengono metodi monitorati nei temini iniziali
	void initControlledWithMonitored(){
	  // No controlled functions initialized with monitored ones have been found
	   }
	
	// applicazione dell'aggiornamento del set
	void fireUpdateSet(){
		
		 count.oldValue = count.newValue;
		 status.oldValue = status.newValue;
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


