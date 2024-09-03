package org.evoservice.atm3;
// ATM3_ASM.java automatically generated from ASM2CODE

import java.util.Scanner;

/**
 * This class allows you to simulate the behavior of an Abstract State Machine (ASM)
 * without asking the user for input values ​​of the monitored functions.
 *
 * <p>
 * It has been optimized to be used with evosuite in order to automatically generate test scenarios.
 * </p>
 */
class ATM3_ASM {

	private final ATM3 esecuzione;
	private int stato;

	/**
	 * Constructor of the {@code ATM3_ASM} class. Creates a private instance of the asm
	 * {@link ATM3} and sets the initial state of the state machine to 1.
	 */
	public ATM3_ASM(){
		this.esecuzione = new ATM3();
		this.stato = 0;
	}

	/** The step function is the only public method of the ASM,
	 * it receives as parameters the values ​​of the monitored functions to be updated
	 * and allows to perform a step of the asm by incrementing the state.
	 */
	public void step(
			int insertedCard,
			int insertedPin,
			ATM3.Service selectedService,
			int insertMoneySizeStandard,
			int insertMoneySizeOther,
			ATM3.MoneySizeSelection standardOrOther){
		System.out.println("<State "+ stato +" (controlled)>");

		printControlled();
		setMonitored(
				insertedCard,
				insertedPin,
				selectedService,
				insertMoneySizeStandard,
				insertMoneySizeOther,
				standardOrOther);
		this.esecuzione.updateASM();

		System.out.println("</State "+ stato +" (controlled)>");

		System.out.println("\n<Stato attuale>");
		printControlled();

		/* monitored */
		coverMonitored();
		/* controlled */
		coverControlled();
		stato++;
	}
	// Monitored getters
	private ATM3.NumCard get_insertedCard(){
		return this.esecuzione.insertedCard.get();
	}

	private int get_insertedPin(){
		return this.esecuzione.insertedPin.get();
	}

	private ATM3.Service get_selectedService(){
		return this.esecuzione.selectedService.get();
	}

	private int get_insertMoneySizeStandard(){
		return this.esecuzione.insertMoneySizeStandard.get().value;
	}

	private int get_insertMoneySizeOther(){
		return this.esecuzione.insertMoneySizeOther.get();
	}

	private ATM3.MoneySizeSelection get_standardOrOther(){
		return this.esecuzione.standardOrOther.get();
	}

	// Controlled getters

	public ATM3.NumCard get_currCard(){
		return this.esecuzione.currCard.get();
	}

	public ATM3.State get_atmState(){
		return this.esecuzione.atmState.get();
	}

	public int get_moneyLeft(){
		return this.esecuzione.moneyLeft.get();
	}

	public int get_numOfBalanceChecks(){
		return this.esecuzione.numOfBalanceChecks.get();
	}

	// Cover functions

	private void coverMonitored(){
		cover_insertedCard();
		cover_insertedPin();
		cover_selectedService();
		cover_insertMoneySizeStandard();
		cover_insertMoneySizeOther();
		cover_standardOrOther();
	}

	private void coverControlled(){
		cover_currCard();
		cover_atmState();
		cover_accessible();
		cover_moneyLeft();
		cover_balance();
		cover_numOfBalanceChecks();
	}

	private void cover_currCard(){
		this.get_currCard();
		//1 Branch covered
	}

	private void cover_atmState(){
		switch(this.get_atmState()){
			case AWAITCARD :
				System.out.println("Branch State AWAITCARD covered");
				// Branch State AWAITCARD covered
				break;
			case AWAITPIN :
				System.out.println("Branch State AWAITPIN covered");
				// Branch State AWAITPIN covered
				break;
			case CHOOSE :
				System.out.println("Branch State CHOOSE covered");
				// Branch State CHOOSE covered
				break;
			case OUTOFSERVICE :
				System.out.println("Branch State OUTOFSERVICE covered");
				// Branch State OUTOFSERVICE covered
				break;
			case CHOOSEAMOUNT :
				System.out.println("Branch State CHOOSEAMOUNT covered");
				// Branch State CHOOSEAMOUNT covered
				break;
			case STANDARDAMOUNTSELECTION :
				System.out.println("Branch State STANDARDAMOUNTSELECTION covered");
				// Branch State STANDARDAMOUNTSELECTION covered
				break;
			case OTHERAMOUNTSELECTION :
				System.out.println("Branch State OTHERAMOUNTSELECTION covered");
				// Branch State OTHERAMOUNTSELECTION covered
				break;
		}
	}

