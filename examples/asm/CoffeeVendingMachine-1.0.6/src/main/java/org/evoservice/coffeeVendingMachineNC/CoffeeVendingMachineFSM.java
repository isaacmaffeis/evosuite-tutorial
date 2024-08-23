package org.evoservice.coffeeVendingMachineNC;

import java.util.Scanner;

public class CoffeeVendingMachineFSM {
    private coffeeVendingMachineNC esecuzione;
    private int stato;

    public CoffeeVendingMachineFSM(coffeeVendingMachineNC esecuzione) {
        this.esecuzione = esecuzione;
        this.stato = 1;
    }

    public void stepFSM(int coin, int product) {
        if(coin<=-1 || coin >=2) return;
        if(product<=-1 || product>=3) return;
        System.out.println("<State " + stato + " (controlled)>");
        printControlled(esecuzione);
        askMonitored(esecuzione, coin, product);
        esecuzione.updateASM();
        System.out.println("</State " + stato + " (controlled)>");
        System.out.println("\n<Stato attuale>");
        printControlled(esecuzione);
        if(coinsState());
        for (int i = 0; i < 3; i++) {
            if(productState(i));
        }
        if(isFinalState()){
            System.out.println("\n<Stato finale>");
        }
        else
            stato++;
    }

    public boolean isFinalState() {
        if(esecuzione.coins.get().value==10)
            return true;
        else
            return false;
    }

    // Metodo per verificare lo stato delle monete
    public void verifyCoins(int expectedCoins) {
        int actualCoins = esecuzione.coins.get().value;
        if (actualCoins != expectedCoins) {
            throw new AssertionError("Expected coins: " + expectedCoins + ", but got: " + actualCoins);
        }
    }

    // Metodo per verificare la disponibilità di un prodotto
    public void verifyProductAvailability(String product, int expectedAvailability) {
        int actualAvailability = esecuzione.available.oldValues.get(product).value;
        if (actualAvailability != expectedAvailability) {
            throw new AssertionError("Expected availability for " + product + ": " + expectedAvailability +
                ", but got: " + actualAvailability);
        }
    }

    public boolean coinsState(){
        return esecuzione.coins.oldValue.value.equals(esecuzione.coins.newValue.value);
    }

    public boolean productState(int i){
        return esecuzione.available.oldValues.get(esecuzione.Product_elemsList.get(i)).value.equals(esecuzione.available.newValues.get(esecuzione.Product_elemsList.get(i)).value);
    }

    private void printControlled(coffeeVendingMachineNC esecuzione) {
        System.out.println("coins = " + esecuzione.coins.get().value);
        for (int i = 0; i < esecuzione.Product_elemsList.size(); i++) {
            System.out.println(" available =>  (" + esecuzione.Product_elemsList.get(i) +
                    ")= " + esecuzione.available.oldValues.get(esecuzione.Product_elemsList.get(i)).value);
        }
    }

    private void askMonitored(coffeeVendingMachineNC esecuzione, int coin, int product) {
        System.out.print("Inserire un numero per indicare l'enumerativo per insertedCoin " +
                esecuzione.CoinType_elemsList.toString() + ":  ");
        Scanner insertedCoininput = new Scanner(System.in);

        for (;;) {
            int x;/*
            String insertedCoinControllo = insertedCoininput.nextLine();
            if (insertedCoinControllo.isEmpty()) break;
            try {
                x = Integer.parseInt(insertedCoinControllo);
            } catch (Exception e) {
                System.out.println("hai inserito un valore sbagliato, riprova");
                continue;
            }*/
            esecuzione.insertedCoin.set(esecuzione.CoinType_elemsList.get(coin));
            break;
        }
        System.out.print("Inserire un numero per indicare l'enumerativo per chosenProduct " +
                esecuzione.Product_elemsList.toString() + ":  ");
        Scanner chosenProductinput = new Scanner(System.in);

        for (;;) {
            int x;/*
            String chosenProductControllo = chosenProductinput.nextLine();
            if (chosenProductControllo.isEmpty()) break;
            try {
                x = Integer.parseInt(chosenProductControllo);
            } catch (Exception e) {
                System.out.println("hai inserito un valore sbagliato, riprova");
                continue;
            }*/
            esecuzione.chosenProduct.set(esecuzione.Product_elemsList.get(product));
            break;
        }
    }
}
