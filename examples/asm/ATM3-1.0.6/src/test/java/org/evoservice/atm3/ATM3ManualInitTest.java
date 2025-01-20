package org.evoservice.atm3;

import org.junit.Test;
import static org.junit.Assert.*;

public class ATM3ManualInitTest {

    @Test
  public void test00()  throws Throwable  {
      ATM3_ATG atm3 = new ATM3_ATG();
      assertEquals(ATM3.State.AWAITCARD, atm3.get_atmState());
      assertEquals(1000, atm3.get_moneyLeft());
        System.out.println("atm3.get_numOfBalanceChecks(): " + atm3.get_numOfBalanceChecks());
      //assertEquals(0, atm3.get_numOfBalanceChecks());
      assertNotNull(atm3);
      
      atm3.set_insertedCard("card3");
      assertEquals(ATM3.State.AWAITCARD, atm3.get_atmState());
      assertEquals(1000, atm3.get_moneyLeft());
      Integer i = new Integer(0);
      assertEquals(null, atm3.get_numOfBalanceChecks());
      
      atm3.step();
      assertEquals(ATM3.State.AWAITPIN, atm3.get_atmState());
      assertEquals(1000, atm3.get_moneyLeft());
      assertEquals(i, atm3.get_numOfBalanceChecks());
      
      atm3.step();
      assertEquals(ATM3.State.AWAITCARD, atm3.get_atmState());
      assertEquals(1000, atm3.get_moneyLeft());
      assertEquals(i, atm3.get_numOfBalanceChecks());
      
      ATM3.State[] aTM3v2_StateArray0 = ATM3.State.values();
      assertNotNull(aTM3v2_StateArray0);
      assertEquals(7, aTM3v2_StateArray0.length);
  }

}
