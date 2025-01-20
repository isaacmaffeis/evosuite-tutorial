package domaintests;// AbstractTD_ATG.java automatically generated from ASM2CODE

/**
* This class is designed to simulate the behavior of an abstract state machine in an automated way.
*
* <p>
* It has been optimized to be used with evosuite in order to automatically generate test scenarios.
* </p>
*/
class AbstractTD_ATG {
	/** Instance of the asmeta specification translated into a java class.*/
	private final AbstractTD execution;
	/** current state. */
	private int state;

	/**
	* Constructor of the {@code AbstractTD_ATG} class. Creates a private instance of the asm
	* {@link AbstractTD} and sets the initial state of the state machine to 0.
	*/
	public AbstractTD_ATG() {
		this.execution = new AbstractTD();
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
	public String get_abstractControlledFunction() {
		String value = AbstractTD.AbstractDomain.toString(this.execution.abstractControlledFunction.get());
		return value != null ? "abstract_" + value : null;
	}

	public String get_enumtoabstractControlledFunction_fromDomain_STATE1() {
		String value = AbstractTD.AbstractDomain.toString(this.execution.enumtoabstractControlledFunction.oldValues
				.get(this.execution.EnumDomain_elemsList.get(0)));
		return value != null ? "abstract_" + value : null;
	}

	public String get_enumtoabstractControlledFunction_fromDomain_STATE2() {
		String value = AbstractTD.AbstractDomain.toString(this.execution.enumtoabstractControlledFunction.oldValues
				.get(this.execution.EnumDomain_elemsList.get(1)));
		return value != null ? "abstract_" + value : null;
	}

	public String get_enumtoabstractControlledFunction_fromDomain_STATE3() {
		String value = AbstractTD.AbstractDomain.toString(this.execution.enumtoabstractControlledFunction.oldValues
				.get(this.execution.EnumDomain_elemsList.get(2)));
		return value != null ? "abstract_" + value : null;
	}

	public String get_stringControlledFunction() {
		return this.execution.stringControlledFunction.get();
	}

	public Integer get_abstracttointegerControlledFunction_fromDomain_value1() {
		return this.execution.abstracttointegerControlledFunction.oldValues
				.get(AbstractTD.AbstractDomain.get("value1"));
	}

	public Integer get_abstracttointegerControlledFunction_fromDomain_value2() {
		return this.execution.abstracttointegerControlledFunction.oldValues
				.get(AbstractTD.AbstractDomain.get("value2"));
	}

	public String get_abstracttostringControlledFunction_fromDomain_value1() {
		return this.execution.abstracttostringControlledFunction.oldValues.get(AbstractTD.AbstractDomain.get("value1"));
	}

	public String get_abstracttostringControlledFunction_fromDomain_value2() {
		return this.execution.abstracttostringControlledFunction.oldValues.get(AbstractTD.AbstractDomain.get("value2"));
	}

	public Boolean get_abstracttobooleanControlledFunction_fromDomain_value1() {
		return this.execution.abstracttobooleanControlledFunction.oldValues
				.get(AbstractTD.AbstractDomain.get("value1"));
	}

	public Boolean get_abstracttobooleanControlledFunction_fromDomain_value2() {
		return this.execution.abstracttobooleanControlledFunction.oldValues
				.get(AbstractTD.AbstractDomain.get("value2"));
	}

	public Double get_abstracttorealControlledFunction_fromDomain_value1() {
		return this.execution.abstracttorealControlledFunction.oldValues.get(AbstractTD.AbstractDomain.get("value1"));
	}

	public Double get_abstracttorealControlledFunction_fromDomain_value2() {
		return this.execution.abstracttorealControlledFunction.oldValues.get(AbstractTD.AbstractDomain.get("value2"));
	}

	public Character get_abstracttocharControlledFunction_fromDomain_value1() {
		return this.execution.abstracttocharControlledFunction.oldValues.get(AbstractTD.AbstractDomain.get("value1"));
	}

	public Character get_abstracttocharControlledFunction_fromDomain_value2() {
		return this.execution.abstracttocharControlledFunction.oldValues.get(AbstractTD.AbstractDomain.get("value2"));
	}

	public AbstractTD.EnumDomain get_abstracttoenumControlledFunction_fromDomain_value1() {
		return this.execution.abstracttoenumControlledFunction.oldValues.get(AbstractTD.AbstractDomain.get("value1"));
	}

	public AbstractTD.EnumDomain get_abstracttoenumControlledFunction_fromDomain_value2() {
		return this.execution.abstracttoenumControlledFunction.oldValues.get(AbstractTD.AbstractDomain.get("value2"));
	}

	public String get_abstracttoabstractControlledFunction_fromDomain_value1() {
		String value = AbstractTD.AnotherAbstractDomain
				.toString(this.execution.abstracttoabstractControlledFunction.oldValues
						.get(AbstractTD.AbstractDomain.get("value1")));
		return value != null ? "abstract_" + value : null;
	}

	public String get_abstracttoabstractControlledFunction_fromDomain_value2() {
		String value = AbstractTD.AnotherAbstractDomain
				.toString(this.execution.abstracttoabstractControlledFunction.oldValues
						.get(AbstractTD.AbstractDomain.get("value2")));
		return value != null ? "abstract_" + value : null;
	}

	public Integer get_abstracttoconcreteControlledFunction_fromDomain_value1() {
		return this.execution.abstracttoconcreteControlledFunction.oldValues
				.get(AbstractTD.AbstractDomain.get("value1")).value;
	}

	public Integer get_abstracttoconcreteControlledFunction_fromDomain_value2() {
		return this.execution.abstracttoconcreteControlledFunction.oldValues
				.get(AbstractTD.AbstractDomain.get("value2")).value;
	}

	// Monitored setters
	public void set_abstract_abstractMonitoredFunction(String abstractMonitoredFunction) {
		this.execution.abstractMonitoredFunction.set(AbstractTD.AbstractDomain.get(abstractMonitoredFunction));
		System.out.println("Set abstractMonitoredFunction = " + abstractMonitoredFunction);
	}

	public void set_abstract_enumtoabstractMonitoredFunction_fromDomain_STATE1(
			String enumtoabstractMonitoredFunction_STATE1) {
		this.execution.enumtoabstractMonitoredFunction.set(AbstractTD.EnumDomain.STATE1,
				AbstractTD.AbstractDomain.get(enumtoabstractMonitoredFunction_STATE1));
		System.out.println("Set enumtoabstractMonitoredFunction_STATE1 = " + enumtoabstractMonitoredFunction_STATE1);
	}

	public void set_abstract_enumtoabstractMonitoredFunction_fromDomain_STATE2(
			String enumtoabstractMonitoredFunction_STATE2) {
		this.execution.enumtoabstractMonitoredFunction.set(AbstractTD.EnumDomain.STATE2,
				AbstractTD.AbstractDomain.get(enumtoabstractMonitoredFunction_STATE2));
		System.out.println("Set enumtoabstractMonitoredFunction_STATE2 = " + enumtoabstractMonitoredFunction_STATE2);
	}

	public void set_abstract_enumtoabstractMonitoredFunction_fromDomain_STATE3(
			String enumtoabstractMonitoredFunction_STATE3) {
		this.execution.enumtoabstractMonitoredFunction.set(AbstractTD.EnumDomain.STATE3,
				AbstractTD.AbstractDomain.get(enumtoabstractMonitoredFunction_STATE3));
		System.out.println("Set enumtoabstractMonitoredFunction_STATE3 = " + enumtoabstractMonitoredFunction_STATE3);
	}

	public void set_stringMonitoredFunction(String stringMonitoredFunction) {
		this.execution.stringMonitoredFunction.set(stringMonitoredFunction);
		System.out.println("Set stringMonitoredFunction = " + stringMonitoredFunction);
	}

	public void set_abstracttointegerMonitoredFunction_fromDomain_value1(
			int abstracttointegerMonitoredFunction_value1) {
		this.execution.abstracttointegerMonitoredFunction.set(AbstractTD.AbstractDomain.get("value1"),
				abstracttointegerMonitoredFunction_value1);
		System.out.println(
				"Set abstracttointegerMonitoredFunction_value1 = " + abstracttointegerMonitoredFunction_value1);
	}

	public void set_abstracttointegerMonitoredFunction_fromDomain_value2(
			int abstracttointegerMonitoredFunction_value2) {
		this.execution.abstracttointegerMonitoredFunction.set(AbstractTD.AbstractDomain.get("value2"),
				abstracttointegerMonitoredFunction_value2);
		System.out.println(
				"Set abstracttointegerMonitoredFunction_value2 = " + abstracttointegerMonitoredFunction_value2);
	}

	public void set_abstracttostringMonitoredFunction_fromDomain_value1(
			String abstracttostringMonitoredFunction_value1) {
		this.execution.abstracttostringMonitoredFunction.set(AbstractTD.AbstractDomain.get("value1"),
				abstracttostringMonitoredFunction_value1);
		System.out
				.println("Set abstracttostringMonitoredFunction_value1 = " + abstracttostringMonitoredFunction_value1);
	}

	public void set_abstracttostringMonitoredFunction_fromDomain_value2(
			String abstracttostringMonitoredFunction_value2) {
		this.execution.abstracttostringMonitoredFunction.set(AbstractTD.AbstractDomain.get("value2"),
				abstracttostringMonitoredFunction_value2);
		System.out
				.println("Set abstracttostringMonitoredFunction_value2 = " + abstracttostringMonitoredFunction_value2);
	}

	public void set_abstracttobooleanMonitoredFunction_fromDomain_value1(
			boolean abstracttobooleanMonitoredFunction_value1) {
		this.execution.abstracttobooleanMonitoredFunction.set(AbstractTD.AbstractDomain.get("value1"),
				abstracttobooleanMonitoredFunction_value1);
		System.out.println(
				"Set abstracttobooleanMonitoredFunction_value1 = " + abstracttobooleanMonitoredFunction_value1);
	}

	public void set_abstracttobooleanMonitoredFunction_fromDomain_value2(
			boolean abstracttobooleanMonitoredFunction_value2) {
		this.execution.abstracttobooleanMonitoredFunction.set(AbstractTD.AbstractDomain.get("value2"),
				abstracttobooleanMonitoredFunction_value2);
		System.out.println(
				"Set abstracttobooleanMonitoredFunction_value2 = " + abstracttobooleanMonitoredFunction_value2);
	}

	public void set_abstracttorealMonitoredFunction_fromDomain_value1(double abstracttorealMonitoredFunction_value1) {
		this.execution.abstracttorealMonitoredFunction.set(AbstractTD.AbstractDomain.get("value1"),
				abstracttorealMonitoredFunction_value1);
		System.out.println("Set abstracttorealMonitoredFunction_value1 = " + abstracttorealMonitoredFunction_value1);
	}

	public void set_abstracttorealMonitoredFunction_fromDomain_value2(double abstracttorealMonitoredFunction_value2) {
		this.execution.abstracttorealMonitoredFunction.set(AbstractTD.AbstractDomain.get("value2"),
				abstracttorealMonitoredFunction_value2);
		System.out.println("Set abstracttorealMonitoredFunction_value2 = " + abstracttorealMonitoredFunction_value2);
	}

	public void set_abstracttocharMonitoredFunction_fromDomain_value1(char abstracttocharMonitoredFunction_value1) {
		this.execution.abstracttocharMonitoredFunction.set(AbstractTD.AbstractDomain.get("value1"),
				abstracttocharMonitoredFunction_value1);
		System.out.println("Set abstracttocharMonitoredFunction_value1 = " + abstracttocharMonitoredFunction_value1);
	}

	public void set_abstracttocharMonitoredFunction_fromDomain_value2(char abstracttocharMonitoredFunction_value2) {
		this.execution.abstracttocharMonitoredFunction.set(AbstractTD.AbstractDomain.get("value2"),
				abstracttocharMonitoredFunction_value2);
		System.out.println("Set abstracttocharMonitoredFunction_value2 = " + abstracttocharMonitoredFunction_value2);
	}

	public void set_abstracttoenumMonitoredFunction_fromDomain_value1(
			AbstractTD.EnumDomain abstracttoenumMonitoredFunction_value1) {
		this.execution.abstracttoenumMonitoredFunction.set(AbstractTD.AbstractDomain.get("value1"),
				abstracttoenumMonitoredFunction_value1);
		System.out.println("Set abstracttoenumMonitoredFunction_value1 = " + abstracttoenumMonitoredFunction_value1);
	}

	public void set_abstracttoenumMonitoredFunction_fromDomain_value2(
			AbstractTD.EnumDomain abstracttoenumMonitoredFunction_value2) {
		this.execution.abstracttoenumMonitoredFunction.set(AbstractTD.AbstractDomain.get("value2"),
				abstracttoenumMonitoredFunction_value2);
		System.out.println("Set abstracttoenumMonitoredFunction_value2 = " + abstracttoenumMonitoredFunction_value2);
	}

	public void set_abstract_abstracttoabstractMonitoredFunction_fromDomain_value1(
			String abstracttoabstractMonitoredFunction_value1) {
		this.execution.abstracttoabstractMonitoredFunction.set(AbstractTD.AbstractDomain.get("value1"),
				AbstractTD.AnotherAbstractDomain.get(abstracttoabstractMonitoredFunction_value1));
		System.out.println(
				"Set abstracttoabstractMonitoredFunction_value1 = " + abstracttoabstractMonitoredFunction_value1);
	}

	public void set_abstract_abstracttoabstractMonitoredFunction_fromDomain_value2(
			String abstracttoabstractMonitoredFunction_value2) {
		this.execution.abstracttoabstractMonitoredFunction.set(AbstractTD.AbstractDomain.get("value2"),
				AbstractTD.AnotherAbstractDomain.get(abstracttoabstractMonitoredFunction_value2));
		System.out.println(
				"Set abstracttoabstractMonitoredFunction_value2 = " + abstracttoabstractMonitoredFunction_value2);
	}

	public void set_abstracttoconcreteMonitoredFunction_fromDomain_value1(
			int abstracttoconcreteMonitoredFunction_value1) {
		this.execution.abstracttoconcreteMonitoredFunction.set(AbstractTD.AbstractDomain.get("value1"),
				AbstractTD.ConcreteDomain
						.valueOf(this.execution.ConcreteDomain_elems.get(abstracttoconcreteMonitoredFunction_value1)));
		System.out.println(
				"Set abstracttoconcreteMonitoredFunction_value1 = " + abstracttoconcreteMonitoredFunction_value1);
	}

	public void set_abstracttoconcreteMonitoredFunction_fromDomain_value2(
			int abstracttoconcreteMonitoredFunction_value2) {
		this.execution.abstracttoconcreteMonitoredFunction.set(AbstractTD.AbstractDomain.get("value2"),
				AbstractTD.ConcreteDomain
						.valueOf(this.execution.ConcreteDomain_elems.get(abstracttoconcreteMonitoredFunction_value2)));
		System.out.println(
				"Set abstracttoconcreteMonitoredFunction_value2 = " + abstracttoconcreteMonitoredFunction_value2);
	}
}
