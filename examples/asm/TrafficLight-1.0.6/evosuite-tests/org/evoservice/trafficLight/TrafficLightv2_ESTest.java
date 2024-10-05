/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 04 20:18:12 GMT 2024
 */

package org.evoservice.trafficLight;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evoservice.trafficLight.TrafficLightv2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TrafficLightv2_ESTest extends TrafficLightv2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TrafficLightv2 trafficLightv2_0 = new TrafficLightv2();
      assertNotNull(trafficLightv2_0);
      assertEquals(0, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(1, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(2, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(3, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(4, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(5, trafficLightv2_0.get_count());
      
      trafficLightv2_0.set_Pedestriand(true);
      assertEquals(5, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(6, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(0, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(0, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(1, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(2, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(3, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(4, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(5, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(6, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(0, trafficLightv2_0.get_count());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TrafficLightv2 trafficLightv2_0 = new TrafficLightv2();
      assertNotNull(trafficLightv2_0);
      assertEquals(0, trafficLightv2_0.get_count());
      
      trafficLightv2_0.set_Pedestriand(false);
      assertEquals(0, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(1, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(2, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(3, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(4, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(5, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(6, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(0, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(1, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(2, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(3, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(4, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(5, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(6, trafficLightv2_0.get_count());
      
      trafficLightv2_0.set_Pedestriand(true);
      assertEquals(6, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(0, trafficLightv2_0.get_count());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TrafficLightv2 trafficLightv2_0 = new TrafficLightv2();
      assertNotNull(trafficLightv2_0);
      assertEquals(0, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(1, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(2, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(3, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(4, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(5, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(6, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(0, trafficLightv2_0.get_count());
      
      trafficLightv2_0.set_Pedestriand(false);
      assertEquals(0, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(1, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(2, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(3, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(4, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(5, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(6, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(0, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(1, trafficLightv2_0.get_count());
      
      trafficLightv2_0.step();
      assertEquals(0, trafficLightv2_0.get_count());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TrafficLightv2 trafficLightv2_0 = new TrafficLightv2();
      assertNotNull(trafficLightv2_0);
      assertEquals(0, trafficLightv2_0.get_count());
      
      int int0 = trafficLightv2_0.get_count();
      assertEquals(0, int0);
      assertEquals(0, trafficLightv2_0.get_count());
  }
}