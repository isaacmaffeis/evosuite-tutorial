/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 01 19:49:31 GMT 2024
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegistroDiCassav4_ATG_ESTest extends RegistroDiCassav4_ATG_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      registroDiCassav4_ATG0.set_pizzaInserita("margherita");
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      registroDiCassav4_ATG0.set_insertQuantita(8);
      assertEquals(RegistroDiCassav4.Stati.ATTENDI_ORDINAZIONI, registroDiCassav4_ATG0.get_statoCassa());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      registroDiCassav4_ATG0.set_insertPrezzo(2);
      assertEquals("", registroDiCassav4_ATG0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      registroDiCassav4_ATG0.step();
      String string0 = registroDiCassav4_ATG0.get_outMess();
      assertEquals("Scegli se aggiungere una nuova pizza", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      RegistroDiCassav4.SelezioneTipoDiPizza registroDiCassav4_SelezioneTipoDiPizza0 = RegistroDiCassav4.SelezioneTipoDiPizza.OTHER;
      registroDiCassav4_ATG0.set_sceltaDelTipoPizza(registroDiCassav4_SelezioneTipoDiPizza0);
      RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.SI;
      registroDiCassav4_ATG0.set_sceltaDiAggiuntaPizza(registroDiCassav4_AggiungiPizza0);
      registroDiCassav4_ATG0.step();
      registroDiCassav4_ATG0.step();
      // Undeclared exception!
      try { 
        registroDiCassav4_ATG0.step();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("RegistroDiCassav4", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.NO;
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      registroDiCassav4_ATG0.set_sceltaDiAggiuntaPizza(registroDiCassav4_AggiungiPizza0);
      registroDiCassav4_ATG0.step();
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.EXIT;
      registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      registroDiCassav4_ATG0.step();
      assertEquals(0, registroDiCassav4_ATG0.get_totale());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      RegistroDiCassav4.Servizio registroDiCassav4_Servizio0 = RegistroDiCassav4.Servizio.NEWORDINE;
      RegistroDiCassav4.SelezioneTipoDiPizza registroDiCassav4_SelezioneTipoDiPizza0 = RegistroDiCassav4.SelezioneTipoDiPizza.STANDARD;
      registroDiCassav4_ATG0.set_sceltaDelTipoPizza(registroDiCassav4_SelezioneTipoDiPizza0);
      registroDiCassav4_ATG0.set_servizioSelezionato(registroDiCassav4_Servizio0);
      RegistroDiCassav4.AggiungiPizza registroDiCassav4_AggiungiPizza0 = RegistroDiCassav4.AggiungiPizza.SI;
      registroDiCassav4_ATG0.set_sceltaDiAggiuntaPizza(registroDiCassav4_AggiungiPizza0);
      registroDiCassav4_ATG0.step();
      registroDiCassav4_ATG0.step();
      assertEquals("Inserisci il nome di una pizza dell'elenco:", registroDiCassav4_ATG0.get_outMess());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      // Undeclared exception!
      try { 
        registroDiCassav4_ATG0.set_pizzaInserita((String) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      String string0 = registroDiCassav4_ATG0.get_pizzaCorrente();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      registroDiCassav4_ATG0.get_statoCassa();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      int int0 = registroDiCassav4_ATG0.get_totale();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      String string0 = registroDiCassav4_ATG0.get_outMess();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      // Undeclared exception!
      try { 
        registroDiCassav4_ATG0.set_insertQuantita((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegistroDiCassav4_ATG registroDiCassav4_ATG0 = new RegistroDiCassav4_ATG();
      // Undeclared exception!
      try { 
        registroDiCassav4_ATG0.set_insertPrezzo((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
