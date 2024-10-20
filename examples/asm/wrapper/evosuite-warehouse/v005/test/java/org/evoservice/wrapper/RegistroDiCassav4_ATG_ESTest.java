/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 19 14:50:39 GMT 2024
 */

package org.evoservice.wrapper;

import org.evoservice.wrapper.RegistroDiCassav4Sig.PrezzoDomain;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegistroDiCassav4_ATG_ESTest extends RegistroDiCassav4_ATG_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertNotNull(registroDiCassav4_ATG0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      
      RegistroDiCassav4Sig.Servizio registroDiCassav4Sig_Servizio0 = RegistroDiCassav4Sig.Servizio.NEWORDINE;
      RegistroDiCassav4Sig.AggiungiPizza registroDiCassav4Sig_AggiungiPizza0 = RegistroDiCassav4Sig.AggiungiPizza.NO;
      registroDiCassav4_ATG0.set_sceltaDiAggiuntaPizza(registroDiCassav4Sig_AggiungiPizza0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      
      registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4Sig_Servizio0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      
      registroDiCassav4_ATG0.step();
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("prezzo totale aggiornato", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertNotNull(registroDiCassav4_ATG0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      
      RegistroDiCassav4Sig.Servizio registroDiCassav4Sig_Servizio0 = RegistroDiCassav4Sig.Servizio.NEWORDINE;
      RegistroDiCassav4Sig.AggiungiPizza registroDiCassav4Sig_AggiungiPizza0 = RegistroDiCassav4Sig.AggiungiPizza.SI;

      LinkedList<RegistroDiCassav4Sig.Pizza> linkedList0 = new LinkedList<RegistroDiCassav4Sig.Pizza>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      
      RegistroDiCassav4Sig.Pizza.elems = (List<RegistroDiCassav4Sig.Pizza>) linkedList0;
      assertEquals(0, linkedList0.size());
      assertEquals(0, RegistroDiCassav4Sig.Pizza.elems.size());
      assertTrue(RegistroDiCassav4Sig.Pizza.elems.isEmpty());


      registroDiCassav4_ATG0.set_sceltaDiAggiuntaPizza(registroDiCassav4Sig_AggiungiPizza0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      
      registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4Sig_Servizio0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      
      RegistroDiCassav4Sig.SelezioneTipoDiPizza registroDiCassav4Sig_SelezioneTipoDiPizza0 = RegistroDiCassav4Sig.SelezioneTipoDiPizza.STANDARD;
      registroDiCassav4_ATG0.set_sceltaDelTipoPizza(registroDiCassav4Sig_SelezioneTipoDiPizza0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      
      registroDiCassav4_ATG0.step();
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
      
      registroDiCassav4_ATG0.step();
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.PIZZASTANDARD_SELEZIONATA, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("Inserisci il nome di una pizza dell'elenco:", registroDiCassav4_ATG0.get_outMess());
      
      registroDiCassav4_ATG0.step();
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.SCEGLI_SE_AGGIUNGERE_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("Questa pizza non  presente in elenco!", registroDiCassav4_ATG0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertNotNull(registroDiCassav4_ATG0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      
      RegistroDiCassav4Sig.Servizio registroDiCassav4Sig_Servizio0 = RegistroDiCassav4Sig.Servizio.NEWORDINE;
      RegistroDiCassav4Sig.AggiungiPizza registroDiCassav4Sig_AggiungiPizza0 = RegistroDiCassav4Sig.AggiungiPizza.SI;
      registroDiCassav4_ATG0.set_sceltaDiAggiuntaPizza(registroDiCassav4Sig_AggiungiPizza0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      
      registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4Sig_Servizio0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      
      registroDiCassav4_ATG0.step();
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
      
      RegistroDiCassav4Sig.SelezioneTipoDiPizza registroDiCassav4Sig_SelezioneTipoDiPizza0 = RegistroDiCassav4Sig.SelezioneTipoDiPizza.STANDARD;
      registroDiCassav4_ATG0.set_insertQuantita(8);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
      
      registroDiCassav4_ATG0.set_sceltaDelTipoPizza(registroDiCassav4Sig_SelezioneTipoDiPizza0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
      
      registroDiCassav4_ATG0.set_pizzaInserita("capricciosa");
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
      
      registroDiCassav4_ATG0.step();
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals("Inserisci il nome di una pizza dell'elenco:", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.PIZZASTANDARD_SELEZIONATA, registroDiCassav4_ATG0.get_statoCassa());
      
      registroDiCassav4_ATG0.step();
      assertEquals("prezzo totale aggiornato", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.SCEGLI_SE_AGGIUNGERE_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(40, registroDiCassav4_ATG0.get_totale());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertNotNull(registroDiCassav4_ATG0);
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      RegistroDiCassav4Sig.Servizio registroDiCassav4Sig_Servizio0 = RegistroDiCassav4Sig.Servizio.EXIT;
      registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4Sig_Servizio0);
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      registroDiCassav4_ATG0.step();
      assertEquals(RegistroDiCassav4Sig.Stati.CHIUSO, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("Registro di cassa chiuso!", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertNotNull(registroDiCassav4_ATG0);
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      RegistroDiCassav4Sig.Servizio registroDiCassav4Sig_Servizio0 = RegistroDiCassav4Sig.Servizio.NEWORDINE;
      RegistroDiCassav4Sig.AggiungiPizza registroDiCassav4Sig_AggiungiPizza0 = RegistroDiCassav4Sig.AggiungiPizza.SI;
      registroDiCassav4_ATG0.set_sceltaDiAggiuntaPizza(registroDiCassav4Sig_AggiungiPizza0);
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4Sig_Servizio0);
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      registroDiCassav4_ATG0.step();
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      RegistroDiCassav4Sig.SelezioneTipoDiPizza registroDiCassav4Sig_SelezioneTipoDiPizza0 = RegistroDiCassav4Sig.SelezioneTipoDiPizza.OTHER;
      registroDiCassav4_ATG0.set_insertPrezzo(1);
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      registroDiCassav4_ATG0.set_insertQuantita(1);
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      registroDiCassav4_ATG0.set_sceltaDelTipoPizza(registroDiCassav4Sig_SelezioneTipoDiPizza0);
      assertEquals("Scegli il tipo di pizza desiderata:", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.SCEGLI_TIPO_DI_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      registroDiCassav4_ATG0.step();
      assertEquals(RegistroDiCassav4Sig.Stati.ALTRAPIZZA_SELEZIONATA, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("Inserisci il nome di una nuova pizza:", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      registroDiCassav4_ATG0.step();
      assertEquals("prezzo totale aggiornato", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.SCEGLI_SE_AGGIUNGERE_PIZZA, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(1, registroDiCassav4_ATG0.get_totale());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertNotNull(registroDiCassav4_ATG0);
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      String string0 = registroDiCassav4_ATG0.get_pizzaCorrente();
      assertNull(string0);
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertNotNull(registroDiCassav4_ATG0);
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      
      String string0 = registroDiCassav4_ATG0.get_outMess();
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertNotNull(registroDiCassav4_ATG0);
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      
      registroDiCassav4_ATG0.get_statoCassa();
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      assertNotNull(registroDiCassav4_ATG0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
      
      int int0 = registroDiCassav4_ATG0.get_totale();
      assertEquals(0, int0);
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
      assertEquals(RegistroDiCassav4Sig.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
  }
}