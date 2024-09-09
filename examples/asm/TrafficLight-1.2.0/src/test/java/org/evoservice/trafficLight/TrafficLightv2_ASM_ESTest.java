/*
 * This file was automatically generated by EvoSuite
 * Mon Sep 09 07:14:53 GMT 2024
 */

package org.evoservice.trafficLight;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TrafficLightv2_ASM_ESTest extends TrafficLightv2_ASM_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TrafficLightv2_ASM trafficLightv2_ASM0 = new TrafficLightv2_ASM();
      assertEquals(0, trafficLightv2_ASM0.get_count());
      assertEquals(TrafficLightv2Sig.States.RED, trafficLightv2_ASM0.get_status());
      assertNotNull(trafficLightv2_ASM0);
      
      trafficLightv2_ASM0.step(false);
      assertEquals(1, trafficLightv2_ASM0.get_count());
      assertEquals(TrafficLightv2Sig.States.RED, trafficLightv2_ASM0.get_status());
      
      trafficLightv2_ASM0.step(false);
      assertEquals(2, trafficLightv2_ASM0.get_count());
      assertEquals(TrafficLightv2Sig.States.RED, trafficLightv2_ASM0.get_status());
      
      trafficLightv2_ASM0.step(false);
      assertEquals(3, trafficLightv2_ASM0.get_count());
      assertEquals(TrafficLightv2Sig.States.RED, trafficLightv2_ASM0.get_status());
      
      trafficLightv2_ASM0.step(false);
      assertEquals(4, trafficLightv2_ASM0.get_count());
      assertEquals(TrafficLightv2Sig.States.RED, trafficLightv2_ASM0.get_status());
      
      trafficLightv2_ASM0.step(false);
      assertEquals(5, trafficLightv2_ASM0.get_count());
      assertEquals(TrafficLightv2Sig.States.RED, trafficLightv2_ASM0.get_status());
      
      trafficLightv2_ASM0.step(false);
      assertEquals(6, trafficLightv2_ASM0.get_count());
      assertEquals(TrafficLightv2Sig.States.RED, trafficLightv2_ASM0.get_status());
      
      trafficLightv2_ASM0.step(false);
      assertEquals(0, trafficLightv2_ASM0.get_count());
      assertEquals(TrafficLightv2Sig.States.GREEN, trafficLightv2_ASM0.get_status());
      
      trafficLightv2_ASM0.step(false);
      assertEquals(1, trafficLightv2_ASM0.get_count());
      assertEquals(TrafficLightv2Sig.States.GREEN, trafficLightv2_ASM0.get_status());
      
      trafficLightv2_ASM0.step(false);
      assertEquals(2, trafficLightv2_ASM0.get_count());
      assertEquals(TrafficLightv2Sig.States.GREEN, trafficLightv2_ASM0.get_status());
      
      trafficLightv2_ASM0.step(false);
      assertEquals(3, trafficLightv2_ASM0.get_count());
      assertEquals(TrafficLightv2Sig.States.GREEN, trafficLightv2_ASM0.get_status());
      
      trafficLightv2_ASM0.step(false);
      assertEquals(4, trafficLightv2_ASM0.get_count());
      assertEquals(TrafficLightv2Sig.States.GREEN, trafficLightv2_ASM0.get_status());
      
      trafficLightv2_ASM0.step(false);
      assertEquals(5, trafficLightv2_ASM0.get_count());
      assertEquals(TrafficLightv2Sig.States.GREEN, trafficLightv2_ASM0.get_status());
      
      trafficLightv2_ASM0.step(false);
      assertEquals(6, trafficLightv2_ASM0.get_count());
      assertEquals(TrafficLightv2Sig.States.GREEN, trafficLightv2_ASM0.get_status());
      
      trafficLightv2_ASM0.step(false);
      assertEquals(0, trafficLightv2_ASM0.get_count());
      assertEquals(TrafficLightv2Sig.States.YELLOW, trafficLightv2_ASM0.get_status());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TrafficLightv2_ASM trafficLightv2_ASM0 = new TrafficLightv2_ASM();
      assertEquals(TrafficLightv2Sig.States.RED, trafficLightv2_ASM0.get_status());
      assertEquals(0, trafficLightv2_ASM0.get_count());
      assertNotNull(trafficLightv2_ASM0);
      
      trafficLightv2_ASM0.step(true);
      assertEquals(TrafficLightv2Sig.States.RED, trafficLightv2_ASM0.get_status());
      assertEquals(1, trafficLightv2_ASM0.get_count());
      
      trafficLightv2_ASM0.step(true);
      assertEquals(TrafficLightv2Sig.States.RED, trafficLightv2_ASM0.get_status());
      assertEquals(2, trafficLightv2_ASM0.get_count());
      
      trafficLightv2_ASM0.step(true);
      assertEquals(TrafficLightv2Sig.States.RED, trafficLightv2_ASM0.get_status());
      assertEquals(3, trafficLightv2_ASM0.get_count());
      
      trafficLightv2_ASM0.step(true);
      assertEquals(4, trafficLightv2_ASM0.get_count());
      assertEquals(TrafficLightv2Sig.States.RED, trafficLightv2_ASM0.get_status());
      
      trafficLightv2_ASM0.step(true);
      assertEquals(5, trafficLightv2_ASM0.get_count());
      assertEquals(TrafficLightv2Sig.States.RED, trafficLightv2_ASM0.get_status());
      
      trafficLightv2_ASM0.step(true);
      assertEquals(6, trafficLightv2_ASM0.get_count());
      assertEquals(TrafficLightv2Sig.States.RED, trafficLightv2_ASM0.get_status());
      
      trafficLightv2_ASM0.step(true);
      assertEquals(TrafficLightv2Sig.States.GREEN, trafficLightv2_ASM0.get_status());
      assertEquals(0, trafficLightv2_ASM0.get_count());
      
      trafficLightv2_ASM0.step(true);
      assertEquals(TrafficLightv2Sig.States.PENDING, trafficLightv2_ASM0.get_status());
      assertEquals(0, trafficLightv2_ASM0.get_count());
  }
}
