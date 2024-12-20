/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 04 09:26:24 GMT 2024
 */

package org.evoservice.atm3;

import org.evoservice.atm3.ATM3Sig.MoneySizeSelection;
import org.evoservice.atm3.ATM3Sig.Service;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ATM3_ASM_ESTest extends ATM3_ASM_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    ATM3_ASM aTM3_ASM0 = new ATM3_ASM();
    assertEquals(ATM3Sig.State.AWAITCARD, aTM3_ASM0.get_atmState());

    aTM3_ASM0.step(0, 1, Service.BALANCE, 10, 50, MoneySizeSelection.OTHER);
    //assertEquals(aTM3_ASM0.get_currCard(), "card1");
    assertEquals(1000, aTM3_ASM0.get_moneyLeft());
    assertEquals(ATM3Sig.State.AWAITPIN, aTM3_ASM0.get_atmState());

    aTM3_ASM0.step(0, 1, Service.BALANCE, 10, 50, MoneySizeSelection.OTHER);

    assertEquals(ATM3Sig.State.CHOOSE, aTM3_ASM0.get_atmState());
    assertEquals(1000, aTM3_ASM0.get_moneyLeft());
    assertEquals(aTM3_ASM0.get_accessible_card1(), true);


  }
}