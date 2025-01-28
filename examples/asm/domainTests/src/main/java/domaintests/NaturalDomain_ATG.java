package domaintests;// NaturalDomain_ATG.java automatically generated from ASM2CODE

/**
* This class is designed to simulate the behavior of an abstract state machine in an automated way.
*
* <p>
* It has been optimized to be used with evosuite in order to automatically generate test scenarios.
* </p>
*/
class NaturalDomain_ATG {
	/** Instance of the asmeta specification translated into a java class.*/
	private final NaturalDomain execution;
	/** current state. */
	private int state;

	/**
	* Constructor of the {@code NaturalDomain_ATG} class. Creates a private instance of the asm
	* {@link NaturalDomain} and sets the initial state of the state machine to 0.
	*/
	public NaturalDomain_ATG() {
		this.execution = new NaturalDomain();
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
	}

	/**
	* Cover all the branches of the rule r_Main.
	*/
	private void cover_r_Main_branches() {
		if (this.execution.branch_r_Main_master) {
			System.out.println("branch_r_Main_master covered");
		}
	}

	/* ASM Methods */
	// Controlled getters
	public Integer get_natural_naturalControlledFunction() {
		return this.execution.naturalControlledFunction.get();
	}

	public Integer get_natural_enumtonaturalControlledFunction_fromDomain_STATE1() {
		return this.execution.enumtonaturalControlledFunction.get(this.execution.EnumDomain_elemsList.get(0));
	}

	public Integer get_natural_enumtonaturalControlledFunction_fromDomain_STATE2() {
		return this.execution.enumtonaturalControlledFunction.get(this.execution.EnumDomain_elemsList.get(1));
	}

	public Integer get_natural_enumtonaturalControlledFunction_fromDomain_STATE3() {
		return this.execution.enumtonaturalControlledFunction.get(this.execution.EnumDomain_elemsList.get(2));
	}

	public Integer get_natural_abstracttonaturalControlledFunction_fromDomain_value1() {
		return this.execution.abstracttonaturalControlledFunction.get(NaturalDomain.AbstractDomain.get("value1"));
	}

	public Integer get_natural_abstracttonaturalControlledFunction_fromDomain_value2() {
		return this.execution.abstracttonaturalControlledFunction.get(NaturalDomain.AbstractDomain.get("value2"));
	}

	public Integer get_natural_concretetonaturalControlledFunction_fromDomain_1() {
		return this.execution.concretetonaturalControlledFunction.get(NaturalDomain.ConcreteDomain.valueOf(1));
	}

	public Integer get_natural_concretetonaturalControlledFunction_fromDomain_2() {
		return this.execution.concretetonaturalControlledFunction.get(NaturalDomain.ConcreteDomain.valueOf(2));
	}

	public Integer get_natural_concretetonaturalControlledFunction_fromDomain_3() {
		return this.execution.concretetonaturalControlledFunction.get(NaturalDomain.ConcreteDomain.valueOf(3));
	}

	public Integer get_natural_concretetonaturalControlledFunction_fromDomain_4() {
		return this.execution.concretetonaturalControlledFunction.get(NaturalDomain.ConcreteDomain.valueOf(4));
	}

	public Integer get_natural_concretetonaturalControlledFunction_fromDomain_5() {
		return this.execution.concretetonaturalControlledFunction.get(NaturalDomain.ConcreteDomain.valueOf(5));
	}

	// Monitored setters
	public void set_natural_naturalMonitoredFunction(int naturalMonitoredFunction) {
		this.execution.naturalMonitoredFunction.set(naturalMonitoredFunction);
		System.out.println("Set naturalMonitoredFunction = " + naturalMonitoredFunction + "n");
	}

	public void set_natural_enumtonaturalMonitoredFunction_fromDomain_STATE1(
			int enumtonaturalMonitoredFunction_STATE1) {
		this.execution.enumtonaturalMonitoredFunction.set(NaturalDomain.EnumDomain.STATE1,
				enumtonaturalMonitoredFunction_STATE1);
		System.out
				.println("Set enumtonaturalMonitoredFunction_STATE1 = " + enumtonaturalMonitoredFunction_STATE1 + "n");
	}

