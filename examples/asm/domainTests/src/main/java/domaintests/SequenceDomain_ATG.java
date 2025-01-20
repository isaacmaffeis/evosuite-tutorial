package domaintests;// SequenceDomain_ATG.java automatically generated from ASM2CODE

/**
* This class is designed to simulate the behavior of an abstract state machine in an automated way.
*
* <p>
* It has been optimized to be used with evosuite in order to automatically generate test scenarios.
* </p>
*/
class SequenceDomain_ATG {
	/** Instance of the asmeta specification translated into a java class.*/
	private final SequenceDomain execution;
	/** current state. */
	private int state;

	/**
	* Constructor of the {@code SequenceDomain_ATG} class. Creates a private instance of the asm
	* {@link SequenceDomain} and sets the initial state of the state machine to 0.
	*/
	public SequenceDomain_ATG() {
		this.execution = new SequenceDomain();
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
	public String get_seqIntegerControlledFunction() {
		java.util.List<Integer> list = this.execution.seqIntegerControlledFunction.get();
		if (list == null || list.isEmpty()) {
			return "[]";
		}
		return "[" + list.stream().map(Object::toString).collect(java.util.stream.Collectors.joining(", ")) + "]";
	}

	public String get_seqBooleanControlledFunction() {
		java.util.List<Boolean> list = this.execution.seqBooleanControlledFunction.get();
		if (list == null || list.isEmpty()) {
			return "[]";
		}
		return "[" + list.stream().map(Object::toString).collect(java.util.stream.Collectors.joining(", ")) + "]";
	}

	public String get_seqStringControlledFunction() {
		java.util.List<String> list = this.execution.seqStringControlledFunction.get();
		if (list == null || list.isEmpty()) {
			return "[]";
		}
		return "[" + list.stream().map(Object::toString).collect(java.util.stream.Collectors.joining(", ")) + "]";
	}

	public String get_seqCharControlledFunction() {
		java.util.List<Character> list = this.execution.seqCharControlledFunction.get();
		if (list == null || list.isEmpty()) {
			return "[]";
		}
		return "[" + list.stream().map(Object::toString).collect(java.util.stream.Collectors.joining(", ")) + "]";
	}

	public String get_seqRealControlledFunction() {
		java.util.List<Double> list = this.execution.seqRealControlledFunction.get();
		if (list == null || list.isEmpty()) {
			return "[]";
		}
		return "[" + list.stream().map(Object::toString).collect(java.util.stream.Collectors.joining(", ")) + "]";
	}

	public String get_seqEnumControlledFunction() {
		java.util.List<SequenceDomain.EnumDomain> list = this.execution.seqEnumControlledFunction.get();
		if (list == null || list.isEmpty()) {
			return "[]";
		}
		return "[" + list.stream().map(Object::toString).collect(java.util.stream.Collectors.joining(", ")) + "]";
	}

	public String get_seqAbstractControlledFunction() {
		java.util.List<SequenceDomain.AbstractDomain> list = this.execution.seqAbstractControlledFunction.get();
		if (list == null || list.isEmpty()) {
			return "[]";
		}
		return "[" + list.stream().map(e -> SequenceDomain.AbstractDomain.toString(e))
				.collect(java.util.stream.Collectors.joining(", ")) + "]";
	}

	// Monitored setters
	public void set_sequence_seqIntegerMonitoredFunction(String seqIntegerMonitoredFunction) {
		java.util.List<Integer> list = java.util.Arrays
				.stream(seqIntegerMonitoredFunction.replaceAll("[\\[\\]]", "").split(",")).map(Integer::parseInt)
				.collect(java.util.stream.Collectors.toList());
		this.execution.seqIntegerMonitoredFunction.set(list);
		System.out.println("Set seqIntegerMonitoredFunction = " + seqIntegerMonitoredFunction);
	}

	public void set_sequence_seqBooleanMonitoredFunction(String seqBooleanMonitoredFunction) {
		java.util.List<Boolean> list = java.util.Arrays
				.stream(seqBooleanMonitoredFunction.replaceAll("[\\[\\]]", "").split(",")).map(Boolean::parseBoolean)
				.collect(java.util.stream.Collectors.toList());
		this.execution.seqBooleanMonitoredFunction.set(list);
		System.out.println("Set seqBooleanMonitoredFunction = " + seqBooleanMonitoredFunction);
	}

	public void set_sequence_seqStringMonitoredFunction(String seqStringMonitoredFunction) {
		java.util.List<String> list = java.util.Arrays
				.stream(seqStringMonitoredFunction.replaceAll("[\\[\\]]", "").split(",")).map(e -> e)
				.collect(java.util.stream.Collectors.toList());
		this.execution.seqStringMonitoredFunction.set(list);
		System.out.println("Set seqStringMonitoredFunction = " + seqStringMonitoredFunction);
	}

	public void set_sequence_seqCharMonitoredFunction(String seqCharMonitoredFunction) {
		java.util.List<Character> list = java.util.Arrays
				.stream(seqCharMonitoredFunction.replaceAll("[\\[\\]]", "").split(",")).map(e -> e.charAt(0))
				.collect(java.util.stream.Collectors.toList());
		this.execution.seqCharMonitoredFunction.set(list);
		System.out.println("Set seqCharMonitoredFunction = " + seqCharMonitoredFunction);
	}

	public void set_sequence_seqRealMonitoredFunction(String seqRealMonitoredFunction) {
		java.util.List<Double> list = java.util.Arrays
				.stream(seqRealMonitoredFunction.replaceAll("[\\[\\]]", "").split(",")).map(Double::parseDouble)
				.collect(java.util.stream.Collectors.toList());
		this.execution.seqRealMonitoredFunction.set(list);
		System.out.println("Set seqRealMonitoredFunction = " + seqRealMonitoredFunction);
	}

	public void set_sequence_seqEnumMonitoredFunction(String seqEnumMonitoredFunction) {
		java.util.List<SequenceDomain.EnumDomain> list = java.util.Arrays
				.stream(seqEnumMonitoredFunction.replaceAll("[\\[\\]]", "").split(","))
				.map(SequenceDomain.EnumDomain::valueOf).collect(java.util.stream.Collectors.toList());
		this.execution.seqEnumMonitoredFunction.set(list);
		System.out.println("Set seqEnumMonitoredFunction = " + seqEnumMonitoredFunction);
	}

	public void set_sequence_seqAbstractMonitoredFunction(String seqAbstractMonitoredFunction) {
		java.util.List<SequenceDomain.AbstractDomain> list = java.util.Arrays
				.stream(seqAbstractMonitoredFunction.replaceAll("[\\[\\]]", "").split(","))
				.map(SequenceDomain.AbstractDomain::get).collect(java.util.stream.Collectors.toList());
		this.execution.seqAbstractMonitoredFunction.set(list);
		System.out.println("Set seqAbstractMonitoredFunction = " + seqAbstractMonitoredFunction);
	}
}
