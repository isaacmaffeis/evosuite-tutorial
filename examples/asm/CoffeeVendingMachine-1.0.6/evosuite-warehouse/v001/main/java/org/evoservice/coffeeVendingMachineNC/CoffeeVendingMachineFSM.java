package org.evoservice.coffeeVendingMachineNC;

import java.util.Scanner;

public class CoffeeVendingMachineFSM {
    private final coffeeVendingMachineNC esecuzione;
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
        getCoins();
        getProduct_0();
        getProduct_1();
        getProduct_2();
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

    public int getCoins() {
        return esecuzione.coins.get().value;
    }

    public int getProduct_0(){
        return esecuzione.available.oldValues.get(esecuzione.Product_elemsList.get(0)).value;
    }

    public int getProduct_1(){
        return esecuzione.available.oldValues.get(esecuzione.Product_elemsList.get(1)).value;
    }

    public int getProduct_2(){
        return esecuzione.available.oldValues.get(esecuzione.Product_elemsList.get(2)).value;
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

        esecuzione.insertedCoin.set(esecuzione.CoinType_elemsList.get(coin));

        System.out.print("Inserire un numero per indicare l'enumerativo per chosenProduct " +
                esecuzione.Product_elemsList.toString() + ":  ");

        esecuzione.chosenProduct.set(esecuzione.Product_elemsList.get(product));
    }
}
