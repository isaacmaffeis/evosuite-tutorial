package org.evoservice.atm3;// ATM3_ATG.java automatically generated from ASM2CODE

/**
* This class is designed to simulate the behavior of an abstract state machine in an automated way.
*
* <p>
* It has been optimized to be used with evosuite in order to automatically generate test scenarios.
* </p>
*/
class ATM3_ATG {
	/** Instance of the asmeta specification translated into a java class.*/
	private final ATM3 execution;
	/** current state. */
	private int state;

	/**
	* Constructor of the {@code ATM3_ATG} class. Creates a private instance of the asm
	* {@link ATM3} and sets the initial state of the state machine to 0.
	*/
	public ATM3_ATG() {
		this.execution = new ATM3();
		this.state = 0;
	}

	/** The step function allows to perform a step of the asm by incrementing the state.
	*/
	public void step() {
		this.execution.updateASM();
		System.out.println("</State " + state + " >");
		// Cover the rules
		coverRules();
		// Cover the outputs
		coverOutputs();
		state++;
	}

	/* Cover the Rules */
	/**
	* Calls all rules covering functions.
	*/
	private void coverRules() {
		cover_r_insertcard_branches();
		cover_r_Main_branches();
		cover_r_chooseAmount_branches();
		cover_r_grantMoney_branches();
		cover_r_subtractFrom_branches();
		cover_r_processMoneyRequest_branches();
		cover_r_goOutOfService_branches();
		cover_r_prelievo_branches();
		cover_r_chooseService_branches();
		cover_r_enterPin_branches();
	}

	/**
	* Cover all the branches of the rule r_insertcard.
	*/
	private void cover_r_insertcard_branches() {
		if (this.execution.branch_r_insertcard_master) {
			System.out.println("branch_r_insertcard_master covered");
		}
		if (this.execution.branch_r_insertcard_1) {
			System.out.println("branch_r_insertcard_1 covered");
		}
		if (this.execution.branch_r_insertcard_2) {
			System.out.println("branch_r_insertcard_2 covered");
		}
	}

	/**
	* Cover all the branches of the rule r_Main.
	*/
	private void cover_r_Main_branches() {
		if (this.execution.branch_r_Main_master) {
			System.out.println("branch_r_Main_master covered");
		}
		if (this.execution.branch_r_Main_1) {
			System.out.println("branch_r_Main_1 covered");
		}
		if (this.execution.branch_r_Main_2) {
			System.out.println("branch_r_Main_2 covered");
		}
		if (this.execution.branch_r_Main_3) {
			System.out.println("branch_r_Main_3 covered");
		}
	}

	/**
	* Cover all the branches of the rule r_chooseAmount.
	*/
	private void cover_r_chooseAmount_branches() {
		if (this.execution.branch_r_chooseAmount_master) {
			System.out.println("branch_r_chooseAmount_master covered");
		}
		if (this.execution.branch_r_chooseAmount_1) {
			System.out.println("branch_r_chooseAmount_1 covered");
		}
		if (this.execution.branch_r_chooseAmount_2) {
			System.out.println("branch_r_chooseAmount_2 covered");
		}
		if (this.execution.branch_r_chooseAmount_3) {
			System.out.println("branch_r_chooseAmount_3 covered");
		}
	}

	/**
	* Cover all the branches of the rule r_grantMoney.
	*/
	private void cover_r_grantMoney_branches() {
		if (this.execution.branch_r_grantMoney_master) {
			System.out.println("branch_r_grantMoney_master covered");
		}
	}

	/**
	* Cover all the branches of the rule r_subtractFrom.
	*/
	private void cover_r_subtractFrom_branches() {
		if (this.execution.branch_r_subtractFrom_master) {
			System.out.println("branch_r_subtractFrom_master covered");
		}
	}

	/**
	* Cover all the branches of the rule r_processMoneyRequest.
	*/
	private void cover_r_processMoneyRequest_branches() {
		if (this.execution.branch_r_processMoneyRequest_master) {
			System.out.println("branch_r_processMoneyRequest_master covered");
		}
		if (this.execution.branch_r_processMoneyRequest_1) {
			System.out.println("branch_r_processMoneyRequest_1 covered");
		}
	}

