package org.evoservice.cashpoint;// CashPointv2_ATG.java automatically generated from ASM2CODE

/**
* This class is designed to simulate the behavior of an abstract state machine in an automated way.
*
* <p>
* It has been optimized to be used with evosuite in order to automatically generate test scenarios.
* </p>
*/
class CashPointv2_ATG {
	/** Instance of the asmeta specification translated into a java class.*/
	private final CashPointv2 execution;
	/** current state. */
	private int state;

	/**
	* Constructor of the {@code CashPointv2_ATG} class. Creates a private instance of the asm
	* {@link CashPointv2} and sets the initial state of the state machine to 0.
	*/
	public CashPointv2_ATG() {
		this.execution = new CashPointv2();
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
		cover_r_insertedCard_branches();
		cover_r_main_branches();
		cover_r_validPin_branches();
		cover_r_insertCard_branches();
		cover_r_enterPin_branches();
	}

	/**
	* Cover all the branches of the rule r_insertedCard.
	*/
	private void cover_r_insertedCard_branches() {
		if (this.execution.branch_r_insertedCard_master) {
			System.out.println("branch_r_insertedCard_master covered");
		}
		if (this.execution.branch_r_insertedCard_1) {
			System.out.println("branch_r_insertedCard_1 covered");
		}
	}

	/**
	* Cover all the branches of the rule r_main.
	*/
	private void cover_r_main_branches() {
		if (this.execution.branch_r_main_master) {
			System.out.println("branch_r_main_master covered");
		}
	}

	/**
	* Cover all the branches of the rule r_validPin.
	*/
	private void cover_r_validPin_branches() {
		if (this.execution.branch_r_validPin_master) {
			System.out.println("branch_r_validPin_master covered");
		}
		if (this.execution.branch_r_validPin_1) {
			System.out.println("branch_r_validPin_1 covered");
		}
		if (this.execution.branch_r_validPin_2) {
			System.out.println("branch_r_validPin_2 covered");
		}
	}

	/**
	* Cover all the branches of the rule r_insertCard.
	*/
	private void cover_r_insertCard_branches() {
		if (this.execution.branch_r_insertCard_master) {
			System.out.println("branch_r_insertCard_master covered");
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
		if (this.execution.branch_r_enterPin_4) {
			System.out.println("branch_r_enterPin_4 covered");
		}
	}

	/* Cover the Outputs */
	// Monitored getters
	// Cover functions
	/**
	* Invokes all output coverage functions.
	* <p>
	* To achieve complete output coverage, only the functions that cover enum codomains need to be invoked.
	* </p>
	*/
	private void coverOutputs() {
		cover_tillState_fromDomain_till1();
	}

	private void cover_tillState_fromDomain_till1() {
		if (this.get_tillState_fromDomain_till1() == null) {
			return;
		}
		switch (this.get_tillState_fromDomain_till1()) {
		case WAITCARD:
			System.out.println("Branch Till -> TillState WAITCARD covered");
			break;
		case WAITPIN:
			System.out.println("Branch Till -> TillState WAITPIN covered");
			break;
		case VALIDPIN:
			System.out.println("Branch Till -> TillState VALIDPIN covered");
			break;
		}
	}

	/* ASM Methods */
	// Controlled getters
	public CashPointv2.TillState get_tillState_fromDomain_till1() {
		return this.execution.tillState.get(CashPointv2.Till.get("till1"));
	}

	public Integer get_balance_fromDomain_account1() {
		return this.execution.balance.get(CashPointv2.Account.get("account1"));
	}

	public Boolean get_legalCard_fromDomain_card1() {
		return this.execution.legalCard.get(CashPointv2.Card.get("card1"));
	}

	public Boolean get_legalCard_fromDomain_card2() {
		return this.execution.legalCard.get(CashPointv2.Card.get("card2"));
	}

	public Integer get_daily_withdraw_sum_fromDomain_card1() {
		return this.execution.daily_withdraw_sum.get(CashPointv2.Card.get("card1"));
	}

	public Integer get_daily_withdraw_sum_fromDomain_card2() {
		return this.execution.daily_withdraw_sum.get(CashPointv2.Card.get("card2"));
	}

	public String get_insertedCard_fromDomain_till1() {
		String value = this.execution.insertedCard.get(CashPointv2.Till.get("till1")).toString();
		return value != null ? "abstract_" + value : null;
	}

	public String get_cardLastUseDate_fromDomain_card1() {
		String value = this.execution.cardLastUseDate.get(CashPointv2.Card.get("card1")).toString();
		return value != null ? "abstract_" + value : null;
	}

	public String get_cardLastUseDate_fromDomain_card2() {
		String value = this.execution.cardLastUseDate.get(CashPointv2.Card.get("card2")).toString();
		return value != null ? "abstract_" + value : null;
	}

	// Monitored setters
	public void set_enteredPin_fromDomain_till1(int enteredPin_till1) {
		this.execution.enteredPin.set(CashPointv2.Till.get("till1"), enteredPin_till1);
		System.out.println("Set enteredPin_till1 = " + enteredPin_till1);
	}

	public void set_amount_fromDomain_till1(int amount_till1) {
		this.execution.amount.set(CashPointv2.Till.get("till1"), amount_till1);
		System.out.println("Set amount_till1 = " + amount_till1);
	}

	public void set_abstract_currentDate(String currentDate) {
		this.execution.currentDate.set(CashPointv2.Date.get(currentDate));
		System.out.println("Set currentDate = " + currentDate);
	}
}
