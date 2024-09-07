package org.evoservice.cashpoint;
// CashPointv3.java automatically generated from ASM2CODE

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


abstract class CashPointv3Sig {
	
	/////////////////////////////////////////////////
	/// DOMAIN CONTAINERS
	/////////////////////////////////////////////////
	/* Domain containers here */
	//Variabile di tipo astratto
	
	static class Account {
		static List<Account> elems = new ArrayList<>();
		static List<String> val = new ArrayList<>();
	
	Account (String a) {
	      elems.add(this);
	      val.add(a);
	      }
	      
	      String toString(Account a) {
	      if(elems.contains(a)) {
	      return val.get(elems.lastIndexOf(a));
	      }
	      else return null;
	      }
	      
	Account get(String a) {
	      if(val.contains(a)) {
	      return elems.get(val.lastIndexOf(a));
	      }
	      else return null;
	      }
	      }
	      
	      List<String> Account_elemsList = new ArrayList<>();
	      List<Account> Account_Class = new ArrayList<>();
	
	//Variabile di tipo astratto
	
	static class Card {
		static List<Card> elems = new ArrayList<>();
		static List<String> val = new ArrayList<>();
	
	Card (String a) {
	      elems.add(this);
	      val.add(a);
	      }
	      
	      String toString(Card a) {
	      if(elems.contains(a)) {
	      return val.get(elems.lastIndexOf(a));
	      }
	      else return null;
	      }
	      
	Card get(String a) {
	      if(val.contains(a)) {
	      return elems.get(val.lastIndexOf(a));
	      }
	      else return null;
	      }
	      }
	      
	      List<String> Card_elemsList = new ArrayList<>();
	      List<Card> Card_Class = new ArrayList<>();
	
	//Variabile di tipo astratto
	
	static class Till {
		static List<Till> elems = new ArrayList<>();
		static List<String> val = new ArrayList<>();
	
	Till (String a) {
	      elems.add(this);
	      val.add(a);
	      }
	      
	      String toString(Till a) {
	      if(elems.contains(a)) {
	      return val.get(elems.lastIndexOf(a));
	      }
	      else return null;
	      }
	      
	Till get(String a) {
	      if(val.contains(a)) {
	      return elems.get(val.lastIndexOf(a));
	      }
	      else return null;
	      }
	      }
	      
	      List<String> Till_elemsList = new ArrayList<>();
	      List<Till> Till_Class = new ArrayList<>();
	
	//Variabile di tipo astratto
	
	static class Date {
		static List<Date> elems = new ArrayList<>();
		static List<String> val = new ArrayList<>();
	
	Date (String a) {
	      elems.add(this);
	      val.add(a);
	      }
	      
	      String toString(Date a) {
	      if(elems.contains(a)) {
	      return val.get(elems.lastIndexOf(a));
	      }
	      else return null;
	      }
	      
	Date get(String a) {
	      if(val.contains(a)) {
	      return elems.get(val.lastIndexOf(a));
	      }
	      else return null;
	      }
	      }
	      
	      List<String> Date_elemsList = new ArrayList<>();
	      List<Date> Date_Class = new ArrayList<>();
	
	//Variabile di tipo Concreto o Enumerativo
	
	static class  PinDomain {
					static List<Integer> elems = new ArrayList<>();
	                Integer value;
	                
	                static PinDomain valueOf(Integer val) {
	                	PinDomain n = new PinDomain();
	                	n.value = val;
	                	return n;
					}
					
					static PinDomain valueOf(PinDomain val) {
					                	return val;
									}
					
					@Override
						public boolean equals(Object obj) {
							if (!(obj instanceof PinDomain)) return false;
							return value.equals(((PinDomain)obj).value);
						}
					
					
					@Override
							public int hashCode() {
								return value.hashCode();
							}
							
					}
					
					PinDomain PinDomain_elem = new PinDomain();
					List<Integer> PinDomain_elems = new ArrayList<>();
	
	//Variabile di tipo Concreto o Enumerativo
	
	enum TillState {WAITCARD, WAITPIN, VALIDPIN}
	
	List<TillState> TillState_elemsList = new ArrayList<>();
	
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
	FunNCtrl<Till, TillState> tillState = new FunNCtrl<>();
	
	
	//Funzione di tipo Controlled
	FunNCtrl<Account, Integer> balance = new FunNCtrl<>();
	
	
	//Funzione di tipo Controlled
	FunNCtrl<Card, Boolean> legalCard = new FunNCtrl<>();
	
	
	//Funzione di tipo Controlled
	FunNCtrl<Card, Integer> daily_withdraw_sum = new FunNCtrl<>();
	
	
	//Funzione di tipo Controlled
	FunNCtrl<Till, Card> insertedCard = new FunNCtrl<>();
	
	
	//Funzione di tipo monitored
	FunN<Till, PinDomain> enteredPin = new FunN<>();
	
	
	//Funzione di tipo monitored
	FunN<Till, Integer> amount = new FunN<>();
	
	
	//Funzione di tipo statico
	abstract Integer withdrawLimit();
	
