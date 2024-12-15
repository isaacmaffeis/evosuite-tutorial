/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 22 08:09:09 GMT 2024
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
  public void test00()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertNotNull(registroDiCassav4_ATG0);
      
      registroDiCassav4_ATG0.set_insertPrezzo(5);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertNotNull(registroDiCassav4_ATG0);
      
      RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.NO;
      registroDiCassav4_ATG0.set_sceltaDiAggiuntaPizza(registroDiCassav4_AggiungiPizza0);
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
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
  public void test02()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertNotNull(registroDiCassav4_ATG0);
      
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.EXIT;
      registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      registroDiCassav4_ATG0.step();
      assertEquals("Registro di cassa chiuso!", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.CHIUSO, registroDiCassav4_ATG0.get_statoCassa());
      
      registroDiCassav4_ATG0.step();
      assertEquals("Registro di cassa chiuso!", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.CHIUSO, registroDiCassav4_ATG0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertNotNull(registroDiCassav4_ATG0);
      
      RegistroDiCassav4.SelezioneTipoDiPizza registroDiCassav4_SelezioneTipoDiPizza0 = RegistroDiCassav4.SelezioneTipoDiPizza.STANDARD;
      registroDiCassav4_ATG0.set_sceltaDelTipoPizza(registroDiCassav4_SelezioneTipoDiPizza0);
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
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
      
      registroDiCassav4_ATG0.step();
      assertEquals(RegistroDiCassav4.Stati.PIZZASTANDARD_SELEZIONATA, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("Inserisci il nome di una pizza dell'elenco:", registroDiCassav4_ATG0.get_outMess());
      
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
  public void test04()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertNotNull(registroDiCassav4_ATG0);
      
      registroDiCassav4_ATG0.get_statoCassa();
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertNotNull(registroDiCassav4_ATG0);
      
      RegistroDiCassav4.SelezioneTipoDiPizza registroDiCassav4_SelezioneTipoDiPizza0 = RegistroDiCassav4.SelezioneTipoDiPizza.OTHER;
      registroDiCassav4_ATG0.set_sceltaDelTipoPizza(registroDiCassav4_SelezioneTipoDiPizza0);
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      
      RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.SI;
      registroDiCassav4_ATG0.set_sceltaDiAggiuntaPizza(registroDiCassav4_AggiungiPizza0);
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      
      registroDiCassav4_ATG0.step();
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      registroDiCassav4_ATG0.step();
      assertEquals("Inserisci il nome di una nuova pizza:", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ALTRAPIZZA_SELEZIONATA, registroDiCassav4_ATG0.get_statoCassa());
      
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
  public void test06()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertNotNull(registroDiCassav4_ATG0);
      
      registroDiCassav4_ATG0.set_pizzaInserita_margherita();
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertNotNull(registroDiCassav4_ATG0);
      
      String string0 = registroDiCassav4_ATG0.get_pizzaCorrente();
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertNotNull(registroDiCassav4_ATG0);
      
      registroDiCassav4_ATG0.set_pizzaInserita_capricciosa();
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertNotNull(registroDiCassav4_ATG0);
      
      String string0 = registroDiCassav4_ATG0.get_outMess();
      assertEquals("", string0);
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertNotNull(registroDiCassav4_ATG0);
      
      registroDiCassav4_ATG0.set_pizzaInserita_marinara();
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertNotNull(registroDiCassav4_ATG0);
      
      registroDiCassav4_ATG0.set_pizzaInserita("capricciosa");
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertNotNull(registroDiCassav4_ATG0);
      
      registroDiCassav4_ATG0.set_insertQuantita(0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertNotNull(registroDiCassav4_ATG0);
      
      int int0 = registroDiCassav4_ATG0.get_totale();
      assertEquals(0, int0);
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
  }
}