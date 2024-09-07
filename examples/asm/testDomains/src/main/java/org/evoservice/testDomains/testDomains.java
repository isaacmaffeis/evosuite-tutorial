package org.evoservice.testDomains;
// testDomains.java automatically generated from ASM2CODE

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


abstract class testDomainsSig {

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
	FunN<TillState, Integer> tilleStateMonitor = new FunN<>();


	//Funzione di tipo monitored
	FunN<Till, Integer> enteredPin = new FunN<>();


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
	static Till till2;

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

	abstract void r_main_seq();

	abstract void r_main();

}



class testDomains extends testDomainsSig {

	// Inizializzazione di funzioni e domini

	testDomains(){

		//Definizione iniziale dei domini statici

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
		till2 = new Till("till2");
		Till_elemsList.add("till2");
		Till_Class.add(till2);
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
			Integer a =Collections.unmodifiableList(Arrays.asList(1000, 2000, 3000)).get(ThreadLocalRandom.current().nextInt(0, Collections.unmodifiableList(Arrays.asList(1000, 2000, 3000)).size()));

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

	// Conversione delle regole ASM in metodi java

	@Override
	Integer withdrawLimit() {
		return 0;
	}

	@Override
	Integer encodedPin(Card param0_encodedPin) {
		return 0;
	}

	@Override
	Account cardAccount(Card param0_cardAccount) {
		return null;
	}

	@Override
	void r_main_seq(){
		// Empty rule
	}

	@Override
	void r_main(){
		// Empty rule
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


