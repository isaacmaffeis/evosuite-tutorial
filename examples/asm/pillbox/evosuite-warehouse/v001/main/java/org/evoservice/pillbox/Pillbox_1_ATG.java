package org.evoservice.pillbox;// Pillbox_1_ATG.java automatically generated from ASM2CODE

/**
* This class is designed to simulate the behavior of an abstract state machine in an automated way.
*
* <p>
* It has been optimized to be used with evosuite in order to automatically generate test scenarios.
* </p>
*/
class Pillbox_1_ATG {
	/** Instance of the asmeta specification translated into a java class.*/
	private final Pillbox_1 execution;
	/** current state. */
	private int state;

	/**
	* Constructor of the {@code Pillbox_1_ATG} class. Creates a private instance of the asm
	* {@link Pillbox_1} and sets the initial state of the state machine to 0.
	*/
	public Pillbox_1_ATG() {
		this.execution = new Pillbox_1();
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
		cover_r_drawerClosed_branches();
		cover_r_pillToBeTaken_branches();
		cover_r_Main_branches();
		cover_r_writeToFile_branches();
		cover_r_takeInTimeout_branches();
		cover_r_timeOutExpired_missedPill_branches();
		cover_r_pillTaken_drawerOpened_branches();
		cover_r_drawerOpened_branches();
		cover_r_timeOutExpired_drawerOpened_branches();
	}

	/**
	* Cover all the branches of the rule r_drawerClosed.
	*/
	private void cover_r_drawerClosed_branches() {
		if (this.execution.branch_r_drawerClosed_master) {
			System.out.println("branch_r_drawerClosed_master covered");
		}
	}

	/**
	* Cover all the branches of the rule r_pillToBeTaken.
	*/
	private void cover_r_pillToBeTaken_branches() {
		if (this.execution.branch_r_pillToBeTaken_master) {
			System.out.println("branch_r_pillToBeTaken_master covered");
		}
		if (this.execution.branch_r_pillToBeTaken_1) {
			System.out.println("branch_r_pillToBeTaken_1 covered");
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
		if (this.execution.branch_r_Main_4) {
			System.out.println("branch_r_Main_4 covered");
		}
		if (this.execution.branch_r_Main_5) {
			System.out.println("branch_r_Main_5 covered");
		}
		if (this.execution.branch_r_Main_6) {
			System.out.println("branch_r_Main_6 covered");
		}
		if (this.execution.branch_r_Main_7) {
			System.out.println("branch_r_Main_7 covered");
		}
		if (this.execution.branch_r_Main_8) {
			System.out.println("branch_r_Main_8 covered");
		}
		if (this.execution.branch_r_Main_9) {
			System.out.println("branch_r_Main_9 covered");
		}
		if (this.execution.branch_r_Main_10) {
			System.out.println("branch_r_Main_10 covered");
		}
		if (this.execution.branch_r_Main_11) {
			System.out.println("branch_r_Main_11 covered");
		}
		if (this.execution.branch_r_Main_12) {
			System.out.println("branch_r_Main_12 covered");
		}
		if (this.execution.branch_r_Main_13) {
			System.out.println("branch_r_Main_13 covered");
		}
		if (this.execution.branch_r_Main_14) {
			System.out.println("branch_r_Main_14 covered");
		}
		if (this.execution.branch_r_Main_15) {
			System.out.println("branch_r_Main_15 covered");
		}
		if (this.execution.branch_r_Main_16) {
			System.out.println("branch_r_Main_16 covered");
		}
		if (this.execution.branch_r_Main_17) {
			System.out.println("branch_r_Main_17 covered");
		}
		if (this.execution.branch_r_Main_18) {
			System.out.println("branch_r_Main_18 covered");
		}
		if (this.execution.branch_r_Main_19) {
			System.out.println("branch_r_Main_19 covered");
		}
		if (this.execution.branch_r_Main_20) {
			System.out.println("branch_r_Main_20 covered");
		}
	}

	/**
	* Cover all the branches of the rule r_writeToFile.
	*/
	private void cover_r_writeToFile_branches() {
		if (this.execution.branch_r_writeToFile_master) {
			System.out.println("branch_r_writeToFile_master covered");
		}
	}

	/**
	* Cover all the branches of the rule r_takeInTimeout.
	*/
	private void cover_r_takeInTimeout_branches() {
		if (this.execution.branch_r_takeInTimeout_master) {
			System.out.println("branch_r_takeInTimeout_master covered");
		}
		if (this.execution.branch_r_takeInTimeout_1) {
			System.out.println("branch_r_takeInTimeout_1 covered");
		}
	}

	/**
	* Cover all the branches of the rule r_timeOutExpired_missedPill.
	*/
	private void cover_r_timeOutExpired_missedPill_branches() {
		if (this.execution.branch_r_timeOutExpired_missedPill_master) {
			System.out.println("branch_r_timeOutExpired_missedPill_master covered");
		}
	}

	/**
	* Cover all the branches of the rule r_pillTaken_drawerOpened.
	*/
	private void cover_r_pillTaken_drawerOpened_branches() {
		if (this.execution.branch_r_pillTaken_drawerOpened_master) {
			System.out.println("branch_r_pillTaken_drawerOpened_master covered");
		}
	}

	/**
	* Cover all the branches of the rule r_drawerOpened.
	*/
	private void cover_r_drawerOpened_branches() {
		if (this.execution.branch_r_drawerOpened_master) {
			System.out.println("branch_r_drawerOpened_master covered");
		}
		if (this.execution.branch_r_drawerOpened_1) {
			System.out.println("branch_r_drawerOpened_1 covered");
		}
	}

	/**
	* Cover all the branches of the rule r_timeOutExpired_drawerOpened.
	*/
	private void cover_r_timeOutExpired_drawerOpened_branches() {
		if (this.execution.branch_r_timeOutExpired_drawerOpened_master) {
			System.out.println("branch_r_timeOutExpired_drawerOpened_master covered");
		}
	}

	/* ASM Methods */
	// Print controlled
	private void printControlled() {
		System.out.println("opened = " + execution.opened.get());
		System.out.println("redLed = " + execution.redLed.oldValue.name());
		System.out.println("outMess = " + execution.outMess.oldValue.name());
		System.out.println("logMess = " + execution.logMess.oldValue.name());
		System.out.println("time_consumption = " + execution.time_consumption.get().value);
		System.out.println("requestSatisfied = " + execution.requestSatisfied.get());
		System.out.println("systemTime = " + execution.systemTime.get().value);
		System.out.println("drawerTimer = " + execution.drawerTimer.get().value);
	}

	// Controlled getters
	public boolean get_opened() {
		return this.execution.opened.get();
	}

	public Pillbox_1.LedLights get_redLed() {
		return this.execution.redLed.get();
	}

	public Pillbox_1.OutMessages get_outMess() {
		return this.execution.outMess.get();
	}

	public Pillbox_1.OutMessages get_logMess() {
		return this.execution.logMess.get();
	}

	public int get_time_consumption() {
		return this.execution.time_consumption.get().value;
	}

	public boolean get_requestSatisfied() {
		return this.execution.requestSatisfied.get();
	}

	public int get_systemTime() {
		return this.execution.systemTime.get().value;
	}

	public int get_drawerTimer() {
		return this.execution.drawerTimer.get().value;
	}

	// Monitored setters
	public void set_openSwitch(boolean openSwitch) {
		this.execution.openSwitch.set(openSwitch);
		System.out.println("Set openSwitch = " + openSwitch);
	}
}
