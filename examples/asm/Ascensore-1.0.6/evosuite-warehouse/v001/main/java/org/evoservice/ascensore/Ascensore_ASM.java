package org.evoservice.ascensore;
// Ascensore_ASM.java automatically generated from ASM2CODE

import java.util.Scanner;

/**
* This class allows you to simulate the behavior of an Abstract State Machine (ASM)
* without asking the user for input values ​​of the monitored functions.
*
* <p>
* It has been optimized to be used with evosuite in order to automatically generate test scenarios.
* </p>
*/
class Ascensore_ASM {
	
	private final Ascensore esecuzione;
	private int stato;
	
    /**
     * Constructor of the {@code Ascensore_ASM} class. Creates a private instance of the asm
     * {@link Ascensore} and sets the initial state of the state machine to 1.
     */
	public Ascensore_ASM(){
		this.esecuzione = new Ascensore();
		this.stato = 0;
	}
	
	/** The step function is the only public method of the ASM,
	* it receives as parameters the values ​​of the monitored functions to be updated 
	* and allows to perform a step of the asm by incrementing the state.
	*/
	public void step( 
		boolean signalPorta){
				System.out.println("<State "+ stato +" (controlled)>");
				
				printControlled();
				setMonitored( 
					signalPorta);
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
		private boolean get_signalPorta(){
			return this.esecuzione.signalPorta.get();
		}

		// Controlled getters

		public Ascensore.Piano get_statoPiano(){
			return this.esecuzione.statoPiano.get();
		}

		public Ascensore.Porta get_statoPorta(){
			return this.esecuzione.statoPorta.get();
		}

	// Cover functions

	private void coverMonitored(){
		cover_signalPorta();
	}

	private void coverControlled(){
		cover_statoPiano();
		cover_statoPorta();
	}

	private void cover_statoPiano(){
		switch(this.get_statoPiano()){
			case UNO :
							System.out.println("Branch Piano UNO covered");
							// Branch Piano UNO covered
							break;
			case DUE :
							System.out.println("Branch Piano DUE covered");
							// Branch Piano DUE covered
							break;
			}
	}

	private void cover_statoPorta(){
		switch(this.get_statoPorta()){
			case CHIUSA :
							System.out.println("Branch Porta CHIUSA covered");
							// Branch Porta CHIUSA covered
							break;
			case APERTA :
							System.out.println("Branch Porta APERTA covered");
							// Branch Porta APERTA covered
							break;
			}
	}

	private void cover_signalPorta(){
		this.get_signalPorta();
		//1 Branch covered
	}


	// ASM Methods
	
	private void printControlled() {
	
		System.out.println("statoPiano = " + esecuzione.statoPiano.oldValue.name());
		System.out.println("statoPorta = " + esecuzione.statoPorta.oldValue.name());
	
	}
	
	private void setMonitored(  
		boolean signalPorta) {
					
					this.esecuzione.signalPorta.set(signalPorta);
					System.out.println("Set signalPorta = " + signalPorta);
					
				}
			}
