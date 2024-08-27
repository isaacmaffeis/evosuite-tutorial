/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 27 14:34:30 GMT 2024
 */

package org.evoservice.RegistroDiCassa;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegistroDiCassav2_ASM_ESTest extends RegistroDiCassav2_ASM_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegistroDiCassav2 registroDiCassav2_0 = new RegistroDiCassav2();
      assertNotNull(registroDiCassav2_0);
      
      RegistroDiCassav2_ASM registroDiCassav2_ASM0 = new RegistroDiCassav2_ASM(registroDiCassav2_0);
      assertNotNull(registroDiCassav2_ASM0);
      assertFalse(registroDiCassav2_ASM0.isFinalState());
      assertNull(registroDiCassav2_ASM0.getAggiungiPizza());
      assertNull(registroDiCassav2_ASM0.getServizio());
      assertEquals(RegistroDiCassav2Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav2_ASM0.getStato());
      assertNull(registroDiCassav2_ASM0.getSelezioneTipoDiPizza());
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      
      RegistroDiCassav2Sig.Servizio registroDiCassav2Sig_Servizio0 = RegistroDiCassav2Sig.Servizio.EXIT;
      RegistroDiCassav2Sig.AggiungiPizza registroDiCassav2Sig_AggiungiPizza0 = RegistroDiCassav2Sig.AggiungiPizza.SI;
      RegistroDiCassav2Sig.SelezioneTipoDiPizza registroDiCassav2Sig_SelezioneTipoDiPizza0 = RegistroDiCassav2Sig.SelezioneTipoDiPizza.OTHER;
      registroDiCassav2_ASM0.step(registroDiCassav2_0, registroDiCassav2Sig_Servizio0, registroDiCassav2Sig_AggiungiPizza0, registroDiCassav2Sig_SelezioneTipoDiPizza0, 10, 10);
      assertFalse(registroDiCassav2_ASM0.isFinalState());
      assertEquals(RegistroDiCassav2Sig.SelezioneTipoDiPizza.OTHER, registroDiCassav2_ASM0.getSelezioneTipoDiPizza());
      assertEquals(RegistroDiCassav2Sig.Servizio.EXIT, registroDiCassav2_ASM0.getServizio());
      assertEquals(RegistroDiCassav2Sig.AggiungiPizza.SI, registroDiCassav2_ASM0.getAggiungiPizza());
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertEquals(RegistroDiCassav2Sig.Stati.CHIUSO, registroDiCassav2_ASM0.getStato());
      
      registroDiCassav2_0.r_aggiungiAlTotale();
      boolean boolean0 = registroDiCassav2_ASM0.isFinalState();
      assertTrue(boolean0);
      assertEquals(RegistroDiCassav2Sig.SelezioneTipoDiPizza.OTHER, registroDiCassav2_ASM0.getSelezioneTipoDiPizza());
      assertTrue(registroDiCassav2_ASM0.isFinalState());
      assertEquals(RegistroDiCassav2Sig.Servizio.EXIT, registroDiCassav2_ASM0.getServizio());
      assertEquals(100, registroDiCassav2_ASM0.getTotale());
      assertEquals(RegistroDiCassav2Sig.AggiungiPizza.SI, registroDiCassav2_ASM0.getAggiungiPizza());
      assertEquals(RegistroDiCassav2Sig.Stati.CHIUSO, registroDiCassav2_ASM0.getStato());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RegistroDiCassav2 registroDiCassav2_0 = new RegistroDiCassav2();
      assertNotNull(registroDiCassav2_0);
      
      RegistroDiCassav2_ASM registroDiCassav2_ASM0 = new RegistroDiCassav2_ASM(registroDiCassav2_0);
      assertNotNull(registroDiCassav2_ASM0);
      assertFalse(registroDiCassav2_ASM0.isFinalState());
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertNull(registroDiCassav2_ASM0.getSelezioneTipoDiPizza());
      assertNull(registroDiCassav2_ASM0.getServizio());
      assertNull(registroDiCassav2_ASM0.getAggiungiPizza());
      assertEquals(RegistroDiCassav2Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav2_ASM0.getStato());
      
      boolean boolean0 = registroDiCassav2_ASM0.isFinalState();
      assertFalse(boolean0);
      assertFalse(registroDiCassav2_ASM0.isFinalState());
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertNull(registroDiCassav2_ASM0.getSelezioneTipoDiPizza());
      assertNull(registroDiCassav2_ASM0.getServizio());
      assertNull(registroDiCassav2_ASM0.getAggiungiPizza());
      assertEquals(RegistroDiCassav2Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav2_ASM0.getStato());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RegistroDiCassav2 registroDiCassav2_0 = new RegistroDiCassav2();
      assertNotNull(registroDiCassav2_0);
      
      RegistroDiCassav2_ASM registroDiCassav2_ASM0 = new RegistroDiCassav2_ASM(registroDiCassav2_0);
      assertNotNull(registroDiCassav2_ASM0);
      assertFalse(registroDiCassav2_ASM0.isFinalState());
      assertNull(registroDiCassav2_ASM0.getSelezioneTipoDiPizza());
      assertNull(registroDiCassav2_ASM0.getAggiungiPizza());
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertNull(registroDiCassav2_ASM0.getServizio());
      assertEquals(RegistroDiCassav2Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav2_ASM0.getStato());
      
      String string0 = registroDiCassav2_ASM0.getStatoCassa();
      assertNotNull(string0);
      assertEquals("ATTENDI_ORDINAZIONI", string0);
      assertFalse(registroDiCassav2_ASM0.isFinalState());
      assertNull(registroDiCassav2_ASM0.getSelezioneTipoDiPizza());
      assertNull(registroDiCassav2_ASM0.getAggiungiPizza());
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertNull(registroDiCassav2_ASM0.getServizio());
      assertEquals(RegistroDiCassav2Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav2_ASM0.getStato());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RegistroDiCassav2 registroDiCassav2_0 = new RegistroDiCassav2();
      assertNotNull(registroDiCassav2_0);
      
      RegistroDiCassav2_ASM registroDiCassav2_ASM0 = new RegistroDiCassav2_ASM(registroDiCassav2_0);
      assertNotNull(registroDiCassav2_ASM0);
      assertEquals(RegistroDiCassav2Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav2_ASM0.getStato());
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertFalse(registroDiCassav2_ASM0.isFinalState());
      assertNull(registroDiCassav2_ASM0.getAggiungiPizza());
      assertNull(registroDiCassav2_ASM0.getServizio());
      assertNull(registroDiCassav2_ASM0.getSelezioneTipoDiPizza());
      
      int int0 = registroDiCassav2_ASM0.getTotale();
      assertEquals(0, int0);
      assertEquals(RegistroDiCassav2Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav2_ASM0.getStato());
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertFalse(registroDiCassav2_ASM0.isFinalState());
      assertNull(registroDiCassav2_ASM0.getAggiungiPizza());
      assertNull(registroDiCassav2_ASM0.getServizio());
      assertNull(registroDiCassav2_ASM0.getSelezioneTipoDiPizza());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RegistroDiCassav2 registroDiCassav2_0 = new RegistroDiCassav2();
      assertNotNull(registroDiCassav2_0);
      
      RegistroDiCassav2_ASM registroDiCassav2_ASM0 = new RegistroDiCassav2_ASM(registroDiCassav2_0);
      assertNotNull(registroDiCassav2_ASM0);
      assertFalse(registroDiCassav2_ASM0.isFinalState());
      assertNull(registroDiCassav2_ASM0.getAggiungiPizza());
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertNull(registroDiCassav2_ASM0.getServizio());
      assertEquals(RegistroDiCassav2Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav2_ASM0.getStato());
      assertNull(registroDiCassav2_ASM0.getSelezioneTipoDiPizza());
      
      registroDiCassav2_ASM0.getAggiungiPizza();
      assertFalse(registroDiCassav2_ASM0.isFinalState());
      assertNull(registroDiCassav2_ASM0.getAggiungiPizza());
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertNull(registroDiCassav2_ASM0.getServizio());
      assertEquals(RegistroDiCassav2Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav2_ASM0.getStato());
      assertNull(registroDiCassav2_ASM0.getSelezioneTipoDiPizza());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RegistroDiCassav2 registroDiCassav2_0 = new RegistroDiCassav2();
      assertNotNull(registroDiCassav2_0);
      
      RegistroDiCassav2_ASM registroDiCassav2_ASM0 = new RegistroDiCassav2_ASM(registroDiCassav2_0);
      assertNotNull(registroDiCassav2_ASM0);
      assertFalse(registroDiCassav2_ASM0.isFinalState());
      assertNull(registroDiCassav2_ASM0.getAggiungiPizza());
      assertNull(registroDiCassav2_ASM0.getServizio());
      assertEquals(RegistroDiCassav2Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav2_ASM0.getStato());
      assertNull(registroDiCassav2_ASM0.getSelezioneTipoDiPizza());
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      
      registroDiCassav2_ASM0.getSelezioneTipoDiPizza();
      assertFalse(registroDiCassav2_ASM0.isFinalState());
      assertNull(registroDiCassav2_ASM0.getAggiungiPizza());
      assertNull(registroDiCassav2_ASM0.getServizio());
      assertEquals(RegistroDiCassav2Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav2_ASM0.getStato());
      assertNull(registroDiCassav2_ASM0.getSelezioneTipoDiPizza());
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RegistroDiCassav2 registroDiCassav2_0 = new RegistroDiCassav2();
      assertNotNull(registroDiCassav2_0);
      
      RegistroDiCassav2_ASM registroDiCassav2_ASM0 = new RegistroDiCassav2_ASM(registroDiCassav2_0);
      assertNotNull(registroDiCassav2_ASM0);
      assertFalse(registroDiCassav2_ASM0.isFinalState());
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertNull(registroDiCassav2_ASM0.getServizio());
      assertNull(registroDiCassav2_ASM0.getAggiungiPizza());
      assertEquals(RegistroDiCassav2Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav2_ASM0.getStato());
      assertNull(registroDiCassav2_ASM0.getSelezioneTipoDiPizza());
      
      RegistroDiCassav2Sig.Servizio registroDiCassav2Sig_Servizio0 = RegistroDiCassav2Sig.Servizio.EXIT;
      RegistroDiCassav2Sig.AggiungiPizza registroDiCassav2Sig_AggiungiPizza0 = RegistroDiCassav2Sig.AggiungiPizza.SI;
      RegistroDiCassav2Sig.SelezioneTipoDiPizza registroDiCassav2Sig_SelezioneTipoDiPizza0 = RegistroDiCassav2Sig.SelezioneTipoDiPizza.OTHER;
      registroDiCassav2_ASM0.step(registroDiCassav2_0, registroDiCassav2Sig_Servizio0, registroDiCassav2Sig_AggiungiPizza0, registroDiCassav2Sig_SelezioneTipoDiPizza0, 10, 10);
      assertFalse(registroDiCassav2_ASM0.isFinalState());
      assertEquals(RegistroDiCassav2Sig.SelezioneTipoDiPizza.OTHER, registroDiCassav2_ASM0.getSelezioneTipoDiPizza());
      assertEquals(RegistroDiCassav2Sig.AggiungiPizza.SI, registroDiCassav2_ASM0.getAggiungiPizza());
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertEquals(RegistroDiCassav2Sig.Servizio.EXIT, registroDiCassav2_ASM0.getServizio());
      assertEquals(RegistroDiCassav2Sig.Stati.CHIUSO, registroDiCassav2_ASM0.getStato());
      
      registroDiCassav2_0.r_aggiungiAlTotale();
      RegistroDiCassav2Sig.Servizio registroDiCassav2Sig_Servizio1 = registroDiCassav2_ASM0.getServizio();
      assertEquals(RegistroDiCassav2Sig.SelezioneTipoDiPizza.OTHER, registroDiCassav2_ASM0.getSelezioneTipoDiPizza());
      assertEquals(RegistroDiCassav2Sig.AggiungiPizza.SI, registroDiCassav2_ASM0.getAggiungiPizza());
      assertTrue(registroDiCassav2_ASM0.isFinalState());
      assertEquals(RegistroDiCassav2Sig.Servizio.EXIT, registroDiCassav2_ASM0.getServizio());
      assertEquals(RegistroDiCassav2Sig.Stati.CHIUSO, registroDiCassav2_ASM0.getStato());
      assertEquals(100, registroDiCassav2_ASM0.getTotale());
      assertSame(registroDiCassav2Sig_Servizio1, registroDiCassav2Sig_Servizio0);
      
      registroDiCassav2_ASM0.step(registroDiCassav2_0, registroDiCassav2Sig_Servizio1, registroDiCassav2Sig_AggiungiPizza0, registroDiCassav2Sig_SelezioneTipoDiPizza0, 10, 10);
      assertEquals(RegistroDiCassav2Sig.SelezioneTipoDiPizza.OTHER, registroDiCassav2_ASM0.getSelezioneTipoDiPizza());
      assertEquals(RegistroDiCassav2Sig.AggiungiPizza.SI, registroDiCassav2_ASM0.getAggiungiPizza());
      assertTrue(registroDiCassav2_ASM0.isFinalState());
      assertEquals(RegistroDiCassav2Sig.Servizio.EXIT, registroDiCassav2_ASM0.getServizio());
      assertEquals(RegistroDiCassav2Sig.Stati.CHIUSO, registroDiCassav2_ASM0.getStato());
      assertEquals(100, registroDiCassav2_ASM0.getTotale());
      assertSame(registroDiCassav2Sig_Servizio1, registroDiCassav2Sig_Servizio0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RegistroDiCassav2 registroDiCassav2_0 = new RegistroDiCassav2();
      assertNotNull(registroDiCassav2_0);
      
      RegistroDiCassav2_ASM registroDiCassav2_ASM0 = new RegistroDiCassav2_ASM(registroDiCassav2_0);
      assertNotNull(registroDiCassav2_ASM0);
      assertFalse(registroDiCassav2_ASM0.isFinalState());
      assertNull(registroDiCassav2_ASM0.getAggiungiPizza());
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertEquals(RegistroDiCassav2Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav2_ASM0.getStato());
      assertNull(registroDiCassav2_ASM0.getSelezioneTipoDiPizza());
      assertNull(registroDiCassav2_ASM0.getServizio());
      
      registroDiCassav2_ASM0.getStato();
      assertFalse(registroDiCassav2_ASM0.isFinalState());
      assertNull(registroDiCassav2_ASM0.getAggiungiPizza());
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertEquals(RegistroDiCassav2Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav2_ASM0.getStato());
      assertNull(registroDiCassav2_ASM0.getSelezioneTipoDiPizza());
      assertNull(registroDiCassav2_ASM0.getServizio());
  }
}
