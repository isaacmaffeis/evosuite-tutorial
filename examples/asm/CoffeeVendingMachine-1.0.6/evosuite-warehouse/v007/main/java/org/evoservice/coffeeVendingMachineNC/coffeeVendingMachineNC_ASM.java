package org.evoservice.coffeeVendingMachineNC;
// coffeeVendingMachineNC_ASM.java automatically generated from ASM2CODE

import java.util.Scanner;

/**
 * This class allows you to simulate the behavior of an Abstract State Machine (ASM)
 * without asking the user for input values ​​of the monitored functions.
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
	public coffeeVendingMachineNC_ASM(){
		this.esecuzione = new coffeeVendingMachineNC();
		this.stato = 0;
	}

	/** The step function is the only public method of the ASM,
	 * it receives as parameters the values ​​of the monitored functions to be updated
	 * and allows to perform a step of the asm by incrementing the state.
	 */
	public void step(
			coffeeVendingMachineNC.CoinType insertedCoin,
			coffeeVendingMachineNC.Product chosenProduct){
		System.out.println("<State "+ stato +" (controlled)>");

		printControlled();
		setMonitored(
				insertedCoin,
				chosenProduct);
		this.esecuzione.updateASM();

		System.out.println("</State "+ stato +" (controlled)>");

		System.out.println("\n<Stato attuale>");
		printControlled();

		/* monitored */
		coverMonitored();
		/* controlled */
		coverControlled();
		/* final state condition */
		if(isFinalState()){
			System.out.println("\n<Stato finale>");
		}
		else
			stato++;
	}
	// final state condition
	public boolean isFinalState(){
		return
				this.get_coins() ==25;
	}
	// Monitored getters
	private coffeeVendingMachineNC.CoinType get_insertedCoin(){
		return this.esecuzione.insertedCoin.get();
	}

	private coffeeVendingMachineNC.Product get_chosenProduct(){
		return this.esecuzione.chosenProduct.get();
	}

	// Controlled getters

	public int get_coins(){
		return this.esecuzione.coins.get().value;
	}

	public int get_available_COFFEE(){
		return this.esecuzione.available.oldValues.get(
				this.esecuzione.Product_elemsList.get(0)).value;
	}

	public int get_available_TEA(){
		return this.esecuzione.available.oldValues.get(
				this.esecuzione.Product_elemsList.get(1)).value;
	}

	public int get_available_MILK(){
		return this.esecuzione.available.oldValues.get(
				this.esecuzione.Product_elemsList.get(2)).value;
	}

	// Cover functions

	private void coverMonitored(){
		cover_insertedCoin();
		cover_chosenProduct();
	}

	private void coverControlled(){
		cover_coins();
		cover_available();
	}

	private void cover_coins(){
		this.get_coins();
		//1 Branch covered
	}

	private void cover_available(){
		this.get_available_COFFEE();
		this.get_available_TEA();
		this.get_available_MILK();
		// 3 Branch covered
	}

	private void cover_insertedCoin(){
		switch(this.get_insertedCoin()){
			case HALF :
				System.out.println("Branch CoinType HALF covered");
				// Branch CoinType HALF covered
				break;
			case ONE :
				System.out.println("Branch CoinType ONE covered");
				// Branch CoinType ONE covered
				break;
		}
	}

	private void cover_chosenProduct(){
		switch(this.get_chosenProduct()){
			case COFFEE :
				System.out.println("Branch Product COFFEE covered");
				// Branch Product COFFEE covered
				break;
			case TEA :
				System.out.println("Branch Product TEA covered");
				// Branch Product TEA covered
				break;
			case MILK :
				System.out.println("Branch Product MILK covered");
				// Branch Product MILK covered
				break;
		}
	}


	// ASM Methods

	private void printControlled() {

		System.out.println("coins = " + esecuzione.coins.get().value);
		for(int i=0; i < esecuzione.Product_elemsList.size(); i++){
			System.out.println(" available =>  (" + esecuzione.Product_elemsList.get(i) +
					") = " + esecuzione.available.oldValues.get(esecuzione.Product_elemsList.get(i)).value);
		}

	}

	private void setMonitored(
			coffeeVendingMachineNC.CoinType insertedCoin,
			coffeeVendingMachineNC.Product chosenProduct) {

		this.esecuzione.insertedCoin.set(insertedCoin);
		System.out.println("Set insertedCoin = " + insertedCoin);

		this.esecuzione.chosenProduct.set(chosenProduct);
		System.out.println("Set chosenProduct = " + chosenProduct);

	}
}
