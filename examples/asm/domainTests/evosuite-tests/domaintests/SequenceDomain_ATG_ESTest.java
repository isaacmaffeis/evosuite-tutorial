/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 20 19:24:13 GMT 2025
 */

package domaintests;

import org.junit.Test;
import static org.junit.Assert.*;
import domaintests.SequenceDomain_ATG;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SequenceDomain_ATG_ESTest extends SequenceDomain_ATG_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SequenceDomain_ATG sequenceDomain_ATG0 = new SequenceDomain_ATG();
      assertNotNull(sequenceDomain_ATG0);
      
      String string0 = sequenceDomain_ATG0.get_seqAbstractControlledFunction();
      assertEquals("[value1, value2]", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SequenceDomain_ATG sequenceDomain_ATG0 = new SequenceDomain_ATG();
      assertNotNull(sequenceDomain_ATG0);
      
      String string0 = sequenceDomain_ATG0.get_seqEnumControlledFunction();
      assertEquals("[STATE1, STATE2]", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SequenceDomain_ATG sequenceDomain_ATG0 = new SequenceDomain_ATG();
      assertNotNull(sequenceDomain_ATG0);
      
      String string0 = sequenceDomain_ATG0.get_seqRealControlledFunction();
      assertEquals("[5.5, 2.2, 7.6]", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SequenceDomain_ATG sequenceDomain_ATG0 = new SequenceDomain_ATG();
      assertNotNull(sequenceDomain_ATG0);
      
      String string0 = sequenceDomain_ATG0.get_seqCharControlledFunction();
      assertEquals("[a, b, c]", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SequenceDomain_ATG sequenceDomain_ATG0 = new SequenceDomain_ATG();
      assertNotNull(sequenceDomain_ATG0);
      
      String string0 = sequenceDomain_ATG0.get_seqStringControlledFunction();
      assertEquals("[Hello,  , world, !]", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SequenceDomain_ATG sequenceDomain_ATG0 = new SequenceDomain_ATG();
      assertNotNull(sequenceDomain_ATG0);
      
      String string0 = sequenceDomain_ATG0.get_seqBooleanControlledFunction();
      assertEquals("[true, false]", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SequenceDomain_ATG sequenceDomain_ATG0 = new SequenceDomain_ATG();
      assertNotNull(sequenceDomain_ATG0);
      
      String string0 = sequenceDomain_ATG0.get_seqIntegerControlledFunction();
      assertEquals("[2, 2]", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SequenceDomain_ATG sequenceDomain_ATG0 = new SequenceDomain_ATG();
      assertNotNull(sequenceDomain_ATG0);
      
      sequenceDomain_ATG0.set_sequence_seqAbstractMonitoredFunction("[STATE1, STATE2]");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SequenceDomain_ATG sequenceDomain_ATG0 = new SequenceDomain_ATG();
      assertNotNull(sequenceDomain_ATG0);
      
      sequenceDomain_ATG0.set_sequence_seqBooleanMonitoredFunction("");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SequenceDomain_ATG sequenceDomain_ATG0 = new SequenceDomain_ATG();
      assertNotNull(sequenceDomain_ATG0);
      
      sequenceDomain_ATG0.set_sequence_seqIntegerMonitoredFunction(",");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SequenceDomain_ATG sequenceDomain_ATG0 = new SequenceDomain_ATG();
      assertNotNull(sequenceDomain_ATG0);
      
      sequenceDomain_ATG0.set_sequence_seqEnumMonitoredFunction("STATE2");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SequenceDomain_ATG sequenceDomain_ATG0 = new SequenceDomain_ATG();
      assertNotNull(sequenceDomain_ATG0);
      
      sequenceDomain_ATG0.set_sequence_seqRealMonitoredFunction("[5.5, 2.2, 7.6]");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SequenceDomain_ATG sequenceDomain_ATG0 = new SequenceDomain_ATG();
      assertNotNull(sequenceDomain_ATG0);
      
      sequenceDomain_ATG0.set_sequence_seqCharMonitoredFunction("[true, false]");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SequenceDomain_ATG sequenceDomain_ATG0 = new SequenceDomain_ATG();
      assertNotNull(sequenceDomain_ATG0);
      
      sequenceDomain_ATG0.set_sequence_seqStringMonitoredFunction("^*ef?SV.");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SequenceDomain_ATG sequenceDomain_ATG0 = new SequenceDomain_ATG();
      assertNotNull(sequenceDomain_ATG0);
      
      sequenceDomain_ATG0.step();
  }
}
