package org.evoservice.ascensore;
// Ascensore.java automatically generated from ASM2CODE

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


abstract class AscensoreSig {
	
	/////////////////////////////////////////////////
	/// DOMAIN CONTAINERS
	/////////////////////////////////////////////////
	/* Domain containers here */
	//Variabile di tipo Concreto o Enumerativo
	
	enum Piano {UNO, DUE}
	
	List<Piano> Piano_elemsList = new ArrayList<>();
	//Variabile di tipo Concreto o Enumerativo
	
	enum Porta {CHIUSA, APERTA}
	
	List<Porta> Porta_elemsList = new ArrayList<>();
	
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
	Fun0Ctrl <Piano> statoPiano = new Fun0Ctrl<>();
	
	
	//Funzione di tipo Controlled
	Fun0Ctrl <Porta> statoPorta = new Fun0Ctrl<>();
	
	
	//Funzione di tipo monitored
	Fun0<Boolean> signalPorta = new Fun0<>();
	
	
	
	////////////////////////////////////////////////
	/// RULE DEFINITION
	/////////////////////////////////////////////////
	/* Rule definition here */
	
	abstract void r_Main_seq();
	
	abstract void r_Main();
	
}



class Ascensore extends AscensoreSig {
	
	// Inizializzazione di funzioni e domini
	
	Ascensore(){
	
	//Definizione iniziale dei domini statici
	    
	 Piano_elemsList = Collections.unmodifiableList(Arrays.asList(Piano.UNO, Piano.DUE));
	 Porta_elemsList = Collections.unmodifiableList(Arrays.asList(Porta.CHIUSA, Porta.APERTA));
	 
	
	 //Definizione iniziale dei domini dinamici
	 
	
	 //Definizione iniziale dei domini astratti con funzini statiche
	 
	
	 //Inizializzazione delle funzioni
	 
	 statoPiano.oldValue = statoPiano.newValue = Piano.UNO;
	 statoPorta.oldValue = statoPorta.newValue = Porta.CHIUSA;
	
	}
	
	   // Definizione delle funzioni statiche
	
	// Conversione delle regole ASM in metodi java
	
	@Override
	void r_Main_seq(){
		if (Boolean.TRUE.equals(signalPorta.get())){ 
			if (Boolean.TRUE.equals((statoPiano.get() == Piano.UNO) && (statoPorta.get() == Porta.CHIUSA))){ 
				//{ //par
					statoPiano.set(Piano.UNO);
					statoPorta.set(Porta.APERTA);
				//} //endpar
			} else {
					if (Boolean.TRUE.equals((statoPiano.get() == Piano.DUE) && (statoPorta.get() == Porta.CHIUSA))){ 
						//{ //par
							statoPiano.set(Piano.UNO);
							statoPorta.set(Porta.APERTA);
						//} //endpar
					}
			}
		} else {
				if (Boolean.TRUE.equals(! signalPorta.get())){ 
					//{ //par
						statoPorta.set(Porta.CHIUSA);
						if (Boolean.TRUE.equals((statoPiano.get() == Piano.UNO))){ 
							statoPiano.set(Piano.DUE);
						} else {
								if (Boolean.TRUE.equals((statoPiano.get() == Piano.DUE))){ 
									statoPiano.set(Piano.UNO);
								}
						}
					//} //endpar
				}
		}
	}
	
	@Override
	void r_Main(){
		if (Boolean.TRUE.equals(signalPorta.get())){ 
			if (Boolean.TRUE.equals((statoPiano.get() == Piano.UNO) && (statoPorta.get() == Porta.CHIUSA))){ 
				//{ //par
					statoPiano.set(Piano.UNO);
					statoPorta.set(Porta.APERTA);
				//} //endpar
			} else {
					if (Boolean.TRUE.equals((statoPiano.get() == Piano.DUE) && (statoPorta.get() == Porta.CHIUSA))){ 
						//{ //par
							statoPiano.set(Piano.UNO);
							statoPorta.set(Porta.APERTA);
						//} //endpar
					}
			}
		} else {
				if (Boolean.TRUE.equals(! signalPorta.get())){ 
					//{ //par
						statoPorta.set(Porta.CHIUSA);
						if (Boolean.TRUE.equals((statoPiano.get() == Piano.UNO))){ 
							statoPiano.set(Piano.DUE);
						} else {
								if (Boolean.TRUE.equals((statoPiano.get() == Piano.DUE))){ 
									statoPiano.set(Piano.UNO);
								}
						}
					//} //endpar
				}
		}
	}
	
	
	// inizializazzione delle funzioni controllate che contengono metodi monitorati nei temini iniziali
	void initControlledWithMonitored(){
	  // No controlled functions initialized with monitored ones have been found
	   }
	
	// applicazione dell'aggiornamento del set
	void fireUpdateSet(){
		
		 statoPiano.oldValue = statoPiano.newValue;
		 statoPorta.oldValue = statoPorta.newValue;
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


