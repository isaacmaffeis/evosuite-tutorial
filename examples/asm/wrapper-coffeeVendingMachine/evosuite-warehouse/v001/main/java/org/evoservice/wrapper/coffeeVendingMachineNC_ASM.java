package org.evoservice.wrapper;// coffeeVendingMachineNC_ASM.java automatically generated from ASM2CODE

/**
* This class allows you to simulate the behavior of an Abstract State Machine (ASM)
* without asking the user for input values â€‹â€‹of the monitored functions.
*
* <p>
* It has been optimized to be used with evosuite in order to automatically generate test scenarios.
* </p>
*/
class coffeeVendingMachineNC_ASM {
	private final coffeeVendingMachineNC esecuzione;
	private int stato;

	/**
	* Constructor of the {@code coffeeVendingMachineNC_ASM} class. Creates a private instance of the asm
	* {@link coffeeVendingMachineNC} and sets the initial state of the state machine to 1.
	*/
	public coffeeVendingMachineNC_ASM() {
		this.esecuzione = new coffeeVendingMachineNC();
		this.stato = 0;
	}

	/** The step function is the only public method of the ASM,
	* it receives as parameters the values â€‹â€‹of the monitored functions to be updated 
	* and allows to perform a step of the asm by incrementing the state.
	*/
	public void step() {
		System.out.println("<State " + stato + " (controlled)>");
		printControlled();
		this.esecuzione.updateASM();
		System.out.println("</State " + stato + " (controlled)>");
		System.out.println("\n<Stato attuale>");
		printControlled();
		stato++;
	}


	// ASM Methods
	private void printControlled() {
		System.out.println("coins = " + esecuzione.coins.get().value);
		for (int i = 0; i < esecuzione.Product_elemsList.size(); i++) {
			System.out.println(" available =>  (" + esecuzione.Product_elemsList.get(i) + ") = "
					+ esecuzione.available.oldValues.get(esecuzione.Product_elemsList.get(i)).value);
		}
	}


	// Controlled getters
	public int get_coins() {
		return this.esecuzione.coins.get().value;
	}

	public int get_available_COFFEE() {
		return this.esecuzione.available.oldValues.get(this.esecuzione.Product_elemsList.get(0)).value;
	}

	public int get_available_TEA() {
		return this.esecuzione.available.oldValues.get(this.esecuzione.Product_elemsList.get(1)).value;
	}

	public int get_available_MILK() {
		return this.esecuzione.available.oldValues.get(this.esecuzione.Product_elemsList.get(2)).value;
	}

	// Monitored setters

	public void set_insertedCoin(coffeeVendingMachineNC.CoinType insertedCoin){
		this.esecuzione.insertedCoin.set(insertedCoin);
		System.out.println("Set insertedCoin = " + insertedCoin);
	}

	public void set_chosenProduct(coffeeVendingMachineNC.Product chosenProduct){
		this.esecuzione.chosenProduct.set(chosenProduct);
		System.out.println("Set chosenProduct = " + chosenProduct);
	}

}