	/**
	* Cover all the branches of the rule r_goOutOfService.
	*/
	private void cover_r_goOutOfService_branches() {
		if (this.execution.branch_r_goOutOfService_master) {
			System.out.println("branch_r_goOutOfService_master covered");
		}
	}

	/**
	* Cover all the branches of the rule r_prelievo.
	*/
	private void cover_r_prelievo_branches() {
		if (this.execution.branch_r_prelievo_master) {
			System.out.println("branch_r_prelievo_master covered");
		}
		if (this.execution.branch_r_prelievo_1) {
			System.out.println("branch_r_prelievo_1 covered");
		}
		if (this.execution.branch_r_prelievo_2) {
			System.out.println("branch_r_prelievo_2 covered");
		}
		if (this.execution.branch_r_prelievo_3) {
			System.out.println("branch_r_prelievo_3 covered");
		}
		if (this.execution.branch_r_prelievo_4) {
			System.out.println("branch_r_prelievo_4 covered");
		}
		if (this.execution.branch_r_prelievo_5) {
			System.out.println("branch_r_prelievo_5 covered");
		}
		if (this.execution.branch_r_prelievo_6) {
			System.out.println("branch_r_prelievo_6 covered");
		}
	}

	/**
	* Cover all the branches of the rule r_chooseService.
	*/
	private void cover_r_chooseService_branches() {
		if (this.execution.branch_r_chooseService_master) {
			System.out.println("branch_r_chooseService_master covered");
		}
		if (this.execution.branch_r_chooseService_1) {
			System.out.println("branch_r_chooseService_1 covered");
		}
		if (this.execution.branch_r_chooseService_2) {
			System.out.println("branch_r_chooseService_2 covered");
		}
		if (this.execution.branch_r_chooseService_3) {
			System.out.println("branch_r_chooseService_3 covered");
		}
		if (this.execution.branch_r_chooseService_4) {
			System.out.println("branch_r_chooseService_4 covered");
		}
		if (this.execution.branch_r_chooseService_5) {
			System.out.println("branch_r_chooseService_5 covered");
		}
		if (this.execution.branch_r_chooseService_6) {
			System.out.println("branch_r_chooseService_6 covered");
		}
	}

	/**
	* Cover all the branches of the rule r_enterPin.
	*/
	private void cover_r_enterPin_branches() {
		if (this.execution.branch_r_enterPin_master) {
			System.out.println("branch_r_enterPin_master covered");
		}
		if (this.execution.branch_r_enterPin_1) {
			System.out.println("branch_r_enterPin_1 covered");
		}
		if (this.execution.branch_r_enterPin_2) {
			System.out.println("branch_r_enterPin_2 covered");
		}
		if (this.execution.branch_r_enterPin_3) {
			System.out.println("branch_r_enterPin_3 covered");
		}
	}

	/* Cover the Outputs */
	// Monitored getters
	/**
	* Get the monitored function {@code selectedService}.
	*
	* @return the selected {@code ATM3.Service selectedService} selectedService
	*/
	private ATM3.Service get_selectedService() {
		return this.execution.selectedService.get();
	}

	/**
	* Get the monitored function {@code standardOrOther}.
	*
	* @return the selected {@code ATM3.MoneySizeSelection standardOrOther} standardOrOther
	*/
	private ATM3.MoneySizeSelection get_standardOrOther() {
		return this.execution.standardOrOther.get();
	}

	// Cover functions
	/**
	* Invokes all output coverage functions.
	* <p>
	* To achieve complete output coverage, only the functions related to the enum need to be invoked.
	* </p>
	*/
	private void coverOutputs() {
		cover_atmState();
		cover_selectedService();
		cover_standardOrOther();
	}

	private void cover_atmState() {
		switch (this.get_atmState()) {
		case AWAITCARD:
			System.out.println("Branch State AWAITCARD covered");
			break;
		case AWAITPIN:
			System.out.println("Branch State AWAITPIN covered");
			break;
		case CHOOSE:
			System.out.println("Branch State CHOOSE covered");
			break;
		case OUTOFSERVICE:
			System.out.println("Branch State OUTOFSERVICE covered");
			break;
		case CHOOSEAMOUNT:
			System.out.println("Branch State CHOOSEAMOUNT covered");
			break;
		case STANDARDAMOUNTSELECTION:
			System.out.println("Branch State STANDARDAMOUNTSELECTION covered");
			break;
		case OTHERAMOUNTSELECTION:
			System.out.println("Branch State OTHERAMOUNTSELECTION covered");
			break;
		}
	}

