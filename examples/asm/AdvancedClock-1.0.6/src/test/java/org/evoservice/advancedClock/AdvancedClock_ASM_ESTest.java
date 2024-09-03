/*
 * This file was automatically generated by EvoSuite
 * Tue Sep 03 13:16:17 GMT 2024
 */

package org.evoservice.advancedClock;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AdvancedClock_ASM_ESTest extends AdvancedClock_ASM_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AdvancedClock_ASM advancedClock_ASM0 = new AdvancedClock_ASM();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_seconds());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      assertNotNull(advancedClock_ASM0);
      
      advancedClock_ASM0.step();
      assertEquals(1, advancedClock_ASM0.get_seconds());
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(2, advancedClock_ASM0.get_seconds());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(3, advancedClock_ASM0.get_seconds());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      assertEquals(4, advancedClock_ASM0.get_seconds());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      assertEquals(5, advancedClock_ASM0.get_seconds());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      assertEquals(6, advancedClock_ASM0.get_seconds());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      assertEquals(7, advancedClock_ASM0.get_seconds());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      assertEquals(8, advancedClock_ASM0.get_seconds());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      assertEquals(9, advancedClock_ASM0.get_seconds());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      assertEquals(10, advancedClock_ASM0.get_seconds());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      assertEquals(11, advancedClock_ASM0.get_seconds());
      
      advancedClock_ASM0.step();
      assertEquals(12, advancedClock_ASM0.get_seconds());
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      
      advancedClock_ASM0.step();
      assertEquals(13, advancedClock_ASM0.get_seconds());
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      
      advancedClock_ASM0.step();
      assertEquals(14, advancedClock_ASM0.get_seconds());
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      
      advancedClock_ASM0.step();
      assertEquals(15, advancedClock_ASM0.get_seconds());
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(16, advancedClock_ASM0.get_seconds());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      
      advancedClock_ASM0.step();
      assertEquals(17, advancedClock_ASM0.get_seconds());
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(18, advancedClock_ASM0.get_seconds());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(19, advancedClock_ASM0.get_seconds());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      assertEquals(20, advancedClock_ASM0.get_seconds());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      assertEquals(21, advancedClock_ASM0.get_seconds());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      assertEquals(22, advancedClock_ASM0.get_seconds());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      assertEquals(23, advancedClock_ASM0.get_seconds());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      assertEquals(24, advancedClock_ASM0.get_seconds());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      assertEquals(25, advancedClock_ASM0.get_seconds());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      assertEquals(26, advancedClock_ASM0.get_seconds());
      
      advancedClock_ASM0.step();
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      assertEquals(27, advancedClock_ASM0.get_seconds());
      
      advancedClock_ASM0.step();
      assertEquals(28, advancedClock_ASM0.get_seconds());
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      
      advancedClock_ASM0.step();
      assertEquals(29, advancedClock_ASM0.get_seconds());
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      assertFalse(advancedClock_ASM0.isFinalState());
      
      advancedClock_ASM0.step();
      assertTrue(advancedClock_ASM0.isFinalState());
      assertEquals(30, advancedClock_ASM0.get_seconds());
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
      
      advancedClock_ASM0.step();
      assertTrue(advancedClock_ASM0.isFinalState());
      assertEquals(31, advancedClock_ASM0.get_seconds());
      assertEquals(0, advancedClock_ASM0.get_hours());
      assertEquals(0, advancedClock_ASM0.get_minutes());
  }
}
