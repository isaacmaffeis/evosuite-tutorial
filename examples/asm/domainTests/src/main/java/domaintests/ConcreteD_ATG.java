package domaintests;// ConcreteD_ATG.java automatically generated from ASM2CODE

/**
* This class is designed to simulate the behavior of an abstract state machine in an automated way.
*
* <p>
* It has been optimized to be used with evosuite in order to automatically generate test scenarios.
* </p>
*/
class ConcreteD_ATG {
	/** Instance of the asmeta specification translated into a java class.*/
	private final ConcreteD execution;
	/** current state. */
	private int state;

	/**
	* Constructor of the {@code ConcreteD_ATG} class. Creates a private instance of the asm
	* {@link ConcreteD} and sets the initial state of the state machine to 0.
	*/
	public ConcreteD_ATG() {
		this.execution = new ConcreteD();
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
	* To achieve complete output coverage, only the functions that cover enum codomains need to be invoked.
	* </p>
	*/
	private void coverOutputs() {
	}

	/* ASM Methods */
	// Controlled getters
	public Integer get_concreteDomainControlledFunction() {
		if (this.execution.concreteDomainControlledFunction.get() != null) {
			return this.execution.concreteDomainControlledFunction.get().value;
		}
		return null;
	}

	public Integer get_concreteDomain2ControlledFunction() {
		if (this.execution.concreteDomain2ControlledFunction.get() != null) {
			return this.execution.concreteDomain2ControlledFunction.get().value;
		}
		return null;
	}

	public ConcreteD.EnumDomain get_concreteEnumDomainControlledFunction() {
		if (this.execution.concreteEnumDomainControlledFunction.get() != null) {
			return this.execution.concreteEnumDomainControlledFunction.get().value;
		}
		return null;
	}

	public ConcreteD.EnumDomain get_concreteToEnumControlledFunction_fromDomain_1() {
		return this.execution.concreteToEnumControlledFunction.get(ConcreteD.ConcreteDomain.valueOf(1));
	}

	public ConcreteD.EnumDomain get_concreteToEnumControlledFunction_fromDomain_2() {
		return this.execution.concreteToEnumControlledFunction.get(ConcreteD.ConcreteDomain.valueOf(2));
	}

	public ConcreteD.EnumDomain get_concreteToEnumControlledFunction_fromDomain_3() {
		return this.execution.concreteToEnumControlledFunction.get(ConcreteD.ConcreteDomain.valueOf(3));
	}

	public ConcreteD.EnumDomain get_concreteToEnumControlledFunction_fromDomain_4() {
		return this.execution.concreteToEnumControlledFunction.get(ConcreteD.ConcreteDomain.valueOf(4));
	}

	public ConcreteD.EnumDomain get_concreteToEnumControlledFunction_fromDomain_5() {
		return this.execution.concreteToEnumControlledFunction.get(ConcreteD.ConcreteDomain.valueOf(5));
	}

	public ConcreteD.EnumDomain get_enumConcreteToEnumControlledFunction_fromDomain_STATE1() {
		return this.execution.enumConcreteToEnumControlledFunction
				.get(ConcreteD.ConcreteEnumDomain.valueOf(ConcreteD.EnumDomain.STATE1));
	}

	public ConcreteD.EnumDomain get_enumConcreteToEnumControlledFunction_fromDomain_STATE2() {
		return this.execution.enumConcreteToEnumControlledFunction
				.get(ConcreteD.ConcreteEnumDomain.valueOf(ConcreteD.EnumDomain.STATE2));
	}

	public Integer get_enumConcreteToIntegerControlledFunction_fromDomain_STATE1() {
		return this.execution.enumConcreteToIntegerControlledFunction
				.get(ConcreteD.ConcreteEnumDomain.valueOf(ConcreteD.EnumDomain.STATE1));
	}

	public Integer get_enumConcreteToIntegerControlledFunction_fromDomain_STATE2() {
		return this.execution.enumConcreteToIntegerControlledFunction
				.get(ConcreteD.ConcreteEnumDomain.valueOf(ConcreteD.EnumDomain.STATE2));
	}

	public String get_enumContreteToAbstractControlledFunction_fromDomain_STATE1() {
		return ConcreteD.AbstractDomain.toString(this.execution.enumContreteToAbstractControlledFunction
				.get(ConcreteD.ConcreteEnumDomain.valueOf(ConcreteD.EnumDomain.STATE1)));
	}

	public String get_enumContreteToAbstractControlledFunction_fromDomain_STATE2() {
		return ConcreteD.AbstractDomain.toString(this.execution.enumContreteToAbstractControlledFunction
				.get(ConcreteD.ConcreteEnumDomain.valueOf(ConcreteD.EnumDomain.STATE2)));
	}

	public Integer get_concreteToConcrete2ControlledFunction_fromDomain_1() {
		return this.execution.concreteToConcrete2ControlledFunction.get(ConcreteD.ConcreteDomain.valueOf(1)).value;
	}

	public Integer get_concreteToConcrete2ControlledFunction_fromDomain_2() {
		return this.execution.concreteToConcrete2ControlledFunction.get(ConcreteD.ConcreteDomain.valueOf(2)).value;
	}

	public Integer get_concreteToConcrete2ControlledFunction_fromDomain_3() {
		return this.execution.concreteToConcrete2ControlledFunction.get(ConcreteD.ConcreteDomain.valueOf(3)).value;
	}

	public Integer get_concreteToConcrete2ControlledFunction_fromDomain_4() {
		return this.execution.concreteToConcrete2ControlledFunction.get(ConcreteD.ConcreteDomain.valueOf(4)).value;
	}

	public Integer get_concreteToConcrete2ControlledFunction_fromDomain_5() {
		return this.execution.concreteToConcrete2ControlledFunction.get(ConcreteD.ConcreteDomain.valueOf(5)).value;
	}

	public String get_concretetoAbstractControlledFunction_fromDomain_1() {
		return ConcreteD.AbstractDomain
				.toString(this.execution.concretetoAbstractControlledFunction.get(ConcreteD.ConcreteDomain.valueOf(1)));
	}

	public String get_concretetoAbstractControlledFunction_fromDomain_2() {
		return ConcreteD.AbstractDomain
				.toString(this.execution.concretetoAbstractControlledFunction.get(ConcreteD.ConcreteDomain.valueOf(2)));
	}

	public String get_concretetoAbstractControlledFunction_fromDomain_3() {
		return ConcreteD.AbstractDomain
				.toString(this.execution.concretetoAbstractControlledFunction.get(ConcreteD.ConcreteDomain.valueOf(3)));
	}

	public String get_concretetoAbstractControlledFunction_fromDomain_4() {
		return ConcreteD.AbstractDomain
				.toString(this.execution.concretetoAbstractControlledFunction.get(ConcreteD.ConcreteDomain.valueOf(4)));
	}

	public String get_concretetoAbstractControlledFunction_fromDomain_5() {
		return ConcreteD.AbstractDomain
				.toString(this.execution.concretetoAbstractControlledFunction.get(ConcreteD.ConcreteDomain.valueOf(5)));
	}

	public Boolean get_concrete2toBooleanControlledFunction_fromDomain_1() {
		return this.execution.concrete2toBooleanControlledFunction.get(ConcreteD.ConcreteDomain2.valueOf(1));
	}

	public Boolean get_concrete2toBooleanControlledFunction_fromDomain_5() {
		return this.execution.concrete2toBooleanControlledFunction.get(ConcreteD.ConcreteDomain2.valueOf(5));
	}

	public Boolean get_concrete2toBooleanControlledFunction_fromDomain_10() {
		return this.execution.concrete2toBooleanControlledFunction.get(ConcreteD.ConcreteDomain2.valueOf(10));
	}

	// Monitored setters
	public void set_concreteDomainMonitoredFunction(Integer concreteDomainMonitoredFunction) {
		this.execution.concreteDomainMonitoredFunction
				.set(ConcreteD.ConcreteDomain.valueOf(concreteDomainMonitoredFunction));
		System.out.println("Set concreteDomainMonitoredFunction = " + concreteDomainMonitoredFunction);
	}

	public void set_concreteDomain2MonitoredFunction(Integer concreteDomain2MonitoredFunction) {
		this.execution.concreteDomain2MonitoredFunction
				.set(ConcreteD.ConcreteDomain2.valueOf(concreteDomain2MonitoredFunction));
		System.out.println("Set concreteDomain2MonitoredFunction = " + concreteDomain2MonitoredFunction);
	}

	public void set_concreteEnumDomainMonitoredFunction(ConcreteD.EnumDomain concreteEnumDomainMonitoredFunction) {
		this.execution.concreteEnumDomainMonitoredFunction
				.set(ConcreteD.ConcreteEnumDomain.valueOf(concreteEnumDomainMonitoredFunction));
		System.out.println("Set concreteEnumDomainMonitoredFunction = " + concreteEnumDomainMonitoredFunction);
	}

	public void set_contreteToEnumMonitoredFunction_fromDomain_1(
			ConcreteD.EnumDomain contreteToEnumMonitoredFunction_1) {
		this.execution.contreteToEnumMonitoredFunction.set(ConcreteD.ConcreteDomain.valueOf(1),
				contreteToEnumMonitoredFunction_1);
		System.out.println("Set contreteToEnumMonitoredFunction_1 = " + contreteToEnumMonitoredFunction_1);
	}

	public void set_contreteToEnumMonitoredFunction_fromDomain_2(
			ConcreteD.EnumDomain contreteToEnumMonitoredFunction_2) {
		this.execution.contreteToEnumMonitoredFunction.set(ConcreteD.ConcreteDomain.valueOf(2),
				contreteToEnumMonitoredFunction_2);
		System.out.println("Set contreteToEnumMonitoredFunction_2 = " + contreteToEnumMonitoredFunction_2);
	}

	public void set_contreteToEnumMonitoredFunction_fromDomain_3(
			ConcreteD.EnumDomain contreteToEnumMonitoredFunction_3) {
		this.execution.contreteToEnumMonitoredFunction.set(ConcreteD.ConcreteDomain.valueOf(3),
				contreteToEnumMonitoredFunction_3);
		System.out.println("Set contreteToEnumMonitoredFunction_3 = " + contreteToEnumMonitoredFunction_3);
	}

	public void set_contreteToEnumMonitoredFunction_fromDomain_4(
			ConcreteD.EnumDomain contreteToEnumMonitoredFunction_4) {
		this.execution.contreteToEnumMonitoredFunction.set(ConcreteD.ConcreteDomain.valueOf(4),
				contreteToEnumMonitoredFunction_4);
		System.out.println("Set contreteToEnumMonitoredFunction_4 = " + contreteToEnumMonitoredFunction_4);
	}

	public void set_contreteToEnumMonitoredFunction_fromDomain_5(
			ConcreteD.EnumDomain contreteToEnumMonitoredFunction_5) {
		this.execution.contreteToEnumMonitoredFunction.set(ConcreteD.ConcreteDomain.valueOf(5),
				contreteToEnumMonitoredFunction_5);
		System.out.println("Set contreteToEnumMonitoredFunction_5 = " + contreteToEnumMonitoredFunction_5);
	}

	public void set_enumContreteToEnumMonitoredFunction_fromDomain_STATE1(
			ConcreteD.EnumDomain enumContreteToEnumMonitoredFunction_STATE1) {
		this.execution.enumContreteToEnumMonitoredFunction.set(
				ConcreteD.ConcreteEnumDomain.valueOf(ConcreteD.EnumDomain.STATE1),
				enumContreteToEnumMonitoredFunction_STATE1);
		System.out.println(
				"Set enumContreteToEnumMonitoredFunction_STATE1 = " + enumContreteToEnumMonitoredFunction_STATE1);
	}

	public void set_enumContreteToEnumMonitoredFunction_fromDomain_STATE2(
			ConcreteD.EnumDomain enumContreteToEnumMonitoredFunction_STATE2) {
		this.execution.enumContreteToEnumMonitoredFunction.set(
				ConcreteD.ConcreteEnumDomain.valueOf(ConcreteD.EnumDomain.STATE2),
				enumContreteToEnumMonitoredFunction_STATE2);
		System.out.println(
				"Set enumContreteToEnumMonitoredFunction_STATE2 = " + enumContreteToEnumMonitoredFunction_STATE2);
	}

	public void set_enumContreteToIntegerMonitoredFunction_fromDomain_STATE1(
			int enumContreteToIntegerMonitoredFunction_STATE1) {
		this.execution.enumContreteToIntegerMonitoredFunction.set(
				ConcreteD.ConcreteEnumDomain.valueOf(ConcreteD.EnumDomain.STATE1),
				enumContreteToIntegerMonitoredFunction_STATE1);
		System.out.println(
				"Set enumContreteToIntegerMonitoredFunction_STATE1 = " + enumContreteToIntegerMonitoredFunction_STATE1);
	}

	public void set_enumContreteToIntegerMonitoredFunction_fromDomain_STATE2(
			int enumContreteToIntegerMonitoredFunction_STATE2) {
		this.execution.enumContreteToIntegerMonitoredFunction.set(
				ConcreteD.ConcreteEnumDomain.valueOf(ConcreteD.EnumDomain.STATE2),
				enumContreteToIntegerMonitoredFunction_STATE2);
		System.out.println(
				"Set enumContreteToIntegerMonitoredFunction_STATE2 = " + enumContreteToIntegerMonitoredFunction_STATE2);
	}

	public void set_abstract_enumContreteToAbstractMonitoredFunction_fromDomain_STATE1(
			String enumContreteToAbstractMonitoredFunction_STATE1) {
		this.execution.enumContreteToAbstractMonitoredFunction.set(
				ConcreteD.ConcreteEnumDomain.valueOf(ConcreteD.EnumDomain.STATE1),
				ConcreteD.AbstractDomain.get(enumContreteToAbstractMonitoredFunction_STATE1));
		System.out.println("Set enumContreteToAbstractMonitoredFunction_STATE1 = "
				+ enumContreteToAbstractMonitoredFunction_STATE1);
	}

	public void set_abstract_enumContreteToAbstractMonitoredFunction_fromDomain_STATE2(
			String enumContreteToAbstractMonitoredFunction_STATE2) {
		this.execution.enumContreteToAbstractMonitoredFunction.set(
				ConcreteD.ConcreteEnumDomain.valueOf(ConcreteD.EnumDomain.STATE2),
				ConcreteD.AbstractDomain.get(enumContreteToAbstractMonitoredFunction_STATE2));
		System.out.println("Set enumContreteToAbstractMonitoredFunction_STATE2 = "
				+ enumContreteToAbstractMonitoredFunction_STATE2);
	}

	public void set_concreteToConcrete2MonitoredFunction_fromDomain_1(Integer concreteToConcrete2MonitoredFunction_1) {
		this.execution.concreteToConcrete2MonitoredFunction.set(ConcreteD.ConcreteDomain.valueOf(1),
				ConcreteD.ConcreteDomain2.valueOf(concreteToConcrete2MonitoredFunction_1));
		System.out.println("Set concreteToConcrete2MonitoredFunction_1 = " + concreteToConcrete2MonitoredFunction_1);
	}

	public void set_concreteToConcrete2MonitoredFunction_fromDomain_2(Integer concreteToConcrete2MonitoredFunction_2) {
		this.execution.concreteToConcrete2MonitoredFunction.set(ConcreteD.ConcreteDomain.valueOf(2),
				ConcreteD.ConcreteDomain2.valueOf(concreteToConcrete2MonitoredFunction_2));
		System.out.println("Set concreteToConcrete2MonitoredFunction_2 = " + concreteToConcrete2MonitoredFunction_2);
	}

	public void set_concreteToConcrete2MonitoredFunction_fromDomain_3(Integer concreteToConcrete2MonitoredFunction_3) {
		this.execution.concreteToConcrete2MonitoredFunction.set(ConcreteD.ConcreteDomain.valueOf(3),
				ConcreteD.ConcreteDomain2.valueOf(concreteToConcrete2MonitoredFunction_3));
		System.out.println("Set concreteToConcrete2MonitoredFunction_3 = " + concreteToConcrete2MonitoredFunction_3);
	}

	public void set_concreteToConcrete2MonitoredFunction_fromDomain_4(Integer concreteToConcrete2MonitoredFunction_4) {
		this.execution.concreteToConcrete2MonitoredFunction.set(ConcreteD.ConcreteDomain.valueOf(4),
				ConcreteD.ConcreteDomain2.valueOf(concreteToConcrete2MonitoredFunction_4));
		System.out.println("Set concreteToConcrete2MonitoredFunction_4 = " + concreteToConcrete2MonitoredFunction_4);
	}

	public void set_concreteToConcrete2MonitoredFunction_fromDomain_5(Integer concreteToConcrete2MonitoredFunction_5) {
		this.execution.concreteToConcrete2MonitoredFunction.set(ConcreteD.ConcreteDomain.valueOf(5),
				ConcreteD.ConcreteDomain2.valueOf(concreteToConcrete2MonitoredFunction_5));
		System.out.println("Set concreteToConcrete2MonitoredFunction_5 = " + concreteToConcrete2MonitoredFunction_5);
	}

	public void set_abstract_concretetoAbstractMonitoredFunction_fromDomain_1(
			String concretetoAbstractMonitoredFunction_1) {
		this.execution.concretetoAbstractMonitoredFunction.set(ConcreteD.ConcreteDomain.valueOf(1),
				ConcreteD.AbstractDomain.get(concretetoAbstractMonitoredFunction_1));
		System.out.println("Set concretetoAbstractMonitoredFunction_1 = " + concretetoAbstractMonitoredFunction_1);
	}

	public void set_abstract_concretetoAbstractMonitoredFunction_fromDomain_2(
			String concretetoAbstractMonitoredFunction_2) {
		this.execution.concretetoAbstractMonitoredFunction.set(ConcreteD.ConcreteDomain.valueOf(2),
				ConcreteD.AbstractDomain.get(concretetoAbstractMonitoredFunction_2));
		System.out.println("Set concretetoAbstractMonitoredFunction_2 = " + concretetoAbstractMonitoredFunction_2);
	}

	public void set_abstract_concretetoAbstractMonitoredFunction_fromDomain_3(
			String concretetoAbstractMonitoredFunction_3) {
		this.execution.concretetoAbstractMonitoredFunction.set(ConcreteD.ConcreteDomain.valueOf(3),
				ConcreteD.AbstractDomain.get(concretetoAbstractMonitoredFunction_3));
		System.out.println("Set concretetoAbstractMonitoredFunction_3 = " + concretetoAbstractMonitoredFunction_3);
	}

	public void set_abstract_concretetoAbstractMonitoredFunction_fromDomain_4(
			String concretetoAbstractMonitoredFunction_4) {
		this.execution.concretetoAbstractMonitoredFunction.set(ConcreteD.ConcreteDomain.valueOf(4),
				ConcreteD.AbstractDomain.get(concretetoAbstractMonitoredFunction_4));
		System.out.println("Set concretetoAbstractMonitoredFunction_4 = " + concretetoAbstractMonitoredFunction_4);
	}

	public void set_abstract_concretetoAbstractMonitoredFunction_fromDomain_5(
			String concretetoAbstractMonitoredFunction_5) {
		this.execution.concretetoAbstractMonitoredFunction.set(ConcreteD.ConcreteDomain.valueOf(5),
				ConcreteD.AbstractDomain.get(concretetoAbstractMonitoredFunction_5));
		System.out.println("Set concretetoAbstractMonitoredFunction_5 = " + concretetoAbstractMonitoredFunction_5);
	}

	public void set_concrete2toBooleanMonitoredFunction_fromDomain_1(boolean concrete2toBooleanMonitoredFunction_1) {
		this.execution.concrete2toBooleanMonitoredFunction.set(ConcreteD.ConcreteDomain2.valueOf(1),
				concrete2toBooleanMonitoredFunction_1);
		System.out.println("Set concrete2toBooleanMonitoredFunction_1 = " + concrete2toBooleanMonitoredFunction_1);
	}

	public void set_concrete2toBooleanMonitoredFunction_fromDomain_5(boolean concrete2toBooleanMonitoredFunction_5) {
		this.execution.concrete2toBooleanMonitoredFunction.set(ConcreteD.ConcreteDomain2.valueOf(5),
				concrete2toBooleanMonitoredFunction_5);
		System.out.println("Set concrete2toBooleanMonitoredFunction_5 = " + concrete2toBooleanMonitoredFunction_5);
	}

	public void set_concrete2toBooleanMonitoredFunction_fromDomain_10(boolean concrete2toBooleanMonitoredFunction_10) {
		this.execution.concrete2toBooleanMonitoredFunction.set(ConcreteD.ConcreteDomain2.valueOf(10),
				concrete2toBooleanMonitoredFunction_10);
		System.out.println("Set concrete2toBooleanMonitoredFunction_10 = " + concrete2toBooleanMonitoredFunction_10);
	}
}
