package org.evoservice.cashpoint;
// CashPointv3_ASM.java automatically generated from ASM2CODE

import java.util.Scanner;

/**
 * This class allows you to simulate the behavior of an Abstract State Machine (ASM)
 * without asking the user for input values ​​of the monitored functions.
 *
 * <p>
 * It has been optimized to be used with evosuite in order to automatically generate test scenarios.
 * </p>
 */
class CashPointv3_ASM {

	private final CashPointv3 esecuzione;
	private int stato;

	/**
	 * Constructor of the {@code CashPointv3_ASM} class. Creates a private instance of the asm
	 * {@link CashPointv3} and sets the initial state of the state machine to 1.
	 */
	public CashPointv3_ASM(){
		this.esecuzione = new CashPointv3();
		this.stato = 0;
	}

	/** The step function is the only public method of the ASM,
	 * it receives as parameters the values ​​of the monitored functions to be updated
	 * and allows to perform a step of the asm by incrementing the state.
	 */
	public void step(
			int enteredPin_till1,
			int amount_till1,
			String currentDate){
		System.out.println("<State "+ stato +" (controlled)>");

		printControlled();
		setMonitored(
				enteredPin_till1,
				amount_till1,
				currentDate);
		this.esecuzione.updateASM();

		System.out.println("</State "+ stato +" (controlled)>");

		System.out.println("\n<Stato attuale>");
		printControlled();

		/* monitored */
		coverMonitored();
		/* controlled */
		coverControlled();
		if(isStatoFinale()){
			System.out.println("\n<Stato finale>");
		} else
			stato++;
	}

	public boolean isStatoFinale() {
		return stato>=5 && get_balance_account1()<=500;
	}


	// Monitored getters
	private int get_enteredPin_till1(){
		return this.esecuzione.enteredPin.get(
				this.esecuzione.Till_Class.get(
						this.esecuzione.Till_elemsList.indexOf("till1"))).value;
	}

	private int get_amount_till1(){
		return this.esecuzione.amount.get(
				this.esecuzione.Till_Class.get(
						this.esecuzione.Till_elemsList.indexOf("till1")));
	}

	private CashPointv3.Date get_currentDate(){
		return this.esecuzione.currentDate.get();
	}

	// Controlled getters

	public CashPointv3.TillState get_tillState_till1(){
		return this.esecuzione.tillState.oldValues.get(
				this.esecuzione.Till_Class.get(
						this.esecuzione.Till_elemsList.indexOf("till1")));
	}

	public int get_balance_account1(){
		return this.esecuzione.balance.oldValues.get(
				this.esecuzione.Account_Class.get(
						this.esecuzione.Account_elemsList.indexOf("account1")));
	}

	public boolean get_legalCard_card1(){
		return this.esecuzione.legalCard.oldValues.get(
				this.esecuzione.Card_Class.get(
						this.esecuzione.Card_elemsList.indexOf("card1")));
	}

	public boolean get_legalCard_card2(){
		return this.esecuzione.legalCard.oldValues.get(
				this.esecuzione.Card_Class.get(
						this.esecuzione.Card_elemsList.indexOf("card2")));
	}

	public int get_daily_withdraw_sum_card1(){
		return this.esecuzione.daily_withdraw_sum.oldValues.get(
				this.esecuzione.Card_Class.get(
						this.esecuzione.Card_elemsList.indexOf("card1")));
	}

	public int get_daily_withdraw_sum_card2(){
		return this.esecuzione.daily_withdraw_sum.oldValues.get(
				this.esecuzione.Card_Class.get(
						this.esecuzione.Card_elemsList.indexOf("card2")));
	}

	public CashPointv3.Card get_insertedCard_till1(){
		return this.esecuzione.insertedCard.oldValues.get(
				this.esecuzione.Till_Class.get(
						this.esecuzione.Till_elemsList.indexOf("till1")));
	}

	public CashPointv3.Date get_cardLastUseDate_card1(){
		return this.esecuzione.cardLastUseDate.oldValues.get(
				this.esecuzione.Card_Class.get(
						this.esecuzione.Card_elemsList.indexOf("card1")));
	}

	public CashPointv3.Date get_cardLastUseDate_card2(){
		return this.esecuzione.cardLastUseDate.oldValues.get(
				this.esecuzione.Card_Class.get(
						this.esecuzione.Card_elemsList.indexOf("card2")));
	}

