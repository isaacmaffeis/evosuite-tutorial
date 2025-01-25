/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 25 10:44:16 GMT 2025
 */

package org.evoservice.cashpoint;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CashPointv2_ATG_ESTest extends CashPointv2_ATG_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CashPointv2_ATG cashPointv2_ATG0 = new CashPointv2_ATG();
      assertNotNull(cashPointv2_ATG0);
      
      cashPointv2_ATG0.step();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CashPointv2_ATG cashPointv2_ATG0 = new CashPointv2_ATG();
      assertNotNull(cashPointv2_ATG0);
      
      Integer integer0 = cashPointv2_ATG0.get_daily_withdraw_sum_fromDomain_card1();
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CashPointv2_ATG cashPointv2_ATG0 = new CashPointv2_ATG();
      assertNotNull(cashPointv2_ATG0);
      
      cashPointv2_ATG0.set_abstract_currentDate_monday();
      Integer integer0 = cashPointv2_ATG0.get_balance_fromDomain_account1();
      assertNotNull(integer0);
      assertEquals(2000, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CashPointv2_ATG cashPointv2_ATG0 = new CashPointv2_ATG();
      assertNotNull(cashPointv2_ATG0);
      
      Integer integer0 = cashPointv2_ATG0.get_daily_withdraw_sum_fromDomain_card2();
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CashPointv2_ATG cashPointv2_ATG0 = new CashPointv2_ATG();
      //  // Unstable assertion: assertNotNull(cashPointv2_ATG0);
      
      cashPointv2_ATG0.get_tillState_fromDomain_till1();
      Boolean boolean0 = cashPointv2_ATG0.get_legalCard_fromDomain_card1();
      //  // Unstable assertion: assertNotNull(boolean0);
      //  // Unstable assertion: assertTrue(boolean0);
      
      cashPointv2_ATG0.step();
      int int0 = 0;
      cashPointv2_ATG0.set_amount_fromDomain_till1(0);
      cashPointv2_ATG0.step();
      Boolean boolean1 = cashPointv2_ATG0.get_legalCard_fromDomain_card2();
      //  // Unstable assertion: assertNotNull(boolean1);
      //  // Unstable assertion: assertTrue(boolean1);
      
      String string0 = cashPointv2_ATG0.get_cardLastUseDate_fromDomain_card1();
      //  // Unstable assertion: assertNotNull(string0);
      //  // Unstable assertion: assertEquals("abstract_monday", string0);
      
      // Undeclared exception!
      try { 
        cashPointv2_ATG0.get_insertedCard_fromDomain_till1();
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evoservice.cashpoint.CashPointv2_ATG", e);
      }
  }
}