	//Funzione di tipo statico
	abstract Integer encodedPin (Card param0_encodedPin);
	
	//Funzione di tipo statico
	abstract Account cardAccount (Card param0_cardAccount);
	
	//Funzione di tipo monitored
	Fun0<Date> currentDate = new Fun0<>();
	
	
	//Funzione di tipo Controlled
	FunNCtrl<Card, Date> cardLastUseDate = new FunNCtrl<>();
	
	
	//Funzione di tipo statico
	static Card card1;
	
	//Funzione di tipo statico
	static Card card2;
	
	//Funzione di tipo statico
	static Till till1;
	
	//Funzione di tipo statico
	static Account account1;
	
	//Funzione di tipo statico
	static Date monday;
	
	//Funzione di tipo statico
	static Date tuesday;
	
	
	////////////////////////////////////////////////
	/// RULE DEFINITION
	/////////////////////////////////////////////////
	/* Rule definition here */
	
	abstract void r_insertedCard_seq (Till _t, Card _c);
	
	abstract void r_insertedCard (Till _t, Card _c);
	
	abstract void r_insertCard_seq (Till _t);
	
	abstract void r_insertCard (Till _t);
	
	abstract void r_enterPin_seq (Till _t);
	
	abstract void r_enterPin (Till _t);
	
	abstract void r_validPin_seq (Till _t);
	
	abstract void r_validPin (Till _t);
	
	abstract void r_main_seq();
	
	abstract void r_main();
	
}



class CashPointv3 extends CashPointv3Sig {
	
	// Inizializzazione di funzioni e domini
	
	CashPointv3(){
	
	//Definizione iniziale dei domini statici
	    
	 PinDomain.elems = Collections.unmodifiableList(Arrays.asList(1, 2));
	 PinDomain_elems = Collections.unmodifiableList(Arrays.asList(1, 2));
	 
	 TillState_elemsList = Collections.unmodifiableList(Arrays.asList(TillState.WAITCARD, TillState.WAITPIN, TillState.VALIDPIN));
	 
	
	 //Definizione iniziale dei domini dinamici
	 
	
	 //Definizione iniziale dei domini astratti con funzini statiche
	 
	 card1 = new Card("card1");
	 Card_elemsList.add("card1");
	 Card_Class.add(card1);
	 card2 = new Card("card2");
	 Card_elemsList.add("card2");
	 Card_Class.add(card2);
	 till1 = new Till("till1");
	 Till_elemsList.add("till1");
	 Till_Class.add(till1);
	 account1 = new Account("account1");
	 Account_elemsList.add("account1");
	 Account_Class.add(account1);
	 monday = new Date("monday");
	 Date_elemsList.add("monday");
	 Date_Class.add(monday);
	 tuesday = new Date("tuesday");
	 Date_elemsList.add("tuesday");
	 Date_Class.add(tuesday);
	
	 //Inizializzazione delle funzioni
	 
	 for(Till _m: Till.elems){
	 TillState a  = TillState.WAITCARD;
	 				
	 				      tillState.oldValues.put(_m,a);
	 				      tillState.newValues.put(_m,a);
	 }
	 for(Card _m: Card.elems){
	 Boolean a  = true;
	 				
	 				      legalCard.oldValues.put(_m,a);
	 				      legalCard.newValues.put(_m,a);
	 }
	 for(Account _a: Account.elems){
	 Integer a  = 1000;
	 				
	 				      balance.oldValues.put(_a,a);
	 				      balance.newValues.put(_a,a);
	 }
	 for(Card _c: Card.elems){
	 Integer a  = 0;
	 				
	 				      daily_withdraw_sum.oldValues.put(_c,a);
	 				      daily_withdraw_sum.newValues.put(_c,a);
	 }
	 for(Card _c: Card.elems){
	 Date monday = new Date("monday");
	 				
	 				      cardLastUseDate.oldValues.put(_c,monday);
	 				      cardLastUseDate.newValues.put(_c,monday);
	 }
	
	}
	
	   // Definizione delle funzioni statiche
	Integer encodedPin(Card _c){ 	if(_c==card1) 
			return 1;
		else if(_c==card2)
			return 2;
	 return null;
	}
	Account cardAccount(Card _c){ 	if(_c==card1) 
			return account1;
		else if(_c==card2)
			return account1;
	 return null;
	}
	Integer withdrawLimit(){return 1000;}
	
	// Conversione delle regole ASM in metodi java
	
	@Override
	void r_insertedCard_seq (Till _t, Card _c){
		if (Boolean.TRUE.equals((tillState.get(_t) == TillState.WAITCARD))){ 
			//{ //par
				tillState.set(_t, TillState.WAITPIN);
				insertedCard.set(_t, _c);
			//} //endpar
		}
	}
	
