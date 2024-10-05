/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 05 09:19:11 GMT 2024
 */

package org.evoservice.RegistroDiCassa;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegistroDiCassav4_ESTest extends RegistroDiCassav4_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertNotNull(registroDiCassav4_0);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      
      RegistroDiCassav4.SelezioneTipoDiPizza registroDiCassav4_SelezioneTipoDiPizza0 = RegistroDiCassav4.SelezioneTipoDiPizza.STANDARD;
      registroDiCassav4_0.set_pizzaInserita("capricciosa");
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      
      RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.SI;
      registroDiCassav4_0.set_sceltaDiAggiuntaPizza(registroDiCassav4_AggiungiPizza0);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      
      registroDiCassav4_0.set_sceltaDelTipoDiPizza(registroDiCassav4_SelezioneTipoDiPizza0);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      registroDiCassav4_0.set_insertQuantita(0);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      
      registroDiCassav4_0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      
      registroDiCassav4_0.step();
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_0.get_outMess());
      
      registroDiCassav4_0.step();
      assertEquals("Inserisci il nome di una pizza dell'elenco:", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.PIZZASTANDARD_SELEZIONATA, registroDiCassav4_0.get_statoCassa());
      
      registroDiCassav4_0.step();
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_SE_AGGIUNGERE_PIZZA, registroDiCassav4_0.get_statoCassa());
      assertEquals("prezzo totale aggiornato", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertNotNull(registroDiCassav4_0);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      RegistroDiCassav4.SelezioneTipoDiPizza registroDiCassav4_SelezioneTipoDiPizza0 = RegistroDiCassav4.SelezioneTipoDiPizza.OTHER;
      registroDiCassav4_0.set_insertPrezzo(5);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.SI;
      registroDiCassav4_0.set_sceltaDiAggiuntaPizza(registroDiCassav4_AggiungiPizza0);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      registroDiCassav4_0.set_sceltaDelTipoDiPizza(registroDiCassav4_SelezioneTipoDiPizza0);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      registroDiCassav4_0.set_insertQuantita(0);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      registroDiCassav4_0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      registroDiCassav4_0.step();
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_0.get_statoCassa());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      registroDiCassav4_0.step();
      assertEquals("Inserisci il nome di una nuova pizza:", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ALTRAPIZZA_SELEZIONATA, registroDiCassav4_0.get_statoCassa());
      
      registroDiCassav4_0.step();
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_SE_AGGIUNGERE_PIZZA, registroDiCassav4_0.get_statoCassa());
      assertEquals("prezzo totale aggiornato", registroDiCassav4_0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertNotNull(registroDiCassav4_0);
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("", registroDiCassav4_0.get_outMess());
      
      RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.NO;
      registroDiCassav4_0.set_sceltaDiAggiuntaPizza(registroDiCassav4_AggiungiPizza0);
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("", registroDiCassav4_0.get_outMess());
      
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      registroDiCassav4_0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("", registroDiCassav4_0.get_outMess());
      
      registroDiCassav4_0.step();
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("prezzo totale aggiornato", registroDiCassav4_0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertNotNull(registroDiCassav4_0);
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.EXIT;
      registroDiCassav4_0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      
      registroDiCassav4_0.step();
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("Registro di cassa chiuso!", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.CHIUSO, registroDiCassav4_0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertNotNull(registroDiCassav4_0);
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      registroDiCassav4_0.get_statoCassa();
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertNotNull(registroDiCassav4_0);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      String string0 = registroDiCassav4_0.get_outMess();
      assertNotNull(string0);
      assertEquals("", string0);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertNotNull(registroDiCassav4_0);
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      int int0 = registroDiCassav4_0.get_totale();
      assertEquals(0, int0);
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
  }
}