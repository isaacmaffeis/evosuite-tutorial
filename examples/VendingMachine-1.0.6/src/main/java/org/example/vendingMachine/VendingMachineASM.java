package org.example.vendingMachine;

public class VendingMachineASM {

  // Stati possibili
  private enum State {
    IDLE,
    COIN_INSERTED,
    DISPENSE
  }

  // Stato attuale
  private State currentState;
  private int balance;

  // Costruttore
  public VendingMachineASM() {
    this.currentState = State.IDLE;
    this.balance = 0;
  }

  // Metodo per inserire una moneta
  public void insertCoin(int amount) {
    switch (currentState) {
      case IDLE:
        balance += amount;
        currentState = State.COIN_INSERTED;
        System.out.println("Coin inserted: " + amount + ". Current balance: " + balance);
        break;
      case COIN_INSERTED:
        balance += amount;
        System.out.println("Additional coin inserted: " + amount + ". Current balance: " + balance);
        break;
      case DISPENSE:
        System.out.println("Wait! Dispensing in progress.");
        break;
    }
  }

  // Metodo per selezionare una bevanda
  public void selectBeverage() {
    switch (currentState) {
      case IDLE:
        System.out.println("Insert coin first.");
        break;
      case COIN_INSERTED:
        if (balance >= 50) {
          currentState = State.DISPENSE;
          System.out.println("Beverage selected. Dispensing...");
          dispense();
        } else {
          System.out.println("Insufficient balance. Please insert more coins.");
        }
        break;
      case DISPENSE:
        System.out.println("Wait! Dispensing in progress.");
        break;
    }
  }

  // Metodo per erogare la bevanda
  private void dispense() {
    switch (currentState) {
      case IDLE:
      case COIN_INSERTED:
        System.out.println("No beverage to dispense.");
        break;
      case DISPENSE:
        System.out.println("Beverage dispensed. Thank you!");
        balance = 0;
        currentState = State.IDLE;
        break;
    }
  }

  // Metodo per ottenere lo stato attuale
  public String getCurrentState() {
    return currentState.name();
  }

  // Metodo per ottenere il saldo attuale
  public int getBalance() {
    return balance;
  }

}
