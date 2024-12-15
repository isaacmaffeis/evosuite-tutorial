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
		cover_rules();
		stato++;
	}

	private void cover_rules(){
		cover_r_main();
		cover_r_prelievo();
		cover_r_processMoneyRequest();
		cover_r_grantMoney();
		cover_r_chooseAmount();
		cover_r_chooseService();
		cover_r_enterPin();
		cover_r_insertcard();
		cover_r_goOutOfService();
		cover_r_subtractFrom();
	}

	private void cover_r_main() {
		if(this.esecuzione.cover_r_Main){
			System.out.println("r_Main covered");
		}
		if(this.esecuzione.cover_r_Main_1){
			System.out.println("r_Main_1 covered");
		}
		if(this.esecuzione.cover_r_Main_2){
			System.out.println("r_Main_2 covered");
		}
		if(this.esecuzione.cover_r_Main_3){
			System.out.println("r_Main_3 covered");
		}
	}

	private void cover_r_prelievo() {
		if(this.esecuzione.cover_r_prelievo){
			System.out.println("r_prelievo covered");
		}
		if(this.esecuzione.cover_r_prelievo_1){
			System.out.println("r_prelievo_1 covered");
		}
		if(this.esecuzione.cover_r_prelievo_2){
			System.out.println("r_prelievo_2 covered");
		}
		if(this.esecuzione.cover_r_prelievo_3){
			System.out.println("r_prelievo_3 covered");
		}
		if(this.esecuzione.cover_r_prelievo_4){
			System.out.println("r_prelievo_4 covered");
		}
		if(this.esecuzione.cover_r_prelievo_5){
			System.out.println("r_prelievo_5 covered");
		}
		if(this.esecuzione.cover_r_prelievo_6){
			System.out.println("r_prelievo_6 covered");
		}
	}

	private void cover_r_processMoneyRequest() {
		if(this.esecuzione.cover_r_processMoneyRequest){
			System.out.println("r_processMoneyRequest covered");
		}
		if(this.esecuzione.cover_r_processMoneyRequest_1){
			System.out.println("r_processMoneyRequest_1 covered");
		}
	}

	private void cover_r_grantMoney() {
		if(this.esecuzione.cover_r_grantMoney){
			System.out.println("r_grantMoney covered");
		}
	}

	private void cover_r_chooseAmount() {
		if(this.esecuzione.cover_r_chooseAmount){
			System.out.println("r_chooseAmount covered");
		}
		if(this.esecuzione.cover_r_chooseAmount_1){
			System.out.println("r_chooseAmount_1 covered");
		}
		if(this.esecuzione.cover_r_chooseAmount_2){
			System.out.println("r_chooseAmount_2 covered");
		}
		if(this.esecuzione.cover_r_chooseAmount_3){
			System.out.println("r_chooseAmount_3 covered");
		}
	}

	private void cover_r_chooseService() {
		if(this.esecuzione.cover_r_chooseService){
			System.out.println("r_chooseService covered");
		}
		if(this.esecuzione.cover_r_chooseService_1){
			System.out.println("r_chooseService_1 covered");
		}
		if(this.esecuzione.cover_r_chooseService_2){
			System.out.println("r_chooseService_2 covered");
		}
		if(this.esecuzione.cover_r_chooseService_3){
			System.out.println("r_chooseService_3 covered");
		}
		if(this.esecuzione.cover_r_chooseService_4){
			System.out.println("r_chooseService_4 covered");
		}
		if(this.esecuzione.cover_r_chooseService_5){
			System.out.println("r_chooseService_5 covered");
		}
		if(this.esecuzione.cover_r_chooseService_6){
			System.out.println("r_chooseService_6 covered");
		}
	}


	private void cover_r_enterPin() {
		if(this.esecuzione.cover_r_enterPin){
			System.out.println("r_enterPin covered");
		}
		if(this.esecuzione.cover_r_enterPin_1){
			System.out.println("r_enterPin_1 covered");
		}
		if(this.esecuzione.cover_r_enterPin_2){
			System.out.println("r_enterPin_2 covered");
		}
		if(this.esecuzione.cover_r_enterPin_3){
			System.out.println("r_enterPin_3 covered");
		}
	}

	private void cover_r_insertcard() {
		if(this.esecuzione.cover_r_insertcard){
			System.out.println("r_insertcard covered");
		}
		if(this.esecuzione.cover_r_insertcard_1){
			System.out.println("r_insertcard_1 covered");
		}
		if(this.esecuzione.cover_r_insertcard_2){
			System.out.println("r_insertcard_2 covered");
		}
	}

	private void cover_r_goOutOfService() {
		if(this.esecuzione.cover_r_goOutOfService){
			System.out.println("r_goOutOfService covered");
		}
	}

	private void cover_r_subtractFrom() {
		if(this.esecuzione.cover_r_subtractFrom){
			System.out.println("r_subtractFrom covered");
		}
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
