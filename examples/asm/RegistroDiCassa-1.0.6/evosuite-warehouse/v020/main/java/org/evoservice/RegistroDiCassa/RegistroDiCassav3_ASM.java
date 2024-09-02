package org.evoservice.RegistroDiCassa;

// RegistroDiCassav3_ASM.java automatically generated from ASM2CODE

import java.util.Scanner;
import org.evoservice.RegistroDiCassa.RegistroDiCassav3Sig.Stati;

/**
 * This class allows you to simulate the behavior of an Abstract State Machine (ASM)
 * without asking the user for input values ​​of the monitored functions.
 *
 * <p>
 * It has been optimized to be used with evosuite in order to automatically generate test scenarios.
 * </p>
 */
class RegistroDiCassav3_ASM {

  private final RegistroDiCassav3 esecuzione;
  private int stato;

  /**
   * Constructor of the {@code RegistroDiCassav3_ASM} class. Creates a private instance of the asm
   * {@link RegistroDiCassav3} and sets the initial state of the state machine to 1.
   */
  public RegistroDiCassav3_ASM(){
    this.esecuzione = new RegistroDiCassav3();
    this.stato = 0;
  }

  /** The step function is the only public method of the ASM,
   * it receives as parameters the values ​​of the monitored functions to be updated
   * and allows to perform a step of the asm by incrementing the state.
   */
  public void step(
      RegistroDiCassav3.Servizio servizioSelezionato,
      int pizzaInserita,
      RegistroDiCassav3.AggiungiPizza sceltaDiAggiuntaPizza,
      RegistroDiCassav3.SelezioneTipoDiPizza sceltaDelTipoPizza,
      int insertQuantita,
      int insertPrezzo){
    System.out.println("<State "+ stato +" (controlled)>");

    printControlled();
    setMonitored(
        servizioSelezionato,
        pizzaInserita,
        sceltaDiAggiuntaPizza,
        sceltaDelTipoPizza,
        insertQuantita,
        insertPrezzo);
    this.esecuzione.updateASM();

    System.out.println("</State "+ stato +" (controlled)>");

    System.out.println("\n<Stato attuale>");
    printControlled();

    /* monitored */
    coverMonitored();
    /* controlled */
    coverControlled();
    /*final state condition */
    if(isFinalState()){
      System.out.println("\n<Stato finale>");
    }
    else
      stato++;
  }
  // final state condition
  public boolean isFinalState(){
    return
        this.stato >=5 &&
            this.get_totale() >=50 &&
            this.get_statoCassa() == Stati.CHIUSO;
  }
  // Monitored getters
  private RegistroDiCassav3.Servizio get_servizioSelezionato(){
    return this.esecuzione.servizioSelezionato.get();
  }

  private RegistroDiCassav3.Pizza get_pizzaInserita(){
    return this.esecuzione.pizzaInserita.get();
  }

  private RegistroDiCassav3.AggiungiPizza get_sceltaDiAggiuntaPizza(){
    return this.esecuzione.sceltaDiAggiuntaPizza.get();
  }

  private RegistroDiCassav3.SelezioneTipoDiPizza get_sceltaDelTipoPizza(){
    return this.esecuzione.sceltaDelTipoPizza.get();
  }

  private RegistroDiCassav3.QuantitaDomain get_insertQuantita(){
    return this.esecuzione.insertQuantita.get();
  }

  private RegistroDiCassav3.PrezzoDomain get_insertPrezzo(){
    return this.esecuzione.insertPrezzo.get();
  }

  // Controlled getters

  public RegistroDiCassav3.Pizza get_pizzaCorrente(){
    return this.esecuzione.pizzaCorrente.get();
  }

  public RegistroDiCassav3.Stati get_statoCassa(){
    return this.esecuzione.statoCassa.get();
  }

  public String get_outMess(){
    return this.esecuzione.outMess.get();
  }

  public int get_totale(){
    return this.esecuzione.totale.get();
  }

  // Cover functions

  private void coverMonitored(){
    cover_servizioSelezionato();
    cover_pizzaInserita();
    cover_sceltaDiAggiuntaPizza();
    cover_sceltaDelTipoPizza();
    cover_insertQuantita();
    cover_insertPrezzo();
  }

  private void coverControlled(){
    cover_pizzaCorrente();
    cover_statoCassa();
    cover_outMess();
    cover_totale();
  }

  private void cover_pizzaCorrente(){
    this.get_pizzaCorrente();
    //1 Branch covered
  }

