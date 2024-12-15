package org.evoservice.wrapper;
// ATM3v2.java automatically generated from ASM2CODE
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.List;

import org.apache.commons.collections4.Bag;

abstract class ATM3v2Sig {
	/////////////////////////////////////////////////
	/// DOMAIN CONTAINERS
	/////////////////////////////////////////////////
	/* Domain containers here */
	//Variabile di tipo astratto
	static class NumCard {
		static List<NumCard> elems = new ArrayList<>();
		static List<String> val = new ArrayList<>();

		NumCard(String a) {
			elems.add(this);
			val.add(a);
		}

		String toString(NumCard a) {
			if (elems.contains(a)) {
				return val.get(elems.lastIndexOf(a));
			} else
				return null;
		}

		NumCard get(String a) {
			if (val.contains(a)) {
				return elems.get(val.lastIndexOf(a));
			} else
				return null;
		}
	}

	List<String> NumCard_elemsList = new ArrayList<>();
	List<NumCard> NumCard_Class = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	enum State {
		AWAITCARD, AWAITPIN, CHOOSE, OUTOFSERVICE, CHOOSEAMOUNT, STANDARDAMOUNTSELECTION, OTHERAMOUNTSELECTION
	}

	List<State> State_elemsList = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	static class MoneySize {
		static List<Integer> elems = new ArrayList<>();
		Integer value;

		static MoneySize valueOf(Integer val) {
			MoneySize n = new MoneySize();
			n.value = val;
			return n;
		}

		static MoneySize valueOf(MoneySize val) {
			return val;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof MoneySize))
				return false;
			return value.equals(((MoneySize) obj).value);
		}

		@Override
		public int hashCode() {
			return value.hashCode();
		}
	}

	MoneySize MoneySize_elem = new MoneySize();
	List<Integer> MoneySize_elems = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	enum Service {
		BALANCE, WITHDRAWAL, EXIT
	}

	List<Service> Service_elemsList = new ArrayList<>();

	//Variabile di tipo Concreto o Enumerativo
	enum MoneySizeSelection {
		STANDARD, OTHER
	}

	List<MoneySizeSelection> MoneySizeSelection_elemsList = new ArrayList<>();

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
	Fun0Ctrl<NumCard> currCard = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<State> atmState = new Fun0Ctrl<>();

	//Funzione di tipo statico
	abstract Integer pin(NumCard param0_pin);

	//Funzione di tipo Controlled
	FunNCtrl<NumCard, Boolean> accessible = new FunNCtrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<Integer> moneyLeft = new Fun0Ctrl<>();
	//Funzione di tipo Controlled
	FunNCtrl<NumCard, Integer> balance = new FunNCtrl<>();
	//Funzione di tipo Controlled
	Fun0Ctrl<Integer> numOfBalanceChecks = new Fun0Ctrl<>();
	//Funzione di tipo monitored
	Fun0<NumCard> insertedCard = new Fun0<>();
	//Funzione di tipo monitored
	Fun0<Integer> insertedPin = new Fun0<>();
	//Funzione di tipo monitored
	Fun0<Service> selectedService = new Fun0<>();
	//Funzione di tipo monitored
	Fun0<MoneySize> insertMoneySizeStandard = new Fun0<>();
	MoneySize insertMoneySizeStandard_supporto = new MoneySize();
	//Funzione di tipo monitored
	Fun0<Integer> insertMoneySizeOther = new Fun0<>();
	//Funzione di tipo monitored
	Fun0<MoneySizeSelection> standardOrOther = new Fun0<>();

	//Funzione di tipo derived
	abstract Boolean allowed(NumCard param0_allowed, Integer param1_allowed);

	//Funzione di tipo statico
	static NumCard card1;
	//Funzione di tipo statico
	static NumCard card2;
	//Funzione di tipo statico
	static NumCard card3;

	//Funzione di tipo statico
	abstract Integer minMoney();

	//Funzione di tipo statico
	abstract Integer maxPrelievo();

	////////////////////////////////////////////////
	/// RULE DEFINITION
	/////////////////////////////////////////////////
	/* Rule definition here */
	abstract void r_subtractFrom(NumCard _c, Integer _m);

	abstract void r_goOutOfService();

	abstract void r_insertcard();

	abstract void r_enterPin();

	abstract void r_chooseService();

	abstract void r_chooseAmount();

	abstract void r_grantMoney(Integer _m);

	abstract void r_processMoneyRequest(Integer _m);

	abstract void r_prelievo();

	abstract void r_Main();
}