	@Override
	void r_insertedCard (Till _t, Card _c){
		if (Boolean.TRUE.equals((tillState.get(_t) == TillState.WAITCARD))){ 
			//{ //par
				tillState.set(_t, TillState.WAITPIN);
				insertedCard.set(_t, _c);
			//} //endpar
		}
	}
	
	@Override
	void r_insertCard_seq (Till _t){
		r_insertedCard(_t, card1);
	}
	
	@Override
	void r_insertCard (Till _t){
		r_insertedCard(_t, card1);
	}
	
	@Override
	void r_enterPin_seq (Till _t){
		if (Boolean.TRUE.equals((tillState.get(_t) == TillState.WAITPIN))){ 
			if (Boolean.TRUE.equals(legalCard.get(insertedCard.get(_t)))){ 
				if (Boolean.TRUE.equals((enteredPin.get(_t).value == encodedPin(insertedCard.get(_t))))){ 
					//{ //par
						if (Boolean.TRUE.equals((cardLastUseDate.get(insertedCard.get(_t)) != currentDate.get()))){ 
							//{ //par
								daily_withdraw_sum.set(insertedCard.get(_t), 0);
								cardLastUseDate.set(insertedCard.get(_t), currentDate.get());
							//} //endpar
						}
						tillState.set(_t, TillState.VALIDPIN);
					//} //endpar
				}
			}
		}
	}
	
	@Override
	void r_enterPin (Till _t){
		if (Boolean.TRUE.equals((tillState.get(_t) == TillState.WAITPIN))){ 
			if (Boolean.TRUE.equals(legalCard.get(insertedCard.get(_t)))){ 
				if (Boolean.TRUE.equals((enteredPin.get(_t).value == encodedPin(insertedCard.get(_t))))){ 
					//{ //par
						if (Boolean.TRUE.equals((cardLastUseDate.get(insertedCard.get(_t)) != currentDate.get()))){ 
							//{ //par
								daily_withdraw_sum.set(insertedCard.get(_t), 0);
								cardLastUseDate.set(insertedCard.get(_t), currentDate.get());
							//} //endpar
						}
						tillState.set(_t, TillState.VALIDPIN);
					//} //endpar
				}
			}
		}
	}
	
	@Override
	void r_validPin_seq (Till _t){
		if (Boolean.TRUE.equals((tillState.get(_t) == TillState.VALIDPIN))){ 
			{
			Account _acc = cardAccount(insertedCard.get(_t));
			if (Boolean.TRUE.equals((amount.get(_t) > 0) && (amount.get(_t) <= balance.get(_acc)) && (daily_withdraw_sum.get(insertedCard.get(_t)) < (withdrawLimit() - amount.get(_t))))){ 
				//{ //par
					balance.set(_acc, (balance.get(_acc) - amount.get(_t)));
					daily_withdraw_sum.set(insertedCard.get(_t), (daily_withdraw_sum.get(insertedCard.get(_t)) - amount.get(_t)));
				//} //endpar
			}
			}
		}
	}
	
	@Override
	void r_validPin (Till _t){
		if (Boolean.TRUE.equals((tillState.get(_t) == TillState.VALIDPIN))){ 
			{
			Account _acc = cardAccount(insertedCard.get(_t));
			if (Boolean.TRUE.equals((amount.get(_t) > 0) && (amount.get(_t) <= balance.get(_acc)) && (daily_withdraw_sum.get(insertedCard.get(_t)) < (withdrawLimit() - amount.get(_t))))){ 
				//{ //par
					balance.set(_acc, (balance.get(_acc) - amount.get(_t)));
					daily_withdraw_sum.set(insertedCard.get(_t), (daily_withdraw_sum.get(insertedCard.get(_t)) - amount.get(_t)));
				//} //endpar
			}
			}
		}
	}
	
	@Override
	void r_main_seq(){
		//{ //par
			r_insertCard(till1);
			r_enterPin(till1);
			r_validPin(till1);
		//} //endpar
	}
	
	@Override
	void r_main(){
		//{ //par
			r_insertCard(till1);
			r_enterPin(till1);
			r_validPin(till1);
		//} //endpar
	}
	
	
	// inizializazzione delle funzioni controllate che contengono metodi monitorati nei temini iniziali
	void initControlledWithMonitored(){
	  // No controlled functions initialized with monitored ones have been found
	   }
	
	// applicazione dell'aggiornamento del set
	void fireUpdateSet(){
		
		 tillState.oldValues = tillState.newValues;
		 balance.oldValues = balance.newValues;
		 legalCard.oldValues = legalCard.newValues;
		 daily_withdraw_sum.oldValues = daily_withdraw_sum.newValues;
		 insertedCard.oldValues = insertedCard.newValues;
		 cardLastUseDate.oldValues = cardLastUseDate.newValues;
	}
	
	//Metodo per l'aggiornamento dell'asm
	void updateASM()
	{
		r_main();
		fireUpdateSet();
		initControlledWithMonitored();
	}
	
	public static void main(String[] args) {
		// TODO: auto-generated main method by Asmeta2Java 
	}
	
}


