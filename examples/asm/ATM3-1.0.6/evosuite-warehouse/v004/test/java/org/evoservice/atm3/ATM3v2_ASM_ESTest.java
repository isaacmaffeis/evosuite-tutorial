/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 04 15:34:34 GMT 2024
 */

package org.evoservice.atm3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evoservice.atm3.ATM3v2Sig;
import org.evoservice.atm3.ATM3v2_ASM;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ATM3v2_ASM_ESTest extends ATM3v2_ASM_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ATM3v2_ASM aTM3v2_ASM0 = new ATM3v2_ASM();
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertNotNull(aTM3v2_ASM0);
      
      int int0 = aTM3v2_ASM0.get_balance_card2();
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertEquals(1652, int0);
      
      int int1 = aTM3v2_ASM0.get_balance_card1();
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertFalse(int1 == int0);
      assertEquals(3000, int1);
      
      int int2 = 0;
      ATM3v2Sig.Service aTM3v2Sig_Service0 = ATM3v2Sig.Service.WITHDRAWAL;
      Boolean boolean0 = aTM3v2_ASM0.get_accessible_card3();
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertNotNull(boolean0);
      assertTrue(boolean0);
      
      int int3 = 24;
      Boolean boolean1 = aTM3v2_ASM0.get_accessible_card2();
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertNotNull(boolean1);
      assertTrue(boolean1);
      
      int int4 = (-2859);
      ATM3v2Sig.MoneySizeSelection aTM3v2Sig_MoneySizeSelection0 = ATM3v2Sig.MoneySizeSelection.STANDARD;
      aTM3v2_ASM0.step(int2, int2, aTM3v2Sig_Service0, int3, int4, aTM3v2Sig_MoneySizeSelection0);
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(ATM3v2Sig.State.AWAITPIN, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertFalse(int2 == int1);
      assertFalse(int2 == int4);
      assertFalse(int2 == int0);
      assertFalse(int2 == int3);
      assertFalse(int3 == int1);
      assertFalse(int3 == int4);
      assertFalse(int3 == int0);
      assertFalse(int3 == int2);
      assertFalse(int4 == int1);
      assertFalse(int4 == int2);
      assertFalse(int4 == int0);
      assertFalse(int4 == int3);
      
      int int5 = aTM3v2_ASM0.get_balance_card3();
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(ATM3v2Sig.State.AWAITPIN, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertFalse(int5 == int3);
      assertFalse(int5 == int0);
      assertFalse(int5 == int2);
      assertFalse(int5 == int4);
      assertFalse(int5 == int1);
      assertEquals(548, int5);
      
      ATM3v2Sig.State aTM3v2Sig_State0 = aTM3v2_ASM0.get_atmState();
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(ATM3v2Sig.State.AWAITPIN, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      
      int int6 = aTM3v2_ASM0.get_balance_card3();
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(ATM3v2Sig.State.AWAITPIN, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertFalse(int6 == int1);
      assertFalse(int6 == int3);
      assertFalse(int6 == int2);
      assertFalse(int6 == int0);
      assertFalse(int6 == int4);
      assertTrue(int6 == int5);
      assertEquals(548, int6);
      
      int int7 = aTM3v2_ASM0.get_balance_card3();
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(ATM3v2Sig.State.AWAITPIN, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertFalse(int7 == int4);
      assertFalse(int7 == int1);
      assertTrue(int7 == int5);
      assertFalse(int7 == int3);
      assertFalse(int7 == int0);
      assertFalse(int7 == int2);
      assertTrue(int7 == int6);
      assertEquals(548, int7);
      
      int int8 = aTM3v2_ASM0.get_balance_card2();
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(ATM3v2Sig.State.AWAITPIN, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertFalse(int8 == int5);
      assertFalse(int8 == int7);
      assertFalse(int8 == int4);
      assertFalse(int8 == int1);
      assertTrue(int8 == int0);
      assertFalse(int8 == int2);
      assertFalse(int8 == int3);
      assertFalse(int8 == int6);
      assertEquals(1652, int8);
      
      ATM3v2Sig.State aTM3v2Sig_State1 = aTM3v2_ASM0.get_atmState();
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(ATM3v2Sig.State.AWAITPIN, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertSame(aTM3v2Sig_State1, aTM3v2Sig_State0);
      
      int int9 = aTM3v2_ASM0.get_balance_card1();
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(ATM3v2Sig.State.AWAITPIN, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertFalse(int9 == int4);
      assertFalse(int9 == int6);
      assertFalse(int9 == int0);
      assertFalse(int9 == int3);
      assertFalse(int9 == int2);
      assertFalse(int9 == int8);
      assertFalse(int9 == int5);
      assertFalse(int9 == int7);
      assertTrue(int9 == int1);
      assertEquals(3000, int9);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ATM3v2_ASM aTM3v2_ASM0 = new ATM3v2_ASM();
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertNotNull(aTM3v2_ASM0);
      
      int int0 = aTM3v2_ASM0.get_balance_card2();
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertEquals(1652, int0);
      
      int int1 = aTM3v2_ASM0.get_balance_card1();
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertFalse(int1 == int0);
      assertEquals(3000, int1);
      
      int int2 = 0;
      ATM3v2Sig.Service aTM3v2Sig_Service0 = ATM3v2Sig.Service.EXIT;
      int int3 = 56;
      int int4 = (-2859);
      ATM3v2Sig.MoneySizeSelection aTM3v2Sig_MoneySizeSelection0 = ATM3v2Sig.MoneySizeSelection.STANDARD;
      aTM3v2_ASM0.step(int2, int2, aTM3v2Sig_Service0, int3, int4, aTM3v2Sig_MoneySizeSelection0);
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(ATM3v2Sig.State.AWAITPIN, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertFalse(int2 == int3);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int4);
      assertFalse(int3 == int0);
      assertFalse(int3 == int1);
      assertFalse(int3 == int4);
      assertFalse(int3 == int2);
      assertFalse(int4 == int2);
      assertFalse(int4 == int0);
      assertFalse(int4 == int1);
      assertFalse(int4 == int3);
      
      int int5 = aTM3v2_ASM0.get_balance_card3();
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(ATM3v2Sig.State.AWAITPIN, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertFalse(int5 == int3);
      assertFalse(int5 == int2);
      assertFalse(int5 == int0);
      assertFalse(int5 == int1);
      assertFalse(int5 == int4);
      assertEquals(548, int5);
      
      ATM3v2Sig.State aTM3v2Sig_State0 = aTM3v2_ASM0.get_atmState();
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(ATM3v2Sig.State.AWAITPIN, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      
      int int6 = aTM3v2_ASM0.get_balance_card3();
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(ATM3v2Sig.State.AWAITPIN, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertFalse(int6 == int2);
      assertTrue(int6 == int5);
      assertFalse(int6 == int3);
      assertFalse(int6 == int0);
      assertFalse(int6 == int1);
      assertFalse(int6 == int4);
      assertEquals(548, int6);
      
      ATM3v2Sig.State aTM3v2Sig_State1 = aTM3v2_ASM0.get_atmState();
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(ATM3v2Sig.State.AWAITPIN, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertSame(aTM3v2Sig_State1, aTM3v2Sig_State0);
      
      int int7 = aTM3v2_ASM0.get_balance_card1();
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(ATM3v2Sig.State.AWAITPIN, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertFalse(int7 == int5);
      assertFalse(int7 == int3);
      assertFalse(int7 == int6);
      assertTrue(int7 == int1);
      assertFalse(int7 == int4);
      assertFalse(int7 == int0);
      assertFalse(int7 == int2);
      assertEquals(3000, int7);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ATM3v2_ASM aTM3v2_ASM0 = new ATM3v2_ASM();
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertNotNull(aTM3v2_ASM0);
      
      int int0 = aTM3v2_ASM0.get_balance_card1();
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(3000, int0);
      
      Boolean boolean0 = aTM3v2_ASM0.get_accessible_card2();
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertNotNull(boolean0);
      assertTrue(boolean0);
      
      int int1 = aTM3v2_ASM0.get_balance_card1();
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertTrue(int1 == int0);
      assertEquals(3000, int1);
      
      int int2 = 0;
      ATM3v2Sig.Service aTM3v2Sig_Service0 = ATM3v2Sig.Service.WITHDRAWAL;
      int int3 = 24;
      Boolean boolean1 = aTM3v2_ASM0.get_accessible_card2();
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertNotNull(boolean1);
      assertTrue(boolean1);
      
      int int4 = (-2859);
      ATM3v2Sig.MoneySizeSelection aTM3v2Sig_MoneySizeSelection0 = ATM3v2Sig.MoneySizeSelection.STANDARD;
      Boolean boolean2 = aTM3v2_ASM0.get_accessible_card2();
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertNotNull(boolean2);
      assertTrue(boolean2);
      
      aTM3v2_ASM0.step(int2, int2, aTM3v2Sig_Service0, int3, int4, aTM3v2Sig_MoneySizeSelection0);
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertEquals(ATM3v2Sig.State.AWAITPIN, aTM3v2_ASM0.get_atmState());
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertFalse(int2 == int3);
      assertFalse(int2 == int4);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int3 == int1);
      assertFalse(int3 == int4);
      assertFalse(int3 == int0);
      assertFalse(int3 == int2);
      assertFalse(int4 == int0);
      assertFalse(int4 == int1);
      assertFalse(int4 == int2);
      assertFalse(int4 == int3);
      
      aTM3v2_ASM0.step(int2, int3, aTM3v2Sig_Service0, int3, int1, aTM3v2Sig_MoneySizeSelection0);
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertTrue(int1 == int0);
      assertFalse(int1 == int3);
      assertFalse(int1 == int2);
      assertFalse(int1 == int4);
      assertFalse(int2 == int3);
      assertFalse(int2 == int4);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int3 == int1);
      assertFalse(int3 == int4);
      assertFalse(int3 == int0);
      assertFalse(int3 == int2);
      
      int int5 = aTM3v2_ASM0.get_balance_card3();
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertFalse(int5 == int0);
      assertFalse(int5 == int4);
      assertFalse(int5 == int1);
      assertFalse(int5 == int3);
      assertFalse(int5 == int2);
      assertEquals(548, int5);
      
      int int6 = aTM3v2_ASM0.get_balance_card1();
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertFalse(int6 == int3);
      assertFalse(int6 == int4);
      assertTrue(int6 == int0);
      assertTrue(int6 == int1);
      assertFalse(int6 == int2);
      assertFalse(int6 == int5);
      assertEquals(3000, int6);
      
      int int7 = aTM3v2_ASM0.get_balance_card3();
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertFalse(int7 == int0);
      assertFalse(int7 == int3);
      assertFalse(int7 == int4);
      assertFalse(int7 == int1);
      assertFalse(int7 == int2);
      assertFalse(int7 == int6);
      assertTrue(int7 == int5);
      assertEquals(548, int7);
      
      int int8 = aTM3v2_ASM0.get_balance_card1();
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertFalse(int8 == int4);
      assertFalse(int8 == int5);
      assertFalse(int8 == int7);
      assertTrue(int8 == int6);
      assertTrue(int8 == int1);
      assertTrue(int8 == int0);
      assertFalse(int8 == int2);
      assertFalse(int8 == int3);
      assertEquals(3000, int8);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ATM3v2_ASM aTM3v2_ASM0 = new ATM3v2_ASM();
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertNotNull(aTM3v2_ASM0);
      
      int int0 = aTM3v2_ASM0.get_numOfBalanceChecks();
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(0, int0);
      
      ATM3v2Sig.Service aTM3v2Sig_Service0 = ATM3v2Sig.Service.BALANCE;
      int int1 = 52;
      ATM3v2Sig.MoneySizeSelection aTM3v2Sig_MoneySizeSelection0 = ATM3v2Sig.MoneySizeSelection.OTHER;
      aTM3v2_ASM0.step(int0, int0, aTM3v2Sig_Service0, int1, int1, aTM3v2Sig_MoneySizeSelection0);
      assertEquals(ATM3v2Sig.State.AWAITPIN, aTM3v2_ASM0.get_atmState());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ATM3v2_ASM aTM3v2_ASM0 = new ATM3v2_ASM();
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertEquals(ATM3v2Sig.State.AWAITCARD, aTM3v2_ASM0.get_atmState());
      assertNotNull(aTM3v2_ASM0);
      
      int int0 = 0;
      ATM3v2Sig.Service aTM3v2Sig_Service0 = ATM3v2Sig.Service.EXIT;
      int int1 = 56;
      ATM3v2Sig.MoneySizeSelection aTM3v2Sig_MoneySizeSelection0 = ATM3v2Sig.MoneySizeSelection.STANDARD;
      aTM3v2_ASM0.step(int0, int0, aTM3v2Sig_Service0, int1, int1, aTM3v2Sig_MoneySizeSelection0);
      assertEquals(ATM3v2Sig.State.AWAITPIN, aTM3v2_ASM0.get_atmState());
      assertEquals(0, aTM3v2_ASM0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ASM0.get_moneyLeft());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }
}