class ATM3v2 extends ATM3v2Sig {
	// Inizializzazione di funzioni e domini
	ATM3v2() {
		//Definizione iniziale dei domini statici
		MoneySize.elems = Collections.unmodifiableList(Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
				23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48,
				49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
				75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100,
				101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121,
				122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142,
				143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163,
				164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184,
				185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200));
		MoneySize_elems = Collections.unmodifiableList(Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
				23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48,
				49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
				75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100,
				101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121,
				122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142,
				143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163,
				164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184,
				185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200));
		State_elemsList = Collections.unmodifiableList(Arrays.asList(State.AWAITCARD, State.AWAITPIN, State.CHOOSE,
				State.OUTOFSERVICE, State.CHOOSEAMOUNT, State.STANDARDAMOUNTSELECTION, State.OTHERAMOUNTSELECTION));
		Service_elemsList = Collections
				.unmodifiableList(Arrays.asList(Service.BALANCE, Service.WITHDRAWAL, Service.EXIT));
		MoneySizeSelection_elemsList = Collections
				.unmodifiableList(Arrays.asList(MoneySizeSelection.STANDARD, MoneySizeSelection.OTHER));
		//Definizione iniziale dei domini dinamici
		//Definizione iniziale dei domini astratti con funzini statiche
		card1 = new NumCard("card1");
		NumCard_elemsList.add("card1");
		NumCard_Class.add(card1);
		card2 = new NumCard("card2");
		NumCard_elemsList.add("card2");
		NumCard_Class.add(card2);
		card3 = new NumCard("card3");
		NumCard_elemsList.add("card3");
		NumCard_Class.add(card3);
		//Inizializzazione delle funzioni
		atmState.oldValue = atmState.newValue = State.AWAITCARD;
		moneyLeft.oldValue = moneyLeft.newValue = 1000;
		for (NumCard _c : NumCard.elems) {
			Integer a = null;
			if (_c.toString(_c).equals("card1"))
				a = 3000;
			else if (_c.toString(_c).equals("card2"))
				a = 1652;
			else if (_c.toString(_c).equals("card3"))
				a = 548;
			;
			balance.oldValues.put(_c, a);
			balance.newValues.put(_c, a);
		}
		for (NumCard _c : NumCard.elems) {
			Boolean a = true;
			accessible.oldValues.put(_c, a);
			accessible.newValues.put(_c, a);
		}
		numOfBalanceChecks.oldValue = numOfBalanceChecks.newValue = 0;
	}

	// Definizione delle funzioni statiche
	Integer minMoney() {
		return 200;
	}

	Integer maxPrelievo() {
		return 1000;
	}

	Integer pin(NumCard _c) {
		if (_c == card1)
			return 1;
		else if (_c == card2)
			return 2;
		else if (_c == card3)
			return 3;
		return null;
	}

	Boolean allowed(NumCard _c, Integer _m) {
		return (balance.get(_c) >= _m);
	}

	// Conversione delle regole ASM in metodi java

	boolean cover_r_subtractFrom = false;

	@Override
	void r_subtractFrom(NumCard _c, Integer _m) {
		cover_r_subtractFrom = true;
		balance.set(_c, (balance.get(_c) - _m));
	}

	boolean cover_r_goOutOfService = false;

	@Override
	void r_goOutOfService() {
		cover_r_goOutOfService = true;
		atmState.set(State.OUTOFSERVICE);
	}

	boolean cover_r_insertcard = false;
	boolean cover_r_insertcard_1 = false;
	boolean cover_r_insertcard_2 = false;

	@Override
	void r_insertcard() {
		cover_r_insertcard = true;
		if (Boolean.TRUE.equals((atmState.get() == State.AWAITCARD))) {
			cover_r_insertcard_1 = true;
			if (Boolean.TRUE.equals(
					NumCard.elems.stream().anyMatch(c -> c.toString(c).equals(insertedCard.get().toString(c))))) {
				cover_r_insertcard_2 = true;
				//{ //par
				currCard.set(insertedCard.get());
				atmState.set(State.AWAITPIN);
				//} //endpar
			}
		}
	}

	boolean cover_r_enterPin = false;
	boolean cover_r_enterPin_1 = false;
	boolean cover_r_enterPin_2 = false;
	boolean cover_r_enterPin_3 = false;

	@Override
	void r_enterPin() {
		cover_r_enterPin = true;
		if (Boolean.TRUE.equals((atmState.get() == State.AWAITPIN))) {
			cover_r_enterPin_1 = true;
			if (Boolean.TRUE.equals((insertedPin.get() == pin(currCard.get())) && accessible.get(currCard.get()))) {
				cover_r_enterPin_2 = true;
				//{ //par
				atmState.set(State.CHOOSE);
				numOfBalanceChecks.set(0);
				//} //endpar
			} else {
				cover_r_enterPin_3 = true;
				atmState.set(State.AWAITCARD);
			}
		}
	}

	boolean cover_r_chooseService = false;
	boolean cover_r_chooseService_1 = false;
	boolean cover_r_chooseService_2 = false;
	boolean cover_r_chooseService_3 = false;
	boolean cover_r_chooseService_4 = false;
	boolean cover_r_chooseService_5 = false;
	boolean cover_r_chooseService_6 = false;

	@Override
	void r_chooseService() {
		cover_r_chooseService = true;
		if (Boolean.TRUE.equals((atmState.get() == State.CHOOSE))) {
			cover_r_chooseService_1 = true;
			//{ //par
			if (Boolean.TRUE.equals((selectedService.get() == Service.BALANCE))) {
				cover_r_chooseService_2 = true;
				if (Boolean.TRUE.equals((numOfBalanceChecks.get() == 0))) {
					cover_r_chooseService_3 = true;
					numOfBalanceChecks.set((numOfBalanceChecks.get() + 1));
				} else {
					cover_r_chooseService_4 = true;
					atmState.set(State.AWAITCARD);
				}
			}
			if (Boolean.TRUE.equals((selectedService.get() == Service.WITHDRAWAL))) {
				cover_r_chooseService_5 = true;
				atmState.set(State.CHOOSEAMOUNT);
			}
			if (Boolean.TRUE.equals((selectedService.get() == Service.EXIT))) {
				cover_r_chooseService_6 = true;
				atmState.set(State.AWAITCARD);
			}
			//} //endpar
		}
	}

	boolean cover_r_chooseAmount = false;
	boolean cover_r_chooseAmount_1 = false;
	boolean cover_r_chooseAmount_2 = false;
	boolean cover_r_chooseAmount_3 = false;

	@Override
	void r_chooseAmount() {
		cover_r_chooseAmount = true;
		if (Boolean.TRUE.equals((atmState.get() == State.CHOOSEAMOUNT))) {
			cover_r_chooseAmount_1 = true;
			//{ //par
			if (Boolean.TRUE.equals((standardOrOther.get() == MoneySizeSelection.STANDARD))) {
				cover_r_chooseAmount_2 = true;
				atmState.set(State.STANDARDAMOUNTSELECTION);
			}
			if (Boolean.TRUE.equals((standardOrOther.get() == MoneySizeSelection.OTHER))) {
				cover_r_chooseAmount_3 = true;
				atmState.set(State.OTHERAMOUNTSELECTION);
			}
			//} //endpar
		}
	}

	boolean cover_r_grantMoney = false;

	@Override
	void r_grantMoney(Integer _m) {
		cover_r_grantMoney = true;
		//{ //par
		accessible.set(currCard.get(), false);
		r_subtractFrom(currCard.get(), _m);
		moneyLeft.set((moneyLeft.get() - _m));
		atmState.set(State.AWAITCARD);
		//} //endpar
	}

	boolean cover_r_processMoneyRequest = false;
	boolean cover_r_processMoneyRequest_1 = false;

	@Override
	void r_processMoneyRequest(Integer _m) {
		cover_r_processMoneyRequest = true;
		if (Boolean.TRUE.equals(allowed(currCard.get(), _m))) {
			cover_r_processMoneyRequest_1 = true;
			r_grantMoney(_m);
		}
	}

	boolean cover_r_prelievo = false;
	boolean cover_r_prelievo_1 = false;
	boolean cover_r_prelievo_2 = false;
	boolean cover_r_prelievo_3 = false;
	boolean cover_r_prelievo_4 = false;
	boolean cover_r_prelievo_5 = false;
	boolean cover_r_prelievo_6 = false;

	@Override
	void r_prelievo() {
		cover_r_prelievo = true;
		//{ //par
		if (Boolean.TRUE.equals((atmState.get() == State.STANDARDAMOUNTSELECTION))) {
			cover_r_prelievo_1 = true;
			if (Boolean.TRUE.equals(MoneySize.elems.stream().anyMatch(c -> c.equals(insertMoneySizeStandard.get().value)))) {
				cover_r_prelievo_2 = true;
				if (Boolean.TRUE.equals((insertMoneySizeStandard.get().value <= moneyLeft.get()))) {
					cover_r_prelievo_3 = true;
					r_processMoneyRequest(insertMoneySizeStandard.get().value);
				}
			}
		}
		if (Boolean.TRUE.equals((atmState.get() == State.OTHERAMOUNTSELECTION))) {
			cover_r_prelievo_4 = true;
			if (Boolean.TRUE.equals(((insertMoneySizeOther.get() % 10) == 0))) {
				cover_r_prelievo_5 = true;
				if (Boolean.TRUE.equals((insertMoneySizeOther.get() <= moneyLeft.get()))) {
					cover_r_prelievo_6 = true;
					r_processMoneyRequest(insertMoneySizeOther.get());
				}
			}
		}
		//} //endpar
	}

	boolean cover_r_Main = false;
	boolean cover_r_Main_1 = false;
	boolean cover_r_Main_2 = false;
	boolean cover_r_Main_3 = false;


	@Override
	void r_Main() {
		cover_r_Main = true;
		if (Boolean.TRUE.equals((moneyLeft.get() < minMoney()))) {
			cover_r_Main_1 = true;
			r_goOutOfService();
		} else {
			cover_r_Main_2 = true;
			//{ //par
			r_insertcard();
			r_enterPin();
			r_chooseService();
			r_chooseAmount();
			//{ //seq
			r_prelievo();
			fireUpdateSet();
			if (Boolean.TRUE.equals(!accessible.get(currCard.get()))) {
				cover_r_Main_3 = true;
				accessible.set(currCard.get(), true);
				accessible.oldValues = accessible.newValues;
			}
			fireUpdateSet();
			//} //endseq
			//} //endpar
		}
	}

	// inizializazzione delle funzioni controllate che contengono metodi monitorati nei temini iniziali
	void initControlledWithMonitored() {
		// No controlled functions initialized with monitored ones have been found
	}

	// applicazione dell'aggiornamento del set
	void fireUpdateSet() {
		currCard.oldValue = currCard.newValue;
		atmState.oldValue = atmState.newValue;
		accessible.oldValues = accessible.newValues;
		moneyLeft.oldValue = moneyLeft.newValue;
		balance.oldValues = balance.newValues;
		numOfBalanceChecks.oldValue = numOfBalanceChecks.newValue;
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
