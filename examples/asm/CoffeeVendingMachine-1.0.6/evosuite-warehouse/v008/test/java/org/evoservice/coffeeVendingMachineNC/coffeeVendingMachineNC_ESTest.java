/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 08 14:10:38 GMT 2024
 */

package org.evoservice.coffeeVendingMachineNC;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class coffeeVendingMachineNC_ESTest extends coffeeVendingMachineNC_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      coffeeVendingMachineNC coffeeVendingMachineNC0 = new coffeeVendingMachineNC();
      assertNotNull(coffeeVendingMachineNC0);
      assertEquals(10, coffeeVendingMachineNC0.get_available_MILK());
      assertEquals(0, coffeeVendingMachineNC0.get_coins());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      
      coffeeVendingMachineNC.Product coffeeVendingMachineNC_Product0 = coffeeVendingMachineNC.Product.TEA;
      coffeeVendingMachineNC.CoinType coffeeVendingMachineNC_CoinType0 = coffeeVendingMachineNC.CoinType.ONE;
      coffeeVendingMachineNC0.step(coffeeVendingMachineNC_CoinType0, coffeeVendingMachineNC_Product0);
      assertEquals(1, coffeeVendingMachineNC0.get_coins());
      assertEquals(10, coffeeVendingMachineNC0.get_available_MILK());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(9, coffeeVendingMachineNC0.get_available_TEA());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      coffeeVendingMachineNC coffeeVendingMachineNC0 = new coffeeVendingMachineNC();
      assertNotNull(coffeeVendingMachineNC0);
      assertEquals(10, coffeeVendingMachineNC0.get_available_MILK());
      assertEquals(0, coffeeVendingMachineNC0.get_coins());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      
      coffeeVendingMachineNC.Product coffeeVendingMachineNC_Product0 = coffeeVendingMachineNC.Product.MILK;
      coffeeVendingMachineNC.CoinType coffeeVendingMachineNC_CoinType0 = coffeeVendingMachineNC.CoinType.ONE;
      coffeeVendingMachineNC0.step(coffeeVendingMachineNC_CoinType0, coffeeVendingMachineNC_Product0);
      assertEquals(10, coffeeVendingMachineNC0.get_available_MILK());
      assertEquals(0, coffeeVendingMachineNC0.get_coins());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      coffeeVendingMachineNC coffeeVendingMachineNC0 = new coffeeVendingMachineNC();
      assertNotNull(coffeeVendingMachineNC0);
      assertEquals(0, coffeeVendingMachineNC0.get_coins());
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_MILK());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      
      coffeeVendingMachineNC.CoinType coffeeVendingMachineNC_CoinType0 = coffeeVendingMachineNC.CoinType.HALF;
      coffeeVendingMachineNC.Product coffeeVendingMachineNC_Product0 = coffeeVendingMachineNC.Product.TEA;
      coffeeVendingMachineNC0.step(coffeeVendingMachineNC_CoinType0, coffeeVendingMachineNC_Product0);
      assertEquals(1, coffeeVendingMachineNC0.get_coins());
      assertEquals(9, coffeeVendingMachineNC0.get_available_MILK());
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      
      coffeeVendingMachineNC0.step(coffeeVendingMachineNC_CoinType0, coffeeVendingMachineNC_Product0);
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(2, coffeeVendingMachineNC0.get_coins());
      assertEquals(8, coffeeVendingMachineNC0.get_available_MILK());
      
      coffeeVendingMachineNC0.step(coffeeVendingMachineNC_CoinType0, coffeeVendingMachineNC_Product0);
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(3, coffeeVendingMachineNC0.get_coins());
      assertEquals(7, coffeeVendingMachineNC0.get_available_MILK());
      
      coffeeVendingMachineNC0.step(coffeeVendingMachineNC_CoinType0, coffeeVendingMachineNC_Product0);
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(4, coffeeVendingMachineNC0.get_coins());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(6, coffeeVendingMachineNC0.get_available_MILK());
      
      coffeeVendingMachineNC0.step(coffeeVendingMachineNC_CoinType0, coffeeVendingMachineNC_Product0);
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(5, coffeeVendingMachineNC0.get_coins());
      assertEquals(5, coffeeVendingMachineNC0.get_available_MILK());
      
      coffeeVendingMachineNC0.step(coffeeVendingMachineNC_CoinType0, coffeeVendingMachineNC_Product0);
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(4, coffeeVendingMachineNC0.get_available_MILK());
      assertEquals(6, coffeeVendingMachineNC0.get_coins());
      
      coffeeVendingMachineNC0.step(coffeeVendingMachineNC_CoinType0, coffeeVendingMachineNC_Product0);
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(3, coffeeVendingMachineNC0.get_available_MILK());
      assertEquals(7, coffeeVendingMachineNC0.get_coins());
      
      coffeeVendingMachineNC0.step(coffeeVendingMachineNC_CoinType0, coffeeVendingMachineNC_Product0);
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(8, coffeeVendingMachineNC0.get_coins());
      assertEquals(2, coffeeVendingMachineNC0.get_available_MILK());
      
      coffeeVendingMachineNC0.step(coffeeVendingMachineNC_CoinType0, coffeeVendingMachineNC_Product0);
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(9, coffeeVendingMachineNC0.get_coins());
      assertEquals(1, coffeeVendingMachineNC0.get_available_MILK());
      
      coffeeVendingMachineNC0.step(coffeeVendingMachineNC_CoinType0, coffeeVendingMachineNC_Product0);
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(0, coffeeVendingMachineNC0.get_available_MILK());
      assertEquals(10, coffeeVendingMachineNC0.get_coins());
      
      coffeeVendingMachineNC0.step(coffeeVendingMachineNC_CoinType0, coffeeVendingMachineNC_Product0);
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(0, coffeeVendingMachineNC0.get_available_MILK());
      assertEquals(10, coffeeVendingMachineNC0.get_coins());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      coffeeVendingMachineNC coffeeVendingMachineNC0 = new coffeeVendingMachineNC();
      assertNotNull(coffeeVendingMachineNC0);
      assertEquals(0, coffeeVendingMachineNC0.get_coins());
      assertEquals(10, coffeeVendingMachineNC0.get_available_MILK());
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      
      int int0 = coffeeVendingMachineNC0.get_available_MILK();
      assertEquals(0, coffeeVendingMachineNC0.get_coins());
      assertEquals(10, coffeeVendingMachineNC0.get_available_MILK());
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      coffeeVendingMachineNC coffeeVendingMachineNC0 = new coffeeVendingMachineNC();
      assertNotNull(coffeeVendingMachineNC0);
      assertEquals(0, coffeeVendingMachineNC0.get_coins());
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(10, coffeeVendingMachineNC0.get_available_MILK());
      
      int int0 = coffeeVendingMachineNC0.get_available_COFFEE();
      assertEquals(0, coffeeVendingMachineNC0.get_coins());
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(10, coffeeVendingMachineNC0.get_available_MILK());
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      coffeeVendingMachineNC coffeeVendingMachineNC0 = new coffeeVendingMachineNC();
      assertNotNull(coffeeVendingMachineNC0);
      assertEquals(0, coffeeVendingMachineNC0.get_coins());
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_MILK());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      
      int int0 = coffeeVendingMachineNC0.get_coins();
      assertEquals(0, coffeeVendingMachineNC0.get_coins());
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_MILK());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      coffeeVendingMachineNC coffeeVendingMachineNC0 = new coffeeVendingMachineNC();
      assertNotNull(coffeeVendingMachineNC0);
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(0, coffeeVendingMachineNC0.get_coins());
      assertEquals(10, coffeeVendingMachineNC0.get_available_MILK());
      
      int int0 = coffeeVendingMachineNC0.get_available_TEA();
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(0, coffeeVendingMachineNC0.get_coins());
      assertEquals(10, coffeeVendingMachineNC0.get_available_MILK());
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      coffeeVendingMachineNC coffeeVendingMachineNC0 = new coffeeVendingMachineNC();
      assertNotNull(coffeeVendingMachineNC0);
      assertEquals(10, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC0.get_available_MILK());
      assertEquals(0, coffeeVendingMachineNC0.get_coins());
      
      coffeeVendingMachineNC.CoinType coffeeVendingMachineNC_CoinType0 = coffeeVendingMachineNC.CoinType.ONE;
      coffeeVendingMachineNC.Product coffeeVendingMachineNC_Product0 = coffeeVendingMachineNC.Product.COFFEE;
      coffeeVendingMachineNC0.step(coffeeVendingMachineNC_CoinType0, coffeeVendingMachineNC_Product0);
      assertEquals(9, coffeeVendingMachineNC0.get_available_COFFEE());
      assertEquals(10, coffeeVendingMachineNC0.get_available_TEA());
      assertEquals(1, coffeeVendingMachineNC0.get_coins());
      assertEquals(10, coffeeVendingMachineNC0.get_available_MILK());
  }
}