	// Cover functions

	private void coverMonitored(){
		cover_enteredPin();
		cover_amount();
		cover_currentDate();
	}

	private void coverControlled(){
		cover_tillState();
		cover_balance();
		cover_legalCard();
		cover_daily_withdraw_sum();
		cover_insertedCard();
		cover_cardLastUseDate();
	}

	private void cover_tillState(){
		switch(this.esecuzione.tillState.get(
				this.esecuzione.Till_Class.get(
						this.esecuzione.Till_elemsList.indexOf("till1")))){
			case WAITCARD :
				System.out.println("Branch till1 WAITCARD covered");
				// Branch till1 WAITCARD covered
				break;
			case WAITPIN :
				System.out.println("Branch till1 WAITPIN covered");
				// Branch till1 WAITPIN covered
				break;
			case VALIDPIN :
				System.out.println("Branch till1 VALIDPIN covered");
				// Branch till1 VALIDPIN covered
				break;
		}
		//3 Branch covered
	}

	private void cover_balance(){
		this.get_balance_account1();
		//1 Branch covered
	}

	private void cover_legalCard(){
		this.get_legalCard_card1();
		this.get_legalCard_card2();
		//2 Branch covered
	}

	private void cover_daily_withdraw_sum(){
		this.get_daily_withdraw_sum_card1();
		this.get_daily_withdraw_sum_card2();
		//2 Branch covered
	}

	private void cover_insertedCard(){
		this.get_insertedCard_till1();
		//1 Branch covered
	}

	private void cover_enteredPin(){
		this.get_enteredPin_till1();
		//1 Branch covered
	}

	private void cover_amount(){
		this.get_amount_till1();
		//1 Branch covered
	}

	private void cover_currentDate(){
		this.get_currentDate();
		//1 Branch covered
	}

	private void cover_cardLastUseDate(){
		this.get_cardLastUseDate_card1();
		this.get_cardLastUseDate_card2();
		//2 Branch covered
	}


	// ASM Methods

	private void printControlled() {

		System.out.print("Account"+ " = {");
		for(int i=0 ; i< esecuzione.Account_elemsList.size(); i++)
			if(i!= esecuzione.Account_elemsList.size()-1)
				System.out.print(esecuzione.Account_elemsList.get(i) +", ");
			else
				System.out.print(esecuzione.Account_elemsList.get(i));
		System.out.println("}");
		System.out.print("Card"+ " = {");
		for(int i=0 ; i< esecuzione.Card_elemsList.size(); i++)
			if(i!= esecuzione.Card_elemsList.size()-1)
				System.out.print(esecuzione.Card_elemsList.get(i) +", ");
			else
				System.out.print(esecuzione.Card_elemsList.get(i));
		System.out.println("}");
		System.out.print("Till"+ " = {");
		for(int i=0 ; i< esecuzione.Till_elemsList.size(); i++)
			if(i!= esecuzione.Till_elemsList.size()-1)
				System.out.print(esecuzione.Till_elemsList.get(i) +", ");
			else
				System.out.print(esecuzione.Till_elemsList.get(i));
		System.out.println("}");
		System.out.print("Date"+ " = {");
		for(int i=0 ; i< esecuzione.Date_elemsList.size(); i++)
			if(i!= esecuzione.Date_elemsList.size()-1)
				System.out.print(esecuzione.Date_elemsList.get(i) +", ");
			else
				System.out.print(esecuzione.Date_elemsList.get(i));
		System.out.println("}");

	}

	private void setMonitored(
			int enteredPin_till1,
			int amount_till1,
			String currentDate) {

		this.esecuzione.enteredPin.set(
				this.esecuzione.Till_Class.get(
						this.esecuzione.Till_elemsList.indexOf("till1")),
				CashPointv3.PinDomain.valueOf(this.esecuzione.PinDomain_elems.get(enteredPin_till1)));
		System.out.println("Set enteredPin_till1 = " + enteredPin_till1);

		this.esecuzione.amount.set(
				this.esecuzione.Till_Class.get(
						this.esecuzione.Till_elemsList.indexOf("till1")),amount_till1);
		System.out.println("Set amount_till1 = " + amount_till1);

		this.esecuzione.currentDate.set(
				this.esecuzione.Date_Class.get(
						this.esecuzione.Date_elemsList.indexOf(currentDate)));
		System.out.println("Set currentDate = " + currentDate);

	}
}
