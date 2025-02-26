/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 15 13:08:19 GMT 2025
 */

package domaintests;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import domaintests.AbstractTD;
import domaintests.AbstractTD_ATG;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractTD_ATG_ESTest extends AbstractTD_ATG_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      abstractTD_ATG0.set_abstracttoconcreteMonitoredFunction_fromDomain_value2(0);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      String string0 = abstractTD_ATG0.get_abstracttoabstractControlledFunction_fromDomain_value2();
      assertEquals("abstract_another2", string0);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(string0);
      
      Double double0 = abstractTD_ATG0.get_abstracttorealControlledFunction_fromDomain_value2();
      assertEquals(2.2, (double)double0, 0.01);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(double0);
      
      Character character0 = abstractTD_ATG0.get_abstracttocharControlledFunction_fromDomain_value1();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNull(character0);
      
      String string1 = abstractTD_ATG0.get_enumtoabstractControlledFunction_fromDomain_STATE3();
      assertEquals("abstract_value1", string1);
      assertFalse(string1.equals((Object)string0));
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(string1);
      
      String string2 = abstractTD_ATG0.get_abstracttoabstractControlledFunction_fromDomain_value2();
      assertEquals("abstract_another2", string2);
      assertTrue(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(string2);
      
      Integer integer0 = abstractTD_ATG0.get_abstracttointegerControlledFunction_fromDomain_value1();
      assertEquals(10, (int)integer0);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(integer0);
      
      String string3 = abstractTD_ATG0.get_abstracttoabstractControlledFunction_fromDomain_value2();
      assertEquals("abstract_another2", string3);
      assertTrue(string3.equals((Object)string2));
      assertFalse(string3.equals((Object)string1));
      assertTrue(string3.equals((Object)string0));
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(string3);
      
      Character character1 = abstractTD_ATG0.get_abstracttocharControlledFunction_fromDomain_value1();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNull(character1);
      
      Integer integer1 = abstractTD_ATG0.get_abstracttointegerControlledFunction_fromDomain_value2();
      assertEquals(20, (int)integer1);
      assertFalse(integer1.equals((Object)integer0));
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(integer1);
      
      // Undeclared exception!
      try { 
        abstractTD_ATG0.set_abstracttoconcreteMonitoredFunction_fromDomain_value2((-164));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -164
         //
         verifyException("java.util.Arrays$ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      abstractTD_ATG0.set_abstracttointegerMonitoredFunction_fromDomain_value1(0);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      AbstractTD.EnumDomain abstractTD_EnumDomain0 = AbstractTD.EnumDomain.STATE3;
      abstractTD_ATG0.set_abstracttoenumMonitoredFunction_fromDomain_value2(abstractTD_EnumDomain0);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      String string0 = abstractTD_ATG0.get_enumtoabstractControlledFunction_fromDomain_STATE2();
      assertEquals("abstract_value2", string0);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(string0);
      
      Double double0 = abstractTD_ATG0.get_abstracttorealControlledFunction_fromDomain_value2();
      assertEquals(2.2, (double)double0, 0.01);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(double0);
      
      AbstractTD.EnumDomain abstractTD_EnumDomain0 = AbstractTD.EnumDomain.STATE2;
      abstractTD_ATG0.set_abstracttoenumMonitoredFunction_fromDomain_value1(abstractTD_EnumDomain0);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      
      abstractTD_ATG0.set_abstracttoconcreteMonitoredFunction_fromDomain_value1(0);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      abstractTD_ATG0.set_abstracttocharMonitoredFunction_fromDomain_value1('x');
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      abstractTD_ATG0.set_abstracttostringMonitoredFunction_fromDomain_value1("hello world");
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      Character character0 = abstractTD_ATG0.get_abstracttocharControlledFunction_fromDomain_value2();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNull(character0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      abstractTD_ATG0.set_abstracttorealMonitoredFunction_fromDomain_value1((-1398.9779758));
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      abstractTD_ATG0.set_stringMonitoredFunction("abstract_value1");
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      abstractTD_ATG0.set_abstracttobooleanMonitoredFunction_fromDomain_value2(false);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      Boolean boolean0 = abstractTD_ATG0.get_abstracttobooleanControlledFunction_fromDomain_value2();
      assertFalse(boolean0);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      abstractTD_ATG0.set_abstract_abstracttoabstractMonitoredFunction_fromDomain_value1("value2");
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      Double double0 = abstractTD_ATG0.get_abstracttorealControlledFunction_fromDomain_value1();
      assertEquals(2.2, (double)double0, 0.01);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(double0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      Integer integer0 = abstractTD_ATG0.get_abstracttoconcreteControlledFunction_fromDomain_value2();
      assertEquals(5, (int)integer0);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      abstractTD_ATG0.set_abstract_abstractMonitoredFunction("hello world");
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      abstractTD_ATG0.set_abstracttorealMonitoredFunction_fromDomain_value2(0.0);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      abstractTD_ATG0.set_abstract_enumtoabstractMonitoredFunction_fromDomain_STATE2("value2");
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      abstractTD_ATG0.set_abstracttobooleanMonitoredFunction_fromDomain_value1(true);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      
      Integer integer0 = abstractTD_ATG0.get_abstracttoconcreteControlledFunction_fromDomain_value1();
      assertEquals(5, (int)integer0);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(integer0);
      
      Integer integer1 = abstractTD_ATG0.get_abstracttointegerControlledFunction_fromDomain_value1();
      assertEquals(10, (int)integer1);
      assertFalse(integer1.equals((Object)integer0));
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(integer1);
      
      abstractTD_ATG0.set_abstract_enumtoabstractMonitoredFunction_fromDomain_STATE2("8b");
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      
      String string0 = abstractTD_ATG0.get_enumtoabstractControlledFunction_fromDomain_STATE3();
      assertEquals("abstract_value1", string0);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(string0);
      
      String string1 = abstractTD_ATG0.get_enumtoabstractControlledFunction_fromDomain_STATE2();
      assertEquals("abstract_value2", string1);
      assertFalse(string1.equals((Object)string0));
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(string1);
      
      String string2 = abstractTD_ATG0.get_stringControlledFunction();
      assertEquals("Hello world", string2);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(string2);
      
      Integer integer2 = abstractTD_ATG0.get_abstracttoconcreteControlledFunction_fromDomain_value1();
      assertEquals(5, (int)integer2);
      assertFalse(integer2.equals((Object)integer1));
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(integer2);
      
      abstractTD_ATG0.set_abstracttobooleanMonitoredFunction_fromDomain_value2(true);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      
      String string3 = abstractTD_ATG0.get_abstracttostringControlledFunction_fromDomain_value2();
      assertEquals("hello world", string3);
      assertFalse(string3.equals((Object)string0));
      assertFalse(string3.equals((Object)string1));
      assertFalse(string3.equals((Object)string2));
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(string3);
      
      Double double0 = abstractTD_ATG0.get_abstracttorealControlledFunction_fromDomain_value2();
      assertEquals(2.2, (double)double0, 0.01);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(double0);
      
      abstractTD_ATG0.set_abstract_enumtoabstractMonitoredFunction_fromDomain_STATE3("");
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      
      abstractTD_ATG0.set_abstract_enumtoabstractMonitoredFunction_fromDomain_STATE3("hello world");
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      
      Double double1 = abstractTD_ATG0.get_abstracttorealControlledFunction_fromDomain_value1();
      assertEquals(2.2, (double)double1, 0.01);
      assertEquals((double)double1, (double)double0, 0.01);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(double1);
      
      String string4 = abstractTD_ATG0.get_enumtoabstractControlledFunction_fromDomain_STATE3();
      assertEquals("abstract_value1", string4);
      assertFalse(string4.equals((Object)string3));
      assertFalse(string4.equals((Object)string2));
      assertTrue(string4.equals((Object)string0));
      assertFalse(string4.equals((Object)string1));
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(string4);
      
      Integer integer3 = abstractTD_ATG0.get_abstracttointegerControlledFunction_fromDomain_value1();
      assertEquals(10, (int)integer3);
      assertFalse(integer3.equals((Object)integer0));
      assertFalse(integer3.equals((Object)integer2));
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(integer3);
      
      Boolean boolean0 = abstractTD_ATG0.get_abstracttobooleanControlledFunction_fromDomain_value1();
      assertTrue(boolean0);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(boolean0);
      
      abstractTD_ATG0.set_abstract_enumtoabstractMonitoredFunction_fromDomain_STATE1("zEUF-^hX7XQBk^Z'jp");
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      
      abstractTD_ATG0.set_abstracttocharMonitoredFunction_fromDomain_value2('a');
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      
      abstractTD_ATG0.set_abstract_abstractMonitoredFunction("hello world");
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      
      String string5 = abstractTD_ATG0.get_enumtoabstractControlledFunction_fromDomain_STATE2();
      assertEquals("abstract_value2", string5);
      assertTrue(string5.equals((Object)string1));
      assertFalse(string5.equals((Object)string0));
      assertFalse(string5.equals((Object)string3));
      assertFalse(string5.equals((Object)string4));
      assertFalse(string5.equals((Object)string2));
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(string5);
      
      String string6 = abstractTD_ATG0.get_abstracttostringControlledFunction_fromDomain_value2();
      assertEquals("hello world", string6);
      assertFalse(string6.equals((Object)string2));
      assertFalse(string6.equals((Object)string1));
      assertFalse(string6.equals((Object)string5));
      assertFalse(string6.equals((Object)string0));
      assertFalse(string6.equals((Object)string4));
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(string6);
      
      String string7 = abstractTD_ATG0.get_abstracttoabstractControlledFunction_fromDomain_value2();
      assertEquals("abstract_another2", string7);
      assertFalse(string7.equals((Object)string1));
      assertFalse(string7.equals((Object)string0));
      assertFalse(string7.equals((Object)string5));
      assertFalse(string7.equals((Object)string3));
      assertFalse(string7.equals((Object)string2));
      assertFalse(string7.equals((Object)string4));
      assertFalse(string7.equals((Object)string6));
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(string7);
      
      String string8 = abstractTD_ATG0.get_abstractControlledFunction();
      assertEquals("abstract_value1", string8);
      assertFalse(string8.equals((Object)string3));
      assertFalse(string8.equals((Object)string6));
      assertTrue(string8.equals((Object)string0));
      assertFalse(string8.equals((Object)string5));
      assertFalse(string8.equals((Object)string2));
      assertFalse(string8.equals((Object)string1));
      assertTrue(string8.equals((Object)string4));
      assertFalse(string8.equals((Object)string7));
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(string8);
      
      String string9 = abstractTD_ATG0.get_enumtoabstractControlledFunction_fromDomain_STATE1();
      assertEquals("abstract_value1", string9);
      assertFalse(string9.equals((Object)string6));
      assertFalse(string9.equals((Object)string7));
      assertTrue(string9.equals((Object)string4));
      assertTrue(string9.equals((Object)string0));
      assertFalse(string9.equals((Object)string5));
      assertTrue(string9.equals((Object)string8));
      assertFalse(string9.equals((Object)string1));
      assertFalse(string9.equals((Object)string3));
      assertFalse(string9.equals((Object)string2));
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(string9);
      
      Character character0 = abstractTD_ATG0.get_abstracttocharControlledFunction_fromDomain_value2();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNull(character0);
      
      abstractTD_ATG0.set_abstracttobooleanMonitoredFunction_fromDomain_value2(false);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      
      abstractTD_ATG0.set_abstracttobooleanMonitoredFunction_fromDomain_value2(false);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      
      String string10 = abstractTD_ATG0.get_abstracttoabstractControlledFunction_fromDomain_value1();
      assertEquals("abstract_another1", string10);
      assertFalse(string10.equals((Object)string2));
      assertFalse(string10.equals((Object)string8));
      assertFalse(string10.equals((Object)string1));
      assertFalse(string10.equals((Object)string7));
      assertFalse(string10.equals((Object)string5));
      assertFalse(string10.equals((Object)string3));
      assertFalse(string10.equals((Object)string4));
      assertFalse(string10.equals((Object)string6));
      assertFalse(string10.equals((Object)string0));
      assertFalse(string10.equals((Object)string9));
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(string10);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      abstractTD_ATG0.get_abstracttoenumControlledFunction_fromDomain_value1();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      abstractTD_ATG0.step();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      abstractTD_ATG0.set_abstract_abstracttoabstractMonitoredFunction_fromDomain_value2("");
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      abstractTD_ATG0.set_abstracttointegerMonitoredFunction_fromDomain_value2((-1));
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      abstractTD_ATG0.get_abstracttoenumControlledFunction_fromDomain_value2();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      abstractTD_ATG0.set_abstracttostringMonitoredFunction_fromDomain_value2("hello world");
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AbstractTD_ATG abstractTD_ATG0 = new AbstractTD_ATG();
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(abstractTD_ATG0);
      
      String string0 = abstractTD_ATG0.get_abstracttostringControlledFunction_fromDomain_value1();
      assertEquals("hello world", string0);
      assertEquals("Hello world", abstractTD_ATG0.get_stringControlledFunction());
      assertNotNull(string0);
  }
}
