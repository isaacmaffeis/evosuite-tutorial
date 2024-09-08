package org.evoservice.trafficLight;
// TrafficLightv2.java automatically generated from ASM2CODE

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


abstract class TrafficLightv2Sig {
	
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



class TrafficLightv2 extends TrafficLightv2Sig {
	
	// Inizializzazione di funzioni e domini
	
	TrafficLightv2(){
	
	//Definizione iniziale dei domini statici
	    
	 TimerDomain.elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6));
	 TimerDomain_elems = Collections.unmodifiableList(Arrays.asList(0, 1, 2, 3, 4, 5, 6));
	 
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
	.value >= 6);}
	Boolean yellow_timeOut(){return (count.get()
	.value >= 1);}
	Boolean interupt(){return (pedestrian.get() == true) && (count.get()
	.value < 6);}
	
	// Conversione delle regole ASM in metodi java
	
	@Override
	void r_red_seq(){
		if (Boolean.TRUE.equals(timeOut())){ 
			//{ //par
				status.set(States.GREEN);
				TimerDomain TimerDomain1976804832_s = new TimerDomain();
				TimerDomain1976804832_s.value = (//count.get().value
				0);
								   count.set(TimerDomain1976804832_s);
			//} //endpar
		} else {
				TimerDomain TimerDomain434398524_s = new TimerDomain();
				TimerDomain434398524_s.value = (//count.get().value
				(count.get()
				.value + 1));
								   count.set(TimerDomain434398524_s);
		}
	}
	
	@Override
	void r_red(){
		if (Boolean.TRUE.equals(timeOut())){ 
			//{ //par
				status.set(States.GREEN);
				TimerDomain TimerDomain1976804832_s = new TimerDomain();
				TimerDomain1976804832_s.value = (//count.get().value
				0);
								   count.set(TimerDomain1976804832_s);
			//} //endpar
		} else {
				TimerDomain TimerDomain434398524_s = new TimerDomain();
				TimerDomain434398524_s.value = (//count.get().value
				(count.get()
				.value + 1));
								   count.set(TimerDomain434398524_s);
		}
	}
	
	@Override
	void r_green_seq(){
		if (Boolean.TRUE.equals(interupt())){ 
			//{ //par
				status.set(States.PENDING);
				TimerDomain TimerDomain856055143_s = new TimerDomain();
				TimerDomain856055143_s.value = (//count.get().value
				0);
								   count.set(TimerDomain856055143_s);
			//} //endpar
		} else {
				if (Boolean.TRUE.equals(timeOut())){ 
					//{ //par
						status.set(States.YELLOW);
						TimerDomain TimerDomain426394307_s = new TimerDomain();
						TimerDomain426394307_s.value = (//count.get().value
						0);
										   count.set(TimerDomain426394307_s);
					//} //endpar
				} else {
						TimerDomain TimerDomain1261031890_s = new TimerDomain();
						TimerDomain1261031890_s.value = (//count.get().value
						(count.get()
						.value + 1));
										   count.set(TimerDomain1261031890_s);
				}
		}
	}
	
	@Override
	void r_green(){
		if (Boolean.TRUE.equals(interupt())){ 
			//{ //par
				status.set(States.PENDING);
				TimerDomain TimerDomain856055143_s = new TimerDomain();
				TimerDomain856055143_s.value = (//count.get().value
				0);
								   count.set(TimerDomain856055143_s);
			//} //endpar
		} else {
				if (Boolean.TRUE.equals(timeOut())){ 
					//{ //par
						status.set(States.YELLOW);
						TimerDomain TimerDomain426394307_s = new TimerDomain();
						TimerDomain426394307_s.value = (//count.get().value
						0);
										   count.set(TimerDomain426394307_s);
					//} //endpar
				} else {
						TimerDomain TimerDomain1261031890_s = new TimerDomain();
						TimerDomain1261031890_s.value = (//count.get().value
						(count.get()
						.value + 1));
										   count.set(TimerDomain1261031890_s);
				}
		}
	}
	
	@Override
	void r_yellow_seq(){
		if (Boolean.TRUE.equals(yellow_timeOut())){ 
			//{ //par
				status.set(States.RED);
				TimerDomain TimerDomain151593342_s = new TimerDomain();
				TimerDomain151593342_s.value = (//count.get().value
				0);
								   count.set(TimerDomain151593342_s);
			//} //endpar
		} else {
				TimerDomain TimerDomain1758008124_s = new TimerDomain();
				TimerDomain1758008124_s.value = (//count.get().value
				(count.get()
				.value + 1));
								   count.set(TimerDomain1758008124_s);
		}
	}
	
	@Override
	void r_yellow(){
		if (Boolean.TRUE.equals(yellow_timeOut())){ 
			//{ //par
				status.set(States.RED);
				TimerDomain TimerDomain151593342_s = new TimerDomain();
				TimerDomain151593342_s.value = (//count.get().value
				0);
								   count.set(TimerDomain151593342_s);
			//} //endpar
		} else {
				TimerDomain TimerDomain1758008124_s = new TimerDomain();
				TimerDomain1758008124_s.value = (//count.get().value
				(count.get()
				.value + 1));
								   count.set(TimerDomain1758008124_s);
		}
	}
	
	@Override
	void r_pending_seq(){
		if (Boolean.TRUE.equals(timeOut())){ 
			//{ //par
				status.set(States.RED);
				TimerDomain TimerDomain384515747_s = new TimerDomain();
				TimerDomain384515747_s.value = (//count.get().value
				0);
								   count.set(TimerDomain384515747_s);
			//} //endpar
		} else {
				TimerDomain TimerDomain1345483087_s = new TimerDomain();
				TimerDomain1345483087_s.value = (//count.get().value
				(count.get()
				.value + 1));
								   count.set(TimerDomain1345483087_s);
		}
	}
	
	@Override
	void r_pending(){
		if (Boolean.TRUE.equals(timeOut())){ 
			//{ //par
				status.set(States.RED);
				TimerDomain TimerDomain384515747_s = new TimerDomain();
				TimerDomain384515747_s.value = (//count.get().value
				0);
								   count.set(TimerDomain384515747_s);
			//} //endpar
		} else {
				TimerDomain TimerDomain1345483087_s = new TimerDomain();
				TimerDomain1345483087_s.value = (//count.get().value
				(count.get()
				.value + 1));
								   count.set(TimerDomain1345483087_s);
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