	private void cover_accessible(){
		this.get_accessible();
		//1 Branch covered
	}

	private void cover_moneyLeft(){
		this.get_moneyLeft();
		//1 Branch covered
	}

	private void cover_balance(){
		this.get_balance();
		//1 Branch covered
	}

	private void cover_numOfBalanceChecks(){
		this.get_numOfBalanceChecks();
		//1 Branch covered
	}

	private void cover_insertedCard(){
		this.get_insertedCard();
		//1 Branch covered
	}

	private void cover_insertedPin(){
		this.get_insertedPin();
		//1 Branch covered
	}

	private void cover_selectedService(){
		switch(this.get_selectedService()){
			case BALANCE :
				System.out.println("Branch Service BALANCE covered");
				// Branch Service BALANCE covered
				break;
			case WITHDRAWAL :
				System.out.println("Branch Service WITHDRAWAL covered");
				// Branch Service WITHDRAWAL covered
				break;
			case EXIT :
				System.out.println("Branch Service EXIT covered");
				// Branch Service EXIT covered
				break;
		}
	}

	private void cover_insertMoneySizeStandard(){
		this.get_insertMoneySizeStandard();
		//1 Branch covered
	}

	private void cover_insertMoneySizeOther(){
		this.get_insertMoneySizeOther();
		//1 Branch covered
	}

	private void cover_standardOrOther(){
		switch(this.get_standardOrOther()){
			case STANDARD :
				System.out.println("Branch MoneySizeSelection STANDARD covered");
				// Branch MoneySizeSelection STANDARD covered
				break;
			case OTHER :
				System.out.println("Branch MoneySizeSelection OTHER covered");
				// Branch MoneySizeSelection OTHER covered
				break;
		}
	}


	// ASM Methods

	private void printControlled() {

		System.out.print("NumCard"+ " = {");
		for(int i=0 ; i< esecuzione.NumCard_elemsList.size(); i++)
			if(i!= esecuzione.NumCard_elemsList.size()-1)
				System.out.print(esecuzione.NumCard_elemsList.get(i) +", ");
			else
				System.out.print(esecuzione.NumCard_elemsList.get(i));
		System.out.println("}");
		System.out.println("atmState = " + esecuzione.atmState.oldValue.name());
		System.out.println("moneyLeft = " + esecuzione.moneyLeft.get());
		System.out.println("numOfBalanceChecks = " + esecuzione.numOfBalanceChecks.get());

	}

	private void setMonitored(
			int insertedCard,
			int insertedPin,
			ATM3.Service selectedService,
			int insertMoneySizeStandard,
			int insertMoneySizeOther,
			ATM3.MoneySizeSelection standardOrOther) {

		this.esecuzione.insertedCard.set(this.esecuzione.NumCard_Class.get(insertedCard));
		System.out.println("Set insertedCard = " + insertedCard);

		this.esecuzione.insertedPin.set(insertedPin);
		System.out.println("Set insertedPin = " + insertedPin);

		this.esecuzione.selectedService.set(selectedService);
		System.out.println("Set selectedService = " + selectedService);

		this.esecuzione.insertMoneySizeStandard.set(
				ATM3.MoneySize.valueOf(
						this.esecuzione.MoneySize_elems.get(
								insertMoneySizeStandard - this.esecuzione.MoneySize_elems.get(0))));
		System.out.println("Set insertMoneySizeStandard = " + insertMoneySizeStandard);

		this.esecuzione.insertMoneySizeOther.set(insertMoneySizeOther);
		System.out.println("Set insertMoneySizeOther = " + insertMoneySizeOther);

		this.esecuzione.standardOrOther.set(standardOrOther);
		System.out.println("Set standardOrOther = " + standardOrOther);

	}
}
