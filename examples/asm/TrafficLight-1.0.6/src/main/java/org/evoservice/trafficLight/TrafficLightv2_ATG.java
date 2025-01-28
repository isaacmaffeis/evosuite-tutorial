package org.evoservice.trafficLight;// TrafficLightv2_ATG.java automatically generated from ASM2CODE

/**
* This class is designed to simulate the behavior of an abstract state machine in an automated way.
*
* <p>
* It has been optimized to be used with evosuite in order to automatically generate test scenarios.
* </p>
*/
class TrafficLightv2_ATG {
	/** Instance of the asmeta specification translated into a java class.*/
	private final TrafficLightv2 execution;
	/** current state. */
	private int state;

	/**
	* Constructor of the {@code TrafficLightv2_ATG} class. Creates a private instance of the asm
	* {@link TrafficLightv2} and sets the initial state of the state machine to 0.
	*/
	public TrafficLightv2_ATG() {
		this.execution = new TrafficLightv2();
		this.state = 0;
	}

	/** The step function allows to perform a step of the asm by incrementing the state.
	*/
	public void step() {
		this.execution.updateASM();
		System.out.println("</State " + state + " >");
		// Cover the rules
		coverRules();
		state++;
	}

	/* Cover the Rules */
	/**
	* Calls all rules covering functions.
	*/
	private void coverRules() {
		cover_r_Main_branches();
		cover_r_yellow_branches();
		cover_r_pending_branches();
		cover_r_green_branches();
		cover_r_red_branches();
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
	}

	/**
	* Cover all the branches of the rule r_yellow.
	*/
	private void cover_r_yellow_branches() {
		if (this.execution.branch_r_yellow_master) {
			System.out.println("branch_r_yellow_master covered");
		}
		if (this.execution.branch_r_yellow_1) {
			System.out.println("branch_r_yellow_1 covered");
		}
		if (this.execution.branch_r_yellow_2) {
			System.out.println("branch_r_yellow_2 covered");
		}
	}

	/**
	* Cover all the branches of the rule r_pending.
	*/
	private void cover_r_pending_branches() {
		if (this.execution.branch_r_pending_master) {
			System.out.println("branch_r_pending_master covered");
		}
		if (this.execution.branch_r_pending_1) {
			System.out.println("branch_r_pending_1 covered");
		}
		if (this.execution.branch_r_pending_2) {
			System.out.println("branch_r_pending_2 covered");
		}
	}

	/**
	* Cover all the branches of the rule r_green.
	*/
	private void cover_r_green_branches() {
		if (this.execution.branch_r_green_master) {
			System.out.println("branch_r_green_master covered");
		}
		if (this.execution.branch_r_green_1) {
			System.out.println("branch_r_green_1 covered");
		}
		if (this.execution.branch_r_green_2) {
			System.out.println("branch_r_green_2 covered");
		}
		if (this.execution.branch_r_green_3) {
			System.out.println("branch_r_green_3 covered");
		}
		if (this.execution.branch_r_green_4) {
			System.out.println("branch_r_green_4 covered");
		}
	}

	/**
	* Cover all the branches of the rule r_red.
	*/
	private void cover_r_red_branches() {
		if (this.execution.branch_r_red_master) {
			System.out.println("branch_r_red_master covered");
		}
		if (this.execution.branch_r_red_1) {
			System.out.println("branch_r_red_1 covered");
		}
		if (this.execution.branch_r_red_2) {
			System.out.println("branch_r_red_2 covered");
		}
	}

	/* ASM Methods */
	// Controlled getters
	public Integer get_count() {
		if (this.execution.count.get() != null) {
			return this.execution.count.get().value;
		}
		return null;
	}

	public TrafficLightv2.States get_status() {
		return this.execution.status.get();
	}

	// Monitored setters
	public void set_pedestrian(boolean pedestrian) {
		this.execution.pedestrian.set(pedestrian);
		System.out.println("Set pedestrian = " + pedestrian);
	}
}
