package org.evoservice.wrapper;// ATM3v2_ATG.java automatically generated from ASM2CODE

/**
* This class allows you to simulate the behavior of an Abstract State Machine (ASM)
* without asking the user for input values â€‹â€‹of the monitored functions.
*
* <p>
* It has been optimized to be used with evosuite in order to automatically generate test scenarios.
* </p>
*/
class ATM3v2_ASM {
	private final ATM3v2 esecuzione;
	private int stato;

	/**
	* Constructor of the {@code ATM3v2_ASM} class. Creates a private instance of the asm
	* {@link ATM3v2} and sets the initial state of the state machine to 1.
	*/
	public ATM3v2_ASM() {
		this.esecuzione = new ATM3v2();
		this.stato = 0;
	}

	/** The step function is the only public method of the ASM,
	* it receives as parameters the values â€‹â€‹of the monitored functions to be updated 
	* and allows to perform a step of the asm by incrementing the state.
	*/
	public void step() {
		System.out.println("<State " + stato + " (controlled)>");
		printControlled();
		this.esecuzione.updateASM();
		System.out.println("</State " + stato + " (controlled)>");
		System.out.println("\n<Stato attuale>");
		printControlled();
		stato++;
	}

	// Controlled getters
	public ATM3v2.NumCard get_currCard() {
		return this.esecuzione.currCard.get();
	}

	public ATM3v2.State get_atmState() {
		return this.esecuzione.atmState.get();
	}

	public boolean get_accessible_card1() {
		return this.esecuzione.accessible.oldValues
				.get(this.esecuzione.NumCard_Class.get(this.esecuzione.NumCard_elemsList.indexOf("card1")));
	}

	public boolean get_accessible_card2() {
		return this.esecuzione.accessible.oldValues
				.get(this.esecuzione.NumCard_Class.get(this.esecuzione.NumCard_elemsList.indexOf("card2")));
	}

	public boolean get_accessible_card3() {
		return this.esecuzione.accessible.oldValues
				.get(this.esecuzione.NumCard_Class.get(this.esecuzione.NumCard_elemsList.indexOf("card3")));
	}

	public int get_moneyLeft() {
		return this.esecuzione.moneyLeft.get();
	}

	public int get_balance_card1() {
		return this.esecuzione.balance.oldValues
				.get(this.esecuzione.NumCard_Class.get(this.esecuzione.NumCard_elemsList.indexOf("card1")));
	}

	public int get_balance_card2() {
		return this.esecuzione.balance.oldValues
				.get(this.esecuzione.NumCard_Class.get(this.esecuzione.NumCard_elemsList.indexOf("card2")));
	}

	public int get_balance_card3() {
		return this.esecuzione.balance.oldValues
				.get(this.esecuzione.NumCard_Class.get(this.esecuzione.NumCard_elemsList.indexOf("card3")));
	}

	public int get_numOfBalanceChecks() {
		return this.esecuzione.numOfBalanceChecks.get();
	}


	// ASM Methods
	private void printControlled() {
		System.out.print("NumCard" + " = {");
		for (int i = 0; i < esecuzione.NumCard_elemsList.size(); i++)
			if (i != esecuzione.NumCard_elemsList.size() - 1)
				System.out.print(esecuzione.NumCard_elemsList.get(i) + ", ");
			else
				System.out.print(esecuzione.NumCard_elemsList.get(i));
		System.out.println("}");
		System.out.println("atmState = " + esecuzione.atmState.oldValue.name());
		System.out.println("moneyLeft = " + esecuzione.moneyLeft.get());
		System.out.println("numOfBalanceChecks = " + esecuzione.numOfBalanceChecks.get());
	}

// Monitored setters

	public void set_insertedCard(String insertedCard) {
		this.esecuzione.insertedCard.set(
				this.esecuzione.NumCard_Class.get(
						this.esecuzione.NumCard_elemsList.indexOf(insertedCard)));
		System.out.println("Set insertedCard = " + insertedCard);
	}

	public void set_insertedPin(int insertedPin) {
		this.esecuzione.insertedPin.set(insertedPin);
		System.out.println("Set insertedPin = " + insertedPin);
	}

	public void set_selectedService(ATM3v2.Service selectedService) {
		this.esecuzione.selectedService.set(selectedService);
		System.out.println("Set selectedService = " + selectedService);
	}

	public void set_insertMoneySizeStandard(int insertMoneySizeStandard) {
		this.esecuzione.insertMoneySizeStandard.set(
				ATM3v2.MoneySize.valueOf(
						this.esecuzione.MoneySize_elems.get(
								insertMoneySizeStandard - this.esecuzione.MoneySize_elems.get(0))));
		System.out.println("Set insertMoneySizeStandard = " + insertMoneySizeStandard);
	}

	public void set_insertMoneySizeOther(int insertMoneySizeOther) {
		this.esecuzione.insertMoneySizeOther.set(insertMoneySizeOther);
		System.out.println("Set insertMoneySizeOther = " + insertMoneySizeOther);
	}

	public void set_standardOrOther(ATM3v2.MoneySizeSelection standardOrOther) {
		this.esecuzione.standardOrOther.set(standardOrOther);
		System.out.println("Set standardOrOther = " + standardOrOther);
	}

}
