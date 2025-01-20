package domaintests;// EnumTD_ATG.java automatically generated from ASM2CODE

/**
* This class is designed to simulate the behavior of an abstract state machine in an automated way.
*
* <p>
* It has been optimized to be used with evosuite in order to automatically generate test scenarios.
* </p>
*/
class EnumTD_ATG {
	/** Instance of the asmeta specification translated into a java class.*/
	private final EnumTD execution;
	/** current state. */
	private int state;

	/**
	* Constructor of the {@code EnumTD_ATG} class. Creates a private instance of the asm
	* {@link EnumTD} and sets the initial state of the state machine to 0.
	*/
	public EnumTD_ATG() {
		this.execution = new EnumTD();
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
	/**
	* Get the monitored function {@code enumMonitoredFunction}.
	*
	* @return the selected {@code EnumTD.EnumDomain enumMonitoredFunction} enumMonitoredFunction
	*/
	private EnumTD.EnumDomain get_enumMonitoredFunction() {
		return this.execution.enumMonitoredFunction.get();
	}

	/**
	* Get the monitored function {@code enumtoenumMonitoredFunction_STATE1}.
	*
	* @return the selected {@code EnumTD.EnumDomain enumtoenumMonitoredFunction_STATE1} enumtoenumMonitoredFunction_STATE1
	*/
	private EnumTD.EnumDomain get_enumtoenumMonitoredFunction_STATE1() {
		return this.execution.enumtoenumMonitoredFunction.get(this.execution.EnumDomain_elemsList.get(0));
	}

	/**
	* Get the monitored function {@code enumtoenumMonitoredFunction_STATE2}.
	*
	* @return the selected {@code EnumTD.EnumDomain enumtoenumMonitoredFunction_STATE2} enumtoenumMonitoredFunction_STATE2
	*/
	private EnumTD.EnumDomain get_enumtoenumMonitoredFunction_STATE2() {
		return this.execution.enumtoenumMonitoredFunction.get(this.execution.EnumDomain_elemsList.get(1));
	}

	/**
	* Get the monitored function {@code enumtoenumMonitoredFunction_STATE3}.
	*
	* @return the selected {@code EnumTD.EnumDomain enumtoenumMonitoredFunction_STATE3} enumtoenumMonitoredFunction_STATE3
	*/
	private EnumTD.EnumDomain get_enumtoenumMonitoredFunction_STATE3() {
		return this.execution.enumtoenumMonitoredFunction.get(this.execution.EnumDomain_elemsList.get(2));
	}

	/**
	* Get the monitored function {@code anotherEnumtoenumMonitoredFunction_ON}.
	*
	* @return the selected {@code EnumTD.EnumDomain anotherEnumtoenumMonitoredFunction_ON} anotherEnumtoenumMonitoredFunction_ON
	*/
	private EnumTD.EnumDomain get_anotherEnumtoenumMonitoredFunction_ON() {
		return this.execution.anotherEnumtoenumMonitoredFunction.get(this.execution.AnotherEnumDomain_elemsList.get(0));
	}

	/**
	* Get the monitored function {@code anotherEnumtoenumMonitoredFunction_OFF}.
	*
	* @return the selected {@code EnumTD.EnumDomain anotherEnumtoenumMonitoredFunction_OFF} anotherEnumtoenumMonitoredFunction_OFF
	*/
	private EnumTD.EnumDomain get_anotherEnumtoenumMonitoredFunction_OFF() {
		return this.execution.anotherEnumtoenumMonitoredFunction.get(this.execution.AnotherEnumDomain_elemsList.get(1));
	}

	// Cover functions
	/**
	* Invokes all output coverage functions.
	* <p>
	* To achieve complete output coverage, only the functions related to the enum need to be invoked.
	* </p>
	*/
	private void coverOutputs() {
		cover_enumMonitoredFunction();
		cover_enumtoenumMonitoredFunction_STATE1();
		cover_enumtoenumMonitoredFunction_STATE2();
		cover_enumtoenumMonitoredFunction_STATE3();
		cover_anotherEnumtoenumMonitoredFunction_ON();
		cover_anotherEnumtoenumMonitoredFunction_OFF();
		cover_enumControlledFunction();
		cover_enumtoenumControlledFunction_STATE1();
		cover_enumtoenumControlledFunction_STATE2();
		cover_enumtoenumControlledFunction_STATE3();
		cover_anotherEnumtoenumControlledFunction_STATE1();
		cover_anotherEnumtoenumControlledFunction_STATE2();
		cover_anotherEnumtoenumControlledFunction_STATE3();
	}

	private void cover_enumMonitoredFunction() {
		if (this.get_enumMonitoredFunction() == null) {
			return;
		}
		switch (this.get_enumMonitoredFunction()) {
		case STATE1:
			System.out.println("Branch EnumDomain STATE1 covered");
			break;
		case STATE2:
			System.out.println("Branch EnumDomain STATE2 covered");
			break;
		case STATE3:
			System.out.println("Branch EnumDomain STATE3 covered");
			break;
		}
	}

	private void cover_enumtoenumMonitoredFunction_STATE1() {
		if (this.get_enumtoenumMonitoredFunction_STATE1() == null) {
			return;
		}
		switch (this.get_enumtoenumMonitoredFunction_STATE1()) {
		case STATE1:
			System.out.println("Branch EnumDomain STATE1 covered");
			break;
		case STATE2:
			System.out.println("Branch EnumDomain STATE2 covered");
			break;
		case STATE3:
			System.out.println("Branch EnumDomain STATE3 covered");
			break;
		}
	}

	private void cover_enumtoenumMonitoredFunction_STATE2() {
		if (this.get_enumtoenumMonitoredFunction_STATE2() == null) {
			return;
		}
		switch (this.get_enumtoenumMonitoredFunction_STATE2()) {
		case STATE1:
			System.out.println("Branch EnumDomain STATE1 covered");
			break;
		case STATE2:
			System.out.println("Branch EnumDomain STATE2 covered");
			break;
		case STATE3:
			System.out.println("Branch EnumDomain STATE3 covered");
			break;
		}
	}

	private void cover_enumtoenumMonitoredFunction_STATE3() {
		if (this.get_enumtoenumMonitoredFunction_STATE3() == null) {
			return;
		}
		switch (this.get_enumtoenumMonitoredFunction_STATE3()) {
		case STATE1:
			System.out.println("Branch EnumDomain STATE1 covered");
			break;
		case STATE2:
			System.out.println("Branch EnumDomain STATE2 covered");
			break;
		case STATE3:
			System.out.println("Branch EnumDomain STATE3 covered");
			break;
		}
	}

	private void cover_anotherEnumtoenumMonitoredFunction_ON() {
		if (this.get_anotherEnumtoenumMonitoredFunction_ON() == null) {
			return;
		}
		switch (this.get_anotherEnumtoenumMonitoredFunction_ON()) {
		case STATE1:
			System.out.println("Branch EnumDomain STATE1 covered");
			break;
		case STATE2:
			System.out.println("Branch EnumDomain STATE2 covered");
			break;
		case STATE3:
			System.out.println("Branch EnumDomain STATE3 covered");
			break;
		}
	}

	private void cover_anotherEnumtoenumMonitoredFunction_OFF() {
		if (this.get_anotherEnumtoenumMonitoredFunction_OFF() == null) {
			return;
		}
		switch (this.get_anotherEnumtoenumMonitoredFunction_OFF()) {
		case STATE1:
			System.out.println("Branch EnumDomain STATE1 covered");
			break;
		case STATE2:
			System.out.println("Branch EnumDomain STATE2 covered");
			break;
		case STATE3:
			System.out.println("Branch EnumDomain STATE3 covered");
			break;
		}
	}

	private void cover_enumControlledFunction() {
		if (this.get_enumControlledFunction() == null) {
			return;
		}
		switch (this.get_enumControlledFunction()) {
		case STATE1:
			System.out.println("Branch EnumDomain STATE1 covered");
			break;
		case STATE2:
			System.out.println("Branch EnumDomain STATE2 covered");
			break;
		case STATE3:
			System.out.println("Branch EnumDomain STATE3 covered");
			break;
		}
	}

	private void cover_enumtoenumControlledFunction_STATE1() {
		if (this.get_enumtoenumControlledFunction_STATE1() == null) {
			return;
		}
		switch (this.get_enumtoenumControlledFunction_STATE1()) {
		case STATE1:
			System.out.println("Branch EnumDomain STATE1 covered");
			break;
		case STATE2:
			System.out.println("Branch EnumDomain STATE2 covered");
			break;
		case STATE3:
			System.out.println("Branch EnumDomain STATE3 covered");
			break;
		}
	}

	private void cover_enumtoenumControlledFunction_STATE2() {
		if (this.get_enumtoenumControlledFunction_STATE2() == null) {
			return;
		}
		switch (this.get_enumtoenumControlledFunction_STATE2()) {
		case STATE1:
			System.out.println("Branch EnumDomain STATE1 covered");
			break;
		case STATE2:
			System.out.println("Branch EnumDomain STATE2 covered");
			break;
		case STATE3:
			System.out.println("Branch EnumDomain STATE3 covered");
			break;
		}
	}

	private void cover_enumtoenumControlledFunction_STATE3() {
		if (this.get_enumtoenumControlledFunction_STATE3() == null) {
			return;
		}
		switch (this.get_enumtoenumControlledFunction_STATE3()) {
		case STATE1:
			System.out.println("Branch EnumDomain STATE1 covered");
			break;
		case STATE2:
			System.out.println("Branch EnumDomain STATE2 covered");
			break;
		case STATE3:
			System.out.println("Branch EnumDomain STATE3 covered");
			break;
		}
	}

	private void cover_anotherEnumtoenumControlledFunction_STATE1() {
		if (this.get_anotherEnumtoenumControlledFunction_STATE1() == null) {
			return;
		}
		switch (this.get_anotherEnumtoenumControlledFunction_STATE1()) {
		case ON:
			System.out.println("Branch AnotherEnumDomain ON covered");
			break;
		case OFF:
			System.out.println("Branch AnotherEnumDomain OFF covered");
			break;
		}
	}

	private void cover_anotherEnumtoenumControlledFunction_STATE2() {
		if (this.get_anotherEnumtoenumControlledFunction_STATE2() == null) {
			return;
		}
		switch (this.get_anotherEnumtoenumControlledFunction_STATE2()) {
		case ON:
			System.out.println("Branch AnotherEnumDomain ON covered");
			break;
		case OFF:
			System.out.println("Branch AnotherEnumDomain OFF covered");
			break;
		}
	}

	private void cover_anotherEnumtoenumControlledFunction_STATE3() {
		if (this.get_anotherEnumtoenumControlledFunction_STATE3() == null) {
			return;
		}
		switch (this.get_anotherEnumtoenumControlledFunction_STATE3()) {
		case ON:
			System.out.println("Branch AnotherEnumDomain ON covered");
			break;
		case OFF:
			System.out.println("Branch AnotherEnumDomain OFF covered");
			break;
		}
	}

	/* ASM Methods */
	// Controlled getters
	public EnumTD.EnumDomain get_enumControlledFunction() {
		return this.execution.enumControlledFunction.get();
	}

	public EnumTD.EnumDomain get_enumtoenumControlledFunction_STATE1() {
		return this.execution.enumtoenumControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(0));
	}

