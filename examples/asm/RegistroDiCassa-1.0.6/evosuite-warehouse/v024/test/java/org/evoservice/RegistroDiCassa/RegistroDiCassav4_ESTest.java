/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 07 08:47:11 GMT 2024
 */

package org.evoservice.RegistroDiCassa;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evoservice.RegistroDiCassa.RegistroDiCassav4;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegistroDiCassav4_ESTest extends RegistroDiCassav4_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertNotNull(registroDiCassav4_0);
      
      registroDiCassav4_0.set_pizzaInserita("marinara");
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("", registroDiCassav4_0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertNotNull(registroDiCassav4_0);
      
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      registroDiCassav4_0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.NO;
      registroDiCassav4_0.set_sceltaDiAggiuntaPizza(registroDiCassav4_AggiungiPizza0);
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      registroDiCassav4_0.step();
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("prezzo totale aggiornato", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertNotNull(registroDiCassav4_0);
      
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      registroDiCassav4_0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("", registroDiCassav4_0.get_outMess());
      
      registroDiCassav4_0.step();
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_SE_AGGIUNGERE_PIZZA, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("Scegli se aggiungere una nuova pizza", registroDiCassav4_0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertNotNull(registroDiCassav4_0);
      
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
  public void test04()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertNotNull(registroDiCassav4_0);
      
      RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.SI;
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      registroDiCassav4_0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      RegistroDiCassav4.SelezioneTipoDiPizza registroDiCassav4_SelezioneTipoDiPizza0 = RegistroDiCassav4.SelezioneTipoDiPizza.STANDARD;
      registroDiCassav4_0.set_sceltaDelTipoDiPizza(registroDiCassav4_SelezioneTipoDiPizza0);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      registroDiCassav4_0.set_sceltaDiAggiuntaPizza(registroDiCassav4_AggiungiPizza0);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      registroDiCassav4_0.step();
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      registroDiCassav4_0.step();
      assertEquals(RegistroDiCassav4.Stati.PIZZASTANDARD_SELEZIONATA, registroDiCassav4_0.get_statoCassa());
      assertEquals("Inserisci il nome di una pizza dell'elenco:", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      // Undeclared exception!
      try { 
        registroDiCassav4_0.step();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evoservice.RegistroDiCassa.RegistroDiCassav4", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertNotNull(registroDiCassav4_0);
      
      registroDiCassav4_0.set_insertPrezzo(2);
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", registroDiCassav4_0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertNotNull(registroDiCassav4_0);
      
      registroDiCassav4_0.get_statoCassa();
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", registroDiCassav4_0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertNotNull(registroDiCassav4_0);
      
      String string0 = registroDiCassav4_0.get_outMess();
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertNotNull(registroDiCassav4_0);
      
      int int0 = registroDiCassav4_0.get_totale();
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertNotNull(registroDiCassav4_0);
      
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      registroDiCassav4_0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", registroDiCassav4_0.get_outMess());
      
      RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.SI;
      RegistroDiCassav4.SelezioneTipoDiPizza registroDiCassav4_SelezioneTipoDiPizza0 = RegistroDiCassav4.SelezioneTipoDiPizza.OTHER;
      registroDiCassav4_0.set_sceltaDelTipoDiPizza(registroDiCassav4_SelezioneTipoDiPizza0);
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", registroDiCassav4_0.get_outMess());
      
      registroDiCassav4_0.set_sceltaDiAggiuntaPizza(registroDiCassav4_AggiungiPizza0);
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", registroDiCassav4_0.get_outMess());
      
      registroDiCassav4_0.step();
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_0.get_statoCassa());
      
      registroDiCassav4_0.step();
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("Inserisci il nome di una nuova pizza:", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ALTRAPIZZA_SELEZIONATA, registroDiCassav4_0.get_statoCassa());
      
      // Undeclared exception!
      try { 
        registroDiCassav4_0.step();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evoservice.RegistroDiCassa.RegistroDiCassav4", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertNotNull(registroDiCassav4_0);
      
      registroDiCassav4_0.set_insertQuantita(2);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.SI;
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      registroDiCassav4_0.set_insertPrezzo(2);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      registroDiCassav4_0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      RegistroDiCassav4.SelezioneTipoDiPizza registroDiCassav4_SelezioneTipoDiPizza0 = RegistroDiCassav4.SelezioneTipoDiPizza.OTHER;
      registroDiCassav4_0.set_sceltaDelTipoDiPizza(registroDiCassav4_SelezioneTipoDiPizza0);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      registroDiCassav4_0.set_sceltaDiAggiuntaPizza(registroDiCassav4_AggiungiPizza0);
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      registroDiCassav4_0.step();
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_0.get_statoCassa());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      registroDiCassav4_0.step();
      assertEquals(RegistroDiCassav4.Stati.ALTRAPIZZA_SELEZIONATA, registroDiCassav4_0.get_statoCassa());
      assertEquals("Inserisci il nome di una nuova pizza:", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      registroDiCassav4_0.step();
      assertEquals("prezzo totale aggiornato", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_SE_AGGIUNGERE_PIZZA, registroDiCassav4_0.get_statoCassa());
      assertEquals(4, registroDiCassav4_0.get_totale());
  }
}