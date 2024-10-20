package org.evoservice.wrapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ManualTest {

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
    assertEquals("", registroDiCassav4_ATG0.get_outMess());
    assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
    assertEquals(0, registroDiCassav4_ATG0.get_totale());
    assertNotNull(registroDiCassav4_ATG0);

    RegistroDiCassav4Sig.Servizio registroDiCassav4Sig_Servizio0 = RegistroDiCassav4Sig.Servizio.NEWORDINE;
    RegistroDiCassav4Sig.AggiungiPizza registroDiCassav4Sig_AggiungiPizza0 = RegistroDiCassav4Sig.AggiungiPizza.SI;
    RegistroDiCassav4Sig.SelezioneTipoDiPizza registroDiCassav4Sig_SelezioneTipoDiPizza0 = RegistroDiCassav4Sig.SelezioneTipoDiPizza.STANDARD;
    registroDiCassav4_ATG0.set_sceltaDiAggiuntaPizza(registroDiCassav4Sig_AggiungiPizza0);
    assertEquals("", registroDiCassav4_ATG0.get_outMess());
    assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
    assertEquals(0, registroDiCassav4_ATG0.get_totale());

    registroDiCassav4_ATG0.set_insertQuantita(4);
    assertEquals("", registroDiCassav4_ATG0.get_outMess());
    assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
    assertEquals(0, registroDiCassav4_ATG0.get_totale());

    registroDiCassav4_ATG0.set_sceltaDelTipoPizza(registroDiCassav4Sig_SelezioneTipoDiPizza0);
    assertEquals("", registroDiCassav4_ATG0.get_outMess());
    assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
    assertEquals(0, registroDiCassav4_ATG0.get_totale());

    registroDiCassav4_ATG0.set_pizzaInserita("capricciosa");
    assertEquals("", registroDiCassav4_ATG0.get_outMess());
    assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
    assertEquals(0, registroDiCassav4_ATG0.get_totale());

    registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4Sig_Servizio0);
    assertEquals("", registroDiCassav4_ATG0.get_outMess());
    assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
    assertEquals(0, registroDiCassav4_ATG0.get_totale());

    registroDiCassav4_ATG0.step();
    assertEquals(RegistroDiCassav4Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
    assertEquals(0, registroDiCassav4_ATG0.get_totale());
    assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ATG0.get_outMess());

    registroDiCassav4_ATG0.step();
    assertEquals("Inserisci il nome di una pizza dell'elenco:", registroDiCassav4_ATG0.get_outMess());
    assertEquals(RegistroDiCassav4Sig.Stati.PIZZASTANDARD_SELEZIONATA, registroDiCassav4_ATG0.get_statoCassa());
    assertEquals(0, registroDiCassav4_ATG0.get_totale());

    System.out.println("/*******************************************/");
    System.out.println(registroDiCassav4_ATG0.get_pizzaCorrente());
    System.out.println("/*******************************************/");

    registroDiCassav4_ATG0.step();
    assertEquals(RegistroDiCassav4Sig.Stati.SCEGLI_SE_AGGIUNGERE_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
    assertEquals(20, registroDiCassav4_ATG0.get_totale());
    assertEquals("prezzo totale aggiornato", registroDiCassav4_ATG0.get_outMess());

    System.out.println("/*******************************************/");
    System.out.println(registroDiCassav4_ATG0.get_pizzaCorrente());
    System.out.println("/*******************************************/");
  }

}
