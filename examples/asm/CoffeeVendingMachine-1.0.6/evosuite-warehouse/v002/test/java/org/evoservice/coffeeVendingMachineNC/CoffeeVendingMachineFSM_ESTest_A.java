/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 23 16:15:39 GMT 2024
 */

package org.evoservice.coffeeVendingMachineNC;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evoservice.coffeeVendingMachineNC.coffeeVendingMachineNC;
import org.evoservice.coffeeVendingMachineNC.coffeeVendingMachineNCSig;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CoffeeVendingMachineFSM_ESTest extends CoffeeVendingMachineFSM_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      coffeeVendingMachineNC coffeeVendingMachineNC0 = new coffeeVendingMachineNC();
      assertNotNull(coffeeVendingMachineNC0);
      
      CoffeeVendingMachineFSM coffeeVendingMachineFSM0 = new CoffeeVendingMachineFSM(coffeeVendingMachineNC0);
      assertFalse(coffeeVendingMachineFSM0.isFinalState());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_1());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_0());
      assertEquals(0, coffeeVendingMachineFSM0.getCoins());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_2());
      assertNotNull(coffeeVendingMachineFSM0);
      
      coffeeVendingMachineNCSig.CoinType coffeeVendingMachineNCSig_CoinType0 = coffeeVendingMachineNCSig.CoinType.ONE;
      coffeeVendingMachineNCSig.Product coffeeVendingMachineNCSig_Product0 = coffeeVendingMachineNCSig.Product.COFFEE;
      coffeeVendingMachineFSM0.stepFSM(coffeeVendingMachineNCSig_CoinType0, coffeeVendingMachineNCSig_Product0);
      assertEquals(1, coffeeVendingMachineFSM0.getCoins());
      assertFalse(coffeeVendingMachineFSM0.isFinalState());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_1());
      assertEquals(9, coffeeVendingMachineFSM0.getProduct_0());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_2());
      
      coffeeVendingMachineFSM0.stepFSM(coffeeVendingMachineNCSig_CoinType0, coffeeVendingMachineNCSig_Product0);
      assertEquals(2, coffeeVendingMachineFSM0.getCoins());
      assertFalse(coffeeVendingMachineFSM0.isFinalState());
      assertEquals(8, coffeeVendingMachineFSM0.getProduct_0());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_1());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_2());
      
      coffeeVendingMachineFSM0.stepFSM(coffeeVendingMachineNCSig_CoinType0, coffeeVendingMachineNCSig_Product0);
      assertEquals(3, coffeeVendingMachineFSM0.getCoins());
      assertEquals(7, coffeeVendingMachineFSM0.getProduct_0());
      assertFalse(coffeeVendingMachineFSM0.isFinalState());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_1());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_2());
      
      coffeeVendingMachineFSM0.stepFSM(coffeeVendingMachineNCSig_CoinType0, coffeeVendingMachineNCSig_Product0);
      assertEquals(4, coffeeVendingMachineFSM0.getCoins());
      assertFalse(coffeeVendingMachineFSM0.isFinalState());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_1());
      assertEquals(6, coffeeVendingMachineFSM0.getProduct_0());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_2());
      
      coffeeVendingMachineFSM0.stepFSM(coffeeVendingMachineNCSig_CoinType0, coffeeVendingMachineNCSig_Product0);
      assertFalse(coffeeVendingMachineFSM0.isFinalState());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_1());
      assertEquals(5, coffeeVendingMachineFSM0.getCoins());
      assertEquals(5, coffeeVendingMachineFSM0.getProduct_0());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_2());
      
      coffeeVendingMachineFSM0.stepFSM(coffeeVendingMachineNCSig_CoinType0, coffeeVendingMachineNCSig_Product0);
      assertFalse(coffeeVendingMachineFSM0.isFinalState());
      assertEquals(6, coffeeVendingMachineFSM0.getCoins());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_1());
      assertEquals(4, coffeeVendingMachineFSM0.getProduct_0());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_2());
      
      coffeeVendingMachineFSM0.stepFSM(coffeeVendingMachineNCSig_CoinType0, coffeeVendingMachineNCSig_Product0);
      assertEquals(7, coffeeVendingMachineFSM0.getCoins());
      assertFalse(coffeeVendingMachineFSM0.isFinalState());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_1());
      assertEquals(3, coffeeVendingMachineFSM0.getProduct_0());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_2());
      
      coffeeVendingMachineFSM0.stepFSM(coffeeVendingMachineNCSig_CoinType0, coffeeVendingMachineNCSig_Product0);
      assertEquals(8, coffeeVendingMachineFSM0.getCoins());
      assertFalse(coffeeVendingMachineFSM0.isFinalState());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_1());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_2());
      assertEquals(2, coffeeVendingMachineFSM0.getProduct_0());
      
      coffeeVendingMachineFSM0.stepFSM(coffeeVendingMachineNCSig_CoinType0, coffeeVendingMachineNCSig_Product0);
      assertFalse(coffeeVendingMachineFSM0.isFinalState());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_1());
      assertEquals(9, coffeeVendingMachineFSM0.getCoins());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_2());
      assertEquals(1, coffeeVendingMachineFSM0.getProduct_0());
      
      coffeeVendingMachineFSM0.stepFSM(coffeeVendingMachineNCSig_CoinType0, coffeeVendingMachineNCSig_Product0);
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_1());
      assertEquals(10, coffeeVendingMachineFSM0.getCoins());
      assertTrue(coffeeVendingMachineFSM0.isFinalState());
      assertEquals(10, coffeeVendingMachineFSM0.getProduct_2());
      assertEquals(0, coffeeVendingMachineFSM0.getProduct_0());
  }
}
