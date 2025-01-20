package initerrors;// EnumTD_ATG.java automatically generated from ASM2CODE

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
		this.execution.fireUpdateSet();
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
	public EnumTD.EnumDomain get_enumControlledFunction() {
		return this.execution.enumControlledFunction.get();
	}

	public EnumTD.AnotherEnumDomain get_anotherEnumControlledFunction() {
		return this.execution.anotherEnumControlledFunction.get();
	}

	public Integer get_enumtointegerControlledFunction_fromDomain_STATE1() {
		return this.execution.enumtointegerControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(0));
	}

	public Integer get_enumtointegerControlledFunction_fromDomain_STATE2() {
		return this.execution.enumtointegerControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(1));
	}

	public Integer get_enumtointegerControlledFunction_fromDomain_STATE3() {
		return this.execution.enumtointegerControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(2));
	}

	public Boolean get_enumtobooleanControlledFunction_fromDomain_STATE1() {
		return this.execution.enumtobooleanControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(0));
	}

	public Boolean get_enumtobooleanControlledFunction_fromDomain_STATE2() {
		return this.execution.enumtobooleanControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(1));
	}

	public Boolean get_enumtobooleanControlledFunction_fromDomain_STATE3() {
		return this.execution.enumtobooleanControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(2));
	}

	public String get_enumtostringControlledFunction_fromDomain_STATE1() {
		return this.execution.enumtostringControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(0));
	}

	public String get_enumtostringControlledFunction_fromDomain_STATE2() {
		return this.execution.enumtostringControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(1));
	}

	public String get_enumtostringControlledFunction_fromDomain_STATE3() {
		return this.execution.enumtostringControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(2));
	}

	public Character get_enumtocharControlledFunction_fromDomain_STATE1() {
		return this.execution.enumtocharControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(0));
	}

	public Character get_enumtocharControlledFunction_fromDomain_STATE2() {
		return this.execution.enumtocharControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(1));
	}

	public Character get_enumtocharControlledFunction_fromDomain_STATE3() {
		return this.execution.enumtocharControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(2));
	}

	public Double get_enumtorealControlledFunction_fromDomain_STATE1() {
		return this.execution.enumtorealControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(0));
	}

	public Double get_enumtorealControlledFunction_fromDomain_STATE2() {
		return this.execution.enumtorealControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(1));
	}

	public Double get_enumtorealControlledFunction_fromDomain_STATE3() {
		return this.execution.enumtorealControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(2));
	}

	public String get_enumtoabstractControlledFunction_fromDomain_STATE1() {
		String value = EnumTD.AbstractDomain.toString(this.execution.enumtoabstractControlledFunction.oldValues
				.get(this.execution.EnumDomain_elemsList.get(0)));
		return value != null ? "abstract_" + value : null;
	}

	public String get_enumtoabstractControlledFunction_fromDomain_STATE2() {
		String value = EnumTD.AbstractDomain.toString(this.execution.enumtoabstractControlledFunction.oldValues
				.get(this.execution.EnumDomain_elemsList.get(1)));
		return value != null ? "abstract_" + value : null;
	}

	public String get_enumtoabstractControlledFunction_fromDomain_STATE3() {
		String value = EnumTD.AbstractDomain.toString(this.execution.enumtoabstractControlledFunction.oldValues
				.get(this.execution.EnumDomain_elemsList.get(2)));
		return value != null ? "abstract_" + value : null;
	}

	public Integer get_enumtoconcreteControlledFunction_fromDomain_STATE1() {
		return this.execution.enumtoconcreteControlledFunction.oldValues
				.get(this.execution.EnumDomain_elemsList.get(0)).value;
	}

	public Integer get_enumtoconcreteControlledFunction_fromDomain_STATE2() {
		return this.execution.enumtoconcreteControlledFunction.oldValues
				.get(this.execution.EnumDomain_elemsList.get(1)).value;
	}

	public Integer get_enumtoconcreteControlledFunction_fromDomain_STATE3() {
		return this.execution.enumtoconcreteControlledFunction.oldValues
				.get(this.execution.EnumDomain_elemsList.get(2)).value;
	}

	public EnumTD.EnumDomain get_enumtoenumControlledFunction_fromDomain_STATE1() {
		return this.execution.enumtoenumControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(0));
	}

	public EnumTD.EnumDomain get_enumtoenumControlledFunction_fromDomain_STATE2() {
		return this.execution.enumtoenumControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(1));
	}

	public EnumTD.EnumDomain get_enumtoenumControlledFunction_fromDomain_STATE3() {
		return this.execution.enumtoenumControlledFunction.oldValues.get(this.execution.EnumDomain_elemsList.get(2));
	}

	public EnumTD.AnotherEnumDomain get_anotherEnumtoenumControlledFunction_fromDomain_STATE1() {
		return this.execution.anotherEnumtoenumControlledFunction.oldValues
				.get(this.execution.EnumDomain_elemsList.get(0));
	}

	public EnumTD.AnotherEnumDomain get_anotherEnumtoenumControlledFunction_fromDomain_STATE2() {
		return this.execution.anotherEnumtoenumControlledFunction.oldValues
				.get(this.execution.EnumDomain_elemsList.get(1));
	}

	public EnumTD.AnotherEnumDomain get_anotherEnumtoenumControlledFunction_fromDomain_STATE3() {
		return this.execution.anotherEnumtoenumControlledFunction.oldValues
				.get(this.execution.EnumDomain_elemsList.get(2));
	}

	// Monitored setters
	public void set_enumMonitoredFunction(EnumTD.EnumDomain enumMonitoredFunction) {
		this.execution.enumMonitoredFunction.set(enumMonitoredFunction);
		System.out.println("Set enumMonitoredFunction = " + enumMonitoredFunction);
	}

	public void set_anotherenumMonitoredFunction(EnumTD.AnotherEnumDomain anotherenumMonitoredFunction) {
		this.execution.anotherenumMonitoredFunction.set(anotherenumMonitoredFunction);
		System.out.println("Set anotherenumMonitoredFunction = " + anotherenumMonitoredFunction);
	}

	public void set_enumtointegerMonitoredFunction_fromDomain_STATE1(int enumtointegerMonitoredFunction_STATE1) {
		this.execution.enumtointegerMonitoredFunction.set(EnumTD.EnumDomain.STATE1,
				enumtointegerMonitoredFunction_STATE1);
		System.out.println("Set enumtointegerMonitoredFunction_STATE1 = " + enumtointegerMonitoredFunction_STATE1);
	}

	public void set_enumtointegerMonitoredFunction_fromDomain_STATE2(int enumtointegerMonitoredFunction_STATE2) {
		this.execution.enumtointegerMonitoredFunction.set(EnumTD.EnumDomain.STATE2,
				enumtointegerMonitoredFunction_STATE2);
		System.out.println("Set enumtointegerMonitoredFunction_STATE2 = " + enumtointegerMonitoredFunction_STATE2);
	}

	public void set_enumtointegerMonitoredFunction_fromDomain_STATE3(int enumtointegerMonitoredFunction_STATE3) {
		this.execution.enumtointegerMonitoredFunction.set(EnumTD.EnumDomain.STATE3,
				enumtointegerMonitoredFunction_STATE3);
		System.out.println("Set enumtointegerMonitoredFunction_STATE3 = " + enumtointegerMonitoredFunction_STATE3);
	}

	public void set_enumtobooleanMonitoredFunction_fromDomain_STATE1(boolean enumtobooleanMonitoredFunction_STATE1) {
		this.execution.enumtobooleanMonitoredFunction.set(EnumTD.EnumDomain.STATE1,
				enumtobooleanMonitoredFunction_STATE1);
		System.out.println("Set enumtobooleanMonitoredFunction_STATE1 = " + enumtobooleanMonitoredFunction_STATE1);
	}

	public void set_enumtobooleanMonitoredFunction_fromDomain_STATE2(boolean enumtobooleanMonitoredFunction_STATE2) {
		this.execution.enumtobooleanMonitoredFunction.set(EnumTD.EnumDomain.STATE2,
				enumtobooleanMonitoredFunction_STATE2);
		System.out.println("Set enumtobooleanMonitoredFunction_STATE2 = " + enumtobooleanMonitoredFunction_STATE2);
	}

	public void set_enumtobooleanMonitoredFunction_fromDomain_STATE3(boolean enumtobooleanMonitoredFunction_STATE3) {
		this.execution.enumtobooleanMonitoredFunction.set(EnumTD.EnumDomain.STATE3,
				enumtobooleanMonitoredFunction_STATE3);
		System.out.println("Set enumtobooleanMonitoredFunction_STATE3 = " + enumtobooleanMonitoredFunction_STATE3);
	}

	public void set_enumtostringMonitoredFunction_fromDomain_STATE1(String enumtostringMonitoredFunction_STATE1) {
		this.execution.enumtostringMonitoredFunction.set(EnumTD.EnumDomain.STATE1,
				enumtostringMonitoredFunction_STATE1);
		System.out.println("Set enumtostringMonitoredFunction_STATE1 = " + enumtostringMonitoredFunction_STATE1);
	}

	public void set_enumtostringMonitoredFunction_fromDomain_STATE2(String enumtostringMonitoredFunction_STATE2) {
		this.execution.enumtostringMonitoredFunction.set(EnumTD.EnumDomain.STATE2,
				enumtostringMonitoredFunction_STATE2);
		System.out.println("Set enumtostringMonitoredFunction_STATE2 = " + enumtostringMonitoredFunction_STATE2);
	}

	public void set_enumtostringMonitoredFunction_fromDomain_STATE3(String enumtostringMonitoredFunction_STATE3) {
		this.execution.enumtostringMonitoredFunction.set(EnumTD.EnumDomain.STATE3,
				enumtostringMonitoredFunction_STATE3);
		System.out.println("Set enumtostringMonitoredFunction_STATE3 = " + enumtostringMonitoredFunction_STATE3);
	}

	public void set_enumtocharMonitoredFunction_fromDomain_STATE1(char enumtocharMonitoredFunction_STATE1) {
		this.execution.enumtocharMonitoredFunction.set(EnumTD.EnumDomain.STATE1, enumtocharMonitoredFunction_STATE1);
		System.out.println("Set enumtocharMonitoredFunction_STATE1 = " + enumtocharMonitoredFunction_STATE1);
	}

	public void set_enumtocharMonitoredFunction_fromDomain_STATE2(char enumtocharMonitoredFunction_STATE2) {
		this.execution.enumtocharMonitoredFunction.set(EnumTD.EnumDomain.STATE2, enumtocharMonitoredFunction_STATE2);
		System.out.println("Set enumtocharMonitoredFunction_STATE2 = " + enumtocharMonitoredFunction_STATE2);
	}

	public void set_enumtocharMonitoredFunction_fromDomain_STATE3(char enumtocharMonitoredFunction_STATE3) {
		this.execution.enumtocharMonitoredFunction.set(EnumTD.EnumDomain.STATE3, enumtocharMonitoredFunction_STATE3);
		System.out.println("Set enumtocharMonitoredFunction_STATE3 = " + enumtocharMonitoredFunction_STATE3);
	}

	public void set_enumtorealMonitoredFunction_fromDomain_STATE1(double enumtorealMonitoredFunction_STATE1) {
		this.execution.enumtorealMonitoredFunction.set(EnumTD.EnumDomain.STATE1, enumtorealMonitoredFunction_STATE1);
		System.out.println("Set enumtorealMonitoredFunction_STATE1 = " + enumtorealMonitoredFunction_STATE1);
	}

	public void set_enumtorealMonitoredFunction_fromDomain_STATE2(double enumtorealMonitoredFunction_STATE2) {
		this.execution.enumtorealMonitoredFunction.set(EnumTD.EnumDomain.STATE2, enumtorealMonitoredFunction_STATE2);
		System.out.println("Set enumtorealMonitoredFunction_STATE2 = " + enumtorealMonitoredFunction_STATE2);
	}

	public void set_enumtorealMonitoredFunction_fromDomain_STATE3(double enumtorealMonitoredFunction_STATE3) {
		this.execution.enumtorealMonitoredFunction.set(EnumTD.EnumDomain.STATE3, enumtorealMonitoredFunction_STATE3);
		System.out.println("Set enumtorealMonitoredFunction_STATE3 = " + enumtorealMonitoredFunction_STATE3);
	}

	public void set_abstract_enumtoabstractMonitoredFunction_fromDomain_STATE1(
			String enumtoabstractMonitoredFunction_STATE1) {
		this.execution.enumtoabstractMonitoredFunction.set(EnumTD.EnumDomain.STATE1,
				EnumTD.AbstractDomain.get(enumtoabstractMonitoredFunction_STATE1));
		System.out.println("Set enumtoabstractMonitoredFunction_STATE1 = " + enumtoabstractMonitoredFunction_STATE1);
	}

	public void set_abstract_enumtoabstractMonitoredFunction_fromDomain_STATE2(
			String enumtoabstractMonitoredFunction_STATE2) {
		this.execution.enumtoabstractMonitoredFunction.set(EnumTD.EnumDomain.STATE2,
				EnumTD.AbstractDomain.get(enumtoabstractMonitoredFunction_STATE2));
		System.out.println("Set enumtoabstractMonitoredFunction_STATE2 = " + enumtoabstractMonitoredFunction_STATE2);
	}

	public void set_abstract_enumtoabstractMonitoredFunction_fromDomain_STATE3(
			String enumtoabstractMonitoredFunction_STATE3) {
		this.execution.enumtoabstractMonitoredFunction.set(EnumTD.EnumDomain.STATE3,
				EnumTD.AbstractDomain.get(enumtoabstractMonitoredFunction_STATE3));
		System.out.println("Set enumtoabstractMonitoredFunction_STATE3 = " + enumtoabstractMonitoredFunction_STATE3);
	}

	public void set_enumtoconcreteMonitoredFunction_fromDomain_STATE1(Integer enumtoconcreteMonitoredFunction_STATE1) {
		this.execution.enumtoconcreteMonitoredFunction.set(EnumTD.EnumDomain.STATE1, EnumTD.ConcreteDomain
				.valueOf(this.execution.ConcreteDomain_elems.get(enumtoconcreteMonitoredFunction_STATE1)));
		System.out.println("Set enumtoconcreteMonitoredFunction_STATE1 = " + enumtoconcreteMonitoredFunction_STATE1);
	}

	public void set_enumtoconcreteMonitoredFunction_fromDomain_STATE2(Integer enumtoconcreteMonitoredFunction_STATE2) {
		this.execution.enumtoconcreteMonitoredFunction.set(EnumTD.EnumDomain.STATE2, EnumTD.ConcreteDomain
				.valueOf(this.execution.ConcreteDomain_elems.get(enumtoconcreteMonitoredFunction_STATE2)));
		System.out.println("Set enumtoconcreteMonitoredFunction_STATE2 = " + enumtoconcreteMonitoredFunction_STATE2);
	}

	public void set_enumtoconcreteMonitoredFunction_fromDomain_STATE3(Integer enumtoconcreteMonitoredFunction_STATE3) {
		this.execution.enumtoconcreteMonitoredFunction.set(EnumTD.EnumDomain.STATE3, EnumTD.ConcreteDomain
				.valueOf(this.execution.ConcreteDomain_elems.get(enumtoconcreteMonitoredFunction_STATE3)));
		System.out.println("Set enumtoconcreteMonitoredFunction_STATE3 = " + enumtoconcreteMonitoredFunction_STATE3);
	}

	public void set_enumtoenumMonitoredFunction_fromDomain_STATE1(
			EnumTD.EnumDomain enumtoenumMonitoredFunction_STATE1) {
		this.execution.enumtoenumMonitoredFunction.set(EnumTD.EnumDomain.STATE1, enumtoenumMonitoredFunction_STATE1);
		System.out.println("Set enumtoenumMonitoredFunction_STATE1 = " + enumtoenumMonitoredFunction_STATE1);
	}

	public void set_enumtoenumMonitoredFunction_fromDomain_STATE2(
			EnumTD.EnumDomain enumtoenumMonitoredFunction_STATE2) {
		this.execution.enumtoenumMonitoredFunction.set(EnumTD.EnumDomain.STATE2, enumtoenumMonitoredFunction_STATE2);
		System.out.println("Set enumtoenumMonitoredFunction_STATE2 = " + enumtoenumMonitoredFunction_STATE2);
	}

	public void set_enumtoenumMonitoredFunction_fromDomain_STATE3(
			EnumTD.EnumDomain enumtoenumMonitoredFunction_STATE3) {
		this.execution.enumtoenumMonitoredFunction.set(EnumTD.EnumDomain.STATE3, enumtoenumMonitoredFunction_STATE3);
		System.out.println("Set enumtoenumMonitoredFunction_STATE3 = " + enumtoenumMonitoredFunction_STATE3);
	}

	public void set_anotherEnumtoenumMonitoredFunction_fromDomain_ON(
			EnumTD.EnumDomain anotherEnumtoenumMonitoredFunction_ON) {
		this.execution.anotherEnumtoenumMonitoredFunction.set(EnumTD.AnotherEnumDomain.ON,
				anotherEnumtoenumMonitoredFunction_ON);
		System.out.println("Set anotherEnumtoenumMonitoredFunction_ON = " + anotherEnumtoenumMonitoredFunction_ON);
	}

	public void set_anotherEnumtoenumMonitoredFunction_fromDomain_OFF(
			EnumTD.EnumDomain anotherEnumtoenumMonitoredFunction_OFF) {
		this.execution.anotherEnumtoenumMonitoredFunction.set(EnumTD.AnotherEnumDomain.OFF,
				anotherEnumtoenumMonitoredFunction_OFF);
		System.out.println("Set anotherEnumtoenumMonitoredFunction_OFF = " + anotherEnumtoenumMonitoredFunction_OFF);
	}
}
