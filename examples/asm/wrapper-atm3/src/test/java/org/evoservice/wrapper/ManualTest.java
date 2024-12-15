package org.evoservice.wrapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.evoservice.wrapper.ATM3v2.MoneySizeSelection;
import org.evoservice.wrapper.ATM3v2.Service;
import org.evoservice.wrapper.ATM3v2.State;
import org.junit.Test;

public class ManualTest {
/*
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    ATM3v2_ATG aTM3v2_ATG0 = new ATM3v2_ATG();
    assertNotNull(aTM3v2_ATG0);
    assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
    assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());

   // aTM3v2_ATG0.set_insertedCard_card1();
    aTM3v2_ATG0.step();
    assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
    assertEquals(ATM3v2.State.AWAITPIN, aTM3v2_ATG0.get_atmState());
    assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(3000, aTM3v2_ATG0.get_balance_card1());

    aTM3v2_ATG0.set_insertedPin(1);
    aTM3v2_ATG0.step();
    assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
    assertEquals(ATM3v2.State.CHOOSE, aTM3v2_ATG0.get_atmState());
    assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(3000, aTM3v2_ATG0.get_balance_card1());

    aTM3v2_ATG0.set_selectedService(Service.WITHDRAWAL);
    aTM3v2_ATG0.step();
    assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
    assertEquals(ATM3v2.State.CHOOSEAMOUNT, aTM3v2_ATG0.get_atmState());
    assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(3000, aTM3v2_ATG0.get_balance_card1());

    aTM3v2_ATG0.set_standardOrOther(MoneySizeSelection.STANDARD);
    aTM3v2_ATG0.step();
    assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
    assertEquals(ATM3v2.State.STANDARDAMOUNTSELECTION, aTM3v2_ATG0.get_atmState());
    assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(3000, aTM3v2_ATG0.get_balance_card1());

    aTM3v2_ATG0.set_insertMoneySizeStandard(50);
    aTM3v2_ATG0.step();
    assertEquals(950, aTM3v2_ATG0.get_moneyLeft());
    assertEquals(State.AWAITCARD, aTM3v2_ATG0.get_atmState());
    assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(2950, aTM3v2_ATG0.get_balance_card1());

    aTM3v2_ATG0.set_insertedCard_card2();
    aTM3v2_ATG0.step();
    assertEquals(950, aTM3v2_ATG0.get_moneyLeft());
    assertEquals(ATM3v2.State.AWAITPIN, aTM3v2_ATG0.get_atmState());
    assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(2950, aTM3v2_ATG0.get_balance_card1());
    assertEquals(1652, aTM3v2_ATG0.get_balance_card2());

    aTM3v2_ATG0.set_insertedPin(2);
    aTM3v2_ATG0.step();
    assertEquals(950, aTM3v2_ATG0.get_moneyLeft());
    assertEquals(ATM3v2.State.CHOOSE, aTM3v2_ATG0.get_atmState());
    assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(2950, aTM3v2_ATG0.get_balance_card1());
    assertEquals(1652, aTM3v2_ATG0.get_balance_card2());

    aTM3v2_ATG0.set_selectedService(Service.BALANCE);
    aTM3v2_ATG0.step();
    assertEquals(950, aTM3v2_ATG0.get_moneyLeft());
    assertEquals(State.CHOOSE, aTM3v2_ATG0.get_atmState());
    assertEquals(1, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(2950, aTM3v2_ATG0.get_balance_card1());
    assertEquals(1652, aTM3v2_ATG0.get_balance_card2());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    ATM3v2_ATG aTM3v2_ATG0 = new ATM3v2_ATG();
    assertNotNull(aTM3v2_ATG0);
    assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
    assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());

    aTM3v2_ATG0.set_insertedCard_card1();
    aTM3v2_ATG0.step();
    assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
    assertEquals(ATM3v2.State.AWAITPIN, aTM3v2_ATG0.get_atmState());
    assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(3000, aTM3v2_ATG0.get_balance_card1());

    aTM3v2_ATG0.set_insertedPin(1);
    aTM3v2_ATG0.step();
    assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
    assertEquals(ATM3v2.State.CHOOSE, aTM3v2_ATG0.get_atmState());
    assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(3000, aTM3v2_ATG0.get_balance_card1());

    aTM3v2_ATG0.set_selectedService(Service.WITHDRAWAL);
    aTM3v2_ATG0.step();
    assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
    assertEquals(ATM3v2.State.CHOOSEAMOUNT, aTM3v2_ATG0.get_atmState());
    assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(3000, aTM3v2_ATG0.get_balance_card1());

    aTM3v2_ATG0.set_standardOrOther(MoneySizeSelection.STANDARD);
    aTM3v2_ATG0.step();
    assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
    assertEquals(ATM3v2.State.STANDARDAMOUNTSELECTION, aTM3v2_ATG0.get_atmState());
    assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(3000, aTM3v2_ATG0.get_balance_card1());

    aTM3v2_ATG0.set_insertMoneySizeStandard(50);
    aTM3v2_ATG0.step();
    assertEquals(950, aTM3v2_ATG0.get_moneyLeft());
    assertEquals(State.AWAITCARD, aTM3v2_ATG0.get_atmState());
    assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(2950, aTM3v2_ATG0.get_balance_card1());

    aTM3v2_ATG0.set_insertedCard_card2();
    aTM3v2_ATG0.step();
    assertEquals(950, aTM3v2_ATG0.get_moneyLeft());
    assertEquals(ATM3v2.State.AWAITPIN, aTM3v2_ATG0.get_atmState());
    assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(2950, aTM3v2_ATG0.get_balance_card1());
    assertEquals(1652, aTM3v2_ATG0.get_balance_card2());

    aTM3v2_ATG0.set_insertedPin(2);
    aTM3v2_ATG0.step();
    assertEquals(950, aTM3v2_ATG0.get_moneyLeft());
    assertEquals(ATM3v2.State.CHOOSE, aTM3v2_ATG0.get_atmState());
    assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(2950, aTM3v2_ATG0.get_balance_card1());
    assertEquals(1652, aTM3v2_ATG0.get_balance_card2());

    aTM3v2_ATG0.set_selectedService(Service.BALANCE);
    aTM3v2_ATG0.step();
    assertEquals(950, aTM3v2_ATG0.get_moneyLeft());
    assertEquals(State.CHOOSE, aTM3v2_ATG0.get_atmState());
    assertEquals(1, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(2950, aTM3v2_ATG0.get_balance_card1());
    assertEquals(1652, aTM3v2_ATG0.get_balance_card2());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
    ATM3v2_ATG aTM3v2_ATG0 = new ATM3v2_ATG();
    assertNotNull(aTM3v2_ATG0);
    assertEquals(ATM3v2.State.AWAITCARD, aTM3v2_ATG0.get_atmState());
    assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());

    //aTM3v2_ATG0.set_insertedCard_card1();
    aTM3v2_ATG0.step();
    assertEquals(1000, aTM3v2_ATG0.get_moneyLeft());
    assertEquals(ATM3v2.State.AWAITPIN, aTM3v2_ATG0.get_atmState());
    assertEquals(0, aTM3v2_ATG0.get_numOfBalanceChecks());
    assertEquals(3000, aTM3v2_ATG0.get_balance_card1());


  }
*/
}