	public EnumTD.EnumDomain get_enumtoenumControlledFunction_STATE2() {
		return this.execution.enumtoenumControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(1));
	}

	public EnumTD.EnumDomain get_enumtoenumControlledFunction_STATE3() {
		return this.execution.enumtoenumControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(2));
	}

	public EnumTD.AnotherEnumDomain get_anotherEnumtoenumControlledFunction_STATE1() {
		return this.execution.anotherEnumtoenumControlledFunction.oldValues
				.get(this.execution.EnumDomain_elemsList.get(0));
	}

	public EnumTD.AnotherEnumDomain get_anotherEnumtoenumControlledFunction_STATE2() {
		return this.execution.anotherEnumtoenumControlledFunction.oldValues
				.get(this.execution.EnumDomain_elemsList.get(1));
	}

	public EnumTD.AnotherEnumDomain get_anotherEnumtoenumControlledFunction_STATE3() {
		return this.execution.anotherEnumtoenumControlledFunction.oldValues
				.get(this.execution.EnumDomain_elemsList.get(2));
	}

	// Monitored setters
	public void set_enumMonitoredFunction(EnumTD.EnumDomain enumMonitoredFunction) {
		this.execution.enumMonitoredFunction.set(enumMonitoredFunction);
		System.out.println("Set enumMonitoredFunction = " + enumMonitoredFunction);
	}

	public void set_enumtoenumMonitoredFunction_STATE1(EnumTD.EnumDomain enumtoenumMonitoredFunction_STATE1) {
		this.execution.enumtoenumMonitoredFunction.set(EnumTD.EnumDomain.STATE1, enumtoenumMonitoredFunction_STATE1);
		System.out.println("Set enumtoenumMonitoredFunction_STATE1 = " + enumtoenumMonitoredFunction_STATE1);
	}

	public void set_enumtoenumMonitoredFunction_STATE2(EnumTD.EnumDomain enumtoenumMonitoredFunction_STATE2) {
		this.execution.enumtoenumMonitoredFunction.set(EnumTD.EnumDomain.STATE2, enumtoenumMonitoredFunction_STATE2);
		System.out.println("Set enumtoenumMonitoredFunction_STATE2 = " + enumtoenumMonitoredFunction_STATE2);
	}

	public void set_enumtoenumMonitoredFunction_STATE3(EnumTD.EnumDomain enumtoenumMonitoredFunction_STATE3) {
		this.execution.enumtoenumMonitoredFunction.set(EnumTD.EnumDomain.STATE3, enumtoenumMonitoredFunction_STATE3);
		System.out.println("Set enumtoenumMonitoredFunction_STATE3 = " + enumtoenumMonitoredFunction_STATE3);
	}

	public void set_anotherEnumtoenumMonitoredFunction_ON(EnumTD.EnumDomain anotherEnumtoenumMonitoredFunction_ON) {
		this.execution.anotherEnumtoenumMonitoredFunction.set(EnumTD.AnotherEnumDomain.ON,
				anotherEnumtoenumMonitoredFunction_ON);
		System.out.println("Set anotherEnumtoenumMonitoredFunction_ON = " + anotherEnumtoenumMonitoredFunction_ON);
	}

	public void set_anotherEnumtoenumMonitoredFunction_OFF(EnumTD.EnumDomain anotherEnumtoenumMonitoredFunction_OFF) {
		this.execution.anotherEnumtoenumMonitoredFunction.set(EnumTD.AnotherEnumDomain.OFF,
				anotherEnumtoenumMonitoredFunction_OFF);
		System.out.println("Set anotherEnumtoenumMonitoredFunction_OFF = " + anotherEnumtoenumMonitoredFunction_OFF);
	}
}
