/*
 * This file was automatically generated by EvoSuite
 * Mon Sep 02 09:30:54 GMT 2024
 */

package org.evoservice.RegistroDiCassa;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegistroDiCassav3_ASM_ESTest extends RegistroDiCassav3_ASM_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegistroDiCassav3_ASM registroDiCassav3_ASM0 = new RegistroDiCassav3_ASM();
      assertNotNull(registroDiCassav3_ASM0);
      assertFalse(registroDiCassav3_ASM0.isFinalState());
      assertEquals(RegistroDiCassav3Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav3_ASM0.get_statoCassa());
      assertNull(registroDiCassav3_ASM0.get_outMess());
      assertEquals(0, registroDiCassav3_ASM0.get_totale());
      
      RegistroDiCassav3Sig.Servizio registroDiCassav3Sig_Servizio0 = RegistroDiCassav3Sig.Servizio.NEWORDINE;
      RegistroDiCassav3Sig.AggiungiPizza registroDiCassav3Sig_AggiungiPizza0 = RegistroDiCassav3Sig.AggiungiPizza.NO;
      RegistroDiCassav3Sig.SelezioneTipoDiPizza registroDiCassav3Sig_SelezioneTipoDiPizza0 = RegistroDiCassav3Sig.SelezioneTipoDiPizza.OTHER;
      RegistroDiCassav3Sig.AggiungiPizza registroDiCassav3Sig_AggiungiPizza1 = RegistroDiCassav3Sig.AggiungiPizza.SI;
      RegistroDiCassav3Sig.SelezioneTipoDiPizza registroDiCassav3Sig_SelezioneTipoDiPizza1 = RegistroDiCassav3Sig.SelezioneTipoDiPizza.STANDARD;
      registroDiCassav3_ASM0.step(registroDiCassav3Sig_Servizio0, 2, registroDiCassav3Sig_AggiungiPizza1, registroDiCassav3Sig_SelezioneTipoDiPizza1, 2, 2);
      assertFalse(registroDiCassav3Sig_AggiungiPizza1.equals((Object)registroDiCassav3Sig_AggiungiPizza0));
      assertFalse(registroDiCassav3Sig_SelezioneTipoDiPizza1.equals((Object)registroDiCassav3Sig_SelezioneTipoDiPizza0));
      assertNotSame(registroDiCassav3Sig_AggiungiPizza1, registroDiCassav3Sig_AggiungiPizza0);
      assertNotSame(registroDiCassav3Sig_SelezioneTipoDiPizza1, registroDiCassav3Sig_SelezioneTipoDiPizza0);
      assertFalse(registroDiCassav3_ASM0.isFinalState());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav3_ASM0.get_outMess());
      assertEquals(0, registroDiCassav3_ASM0.get_totale());
      assertEquals(RegistroDiCassav3Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav3_ASM0.get_statoCassa());
      
      registroDiCassav3_ASM0.step(registroDiCassav3Sig_Servizio0, 2, registroDiCassav3Sig_AggiungiPizza0, registroDiCassav3Sig_SelezioneTipoDiPizza1, 2, 2);
      assertFalse(registroDiCassav3Sig_AggiungiPizza0.equals((Object)registroDiCassav3Sig_AggiungiPizza1));
      assertFalse(registroDiCassav3Sig_SelezioneTipoDiPizza1.equals((Object)registroDiCassav3Sig_SelezioneTipoDiPizza0));
      assertNotSame(registroDiCassav3Sig_AggiungiPizza0, registroDiCassav3Sig_AggiungiPizza1);
      assertNotSame(registroDiCassav3Sig_SelezioneTipoDiPizza1, registroDiCassav3Sig_SelezioneTipoDiPizza0);
      assertFalse(registroDiCassav3_ASM0.isFinalState());
      assertEquals(RegistroDiCassav3Sig.Stati.PIZZASTANDARD_SELEZIONATA, registroDiCassav3_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav3_ASM0.get_totale());
      assertEquals("Inserisci il nome di una pizza dell'elenco:", registroDiCassav3_ASM0.get_outMess());
      
      registroDiCassav3_ASM0.step(registroDiCassav3Sig_Servizio0, 2, registroDiCassav3Sig_AggiungiPizza0, registroDiCassav3Sig_SelezioneTipoDiPizza1, 2, 2);
      assertFalse(registroDiCassav3Sig_AggiungiPizza0.equals((Object)registroDiCassav3Sig_AggiungiPizza1));
      assertFalse(registroDiCassav3Sig_SelezioneTipoDiPizza1.equals((Object)registroDiCassav3Sig_SelezioneTipoDiPizza0));
      assertNotSame(registroDiCassav3Sig_AggiungiPizza0, registroDiCassav3Sig_AggiungiPizza1);
      assertNotSame(registroDiCassav3Sig_SelezioneTipoDiPizza1, registroDiCassav3Sig_SelezioneTipoDiPizza0);
      assertFalse(registroDiCassav3_ASM0.isFinalState());
      assertEquals(10, registroDiCassav3_ASM0.get_totale());
      assertEquals(RegistroDiCassav3Sig.Stati.SCEGLI_SE_AGGIUNGERE_PIZZA, registroDiCassav3_ASM0.get_statoCassa());
      assertEquals("prezzo totale aggiornato", registroDiCassav3_ASM0.get_outMess());
      
      registroDiCassav3_ASM0.step(registroDiCassav3Sig_Servizio0, 2, registroDiCassav3Sig_AggiungiPizza1, registroDiCassav3Sig_SelezioneTipoDiPizza1, 2, 2);
      assertFalse(registroDiCassav3Sig_AggiungiPizza1.equals((Object)registroDiCassav3Sig_AggiungiPizza0));
      assertFalse(registroDiCassav3Sig_SelezioneTipoDiPizza1.equals((Object)registroDiCassav3Sig_SelezioneTipoDiPizza0));
      assertNotSame(registroDiCassav3Sig_AggiungiPizza1, registroDiCassav3Sig_AggiungiPizza0);
      assertNotSame(registroDiCassav3Sig_SelezioneTipoDiPizza1, registroDiCassav3Sig_SelezioneTipoDiPizza0);
      assertFalse(registroDiCassav3_ASM0.isFinalState());
      assertEquals(10, registroDiCassav3_ASM0.get_totale());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav3_ASM0.get_outMess());
      assertEquals(RegistroDiCassav3Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav3_ASM0.get_statoCassa());
      
      registroDiCassav3_ASM0.step(registroDiCassav3Sig_Servizio0, 2, registroDiCassav3Sig_AggiungiPizza1, registroDiCassav3Sig_SelezioneTipoDiPizza0, 2, 2);
      assertFalse(registroDiCassav3Sig_SelezioneTipoDiPizza0.equals((Object)registroDiCassav3Sig_SelezioneTipoDiPizza1));
      assertFalse(registroDiCassav3Sig_AggiungiPizza1.equals((Object)registroDiCassav3Sig_AggiungiPizza0));
      assertNotSame(registroDiCassav3Sig_SelezioneTipoDiPizza0, registroDiCassav3Sig_SelezioneTipoDiPizza1);
      assertNotSame(registroDiCassav3Sig_AggiungiPizza1, registroDiCassav3Sig_AggiungiPizza0);
      assertFalse(registroDiCassav3_ASM0.isFinalState());
      assertEquals(10, registroDiCassav3_ASM0.get_totale());
      assertEquals(RegistroDiCassav3Sig.Stati.ALTRAPIZZA_SELEZIONATA, registroDiCassav3_ASM0.get_statoCassa());
      assertEquals("Inserisci il nome di una nuova pizza:", registroDiCassav3_ASM0.get_outMess());
      
      registroDiCassav3_ASM0.step(registroDiCassav3Sig_Servizio0, 2, registroDiCassav3Sig_AggiungiPizza0, registroDiCassav3Sig_SelezioneTipoDiPizza1, 2, 20);
      assertFalse(registroDiCassav3Sig_AggiungiPizza0.equals((Object)registroDiCassav3Sig_AggiungiPizza1));
      assertFalse(registroDiCassav3Sig_SelezioneTipoDiPizza1.equals((Object)registroDiCassav3Sig_SelezioneTipoDiPizza0));
      assertNotSame(registroDiCassav3Sig_AggiungiPizza0, registroDiCassav3Sig_AggiungiPizza1);
      assertNotSame(registroDiCassav3Sig_SelezioneTipoDiPizza1, registroDiCassav3Sig_SelezioneTipoDiPizza0);
      assertFalse(registroDiCassav3_ASM0.isFinalState());
      assertEquals(RegistroDiCassav3Sig.Stati.SCEGLI_SE_AGGIUNGERE_PIZZA, registroDiCassav3_ASM0.get_statoCassa());
      assertEquals(50, registroDiCassav3_ASM0.get_totale());
      assertEquals("prezzo totale aggiornato", registroDiCassav3_ASM0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RegistroDiCassav3_ASM registroDiCassav3_ASM0 = new RegistroDiCassav3_ASM();
      assertNotNull(registroDiCassav3_ASM0);
      assertFalse(registroDiCassav3_ASM0.isFinalState());
      assertEquals(RegistroDiCassav3Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav3_ASM0.get_statoCassa());
      assertNull(registroDiCassav3_ASM0.get_outMess());
      assertEquals(0, registroDiCassav3_ASM0.get_totale());
      
      RegistroDiCassav3Sig.Servizio registroDiCassav3Sig_Servizio0 = RegistroDiCassav3Sig.Servizio.NEWORDINE;
      RegistroDiCassav3Sig.AggiungiPizza registroDiCassav3Sig_AggiungiPizza0 = RegistroDiCassav3Sig.AggiungiPizza.NO;
      RegistroDiCassav3Sig.SelezioneTipoDiPizza registroDiCassav3Sig_SelezioneTipoDiPizza0 = RegistroDiCassav3Sig.SelezioneTipoDiPizza.OTHER;
      registroDiCassav3_ASM0.step(registroDiCassav3Sig_Servizio0, 2, registroDiCassav3Sig_AggiungiPizza0, registroDiCassav3Sig_SelezioneTipoDiPizza0, 2, 2);
      assertFalse(registroDiCassav3_ASM0.isFinalState());
      assertEquals(RegistroDiCassav3Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav3_ASM0.get_statoCassa());
      assertEquals("Totale aggiornato", registroDiCassav3_ASM0.get_outMess());
      assertEquals(0, registroDiCassav3_ASM0.get_totale());
      
      registroDiCassav3_ASM0.step(registroDiCassav3Sig_Servizio0, 2, registroDiCassav3Sig_AggiungiPizza0, registroDiCassav3Sig_SelezioneTipoDiPizza0, 2, 2);
      assertFalse(registroDiCassav3_ASM0.isFinalState());
      assertEquals(RegistroDiCassav3Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav3_ASM0.get_statoCassa());
      assertEquals("Totale aggiornato", registroDiCassav3_ASM0.get_outMess());
      assertEquals(0, registroDiCassav3_ASM0.get_totale());
      
      registroDiCassav3_ASM0.step(registroDiCassav3Sig_Servizio0, 2, registroDiCassav3Sig_AggiungiPizza0, registroDiCassav3Sig_SelezioneTipoDiPizza0, 2, 2);
      assertFalse(registroDiCassav3_ASM0.isFinalState());
      assertEquals(RegistroDiCassav3Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav3_ASM0.get_statoCassa());
      assertEquals("Totale aggiornato", registroDiCassav3_ASM0.get_outMess());
      assertEquals(0, registroDiCassav3_ASM0.get_totale());
      
      registroDiCassav3_ASM0.step(registroDiCassav3Sig_Servizio0, 2, registroDiCassav3Sig_AggiungiPizza0, registroDiCassav3Sig_SelezioneTipoDiPizza0, 2, 2);
      assertFalse(registroDiCassav3_ASM0.isFinalState());
      assertEquals(RegistroDiCassav3Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav3_ASM0.get_statoCassa());
      assertEquals("Totale aggiornato", registroDiCassav3_ASM0.get_outMess());
      assertEquals(0, registroDiCassav3_ASM0.get_totale());
      
      registroDiCassav3_ASM0.step(registroDiCassav3Sig_Servizio0, 2, registroDiCassav3Sig_AggiungiPizza0, registroDiCassav3Sig_SelezioneTipoDiPizza0, 2, 2);
      assertFalse(registroDiCassav3_ASM0.isFinalState());
      assertEquals(RegistroDiCassav3Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav3_ASM0.get_statoCassa());
      assertEquals("Totale aggiornato", registroDiCassav3_ASM0.get_outMess());
      assertEquals(0, registroDiCassav3_ASM0.get_totale());
      
      registroDiCassav3_ASM0.step(registroDiCassav3Sig_Servizio0, 2, registroDiCassav3Sig_AggiungiPizza0, registroDiCassav3Sig_SelezioneTipoDiPizza0, 2, 2);
      assertFalse(registroDiCassav3_ASM0.isFinalState());
      assertEquals(RegistroDiCassav3Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav3_ASM0.get_statoCassa());
      assertEquals("Totale aggiornato", registroDiCassav3_ASM0.get_outMess());
      assertEquals(0, registroDiCassav3_ASM0.get_totale());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RegistroDiCassav3_ASM registroDiCassav3_ASM0 = new RegistroDiCassav3_ASM();
      assertNotNull(registroDiCassav3_ASM0);
      assertFalse(registroDiCassav3_ASM0.isFinalState());
      assertEquals(RegistroDiCassav3Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav3_ASM0.get_statoCassa());
      assertNull(registroDiCassav3_ASM0.get_outMess());
      assertEquals(0, registroDiCassav3_ASM0.get_totale());
      
      RegistroDiCassav3Sig.AggiungiPizza registroDiCassav3Sig_AggiungiPizza0 = RegistroDiCassav3Sig.AggiungiPizza.SI;
      RegistroDiCassav3Sig.SelezioneTipoDiPizza registroDiCassav3Sig_SelezioneTipoDiPizza0 = RegistroDiCassav3Sig.SelezioneTipoDiPizza.STANDARD;
      RegistroDiCassav3Sig.Servizio registroDiCassav3Sig_Servizio0 = RegistroDiCassav3Sig.Servizio.EXIT;
      registroDiCassav3_ASM0.step(registroDiCassav3Sig_Servizio0, 2, registroDiCassav3Sig_AggiungiPizza0, registroDiCassav3Sig_SelezioneTipoDiPizza0, 2, 2);
      assertFalse(registroDiCassav3_ASM0.isFinalState());
      assertEquals(RegistroDiCassav3Sig.Stati.CHIUSO, registroDiCassav3_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav3_ASM0.get_totale());
      assertEquals("Registro di cassa chiuso!", registroDiCassav3_ASM0.get_outMess());
  }
}