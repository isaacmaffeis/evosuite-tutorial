package org.evoservice.trafficLight;
// TrafficLight_ASM.java automatically generated from ASM2CODE

import java.util.Scanner;

/**
* This class allows you to simulate the behavior of an Abstract State Machine (ASM)
* without asking the user for input values ​​of the monitored functions.
*
* <p>
* It has been optimized to be used with evosuite in order to automatically generate test scenarios.
* </p>
*/
class TrafficLight_ASM {
	
	private final TrafficLight esecuzione;
	private int stato;
	
    /**
     * Constructor of the {@code TrafficLight_ASM} class. Creates a private instance of the asm
     * {@link TrafficLight} and sets the initial state of the state machine to 1.
     */
	public TrafficLight_ASM(){
		this.esecuzione = new TrafficLight();
		this.stato = 0;
	}
	
	/** The step function is the only public method of the ASM,
	* it receives as parameters the values ​​of the monitored functions to be updated 
	* and allows to perform a step of the asm by incrementing the state.
	*/
	public void step( 
		boolean pedestrian){
				System.out.println("<State "+ stato +" (controlled)>");
				
				printControlled();
				setMonitored( 
					pedestrian);
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
		private boolean get_pedestrian(){
			return this.esecuzione.pedestrian.get();
		}

		// Controlled getters

		public int get_count(){
			return this.esecuzione.count.get().value;
		}

		public TrafficLight.States get_status(){
			return this.esecuzione.status.get();
		}

	// Cover functions

	private void coverMonitored(){
		cover_pedestrian();
	}

	private void coverControlled(){
		cover_count();
		cover_status();
	}

	private void cover_count(){
		this.get_count();
		//1 Branch covered
	}

	private void cover_status(){
		switch(this.get_status()){
			case RED :
							System.out.println("Branch States RED covered");
							// Branch States RED covered
							break;
			case GREEN :
							System.out.println("Branch States GREEN covered");
							// Branch States GREEN covered
							break;
			case YELLOW :
							System.out.println("Branch States YELLOW covered");
							// Branch States YELLOW covered
							break;
			case PENDING :
							System.out.println("Branch States PENDING covered");
							// Branch States PENDING covered
							break;
			}
	}

	private void cover_pedestrian(){
		this.get_pedestrian();
		//1 Branch covered
	}


	// ASM Methods
	
	private void printControlled() {
	
		System.out.println("count = " + esecuzione.count.get().value);
		System.out.println("status = " + esecuzione.status.oldValue.name());
	
	}
	
	private void setMonitored(  
		boolean pedestrian) {
					
					this.esecuzione.pedestrian.set(pedestrian);
					System.out.println("Set pedestrian = " + pedestrian);
					
				}
			}
