package domaintests;// BasicTD_ATG.java automatically generated from ASM2CODE

/**
* This class is designed to simulate the behavior of an abstract state machine in an automated way.
*
* <p>
* It has been optimized to be used with evosuite in order to automatically generate test scenarios.
* </p>
*/
class BasicTD_ATG {
	/** Instance of the asmeta specification translated into a java class.*/
	private final BasicTD execution;
	/** current state. */
	private int state;

	/**
	* Constructor of the {@code BasicTD_ATG} class. Creates a private instance of the asm
	* {@link BasicTD} and sets the initial state of the state machine to 0.
	*/
	public BasicTD_ATG() {
		this.execution = new BasicTD();
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
		cover_r_Main_branches();
	}

	/**
	* Cover all the branches of the rule r_Main.
	*/
	private void cover_r_Main_branches() {
		if (this.execution.branch_r_Main_master) {
			System.out.println("branch_r_Main_master covered");
		}
	}

	/* Cover the Outputs */
	// Monitored getters
	// Cover functions
	/**
	* Invokes all output coverage functions.
	* <p>
	* To achieve complete output coverage, only the functions related to the enum need to be invoked.
	* </p>
	*/
	private void coverOutputs() {
	}

	/* ASM Methods */
	// Controlled getters
	public Double get_realControlledFunction() {
		return this.execution.realControlledFunction.get();
	}

	public Integer get_integerControlledFunction() {
		return this.execution.integerControlledFunction.get();
	}

	public String get_stringControlledFunction() {
		return this.execution.stringControlledFunction.get();
	}

	public Character get_charControlledFunction() {
		return this.execution.charControlledFunction.get();
	}

	public Boolean get_booleanControlledFunction() {
		return this.execution.booleanControlledFunction.get();
	}

	// Monitored setters
	public void set_realMonitoredFunction(double realMonitoredFunction) {
		this.execution.realMonitoredFunction.set(realMonitoredFunction);
		System.out.println("Set realMonitoredFunction = " + realMonitoredFunction);
	}

	public void set_integerMonitoredFunction(int integerMonitoredFunction) {
		this.execution.integerMonitoredFunction.set(integerMonitoredFunction);
		System.out.println("Set integerMonitoredFunction = " + integerMonitoredFunction);
	}

	public void set_stringMonitoredFunction(String stringMonitoredFunction) {
		this.execution.stringMonitoredFunction.set(stringMonitoredFunction);
		System.out.println("Set stringMonitoredFunction = " + stringMonitoredFunction);
	}

	public void set_charMonitoredFunction(char charMonitoredFunction) {
		this.execution.charMonitoredFunction.set(charMonitoredFunction);
		System.out.println("Set charMonitoredFunction = " + charMonitoredFunction);
	}

	public void set_booleanMonitoredFunction(boolean booleanMonitoredFunction) {
		this.execution.booleanMonitoredFunction.set(booleanMonitoredFunction);
		System.out.println("Set booleanMonitoredFunction = " + booleanMonitoredFunction);
	}
}
