/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 20 12:50:40 GMT 2024
 */

package org.evoservice.wrapper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegistroDiCassav4_ATG_ESTest extends RegistroDiCassav4_ATG_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertNotNull(registroDiCassav4_ATG0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      
      RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.NO;
      registroDiCassav4_ATG0.set_sceltaDiAggiuntaPizza(registroDiCassav4_AggiungiPizza0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      
      registroDiCassav4_ATG0.step();
      assertEquals("prezzo totale aggiornato", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      
      registroDiCassav4_ATG0.step();
      assertEquals("prezzo totale aggiornato", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertNotNull(registroDiCassav4_ATG0);
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.EXIT;
      registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      registroDiCassav4_ATG0.step();
      assertEquals("Registro di cassa chiuso!", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.CHIUSO, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      registroDiCassav4_ATG0.step();
      assertEquals("Registro di cassa chiuso!", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.CHIUSO, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertNotNull(registroDiCassav4_ATG0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      
      RegistroDiCassav4.SelezioneTipoDiPizza registroDiCassav4_SelezioneTipoDiPizza0 = RegistroDiCassav4.SelezioneTipoDiPizza.OTHER;
      registroDiCassav4_ATG0.set_insertPrezzo(19);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      
      registroDiCassav4_ATG0.set_sceltaDelTipoPizza(registroDiCassav4_SelezioneTipoDiPizza0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      
      RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.SI;
      registroDiCassav4_ATG0.set_sceltaDiAggiuntaPizza(registroDiCassav4_AggiungiPizza0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      
      registroDiCassav4_ATG0.set_insertQuantita(6);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      
      registroDiCassav4_ATG0.step();
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
      
      registroDiCassav4_ATG0.step();
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ALTRAPIZZA_SELEZIONATA, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("Inserisci il nome di una nuova pizza:", registroDiCassav4_ATG0.get_outMess());
      
      registroDiCassav4_ATG0.step();
      assertEquals(114, registroDiCassav4_ATG0.get_totale());
      assertEquals("prezzo totale aggiornato", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_SE_AGGIUNGERE_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
      
      registroDiCassav4_ATG0.step();
      assertEquals(114, registroDiCassav4_ATG0.get_totale());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertNotNull(registroDiCassav4_ATG0);
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      registroDiCassav4_ATG0.get_statoCassa();
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertNotNull(registroDiCassav4_ATG0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      
      RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.SI;
      registroDiCassav4_ATG0.set_sceltaDiAggiuntaPizza(registroDiCassav4_AggiungiPizza0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      
      registroDiCassav4_ATG0.step();
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
      
      RegistroDiCassav4.SelezioneTipoDiPizza registroDiCassav4_SelezioneTipoDiPizza0 = RegistroDiCassav4.SelezioneTipoDiPizza.STANDARD;
      registroDiCassav4_ATG0.set_sceltaDelTipoPizza(registroDiCassav4_SelezioneTipoDiPizza0);
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
      
      registroDiCassav4_ATG0.step();
      assertEquals(RegistroDiCassav4.Stati.PIZZASTANDARD_SELEZIONATA, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("Inserisci il nome di una pizza dell'elenco:", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      // Undeclared exception!
      try { 
        registroDiCassav4_ATG0.step();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evoservice.wrapper.RegistroDiCassav4", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertNotNull(registroDiCassav4_ATG0);
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      
      String string0 = registroDiCassav4_ATG0.get_pizzaCorrente();
      assertNull(string0);
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertNotNull(registroDiCassav4_ATG0);
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      String string0 = registroDiCassav4_ATG0.get_outMess();
      assertNotNull(string0);
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertNotNull(registroDiCassav4_ATG0);
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      registroDiCassav4_ATG0.set_pizzaInserita("capricciosa");
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertNotNull(registroDiCassav4_ATG0);
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      
      int int0 = registroDiCassav4_ATG0.get_totale();
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, int0);
  }
}
