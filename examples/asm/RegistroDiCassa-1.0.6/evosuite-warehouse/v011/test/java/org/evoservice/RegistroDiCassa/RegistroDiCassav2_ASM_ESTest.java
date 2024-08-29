/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 28 19:44:50 GMT 2024
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
      RegistroDiCassav2_ASM registroDiCassav2_ASM0 = new RegistroDiCassav2_ASM();
      assertNotNull(registroDiCassav2_ASM0);
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertEquals(RegistroDiCassav2Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav2_ASM0.getStatoCassa());
      
      RegistroDiCassav2Sig.Servizio registroDiCassav2Sig_Servizio0 = RegistroDiCassav2Sig.Servizio.NEWORDINE;
      RegistroDiCassav2Sig.AggiungiPizza registroDiCassav2Sig_AggiungiPizza0 = RegistroDiCassav2Sig.AggiungiPizza.SI;
      RegistroDiCassav2Sig.SelezioneTipoDiPizza registroDiCassav2Sig_SelezioneTipoDiPizza0 = RegistroDiCassav2Sig.SelezioneTipoDiPizza.STANDARD;
      registroDiCassav2_ASM0.step(registroDiCassav2Sig_Servizio0, registroDiCassav2Sig_AggiungiPizza0, registroDiCassav2Sig_SelezioneTipoDiPizza0, 2, 2, 2);
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertEquals(RegistroDiCassav2Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav2_ASM0.getStatoCassa());
      
      registroDiCassav2_ASM0.step(registroDiCassav2Sig_Servizio0, registroDiCassav2Sig_AggiungiPizza0, registroDiCassav2Sig_SelezioneTipoDiPizza0, 2, 2, 2);
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertEquals(RegistroDiCassav2Sig.Stati.PIZZASTANDARD_SELEZIONATA, registroDiCassav2_ASM0.getStatoCassa());
      
      registroDiCassav2_ASM0.step(registroDiCassav2Sig_Servizio0, registroDiCassav2Sig_AggiungiPizza0, registroDiCassav2Sig_SelezioneTipoDiPizza0, 2, 2, 2);
      assertEquals(RegistroDiCassav2Sig.Stati.SCEGLI_SE_AGGIUNGERE_PIZZA, registroDiCassav2_ASM0.getStatoCassa());
      assertEquals(10, registroDiCassav2_ASM0.getTotale());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RegistroDiCassav2_ASM registroDiCassav2_ASM0 = new RegistroDiCassav2_ASM();
      assertNotNull(registroDiCassav2_ASM0);
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertEquals(RegistroDiCassav2Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav2_ASM0.getStatoCassa());
      
      RegistroDiCassav2Sig.Servizio registroDiCassav2Sig_Servizio0 = RegistroDiCassav2Sig.Servizio.NEWORDINE;
      RegistroDiCassav2Sig.AggiungiPizza registroDiCassav2Sig_AggiungiPizza0 = RegistroDiCassav2Sig.AggiungiPizza.SI;
      RegistroDiCassav2Sig.SelezioneTipoDiPizza registroDiCassav2Sig_SelezioneTipoDiPizza0 = RegistroDiCassav2Sig.SelezioneTipoDiPizza.OTHER;
      registroDiCassav2_ASM0.step(registroDiCassav2Sig_Servizio0, registroDiCassav2Sig_AggiungiPizza0, registroDiCassav2Sig_SelezioneTipoDiPizza0, 2, 8, 8);
      assertEquals(RegistroDiCassav2Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav2_ASM0.getStatoCassa());
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      
      registroDiCassav2_ASM0.step(registroDiCassav2Sig_Servizio0, registroDiCassav2Sig_AggiungiPizza0, registroDiCassav2Sig_SelezioneTipoDiPizza0, 2, 2, 2);
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertEquals(RegistroDiCassav2Sig.Stati.ALTRAPIZZA_SELEZIONATA, registroDiCassav2_ASM0.getStatoCassa());
      
      registroDiCassav2_ASM0.step(registroDiCassav2Sig_Servizio0, registroDiCassav2Sig_AggiungiPizza0, registroDiCassav2Sig_SelezioneTipoDiPizza0, 2, 8, 8);
      assertEquals(RegistroDiCassav2Sig.Stati.SCEGLI_SE_AGGIUNGERE_PIZZA, registroDiCassav2_ASM0.getStatoCassa());
      assertEquals(64, registroDiCassav2_ASM0.getTotale());
      
      registroDiCassav2_ASM0.step(registroDiCassav2Sig_Servizio0, registroDiCassav2Sig_AggiungiPizza0, registroDiCassav2Sig_SelezioneTipoDiPizza0, 2, 2, 2);
      assertEquals(RegistroDiCassav2Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav2_ASM0.getStatoCassa());
      assertEquals(64, registroDiCassav2_ASM0.getTotale());
      
      boolean boolean0 = registroDiCassav2_ASM0.isFinalState();
      assertFalse(boolean0);
      assertEquals(RegistroDiCassav2Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav2_ASM0.getStatoCassa());
      assertEquals(64, registroDiCassav2_ASM0.getTotale());
  }
}
