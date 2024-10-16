/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 07 21:31:29 GMT 2024
 */

package org.example.vendingMachine;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.example.vendingMachine.VendingMachineASM;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class VendingMachineASM_ESTest extends VendingMachineASM_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VendingMachineASM vendingMachineASM0 = new VendingMachineASM();
      vendingMachineASM0.insertCoin(48);
      vendingMachineASM0.insertCoin(48);
      vendingMachineASM0.selectBeverage();
      assertEquals(0, vendingMachineASM0.getBalance());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VendingMachineASM vendingMachineASM0 = new VendingMachineASM();
      vendingMachineASM0.insertCoin(48);
      int int0 = vendingMachineASM0.getBalance();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VendingMachineASM vendingMachineASM0 = new VendingMachineASM();
      vendingMachineASM0.insertCoin((-1362));
      int int0 = vendingMachineASM0.getBalance();
      assertEquals((-1362), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VendingMachineASM vendingMachineASM0 = new VendingMachineASM();
      vendingMachineASM0.insertCoin(50);
      assertEquals(50, vendingMachineASM0.getBalance());
      
      vendingMachineASM0.selectBeverage();
      assertEquals(0, vendingMachineASM0.getBalance());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      VendingMachineASM vendingMachineASM0 = new VendingMachineASM();
      vendingMachineASM0.insertCoin(0);
      vendingMachineASM0.selectBeverage();
      assertEquals(0, vendingMachineASM0.getBalance());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      VendingMachineASM vendingMachineASM0 = new VendingMachineASM();
      vendingMachineASM0.selectBeverage();
      assertEquals(0, vendingMachineASM0.getBalance());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      VendingMachineASM vendingMachineASM0 = new VendingMachineASM();
      int int0 = vendingMachineASM0.getBalance();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      VendingMachineASM vendingMachineASM0 = new VendingMachineASM();
      vendingMachineASM0.getCurrentState();
      assertEquals(0, vendingMachineASM0.getBalance());
  }
}
