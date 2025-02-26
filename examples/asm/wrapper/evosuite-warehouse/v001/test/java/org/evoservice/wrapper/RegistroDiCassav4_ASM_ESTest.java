/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 11 13:18:13 GMT 2024
 */

package org.evoservice.wrapper;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegistroDiCassav4_ASM_ESTest extends RegistroDiCassav4_ASM_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RegistroDiCassav4_ASM registroDiCassav4_ASM0 = new RegistroDiCassav4_ASM();
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertNotNull(registroDiCassav4_ASM0);
      
      RegistroDiCassav4Sig.AggiungiPizza registroDiCassav4Sig_AggiungiPizza0 = RegistroDiCassav4Sig.AggiungiPizza.SI;
      registroDiCassav4_ASM0.set_sceltaDiAggiuntaPizza(registroDiCassav4Sig_AggiungiPizza0);
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegistroDiCassav4_ASM registroDiCassav4_ASM0 = new RegistroDiCassav4_ASM();
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertNotNull(registroDiCassav4_ASM0);
      
      RegistroDiCassav4Sig.SelezioneTipoDiPizza registroDiCassav4Sig_SelezioneTipoDiPizza0 = RegistroDiCassav4Sig.SelezioneTipoDiPizza.OTHER;
      registroDiCassav4_ASM0.set_sceltaDelTipoDiPizza(registroDiCassav4Sig_SelezioneTipoDiPizza0);
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegistroDiCassav4_ASM registroDiCassav4_ASM0 = new RegistroDiCassav4_ASM();
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertNotNull(registroDiCassav4_ASM0);
      
      String string0 = registroDiCassav4_ASM0.get_outMess();
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegistroDiCassav4_ASM registroDiCassav4_ASM0 = new RegistroDiCassav4_ASM();
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertNotNull(registroDiCassav4_ASM0);
      
      int int0 = registroDiCassav4_ASM0.get_totale();
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegistroDiCassav4_ASM registroDiCassav4_ASM0 = new RegistroDiCassav4_ASM();
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertNotNull(registroDiCassav4_ASM0);
      
      RegistroDiCassav4Sig.Servizio registroDiCassav4Sig_Servizio0 = RegistroDiCassav4Sig.Servizio.EXIT;
      registroDiCassav4_ASM0.set_servizioSelezionato(registroDiCassav4Sig_Servizio0);
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegistroDiCassav4_ASM registroDiCassav4_ASM0 = new RegistroDiCassav4_ASM();
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertNotNull(registroDiCassav4_ASM0);
      
      registroDiCassav4_ASM0.set_insertQuantita(0);
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegistroDiCassav4_ASM registroDiCassav4_ASM0 = new RegistroDiCassav4_ASM();
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertNotNull(registroDiCassav4_ASM0);
      
      registroDiCassav4_ASM0.step();
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegistroDiCassav4_ASM registroDiCassav4_ASM0 = new RegistroDiCassav4_ASM();
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertNotNull(registroDiCassav4_ASM0);
      
      RegistroDiCassav4Sig.Pizza registroDiCassav4Sig_Pizza0 = registroDiCassav4_ASM0.get_pizzaCorrente();
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertNull(registroDiCassav4Sig_Pizza0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegistroDiCassav4_ASM registroDiCassav4_ASM0 = new RegistroDiCassav4_ASM();
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertNotNull(registroDiCassav4_ASM0);
      
      registroDiCassav4_ASM0.set_insertPrezzo(10);
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegistroDiCassav4_ASM registroDiCassav4_ASM0 = new RegistroDiCassav4_ASM();
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertNotNull(registroDiCassav4_ASM0);
      
      registroDiCassav4_ASM0.get_statoCassa();
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegistroDiCassav4_ASM registroDiCassav4_ASM0 = new RegistroDiCassav4_ASM();
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertNotNull(registroDiCassav4_ASM0);
      
      registroDiCassav4_ASM0.set_pizzaInserita("capricciosa");
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
  }
}
