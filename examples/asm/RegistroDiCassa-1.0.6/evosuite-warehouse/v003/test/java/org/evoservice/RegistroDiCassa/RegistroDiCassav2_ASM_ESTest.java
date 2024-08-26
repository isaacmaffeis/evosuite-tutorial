/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 24 18:09:46 GMT 2024
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
      assertEquals("marinara", registroDiCassav2_ASM0.getPizza_elemsList_1());
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertNull(registroDiCassav2_ASM0.getServizio());
      assertEquals("capricciosa", registroDiCassav2_ASM0.getPizza_elemsList_2());
      assertEquals("margherita", registroDiCassav2_ASM0.getPizza_elemsList_0());
      assertFalse(registroDiCassav2_ASM0.isFinalState());
      
      RegistroDiCassav2Sig.Servizio registroDiCassav2Sig_Servizio0 = RegistroDiCassav2Sig.Servizio.NEWORDINE;
      RegistroDiCassav2Sig.AggiungiPizza registroDiCassav2Sig_AggiungiPizza0 = RegistroDiCassav2Sig.AggiungiPizza.SI;
      RegistroDiCassav2Sig.SelezioneTipoDiPizza registroDiCassav2Sig_SelezioneTipoDiPizza0 = RegistroDiCassav2Sig.SelezioneTipoDiPizza.OTHER;
      registroDiCassav2_ASM0.stepFSM(registroDiCassav2_0, registroDiCassav2Sig_Servizio0, registroDiCassav2Sig_AggiungiPizza0, registroDiCassav2Sig_SelezioneTipoDiPizza0, 3, 3);
      assertEquals("marinara", registroDiCassav2_ASM0.getPizza_elemsList_1());
      assertEquals(0, registroDiCassav2_ASM0.getTotale());
      assertEquals("capricciosa", registroDiCassav2_ASM0.getPizza_elemsList_2());
      assertEquals(RegistroDiCassav2Sig.Servizio.NEWORDINE, registroDiCassav2_ASM0.getServizio());
      assertEquals("margherita", registroDiCassav2_ASM0.getPizza_elemsList_0());
      assertFalse(registroDiCassav2_ASM0.isFinalState());
      
      registroDiCassav2_0.r_aggiungiAlTotale();
      registroDiCassav2_ASM0.stepFSM(registroDiCassav2_0, registroDiCassav2Sig_Servizio0, registroDiCassav2Sig_AggiungiPizza0, registroDiCassav2Sig_SelezioneTipoDiPizza0, 3, 3);
      assertEquals("marinara", registroDiCassav2_ASM0.getPizza_elemsList_1());
      assertEquals("capricciosa", registroDiCassav2_ASM0.getPizza_elemsList_2());
      assertEquals(RegistroDiCassav2Sig.Servizio.NEWORDINE, registroDiCassav2_ASM0.getServizio());
      assertEquals("margherita", registroDiCassav2_ASM0.getPizza_elemsList_0());
      assertFalse(registroDiCassav2_ASM0.isFinalState());
      assertEquals(12, registroDiCassav2_ASM0.getTotale());
      
      registroDiCassav2_0.r_aggiungiAlTotale_seq();
      registroDiCassav2_ASM0.stepFSM(registroDiCassav2_0, registroDiCassav2Sig_Servizio0, registroDiCassav2Sig_AggiungiPizza0, registroDiCassav2Sig_SelezioneTipoDiPizza0, 7, 3);
      assertEquals("marinara", registroDiCassav2_ASM0.getPizza_elemsList_1());
      assertEquals("capricciosa", registroDiCassav2_ASM0.getPizza_elemsList_2());
      assertEquals(52, registroDiCassav2_ASM0.getTotale());
      assertTrue(registroDiCassav2_ASM0.isFinalState());
      assertEquals(RegistroDiCassav2Sig.Servizio.NEWORDINE, registroDiCassav2_ASM0.getServizio());
      assertEquals("margherita", registroDiCassav2_ASM0.getPizza_elemsList_0());
  }
}
