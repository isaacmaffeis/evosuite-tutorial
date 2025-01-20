package org.evoservice.initTest;// InitTest_ATG.java automatically generated from ASM2CODE

/**
* This class is designed to simulate the behavior of an abstract state machine in an automated way.
*
* <p>
* It has been optimized to be used with evosuite in order to automatically generate test scenarios.
* </p>
*/
class InitTest_ATG {
	/** Instance of the asmeta specification translated into a java class.*/
	private final InitTest execution;
	/** current state. */
	private int state;

	/**
	* Constructor of the {@code InitTest_ATG} class. Creates a private instance of the asm
	* {@link InitTest} and sets the initial state of the state machine to 0.
	*/
	public InitTest_ATG() {
		this.execution = new InitTest();
		this.state = 0;
	}

	/** The step function allows to perform a step of the asm by incrementing the state.
	*/
	public void step() {
		System.out.println("<State " + state + " (controlled)>");
		printControlled();
		this.execution.updateASM();
		System.out.println("</State " + state + " (controlled)>");
		System.out.println("\n<Current status>");
		printControlled();
		// Cover the rules
		coverRules();
		state++;
	}

	/* Cover the Rules */
	/**
	* Calls all rules covering functions.
	*/
	private void coverRules() {
		cover_r_timeRule_branches();
		cover_r_Main_branches();
		cover_r_restartRule_branches();
	}

	/**
	* Cover all the branches of the rule r_timeRule.
	*/
	private void cover_r_timeRule_branches() {
		if (this.execution.branch_r_timeRule_master) {
			System.out.println("branch_r_timeRule_master covered");
		}
		if (this.execution.branch_r_timeRule_1) {
			System.out.println("branch_r_timeRule_1 covered");
		}
		if (this.execution.branch_r_timeRule_2) {
			System.out.println("branch_r_timeRule_2 covered");
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
	}

	/**
	* Cover all the branches of the rule r_restartRule.
	*/
	private void cover_r_restartRule_branches() {
		if (this.execution.branch_r_restartRule_master) {
			System.out.println("branch_r_restartRule_master covered");
		}
		if (this.execution.branch_r_restartRule_1) {
			System.out.println("branch_r_restartRule_1 covered");
		}
		if (this.execution.branch_r_restartRule_2) {
			System.out.println("branch_r_restartRule_2 covered");
		}
	}

	/* ASM Methods */
	// Print controlled
	private void printControlled() {
		System.out.println("seconds = " + execution.seconds.get().value);
		System.out.println("minutes = " + execution.minutes.get().value);
		System.out.println("status = " + execution.status.oldValue.name());
	}

	// Controlled getters
	public int get_seconds() {
		return this.execution.seconds.get().value;
	}

	public int get_minutes() {
		return this.execution.minutes.get().value;
	}

	public InitTest.State get_status() {
		return this.execution.status.get();
	}

	// Monitored setters
	public void set_signal(boolean signal) {
		this.execution.signal.set(signal);
		System.out.println("Set signal = " + signal);
	}
}
