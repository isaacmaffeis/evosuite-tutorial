package org.evoservice.atm3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ManualTest {

  @Test//(timeout = 4000)
  public void test00()  throws Throwable  {
    ATM3v2 aTM3v2_0 = new ATM3v2();
    assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_0.get_atmState());
    assertEquals(1000, aTM3v2_0.get_moneyLeft());
    assertEquals(0, aTM3v2_0.get_numOfBalanceChecks());

    aTM3v2_0.set_insertedCard("card1");
    aTM3v2_0.step();
    assertEquals(1000, aTM3v2_0.get_moneyLeft());
    assertEquals(ATM3v2.State.AWAITPIN, aTM3v2_0.get_atmState());
    assertEquals(0, aTM3v2_0.get_numOfBalanceChecks());

    aTM3v2_0.set_insertedPin(1);
    aTM3v2_0.step();
    assertEquals(1000, aTM3v2_0.get_moneyLeft());
    assertEquals(ATM3v2.State.CHOOSE, aTM3v2_0.get_atmState());
    assertEquals(0, aTM3v2_0.get_numOfBalanceChecks());

    aTM3v2_0.set_selectedService(ATM3v2.Service.WITHDRAWAL);
    aTM3v2_0.step();
    assertEquals(1000, aTM3v2_0.get_moneyLeft());
    assertEquals(ATM3v2.State.CHOOSEAMOUNT, aTM3v2_0.get_atmState());
    assertEquals(0, aTM3v2_0.get_numOfBalanceChecks());

    aTM3v2_0.set_standardOrOther(ATM3v2.MoneySizeSelection.STANDARD);
    aTM3v2_0.step();
    assertEquals(1000, aTM3v2_0.get_moneyLeft());
    assertEquals(ATM3v2.State.STANDARDAMOUNTSELECTION, aTM3v2_0.get_atmState());
    assertEquals(0, aTM3v2_0.get_numOfBalanceChecks());
    assertEquals(3000,aTM3v2_0.get_balance_card1());

    aTM3v2_0.set_insertMoneySizeStandard(100);
    aTM3v2_0.step();
    assertEquals(900, aTM3v2_0.get_moneyLeft());
    assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_0.get_atmState());
    assertEquals(0, aTM3v2_0.get_numOfBalanceChecks());
    assertEquals(2900,aTM3v2_0.get_balance_card1());

  }

}