  private void cover_statoCassa(){
    switch(this.get_statoCassa()){
      case ATTENDI_ORDINAZIONI :
        System.out.println("Branch Stati ATTENDI_ORDINAZIONI covered");
        // Branch Stati ATTENDI_ORDINAZIONI covered
        break;
      case SCEGLI_SE_AGGIUNGERE_PIZZA :
        System.out.println("Branch Stati SCEGLI_SE_AGGIUNGERE_PIZZA covered");
        // Branch Stati SCEGLI_SE_AGGIUNGERE_PIZZA covered
        break;
      case CHIUSO :
        System.out.println("Branch Stati CHIUSO covered");
        // Branch Stati CHIUSO covered
        break;
      case SCEGLI_TIPO_DI_PIZZA :
        System.out.println("Branch Stati SCEGLI_TIPO_DI_PIZZA covered");
        // Branch Stati SCEGLI_TIPO_DI_PIZZA covered
        break;
      case PIZZASTANDARD_SELEZIONATA :
        System.out.println("Branch Stati PIZZASTANDARD_SELEZIONATA covered");
        // Branch Stati PIZZASTANDARD_SELEZIONATA covered
        break;
      case ALTRAPIZZA_SELEZIONATA :
        System.out.println("Branch Stati ALTRAPIZZA_SELEZIONATA covered");
        // Branch Stati ALTRAPIZZA_SELEZIONATA covered
        break;
    }
  }

  private void cover_outMess(){
    this.get_outMess();
    //1 Branch covered
  }

  private void cover_servizioSelezionato(){
    switch(this.get_servizioSelezionato()){
      case NEWORDINE :
        System.out.println("Branch Servizio NEWORDINE covered");
        // Branch Servizio NEWORDINE covered
        break;
      case EXIT :
        System.out.println("Branch Servizio EXIT covered");
        // Branch Servizio EXIT covered
        break;
    }
  }

  private void cover_pizzaInserita(){
    this.get_pizzaInserita();
    //1 Branch covered
  }

  private void cover_sceltaDiAggiuntaPizza(){
    switch(this.get_sceltaDiAggiuntaPizza()){
      case SI :
        System.out.println("Branch AggiungiPizza SI covered");
        // Branch AggiungiPizza SI covered
        break;
      case NO :
        System.out.println("Branch AggiungiPizza NO covered");
        // Branch AggiungiPizza NO covered
        break;
    }
  }

  private void cover_sceltaDelTipoPizza(){
    switch(this.get_sceltaDelTipoPizza()){
      case STANDARD :
        System.out.println("Branch SelezioneTipoDiPizza STANDARD covered");
        // Branch SelezioneTipoDiPizza STANDARD covered
        break;
      case OTHER :
        System.out.println("Branch SelezioneTipoDiPizza OTHER covered");
        // Branch SelezioneTipoDiPizza OTHER covered
        break;
    }
  }

  private void cover_insertQuantita(){
    this.get_insertQuantita();
    //1 Branch covered
  }

  private void cover_insertPrezzo(){
    this.get_insertPrezzo();
    //1 Branch covered
  }

  private void cover_totale(){
    this.get_totale();
    //1 Branch covered
  }


  // ASM Methods

  private void printControlled() {

    System.out.print("Pizza"+ " = {");
    for(int i=0 ; i< esecuzione.Pizza_elemsList.size(); i++)
      if(i!= esecuzione.Pizza_elemsList.size()-1)
        System.out.print(esecuzione.Pizza_elemsList.get(i) +", ");
      else
        System.out.print(esecuzione.Pizza_elemsList.get(i));
    System.out.println("}");
    System.out.println("statoCassa = " + esecuzione.statoCassa.oldValue.name());
    System.out.println("outMess = " + esecuzione.outMess.get());
    System.out.println("totale = " + esecuzione.totale.get());

  }

  private void setMonitored(
      RegistroDiCassav3.Servizio servizioSelezionato,
      int pizzaInserita,
      RegistroDiCassav3.AggiungiPizza sceltaDiAggiuntaPizza,
      RegistroDiCassav3.SelezioneTipoDiPizza sceltaDelTipoPizza,
      int insertQuantita,
      int insertPrezzo) {

    this.esecuzione.servizioSelezionato.set(servizioSelezionato);
    System.out.println("Set servizioSelezionato = " + servizioSelezionato);

    this.esecuzione.pizzaInserita.set(this.esecuzione.Pizza_Class.get(pizzaInserita));
    System.out.println("Set pizzaInserita = " + pizzaInserita);

    this.esecuzione.sceltaDiAggiuntaPizza.set(sceltaDiAggiuntaPizza);
    System.out.println("Set sceltaDiAggiuntaPizza = " + sceltaDiAggiuntaPizza);

    this.esecuzione.sceltaDelTipoPizza.set(sceltaDelTipoPizza);
    System.out.println("Set sceltaDelTipoPizza = " + sceltaDelTipoPizza);

    this.esecuzione.insertQuantita_supporto.value = insertQuantita;
    this.esecuzione.insertQuantita.set(this.esecuzione.insertQuantita_supporto);
    System.out.println("Set insertQuantita = " + insertQuantita);

    this.esecuzione.insertPrezzo_supporto.value = insertPrezzo;
    this.esecuzione.insertPrezzo.set(this.esecuzione.insertPrezzo_supporto);
    System.out.println("Set insertPrezzo = " + insertPrezzo);

  }
}