	public void set_natural_enumtonaturalMonitoredFunction_fromDomain_STATE2(
			int enumtonaturalMonitoredFunction_STATE2) {
		this.execution.enumtonaturalMonitoredFunction.set(NaturalDomain.EnumDomain.STATE2,
				enumtonaturalMonitoredFunction_STATE2);
		System.out
				.println("Set enumtonaturalMonitoredFunction_STATE2 = " + enumtonaturalMonitoredFunction_STATE2 + "n");
	}

	public void set_natural_enumtonaturalMonitoredFunction_fromDomain_STATE3(
			int enumtonaturalMonitoredFunction_STATE3) {
		this.execution.enumtonaturalMonitoredFunction.set(NaturalDomain.EnumDomain.STATE3,
				enumtonaturalMonitoredFunction_STATE3);
		System.out
				.println("Set enumtonaturalMonitoredFunction_STATE3 = " + enumtonaturalMonitoredFunction_STATE3 + "n");
	}

	public void set_natural_abstracttonaturalMonitoredFunction_fromDomain_value1(
			int abstracttonaturalMonitoredFunction_value1) {
		this.execution.abstracttonaturalMonitoredFunction.set(NaturalDomain.AbstractDomain.get("value1"),
				abstracttonaturalMonitoredFunction_value1);
		System.out.println(
				"Set abstracttonaturalMonitoredFunction_value1 = " + abstracttonaturalMonitoredFunction_value1 + "n");
	}

	public void set_natural_abstracttonaturalMonitoredFunction_fromDomain_value2(
			int abstracttonaturalMonitoredFunction_value2) {
		this.execution.abstracttonaturalMonitoredFunction.set(NaturalDomain.AbstractDomain.get("value2"),
				abstracttonaturalMonitoredFunction_value2);
		System.out.println(
				"Set abstracttonaturalMonitoredFunction_value2 = " + abstracttonaturalMonitoredFunction_value2 + "n");
	}

	public void set_natural_concretetonaturalMonitoredFunction_fromDomain_1(int concretetonaturalMonitoredFunction_1) {
		this.execution.concretetonaturalMonitoredFunction.set(NaturalDomain.ConcreteDomain.valueOf(1),
				concretetonaturalMonitoredFunction_1);
		System.out.println("Set concretetonaturalMonitoredFunction_1 = " + concretetonaturalMonitoredFunction_1 + "n");
	}

	public void set_natural_concretetonaturalMonitoredFunction_fromDomain_2(int concretetonaturalMonitoredFunction_2) {
		this.execution.concretetonaturalMonitoredFunction.set(NaturalDomain.ConcreteDomain.valueOf(2),
				concretetonaturalMonitoredFunction_2);
		System.out.println("Set concretetonaturalMonitoredFunction_2 = " + concretetonaturalMonitoredFunction_2 + "n");
	}

	public void set_natural_concretetonaturalMonitoredFunction_fromDomain_3(int concretetonaturalMonitoredFunction_3) {
		this.execution.concretetonaturalMonitoredFunction.set(NaturalDomain.ConcreteDomain.valueOf(3),
				concretetonaturalMonitoredFunction_3);
		System.out.println("Set concretetonaturalMonitoredFunction_3 = " + concretetonaturalMonitoredFunction_3 + "n");
	}

	public void set_natural_concretetonaturalMonitoredFunction_fromDomain_4(int concretetonaturalMonitoredFunction_4) {
		this.execution.concretetonaturalMonitoredFunction.set(NaturalDomain.ConcreteDomain.valueOf(4),
				concretetonaturalMonitoredFunction_4);
		System.out.println("Set concretetonaturalMonitoredFunction_4 = " + concretetonaturalMonitoredFunction_4 + "n");
	}

	public void set_natural_concretetonaturalMonitoredFunction_fromDomain_5(int concretetonaturalMonitoredFunction_5) {
		this.execution.concretetonaturalMonitoredFunction.set(NaturalDomain.ConcreteDomain.valueOf(5),
				concretetonaturalMonitoredFunction_5);
		System.out.println("Set concretetonaturalMonitoredFunction_5 = " + concretetonaturalMonitoredFunction_5 + "n");
	}
}
