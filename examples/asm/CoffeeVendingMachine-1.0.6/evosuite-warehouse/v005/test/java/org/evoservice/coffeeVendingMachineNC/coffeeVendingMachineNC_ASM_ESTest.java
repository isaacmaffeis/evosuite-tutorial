/*
 * This file was automatically generated by EvoSuite
 * Mon Sep 02 22:02:21 GMT 2024
 */

package org.evoservice.coffeeVendingMachineNC;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class coffeeVendingMachineNC_ASM_ESTest extends coffeeVendingMachineNC_ASM_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      coffeeVendingMachineNC_ASM coffeeVendingMachineNC_ASM0 = new coffeeVendingMachineNC_ASM();
      assertNotNull(coffeeVendingMachineNC_ASM0);
      assertEquals(10, coffeeVendingMachineNC_ASM0.get_available_MILK());
      assertEquals(10, coffeeVendingMachineNC_ASM0.get_available_COFFEE());
      assertEquals(10, coffeeVendingMachineNC_ASM0.get_available_TEA());
      
      coffeeVendingMachineNCSig.CoinType coffeeVendingMachineNCSig_CoinType0 = coffeeVendingMachineNCSig.CoinType.ONE;
      coffeeVendingMachineNCSig.Product coffeeVendingMachineNCSig_Product0 = coffeeVendingMachineNCSig.Product.TEA;
      coffeeVendingMachineNC_ASM0.step(coffeeVendingMachineNCSig_CoinType0, coffeeVendingMachineNCSig_Product0);
      assertEquals(10, coffeeVendingMachineNC_ASM0.get_available_MILK());
      assertEquals(10, coffeeVendingMachineNC_ASM0.get_available_COFFEE());
      assertEquals(9, coffeeVendingMachineNC_ASM0.get_available_TEA());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      coffeeVendingMachineNC_ASM coffeeVendingMachineNC_ASM0 = new coffeeVendingMachineNC_ASM();
      assertNotNull(coffeeVendingMachineNC_ASM0);
      assertEquals(10, coffeeVendingMachineNC_ASM0.get_available_COFFEE());
      assertEquals(10, coffeeVendingMachineNC_ASM0.get_available_MILK());
      assertEquals(10, coffeeVendingMachineNC_ASM0.get_available_TEA());
      
      coffeeVendingMachineNCSig.CoinType coffeeVendingMachineNCSig_CoinType0 = coffeeVendingMachineNCSig.CoinType.ONE;
      coffeeVendingMachineNCSig.Product coffeeVendingMachineNCSig_Product0 = coffeeVendingMachineNCSig.Product.COFFEE;
      coffeeVendingMachineNC_ASM0.step(coffeeVendingMachineNCSig_CoinType0, coffeeVendingMachineNCSig_Product0);
      assertEquals(9, coffeeVendingMachineNC_ASM0.get_available_COFFEE());
      assertEquals(10, coffeeVendingMachineNC_ASM0.get_available_MILK());
      assertEquals(10, coffeeVendingMachineNC_ASM0.get_available_TEA());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      coffeeVendingMachineNC_ASM coffeeVendingMachineNC_ASM0 = new coffeeVendingMachineNC_ASM();
      assertNotNull(coffeeVendingMachineNC_ASM0);
      assertEquals(10, coffeeVendingMachineNC_ASM0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC_ASM0.get_available_COFFEE());
      assertEquals(10, coffeeVendingMachineNC_ASM0.get_available_MILK());
      
      coffeeVendingMachineNCSig.CoinType coffeeVendingMachineNCSig_CoinType0 = coffeeVendingMachineNCSig.CoinType.HALF;
      coffeeVendingMachineNCSig.Product coffeeVendingMachineNCSig_Product0 = coffeeVendingMachineNCSig.Product.MILK;
      coffeeVendingMachineNC_ASM0.step(coffeeVendingMachineNCSig_CoinType0, coffeeVendingMachineNCSig_Product0);
      assertEquals(10, coffeeVendingMachineNC_ASM0.get_available_TEA());
      assertEquals(10, coffeeVendingMachineNC_ASM0.get_available_COFFEE());
      assertEquals(9, coffeeVendingMachineNC_ASM0.get_available_MILK());
  }
}
