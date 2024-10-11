/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 11 15:15:20 GMT 2024
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
  public void test0()  throws Throwable  {
      RegistroDiCassav4_ASM registroDiCassav4_ASM0 = new RegistroDiCassav4_ASM();
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertNotNull(registroDiCassav4_ASM0);
      
      RegistroDiCassav4Sig.Servizio registroDiCassav4Sig_Servizio0 = RegistroDiCassav4Sig.Servizio.NEWORDINE;
      RegistroDiCassav4Sig.AggiungiPizza registroDiCassav4Sig_AggiungiPizza0 = RegistroDiCassav4Sig.AggiungiPizza.NO;
      registroDiCassav4_ASM0.set_sceltaDiAggiuntaPizza(registroDiCassav4Sig_AggiungiPizza0);
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      
      registroDiCassav4_ASM0.set_servizioSelezionato(registroDiCassav4Sig_Servizio0);
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      
      registroDiCassav4_ASM0.step();
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("prezzo totale aggiornato", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RegistroDiCassav4_ASM registroDiCassav4_ASM0 = new RegistroDiCassav4_ASM();
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertNotNull(registroDiCassav4_ASM0);
      
      RegistroDiCassav4Sig.Servizio registroDiCassav4Sig_Servizio0 = RegistroDiCassav4Sig.Servizio.EXIT;
      registroDiCassav4_ASM0.set_servizioSelezionato(registroDiCassav4Sig_Servizio0);
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      
      registroDiCassav4_ASM0.step();
      assertEquals("Registro di cassa chiuso!", registroDiCassav4_ASM0.get_outMess());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.CHIUSO, registroDiCassav4_ASM0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RegistroDiCassav4_ASM registroDiCassav4_ASM0 = new RegistroDiCassav4_ASM();
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertNotNull(registroDiCassav4_ASM0);
      
      registroDiCassav4_ASM0.set_insertQuantita(7);
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      
      RegistroDiCassav4Sig.AggiungiPizza registroDiCassav4Sig_AggiungiPizza0 = RegistroDiCassav4Sig.AggiungiPizza.SI;
      registroDiCassav4_ASM0.set_pizzaInserita("margherita");
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      
      RegistroDiCassav4Sig.SelezioneTipoDiPizza registroDiCassav4Sig_SelezioneTipoDiPizza0 = RegistroDiCassav4Sig.SelezioneTipoDiPizza.STANDARD;
      registroDiCassav4_ASM0.set_sceltaDelTipoDiPizza(registroDiCassav4Sig_SelezioneTipoDiPizza0);
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      
      RegistroDiCassav4Sig.Servizio registroDiCassav4Sig_Servizio0 = RegistroDiCassav4Sig.Servizio.NEWORDINE;
      registroDiCassav4_ASM0.set_servizioSelezionato(registroDiCassav4Sig_Servizio0);
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      
      registroDiCassav4_ASM0.set_sceltaDiAggiuntaPizza(registroDiCassav4Sig_AggiungiPizza0);
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      
      registroDiCassav4_ASM0.step();
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ASM0.get_statoCassa());
      
      registroDiCassav4_ASM0.step();
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("Inserisci il nome di una pizza dell'elenco:", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.PIZZASTANDARD_SELEZIONATA, registroDiCassav4_ASM0.get_statoCassa());
      
      registroDiCassav4_ASM0.step();
      assertEquals("prezzo totale aggiornato", registroDiCassav4_ASM0.get_outMess());
      assertEquals(28, registroDiCassav4_ASM0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.SCEGLI_SE_AGGIUNGERE_PIZZA, registroDiCassav4_ASM0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RegistroDiCassav4_ASM registroDiCassav4_ASM0 = new RegistroDiCassav4_ASM();
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertNotNull(registroDiCassav4_ASM0);
      
      RegistroDiCassav4Sig.AggiungiPizza registroDiCassav4Sig_AggiungiPizza0 = RegistroDiCassav4Sig.AggiungiPizza.SI;
      registroDiCassav4_ASM0.set_sceltaDiAggiuntaPizza(registroDiCassav4Sig_AggiungiPizza0);
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      
      registroDiCassav4_ASM0.set_insertQuantita(5);
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      
      RegistroDiCassav4Sig.SelezioneTipoDiPizza registroDiCassav4Sig_SelezioneTipoDiPizza0 = RegistroDiCassav4Sig.SelezioneTipoDiPizza.OTHER;
      registroDiCassav4_ASM0.set_sceltaDelTipoDiPizza(registroDiCassav4Sig_SelezioneTipoDiPizza0);
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      
      RegistroDiCassav4Sig.Servizio registroDiCassav4Sig_Servizio0 = RegistroDiCassav4Sig.Servizio.NEWORDINE;
      registroDiCassav4_ASM0.set_insertPrezzo(5);
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      
      registroDiCassav4_ASM0.set_servizioSelezionato(registroDiCassav4Sig_Servizio0);
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      
      registroDiCassav4_ASM0.step();
      assertEquals(RegistroDiCassav4Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ASM0.get_outMess());
      
      registroDiCassav4_ASM0.step();
      assertEquals("Inserisci il nome di una nuova pizza:", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ALTRAPIZZA_SELEZIONATA, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      
      registroDiCassav4_ASM0.step();
      assertEquals(25, registroDiCassav4_ASM0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.SCEGLI_SE_AGGIUNGERE_PIZZA, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals("prezzo totale aggiornato", registroDiCassav4_ASM0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RegistroDiCassav4_ASM registroDiCassav4_ASM0 = new RegistroDiCassav4_ASM();
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertNotNull(registroDiCassav4_ASM0);
      
      String string0 = registroDiCassav4_ASM0.get_outMess();
      assertEquals("", string0);
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RegistroDiCassav4_ASM registroDiCassav4_ASM0 = new RegistroDiCassav4_ASM();
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertNotNull(registroDiCassav4_ASM0);
      
      int int0 = registroDiCassav4_ASM0.get_totale();
      assertEquals(0, int0);
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RegistroDiCassav4_ASM registroDiCassav4_ASM0 = new RegistroDiCassav4_ASM();
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertNotNull(registroDiCassav4_ASM0);
      
      RegistroDiCassav4Sig.Pizza registroDiCassav4Sig_Pizza0 = registroDiCassav4_ASM0.get_pizzaCorrente();
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertNull(registroDiCassav4Sig_Pizza0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RegistroDiCassav4_ASM registroDiCassav4_ASM0 = new RegistroDiCassav4_ASM();
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
      assertNotNull(registroDiCassav4_ASM0);
      
      registroDiCassav4_ASM0.get_statoCassa();
      assertEquals(0, registroDiCassav4_ASM0.get_totale());
      assertEquals("", registroDiCassav4_ASM0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ASM0.get_statoCassa());
  }
}
