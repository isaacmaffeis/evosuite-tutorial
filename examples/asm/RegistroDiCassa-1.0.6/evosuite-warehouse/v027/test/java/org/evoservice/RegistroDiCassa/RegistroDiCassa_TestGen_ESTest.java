/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 10 20:10:22 GMT 2024
 */

package org.evoservice.RegistroDiCassa;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evoservice.RegistroDiCassa.RegistroDiCassa_TestGen;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegistroDiCassa_TestGen_ESTest extends RegistroDiCassa_TestGen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RegistroDiCassa_TestGen registroDiCassa_TestGen0 = new RegistroDiCassa_TestGen();
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertNotNull(registroDiCassa_TestGen0);
      
      registroDiCassa_TestGen0.set_pizzaInserita("marinara");
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegistroDiCassa_TestGen registroDiCassa_TestGen0 = new RegistroDiCassa_TestGen();
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      assertNotNull(registroDiCassa_TestGen0);
      
      registroDiCassa_TestGen0.set_insertQuantita(0);
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegistroDiCassa_TestGen registroDiCassa_TestGen0 = new RegistroDiCassa_TestGen();
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      assertNotNull(registroDiCassa_TestGen0);
      
      registroDiCassa_TestGen0.set_insertPrezzo(1);
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegistroDiCassa_TestGen registroDiCassa_TestGen0 = new RegistroDiCassa_TestGen();
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      assertNotNull(registroDiCassa_TestGen0);
      
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Servizio registroDiCassa_TestGen_RegistroDiCassav4Sig_Servizio0 = RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Servizio.NEWORDINE;
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.AggiungiPizza registroDiCassa_TestGen_RegistroDiCassav4Sig_AggiungiPizza0 = RegistroDiCassa_TestGen.RegistroDiCassav4Sig.AggiungiPizza.NO;
      registroDiCassa_TestGen0.set_sceltaDiAggiuntaPizza(registroDiCassa_TestGen_RegistroDiCassav4Sig_AggiungiPizza0);
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      
      registroDiCassa_TestGen0.set_servizioSelezionato(registroDiCassa_TestGen_RegistroDiCassav4Sig_Servizio0);
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      
      registroDiCassa_TestGen0.step();
      assertEquals("prezzo totale aggiornato", registroDiCassa_TestGen0.get_outMess());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegistroDiCassa_TestGen registroDiCassa_TestGen0 = new RegistroDiCassa_TestGen();
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      assertNotNull(registroDiCassa_TestGen0);
      
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Servizio registroDiCassa_TestGen_RegistroDiCassav4Sig_Servizio0 = RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Servizio.EXIT;
      registroDiCassa_TestGen0.set_servizioSelezionato(registroDiCassa_TestGen_RegistroDiCassav4Sig_Servizio0);
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      
      registroDiCassa_TestGen0.step();
      assertEquals("Registro di cassa chiuso!", registroDiCassa_TestGen0.get_outMess());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.CHIUSO, registroDiCassa_TestGen0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.QuantitaDomain registroDiCassa_TestGen_RegistroDiCassav4Sig_QuantitaDomain0 = new RegistroDiCassa_TestGen.RegistroDiCassav4Sig.QuantitaDomain();
      assertNotNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_QuantitaDomain0);
      
      boolean boolean0 = registroDiCassa_TestGen_RegistroDiCassav4Sig_QuantitaDomain0.equals("margherita");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.QuantitaDomain registroDiCassa_TestGen_RegistroDiCassav4Sig_QuantitaDomain0 = new RegistroDiCassa_TestGen.RegistroDiCassav4Sig.QuantitaDomain();
      assertNotNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_QuantitaDomain0);
      
      // Undeclared exception!
      try { 
        registroDiCassa_TestGen_RegistroDiCassav4Sig_QuantitaDomain0.equals(registroDiCassa_TestGen_RegistroDiCassav4Sig_QuantitaDomain0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evoservice.RegistroDiCassa.RegistroDiCassa_TestGen$RegistroDiCassav4Sig$QuantitaDomain", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.PrezzoDomain registroDiCassa_TestGen_RegistroDiCassav4Sig_PrezzoDomain0 = new RegistroDiCassa_TestGen.RegistroDiCassav4Sig.PrezzoDomain();
      assertNotNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_PrezzoDomain0);
      
      // Undeclared exception!
      try { 
        registroDiCassa_TestGen_RegistroDiCassav4Sig_PrezzoDomain0.equals(registroDiCassa_TestGen_RegistroDiCassav4Sig_PrezzoDomain0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evoservice.RegistroDiCassa.RegistroDiCassa_TestGen$RegistroDiCassav4Sig$PrezzoDomain", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegistroDiCassa_TestGen registroDiCassa_TestGen0 = new RegistroDiCassa_TestGen();
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      assertNotNull(registroDiCassa_TestGen0);
      
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.AggiungiPizza registroDiCassa_TestGen_RegistroDiCassav4Sig_AggiungiPizza0 = RegistroDiCassa_TestGen.RegistroDiCassav4Sig.AggiungiPizza.SI;
      registroDiCassa_TestGen0.set_sceltaDiAggiuntaPizza(registroDiCassa_TestGen_RegistroDiCassav4Sig_AggiungiPizza0);
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Servizio registroDiCassa_TestGen_RegistroDiCassav4Sig_Servizio0 = RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Servizio.NEWORDINE;
      registroDiCassa_TestGen0.set_servizioSelezionato(registroDiCassa_TestGen_RegistroDiCassav4Sig_Servizio0);
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      
      registroDiCassa_TestGen0.step();
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassa_TestGen0.get_outMess());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassa_TestGen0.get_statoCassa());
      
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.SelezioneTipoDiPizza registroDiCassa_TestGen_RegistroDiCassav4Sig_SelezioneTipoDiPizza0 = RegistroDiCassa_TestGen.RegistroDiCassav4Sig.SelezioneTipoDiPizza.STANDARD;
      registroDiCassa_TestGen0.set_sceltaDelTipoDiPizza(registroDiCassa_TestGen_RegistroDiCassav4Sig_SelezioneTipoDiPizza0);
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassa_TestGen0.get_outMess());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassa_TestGen0.get_statoCassa());
      
      registroDiCassa_TestGen0.step();
      assertEquals("Inserisci il nome di una pizza dell'elenco:", registroDiCassa_TestGen0.get_outMess());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.PIZZASTANDARD_SELEZIONATA, registroDiCassa_TestGen0.get_statoCassa());
      
      // Undeclared exception!
      try { 
        registroDiCassa_TestGen0.step();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evoservice.RegistroDiCassa.RegistroDiCassa_TestGen$RegistroDiCassav4", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer(0);
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
      
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.PrezzoDomain registroDiCassa_TestGen_RegistroDiCassav4Sig_PrezzoDomain0 = RegistroDiCassa_TestGen.RegistroDiCassav4Sig.PrezzoDomain.valueOf(integer0);
      assertNotNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_PrezzoDomain0);
      
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.PrezzoDomain registroDiCassa_TestGen_RegistroDiCassav4Sig_PrezzoDomain1 = RegistroDiCassa_TestGen.RegistroDiCassav4Sig.PrezzoDomain.valueOf(registroDiCassa_TestGen_RegistroDiCassav4Sig_PrezzoDomain0);
      assertSame(registroDiCassa_TestGen_RegistroDiCassav4Sig_PrezzoDomain0, registroDiCassa_TestGen_RegistroDiCassav4Sig_PrezzoDomain1);
      assertSame(registroDiCassa_TestGen_RegistroDiCassav4Sig_PrezzoDomain1, registroDiCassa_TestGen_RegistroDiCassav4Sig_PrezzoDomain0);
      assertNotNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_PrezzoDomain1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(0);
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
      
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.PrezzoDomain registroDiCassa_TestGen_RegistroDiCassav4Sig_PrezzoDomain0 = RegistroDiCassa_TestGen.RegistroDiCassav4Sig.PrezzoDomain.valueOf(integer0);
      assertNotNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_PrezzoDomain0);
      
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.FunNCtrl<Object, Object> registroDiCassa_TestGen_RegistroDiCassav4Sig_FunNCtrl0 = new RegistroDiCassa_TestGen.RegistroDiCassav4Sig.FunNCtrl<Object, Object>();
      assertNotNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_FunNCtrl0);
      
      Object object0 = registroDiCassa_TestGen_RegistroDiCassav4Sig_FunNCtrl0.get(registroDiCassa_TestGen_RegistroDiCassav4Sig_PrezzoDomain0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer((-1293));
      assertNotNull(integer0);
      assertEquals((-1293), (int)integer0);
      
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.PrezzoDomain registroDiCassa_TestGen_RegistroDiCassav4Sig_PrezzoDomain0 = RegistroDiCassa_TestGen.RegistroDiCassav4Sig.PrezzoDomain.valueOf(integer0);
      assertNotNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_PrezzoDomain0);
      
      boolean boolean0 = registroDiCassa_TestGen_RegistroDiCassav4Sig_PrezzoDomain0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegistroDiCassa_TestGen registroDiCassa_TestGen0 = new RegistroDiCassa_TestGen();
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertNotNull(registroDiCassa_TestGen0);
      
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.AggiungiPizza registroDiCassa_TestGen_RegistroDiCassav4Sig_AggiungiPizza0 = RegistroDiCassa_TestGen.RegistroDiCassav4Sig.AggiungiPizza.SI;
      registroDiCassa_TestGen0.set_sceltaDiAggiuntaPizza(registroDiCassa_TestGen_RegistroDiCassav4Sig_AggiungiPizza0);
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Servizio registroDiCassa_TestGen_RegistroDiCassav4Sig_Servizio0 = RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Servizio.NEWORDINE;
      registroDiCassa_TestGen0.set_servizioSelezionato(registroDiCassa_TestGen_RegistroDiCassav4Sig_Servizio0);
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      
      registroDiCassa_TestGen0.step();
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassa_TestGen0.get_statoCassa());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassa_TestGen0.get_outMess());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.SelezioneTipoDiPizza registroDiCassa_TestGen_RegistroDiCassav4Sig_SelezioneTipoDiPizza0 = RegistroDiCassa_TestGen.RegistroDiCassav4Sig.SelezioneTipoDiPizza.OTHER;
      registroDiCassa_TestGen0.set_sceltaDelTipoDiPizza(registroDiCassa_TestGen_RegistroDiCassav4Sig_SelezioneTipoDiPizza0);
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassa_TestGen0.get_statoCassa());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassa_TestGen0.get_outMess());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      
      registroDiCassa_TestGen0.step();
      assertEquals("Inserisci il nome di una nuova pizza:", registroDiCassa_TestGen0.get_outMess());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ALTRAPIZZA_SELEZIONATA, registroDiCassa_TestGen0.get_statoCassa());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      
      // Undeclared exception!
      try { 
        registroDiCassa_TestGen0.step();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evoservice.RegistroDiCassa.RegistroDiCassa_TestGen$RegistroDiCassav4", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegistroDiCassa_TestGen registroDiCassa_TestGen0 = new RegistroDiCassa_TestGen();
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      assertNotNull(registroDiCassa_TestGen0);
      
      int int0 = registroDiCassa_TestGen0.get_totale();
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegistroDiCassa_TestGen registroDiCassa_TestGen0 = new RegistroDiCassa_TestGen();
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertNotNull(registroDiCassa_TestGen0);
      
      String string0 = registroDiCassa_TestGen0.get_outMess();
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegistroDiCassa_TestGen registroDiCassa_TestGen0 = new RegistroDiCassa_TestGen();
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      assertNotNull(registroDiCassa_TestGen0);
      
      registroDiCassa_TestGen0.get_statoCassa();
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegistroDiCassa_TestGen registroDiCassa_TestGen0 = new RegistroDiCassa_TestGen();
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      assertNotNull(registroDiCassa_TestGen0);
      
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Pizza registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0 = registroDiCassa_TestGen0.get_pizzaCorrente();
      assertEquals(0, registroDiCassa_TestGen0.get_totale());
      assertEquals("", registroDiCassa_TestGen0.get_outMess());
      assertEquals(RegistroDiCassa_TestGen.RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassa_TestGen0.get_statoCassa());
      assertNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_Pizza0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.QuantitaDomain registroDiCassa_TestGen_RegistroDiCassav4Sig_QuantitaDomain0 = new RegistroDiCassa_TestGen.RegistroDiCassav4Sig.QuantitaDomain();
      assertNotNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_QuantitaDomain0);
      
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.QuantitaDomain registroDiCassa_TestGen_RegistroDiCassav4Sig_QuantitaDomain1 = RegistroDiCassa_TestGen.RegistroDiCassav4Sig.QuantitaDomain.valueOf(registroDiCassa_TestGen_RegistroDiCassav4Sig_QuantitaDomain0);
      assertSame(registroDiCassa_TestGen_RegistroDiCassav4Sig_QuantitaDomain0, registroDiCassa_TestGen_RegistroDiCassav4Sig_QuantitaDomain1);
      assertSame(registroDiCassa_TestGen_RegistroDiCassav4Sig_QuantitaDomain1, registroDiCassa_TestGen_RegistroDiCassav4Sig_QuantitaDomain0);
      assertNotNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_QuantitaDomain1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegistroDiCassa_TestGen.RegistroDiCassav4Sig.FunNCtrl<String, String> registroDiCassa_TestGen_RegistroDiCassav4Sig_FunNCtrl0 = new RegistroDiCassa_TestGen.RegistroDiCassav4Sig.FunNCtrl<String, String>();
      assertNotNull(registroDiCassa_TestGen_RegistroDiCassav4Sig_FunNCtrl0);
      
      registroDiCassa_TestGen_RegistroDiCassav4Sig_FunNCtrl0.set("DB_/'>vo~nUmV/f", "cw$h!<Np/@'qWoN|NS");
  }
}