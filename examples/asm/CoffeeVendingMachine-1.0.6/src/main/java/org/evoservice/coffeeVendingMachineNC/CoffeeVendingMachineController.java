package org.evoservice.coffeeVendingMachineNC;// coffeeVendingMachineNC_Exe.java automatically generated from ASM2CODE
//Classe per l'esecuzione dei file java generati dalla traduzione di un programma ASM

import java.util.Random;
import java.util.Scanner;

public class CoffeeVendingMachineController {
	private coffeeVendingMachineNC esecuzione;

	public CoffeeVendingMachineController(coffeeVendingMachineNC esecuzione) {
		this.esecuzione = esecuzione;
	}

	public void runFSM() {
		String continuare = "no";
		int stato = 0;
		stato++;

		System.out.println("INITIAL STATE:");

		do {
			System.out.println("<State " + stato + " (controlled)>");

			// Aggiornamento valori dell'ASM e inserimento dati monitorati
			printControlled(esecuzione);
			askMonitored(esecuzione);
			esecuzione.updateASM();

			System.out.println("</State " + stato + " (controlled)>");

			System.out.println("\n<Stato attuale>");
			printControlled(esecuzione);

			System.out.print("Vuoi continuare? (yes/no)  ");
			//Scanner input = new Scanner(System.in);
			//continuare = input.next();

			stato++;
			if(stato > 5){
				System.out.print("Stato = 5");
			}
		} while (stato < 10);

		System.out.println("FINAL STATE:");
		printControlled(esecuzione);
		System.out.println("esecuzione terminata");
	}

	private void printControlled(coffeeVendingMachineNC esecuzione) {
		System.out.println("coins = " + esecuzione.coins.get().value);
		for (int i = 0; i < esecuzione.Product_elemsList.size(); i++) {
			System.out.println(" available =>  (" + esecuzione.Product_elemsList.get(i) +
					")= " + esecuzione.available.oldValues.get(esecuzione.Product_elemsList.get(i)).value);
		}
	}

	private void askMonitored(coffeeVendingMachineNC esecuzione) {
		System.out.print("Inserire un numero per indicare l'enumerativo per insertedCoin " +
				esecuzione.CoinType_elemsList.toString() + ":  ");
		//Scanner insertedCoininput = new Scanner(System.in);
		Random random = new Random();

		for (;;) {
/*			int x;
			String insertedCoinControllo = insertedCoininput.nextLine();
			if (insertedCoinControllo.isEmpty()) break;
			try {
				x = Integer.parseInt(insertedCoinControllo);
			} catch (Exception e) {
				System.out.println("hai inserito un valore sbagliato, riprova");
				continue;
			}*/
			int x = random.nextInt(2);
			esecuzione.insertedCoin.set(esecuzione.CoinType_elemsList.get(x));
			break;
		}
		System.out.print("Inserire un numero per indicare l'enumerativo per chosenProduct " +
				esecuzione.Product_elemsList.toString() + ":  ");
		//Scanner chosenProductinput = new Scanner(System.in);

		for (;;) {
/*			int x;
			String chosenProductControllo = chosenProductinput.nextLine();
			if (chosenProductControllo.isEmpty()) break;
			try {
				x = Integer.parseInt(chosenProductControllo);
			} catch (Exception e) {
				System.out.println("hai inserito un valore sbagliato, riprova");
				continue;
			}*/
			int x = random.nextInt(3);
			esecuzione.chosenProduct.set(esecuzione.Product_elemsList.get(x));
			break;
		}
	}

	public static void main(String[] args) {
		coffeeVendingMachineNC coffeeVendingMachineNC = new coffeeVendingMachineNC();
		CoffeeVendingMachineController coffeeVendingMachineController = new CoffeeVendingMachineController(coffeeVendingMachineNC);
		coffeeVendingMachineController.runFSM();
	}

}
