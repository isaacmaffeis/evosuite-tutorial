package org.evoservice.advancedClock;

// AdvancedClock_ASM.java automatically generated from ASM2CODE

import java.util.Scanner;

/**
 * This class allows you to simulate the behavior of an Abstract State Machine (ASM)
 * without asking the user for input values ​​of the monitored functions.
 *
 * <p>
 * It has been optimized to be used with evosuite in order to automatically generate test scenarios.
 * </p>
 */
class AdvancedClock_ASM {

	private final AdvancedClock esecuzione;
	private int stato;

	/**
	 * Constructor of the {@code AdvancedClock_ASM} class. Creates a private instance of the asm
	 * {@link AdvancedClock} and sets the initial state of the state machine to 1.
	 */
	public AdvancedClock_ASM(){
		this.esecuzione = new AdvancedClock();
		this.stato = 0;
	}

	/** The step function is the only public method of the ASM,
	 * it receives as parameters the values ​​of the monitored functions to be updated
	 * and allows to perform a step of the asm by incrementing the state.
	 */
	public void step(){
		System.out.println("<State "+ stato +" (controlled)>");

		printControlled();
		setMonitored();
		this.esecuzione.updateASM();

		System.out.println("</State "+ stato +" (controlled)>");

		System.out.println("\n<Stato attuale>");
		printControlled();

		/* monitored */
		coverMonitored();
		/* controlled */
		coverControlled();
		stato++;
	}
	// Monitored getters
	// Controlled getters

	public int get_seconds(){
		return this.esecuzione.seconds.get().value;
	}

	public int get_minutes(){
		return this.esecuzione.minutes.get().value;
	}

	public int get_hours(){
		return this.esecuzione.hours.get().value;
	}

	// Cover functions

	private void coverMonitored(){
	}

	private void coverControlled(){
		cover_seconds();
		cover_minutes();
		cover_hours();
	}

	private void cover_seconds(){
		this.get_seconds();
		//1 Branch covered
	}

	private void cover_minutes(){
		this.get_minutes();
		//1 Branch covered
	}

	private void cover_hours(){
		this.get_hours();
		//1 Branch covered
	}


	// ASM Methods

	private void printControlled() {

		System.out.println("seconds = " + esecuzione.seconds.get().value);
		System.out.println("minutes = " + esecuzione.minutes.get().value);
		System.out.println("hours = " + esecuzione.hours.get().value);

	}

	private void setMonitored( ) {

	}
}