	private void cover_selectedService() {
		if(this.get_selectedService() == null){
			return;
		}
		switch (this.get_selectedService()) {
		case BALANCE:
			System.out.println("Branch Service BALANCE covered");
			break;
		case WITHDRAWAL:
			System.out.println("Branch Service WITHDRAWAL covered");
			break;
		case EXIT:
			System.out.println("Branch Service EXIT covered");
			break;
		}
	}

	private void cover_standardOrOther() {
		switch (this.get_standardOrOther()) {
		case STANDARD:
			System.out.println("Branch MoneySizeSelection STANDARD covered");
			break;
		case OTHER:
			System.out.println("Branch MoneySizeSelection OTHER covered");
			break;
		}
	}

	/* ASM Methods */
	// Controlled getters
	public String get_currCard() {
		return ATM3.NumCard.toString(this.execution.currCard.get());
	}

	public ATM3.State get_atmState() {
		return this.execution.atmState.get();
	}

	public boolean get_accessible_card1() {
		return this.execution.accessible.oldValues
				.get(this.execution.NumCard_Class.get(this.execution.NumCard_elemsList.indexOf("card1")));
	}

	public boolean get_accessible_card2() {
		return this.execution.accessible.oldValues
				.get(this.execution.NumCard_Class.get(this.execution.NumCard_elemsList.indexOf("card2")));
	}

	public boolean get_accessible_card3() {
		return this.execution.accessible.oldValues
				.get(this.execution.NumCard_Class.get(this.execution.NumCard_elemsList.indexOf("card3")));
	}

	public int get_moneyLeft() {
		return this.execution.moneyLeft.get();
	}

	public int get_balance_card1() {
		return this.execution.balance.oldValues
				.get(this.execution.NumCard_Class.get(this.execution.NumCard_elemsList.indexOf("card1")));
	}

	public int get_balance_card2() {
		return this.execution.balance.oldValues
				.get(this.execution.NumCard_Class.get(this.execution.NumCard_elemsList.indexOf("card2")));
	}

	public int get_balance_card3() {
		return this.execution.balance.oldValues
				.get(this.execution.NumCard_Class.get(this.execution.NumCard_elemsList.indexOf("card3")));
	}

	public Integer get_numOfBalanceChecks() {
		return this.execution.numOfBalanceChecks.get();
	}

	// Monitored setters
	public void set_insertedCard(String insertedCard) {
		this.execution.insertedCard
				.set(this.execution.NumCard_Class.get(this.execution.NumCard_elemsList.indexOf(insertedCard)));
		System.out.println("Set insertedCard = " + insertedCard);
	}

	public void set_insertedPin(int insertedPin) {
		this.execution.insertedPin.set(insertedPin);
		System.out.println("Set insertedPin = " + insertedPin);
	}

	public void set_selectedService(ATM3.Service selectedService) {
		this.execution.selectedService.set(selectedService);
		System.out.println("Set selectedService = " + selectedService);
	}

	public void set_insertMoneySizeStandard(int insertMoneySizeStandard) {
		this.execution.insertMoneySizeStandard.set(ATM3.MoneySize.valueOf(
				this.execution.MoneySize_elems.get(insertMoneySizeStandard - this.execution.MoneySize_elems.get(0))));
		System.out.println("Set insertMoneySizeStandard = " + insertMoneySizeStandard);
	}

	public void set_insertMoneySizeOther(int insertMoneySizeOther) {
		this.execution.insertMoneySizeOther.set(insertMoneySizeOther);
		System.out.println("Set insertMoneySizeOther = " + insertMoneySizeOther);
	}

	public void set_standardOrOther(ATM3.MoneySizeSelection standardOrOther) {
		this.execution.standardOrOther.set(standardOrOther);
		System.out.println("Set standardOrOther = " + standardOrOther);
	}
}
