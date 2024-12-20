/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 22 10:07:43 GMT 2024
 */

package org.evoservice.wrapper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ATM3v2_ATG_ESTest extends ATM3v2_ATG_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ATM3v2_ATG aTM3v2_ATG0 = new ATM3v2_ATG();
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertNotNull(aTM3v2_ATG0);
      
      int int0 = aTM3v2_ATG0.get_numOfBalanceChecks();
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ATM3v2_ATG aTM3v2_ATG0 = new ATM3v2_ATG();
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertNotNull(aTM3v2_ATG0);
      
      int int0 = 65;
      boolean boolean0 = aTM3v2_ATG0.get_accessible_card2();
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertTrue(boolean0);
      
      int int1 = (-1);
      aTM3v2_ATG0.set_insertedPin(int1);
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertFalse(int1 == int0);
      
      String string0 = "";
      ATM3v2.NumCard aTM3v2_NumCard0 = new ATM3v2.NumCard(string0);
      assertNotNull(aTM3v2_NumCard0);
      
      String string1 = "OIHn56xT}\\(vOJ";
      String string2 = "";
      ATM3v2.NumCard aTM3v2_NumCard1 = new ATM3v2.NumCard(string2);
      assertFalse(string2.equals((Object)string1));
      assertFalse(aTM3v2_NumCard1.equals((Object)aTM3v2_NumCard0));
      assertNotNull(aTM3v2_NumCard1);
      
      String string3 = "2Y\\{mW%7G\\:*ot";
      ATM3v2.NumCard aTM3v2_NumCard2 = aTM3v2_NumCard0.get(string3);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string3));
      assertFalse(aTM3v2_NumCard0.equals((Object)aTM3v2_NumCard1));
      assertFalse(string3.equals((Object)string1));
      assertFalse(string3.equals((Object)string0));
      assertFalse(string3.equals((Object)string2));
      assertNotSame(aTM3v2_NumCard0, aTM3v2_NumCard1);
      assertNull(aTM3v2_NumCard2);
      
      ATM3v2.NumCard aTM3v2_NumCard3 = aTM3v2_NumCard1.get(string2);
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string3));
      assertFalse(aTM3v2_NumCard1.equals((Object)aTM3v2_NumCard0));
      assertFalse(aTM3v2_NumCard3.equals((Object)aTM3v2_NumCard0));
      assertSame(aTM3v2_NumCard1, aTM3v2_NumCard3);
      assertNotSame(aTM3v2_NumCard1, aTM3v2_NumCard0);
      assertNotSame(aTM3v2_NumCard3, aTM3v2_NumCard0);
      assertSame(aTM3v2_NumCard3, aTM3v2_NumCard1);
      assertNotNull(aTM3v2_NumCard3);
      
      ATM3v2.NumCard aTM3v2_NumCard4 = aTM3v2_NumCard0.get(string3);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string3));
      assertFalse(aTM3v2_NumCard0.equals((Object)aTM3v2_NumCard3));
      assertFalse(aTM3v2_NumCard0.equals((Object)aTM3v2_NumCard1));
      assertFalse(string3.equals((Object)string1));
      assertFalse(string3.equals((Object)string0));
      assertFalse(string3.equals((Object)string2));
      assertNotSame(aTM3v2_NumCard0, aTM3v2_NumCard3);
      assertNotSame(aTM3v2_NumCard0, aTM3v2_NumCard1);
      assertNull(aTM3v2_NumCard4);
      
      String string4 = ATM3v2.NumCard.toString(aTM3v2_NumCard1);
      assertEquals("", string4);
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string3));
      assertFalse(aTM3v2_NumCard1.equals((Object)aTM3v2_NumCard0));
      assertFalse(string4.equals((Object)string1));
      assertFalse(string4.equals((Object)string3));
      assertSame(aTM3v2_NumCard1, aTM3v2_NumCard3);
      assertNotSame(aTM3v2_NumCard1, aTM3v2_NumCard0);
      assertNotNull(string4);
      
      ATM3v2.NumCard aTM3v2_NumCard5 = aTM3v2_NumCard0.get(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string3));
      assertFalse(aTM3v2_NumCard0.equals((Object)aTM3v2_NumCard3));
      assertFalse(aTM3v2_NumCard0.equals((Object)aTM3v2_NumCard1));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string3));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string4));
      assertNotSame(aTM3v2_NumCard0, aTM3v2_NumCard3);
      assertNotSame(aTM3v2_NumCard0, aTM3v2_NumCard1);
      assertNull(aTM3v2_NumCard5);
      
      String string5 = ATM3v2.NumCard.toString(aTM3v2_NumCard1);
      assertEquals("", string5);
      assertFalse(string5.equals((Object)string1));
      assertFalse(string5.equals((Object)string3));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string3));
      assertFalse(aTM3v2_NumCard1.equals((Object)aTM3v2_NumCard0));
      assertSame(aTM3v2_NumCard1, aTM3v2_NumCard3);
      assertNotSame(aTM3v2_NumCard1, aTM3v2_NumCard0);
      assertNotNull(string5);
      
      ATM3v2.card1 = aTM3v2_NumCard5;
      aTM3v2_ATG0.set_insertMoneySizeStandard(int0);
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertFalse(int0 == int1);
      
      int int2 = aTM3v2_ATG0.get_balance_card2();
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(1652, int2);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      
      boolean boolean1 = aTM3v2_ATG0.get_accessible_card1();
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertTrue(boolean1);
      assertTrue(boolean1 == boolean0);
      
      aTM3v2_ATG0.set_insertedCard_card3();
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      
      ATM3v2.State aTM3v2_State0 = aTM3v2_ATG0.get_atmState();
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      
      aTM3v2_ATG0.set_insertedCard_card3();
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      
      int int3 = (-1190);
      aTM3v2_ATG0.set_insertedPin(int3);
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertFalse(int3 == int1);
      assertFalse(int3 == int2);
      assertFalse(int3 == int0);
      
      ATM3v2.State aTM3v2_State1 = aTM3v2_ATG0.get_atmState();
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertSame(aTM3v2_State1, aTM3v2_State0);
      
      ATM3v2.State aTM3v2_State2 = aTM3v2_ATG0.get_atmState();
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertSame(aTM3v2_State2, aTM3v2_State0);
      assertSame(aTM3v2_State2, aTM3v2_State1);
      
      ATM3v2.Service aTM3v2_Service0 = ATM3v2.Service.BALANCE;
      aTM3v2_ATG0.set_selectedService(aTM3v2_Service0);
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ATM3v2_ATG aTM3v2_ATG0 = new ATM3v2_ATG();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertNotNull(aTM3v2_ATG0);
      
      aTM3v2_ATG0.set_insertedCard_card3();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      
      String string0 = "";
      ATM3v2.NumCard aTM3v2_NumCard0 = new ATM3v2.NumCard(string0);
      assertNotNull(aTM3v2_NumCard0);
      
      ATM3v2.card3 = aTM3v2_NumCard0;
      int int0 = aTM3v2_ATG0.get_balance_card2();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1652, int0);
      
      ATM3v2.Service aTM3v2_Service0 = ATM3v2.Service.EXIT;
      aTM3v2_ATG0.set_selectedService(aTM3v2_Service0);
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ATM3v2_ATG aTM3v2_ATG0 = new ATM3v2_ATG();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertNotNull(aTM3v2_ATG0);
      
      int int0 = 35;
      aTM3v2_ATG0.set_insertMoneySizeOther(int0);
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      
      aTM3v2_ATG0.set_insertedCard_card1();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      
      int int1 = 0;
      aTM3v2_ATG0.set_insertMoneySizeOther(int1);
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertFalse(int1 == int0);
      
      int int2 = aTM3v2_ATG0.get_balance_card1();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(3000, int2);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      
      aTM3v2_ATG0.step();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITPIN, aTM3v2_ATG0.get_atmState());
      
      ATM3v2.MoneySizeSelection aTM3v2_MoneySizeSelection0 = ATM3v2.MoneySizeSelection.OTHER;
      aTM3v2_ATG0.set_standardOrOther(aTM3v2_MoneySizeSelection0);
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITPIN, aTM3v2_ATG0.get_atmState());
      
      aTM3v2_ATG0.step();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      
      aTM3v2_ATG0.set_insertedCard_card3();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      
      boolean boolean0 = aTM3v2_ATG0.get_accessible_card2();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertTrue(boolean0);
      
      int int3 = 1345;
      aTM3v2_ATG0.step();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITPIN, aTM3v2_ATG0.get_atmState());
      
      aTM3v2_ATG0.set_insertMoneySizeOther(int3);
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITPIN, aTM3v2_ATG0.get_atmState());
      assertFalse(int3 == int2);
      assertFalse(int3 == int0);
      assertFalse(int3 == int1);
      
      aTM3v2_ATG0.set_insertedCard_card1();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITPIN, aTM3v2_ATG0.get_atmState());
      
      aTM3v2_ATG0.get_atmState();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITPIN, aTM3v2_ATG0.get_atmState());
      
      int int4 = aTM3v2_ATG0.get_balance_card1();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITPIN, aTM3v2_ATG0.get_atmState());
      assertEquals(3000, int4);
      assertFalse(int4 == int1);
      assertFalse(int4 == int3);
      assertFalse(int4 == int0);
      assertTrue(int4 == int2);
      
      int int5 = aTM3v2_ATG0.get_moneyLeft();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITPIN, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, int5);
      assertFalse(int5 == int1);
      assertFalse(int5 == int3);
      assertFalse(int5 == int2);
      assertFalse(int5 == int0);
      assertFalse(int5 == int4);
      
      aTM3v2_ATG0.set_insertedCard_card1();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITPIN, aTM3v2_ATG0.get_atmState());
      
      ATM3v2.MoneySizeSelection aTM3v2_MoneySizeSelection1 = ATM3v2.MoneySizeSelection.STANDARD;
      aTM3v2_ATG0.set_standardOrOther(aTM3v2_MoneySizeSelection1);
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITPIN, aTM3v2_ATG0.get_atmState());
      assertFalse(aTM3v2_MoneySizeSelection1.equals((Object)aTM3v2_MoneySizeSelection0));
      assertNotSame(aTM3v2_MoneySizeSelection1, aTM3v2_MoneySizeSelection0);
      
      aTM3v2_ATG0.set_insertedCard_card2();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITPIN, aTM3v2_ATG0.get_atmState());
      
      aTM3v2_ATG0.step();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      
      aTM3v2_ATG0.set_insertedCard_card1();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      
      boolean boolean1 = aTM3v2_ATG0.get_accessible_card2();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertTrue(boolean1);
      assertTrue(boolean1 == boolean0);
      
      aTM3v2_ATG0.set_insertedCard_card1();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      
      int int6 = (-163);
      aTM3v2_ATG0.set_insertMoneySizeOther(int6);
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertFalse(int6 == int2);
      assertFalse(int6 == int3);
      assertFalse(int6 == int5);
      assertFalse(int6 == int1);
      assertFalse(int6 == int0);
      assertFalse(int6 == int4);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ATM3v2_ATG aTM3v2_ATG0 = new ATM3v2_ATG();
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertNotNull(aTM3v2_ATG0);
      
      int int0 = (-485);
      // Undeclared exception!
      try { 
        aTM3v2_ATG0.set_insertMoneySizeStandard(int0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -495
         //
         verifyException("java.util.Arrays$ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ATM3v2_ATG aTM3v2_ATG0 = new ATM3v2_ATG();
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertNotNull(aTM3v2_ATG0);
      
      boolean boolean0 = aTM3v2_ATG0.get_accessible_card1();
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertTrue(boolean0);
      
      aTM3v2_ATG0.set_insertedCard_card3();
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      
      String string0 = "XC6`#RI7BR_Pg";
      ATM3v2.NumCard aTM3v2_NumCard0 = new ATM3v2.NumCard(string0);
      assertNotNull(aTM3v2_NumCard0);
      
      ATM3v2.NumCard aTM3v2_NumCard1 = aTM3v2_NumCard0.get(string0);
      assertSame(aTM3v2_NumCard0, aTM3v2_NumCard1);
      assertSame(aTM3v2_NumCard1, aTM3v2_NumCard0);
      assertNotNull(aTM3v2_NumCard1);
      
      ATM3v2.card2 = aTM3v2_NumCard1;
      int int0 = aTM3v2_ATG0.get_balance_card1();
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(3000, int0);
      
      aTM3v2_ATG0.set_insertedCard_card1();
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ATM3v2_ATG aTM3v2_ATG0 = new ATM3v2_ATG();
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertNotNull(aTM3v2_ATG0);
      
      int int0 = aTM3v2_ATG0.get_balance_card3();
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(548, int0);
      
      boolean boolean0 = aTM3v2_ATG0.get_accessible_card3();
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertTrue(boolean0);
      
      String string0 = "";
      ATM3v2.NumCard aTM3v2_NumCard0 = new ATM3v2.NumCard(string0);
      assertNotNull(aTM3v2_NumCard0);
      
      ATM3v2.card1 = aTM3v2_NumCard0;
      aTM3v2_ATG0.set_insertMoneySizeOther(int0);
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      
      boolean boolean1 = aTM3v2_ATG0.get_accessible_card1();
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertTrue(boolean1);
      assertTrue(boolean1 == boolean0);
      
      int int1 = aTM3v2_ATG0.get_balance_card1();
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(3000, int1);
      assertFalse(int1 == int0);
      
      boolean boolean2 = aTM3v2_ATG0.get_accessible_card2();
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertTrue(boolean2);
      assertTrue(boolean2 == boolean1);
      assertTrue(boolean2 == boolean0);
      
      boolean boolean3 = aTM3v2_ATG0.get_accessible_card2();
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertTrue(boolean3);
      assertTrue(boolean3 == boolean1);
      assertTrue(boolean3 == boolean2);
      assertTrue(boolean3 == boolean0);
      
      int int2 = aTM3v2_ATG0.get_moneyLeft();
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(1000, int2);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      
      int int3 = aTM3v2_ATG0.get_balance_card2();
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(1652, int3);
      assertFalse(int3 == int2);
      assertFalse(int3 == int0);
      assertFalse(int3 == int1);
      
      int int4 = (-4903);
      aTM3v2_ATG0.set_insertMoneySizeOther(int4);
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertFalse(int4 == int2);
      assertFalse(int4 == int0);
      assertFalse(int4 == int1);
      assertFalse(int4 == int3);
      
      int int5 = aTM3v2_ATG0.get_moneyLeft();
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(1000, int5);
      assertFalse(int5 == int0);
      assertFalse(int5 == int4);
      assertTrue(int5 == int2);
      assertFalse(int5 == int1);
      assertFalse(int5 == int3);
      
      boolean boolean4 = aTM3v2_ATG0.get_accessible_card1();
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertTrue(boolean4);
      assertTrue(boolean4 == boolean0);
      assertTrue(boolean4 == boolean3);
      assertTrue(boolean4 == boolean1);
      assertTrue(boolean4 == boolean2);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ATM3v2_ATG aTM3v2_ATG0 = new ATM3v2_ATG();
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertNotNull(aTM3v2_ATG0);
      
      aTM3v2_ATG0.set_insertedCard_card2();
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      
      int int0 = 0;
      boolean boolean0 = aTM3v2_ATG0.get_accessible_card3();
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertTrue(boolean0);
      
      aTM3v2_ATG0.set_insertMoneySizeOther(int0);
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      
      int int1 = aTM3v2_ATG0.get_balance_card2();
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(1652, int1);
      assertFalse(int1 == int0);
      
      aTM3v2_ATG0.step();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITPIN, aTM3v2_ATG0.get_atmState());
      
      boolean boolean1 = aTM3v2_ATG0.get_accessible_card3();
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(ATM3v2.State.AWAITPIN, aTM3v2_ATG0.get_atmState());
      assertTrue(boolean1);
      assertTrue(boolean1 == boolean0);
      
      aTM3v2_ATG0.step();
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      
      ATM3v2.MoneySizeSelection aTM3v2_MoneySizeSelection0 = ATM3v2.MoneySizeSelection.STANDARD;
      String string0 = "blJCefrBdq*\"";
      ATM3v2.NumCard aTM3v2_NumCard0 = new ATM3v2.NumCard(string0);
      assertNotNull(aTM3v2_NumCard0);
      
      String string1 = "r9bp{vDBa";
      ATM3v2.NumCard aTM3v2_NumCard1 = aTM3v2_NumCard0.get(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNull(aTM3v2_NumCard1);
      
      ATM3v2.NumCard aTM3v2_NumCard2 = aTM3v2_NumCard0.get(string0);
      assertFalse(string0.equals((Object)string1));
      assertSame(aTM3v2_NumCard0, aTM3v2_NumCard2);
      assertSame(aTM3v2_NumCard2, aTM3v2_NumCard0);
      assertNotNull(aTM3v2_NumCard2);
      
      ATM3v2.card3 = aTM3v2_NumCard2;
      aTM3v2_ATG0.set_standardOrOther(aTM3v2_MoneySizeSelection0);
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      
      aTM3v2_ATG0.set_insertedPin(int0);
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertFalse(int0 == int1);
      
      boolean boolean2 = aTM3v2_ATG0.get_accessible_card1();
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertTrue(boolean2);
      assertTrue(boolean2 == boolean1);
      assertTrue(boolean2 == boolean0);
      
      int int2 = aTM3v2_ATG0.get_balance_card1();
      assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
      assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
      assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
      assertEquals(3000, int2);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
  }
}
