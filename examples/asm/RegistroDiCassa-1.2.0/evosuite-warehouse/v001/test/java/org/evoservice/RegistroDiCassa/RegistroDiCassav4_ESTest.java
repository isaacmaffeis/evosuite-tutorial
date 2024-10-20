/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 07 11:38:31 GMT 2024
 */

package org.evoservice.RegistroDiCassa;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RegistroDiCassav4_ESTest extends RegistroDiCassav4_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertNotNull(registroDiCassav4_0);
      
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.NO;
      RegistroDiCassav4.SelezioneTipoDiPizza registroDiCassav4_SelezioneTipoDiPizza0 = RegistroDiCassav4.SelezioneTipoDiPizza.OTHER;
      registroDiCassav4_0.step(registroDiCassav4_Servizio0, "margherita", registroDiCassav4_AggiungiPizza0, registroDiCassav4_SelezioneTipoDiPizza0, 1, 1);
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("prezzo totale aggiornato", registroDiCassav4_0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertNotNull(registroDiCassav4_0);
      
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.EXIT;
      RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.NO;
      RegistroDiCassav4.SelezioneTipoDiPizza registroDiCassav4_SelezioneTipoDiPizza0 = RegistroDiCassav4.SelezioneTipoDiPizza.OTHER;
      registroDiCassav4_0.step(registroDiCassav4_Servizio0, "margherita", registroDiCassav4_AggiungiPizza0, registroDiCassav4_SelezioneTipoDiPizza0, 1, 1);
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("Registro di cassa chiuso!", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.CHIUSO, registroDiCassav4_0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertNotNull(registroDiCassav4_0);
      
      registroDiCassav4_0.get_statoCassa();
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertNotNull(registroDiCassav4_0);
      
      String string0 = registroDiCassav4_0.get_outMess();
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
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
  public void test5()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertNotNull(registroDiCassav4_0);
      
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.SI;
      RegistroDiCassav4.SelezioneTipoDiPizza registroDiCassav4_SelezioneTipoDiPizza0 = RegistroDiCassav4.SelezioneTipoDiPizza.OTHER;
      registroDiCassav4_0.step(registroDiCassav4_Servizio0, "margherita", registroDiCassav4_AggiungiPizza0, registroDiCassav4_SelezioneTipoDiPizza0, 1, 1);
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_0.get_statoCassa());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      registroDiCassav4_0.step(registroDiCassav4_Servizio0, "margherita", registroDiCassav4_AggiungiPizza0, registroDiCassav4_SelezioneTipoDiPizza0, 1, 1);
      assertEquals("Inserisci il nome di una nuova pizza:", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.ALTRAPIZZA_SELEZIONATA, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      
      registroDiCassav4_0.step(registroDiCassav4_Servizio0, "margherita", registroDiCassav4_AggiungiPizza0, registroDiCassav4_SelezioneTipoDiPizza0, 1, 1);
      assertEquals("prezzo totale aggiornato", registroDiCassav4_0.get_outMess());
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_SE_AGGIUNGERE_PIZZA, registroDiCassav4_0.get_statoCassa());
      assertEquals(1, registroDiCassav4_0.get_totale());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RegistroDiCassav4 registroDiCassav4_0 = new RegistroDiCassav4();
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_0.get_statoCassa());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals("", registroDiCassav4_0.get_outMess());
      assertNotNull(registroDiCassav4_0);
      
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.SI;
      RegistroDiCassav4.SelezioneTipoDiPizza registroDiCassav4_SelezioneTipoDiPizza0 = RegistroDiCassav4.SelezioneTipoDiPizza.STANDARD;
      registroDiCassav4_0.step(registroDiCassav4_Servizio0, "margherita", registroDiCassav4_AggiungiPizza0, registroDiCassav4_SelezioneTipoDiPizza0, 3, 3);
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_0.get_statoCassa());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_0.get_outMess());
      
      registroDiCassav4_0.step(registroDiCassav4_Servizio0, "margherita", registroDiCassav4_AggiungiPizza0, registroDiCassav4_SelezioneTipoDiPizza0, 3, 3);
      assertEquals("Inserisci il nome di una pizza dell'elenco:", registroDiCassav4_0.get_outMess());
      assertEquals(0, registroDiCassav4_0.get_totale());
      assertEquals(RegistroDiCassav4.Stati.PIZZASTANDARD_SELEZIONATA, registroDiCassav4_0.get_statoCassa());
      
      registroDiCassav4_0.step(registroDiCassav4_Servizio0, "margherita", registroDiCassav4_AggiungiPizza0, registroDiCassav4_SelezioneTipoDiPizza0, 3, 3);
      assertEquals(RegistroDiCassav4.Stati.SCEGLI_SE_AGGIUNGERE_PIZZA, registroDiCassav4_0.get_statoCassa());
      assertEquals("prezzo totale aggiornato", registroDiCassav4_0.get_outMess());
      assertEquals(12, registroDiCassav4_0.get_totale());
  }
}