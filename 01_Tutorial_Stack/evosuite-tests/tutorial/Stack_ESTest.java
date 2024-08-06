/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 06 12:26:19 GMT 2024
 */

package tutorial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.EmptyStackException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import tutorial.Stack;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Stack_ESTest extends Stack_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Stack<Integer> stack0 = new Stack<Integer>();
      assertNotNull(stack0);
      assertTrue(stack0.isEmpty());
      
      boolean boolean0 = stack0.isEmpty();
      assertTrue(boolean0);
      assertTrue(stack0.isEmpty());
      
      Stack<String> stack1 = new Stack<String>();
      assertNotNull(stack1);
      assertTrue(stack1.isEmpty());
      
      stack1.push("");
      assertFalse(stack1.isEmpty());
      
      boolean boolean1 = stack1.isEmpty();
      assertFalse(boolean1);
      assertFalse(stack1.isEmpty());
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Stack<String> stack0 = new Stack<String>();
      assertNotNull(stack0);
      assertTrue(stack0.isEmpty());
      
      stack0.push("");
      assertFalse(stack0.isEmpty());
      
      stack0.push("");
      assertFalse(stack0.isEmpty());
      
      String string0 = stack0.pop();
      assertNotNull(string0);
      assertEquals("", string0);
      assertFalse(stack0.isEmpty());
      
      stack0.push("m:Lk9z94<XS=983$");
      assertFalse(stack0.isEmpty());
      
      Stack<Object> stack1 = new Stack<Object>();
      assertNotNull(stack1);
      assertTrue(stack1.isEmpty());
      
      // Undeclared exception!
      try { 
        stack1.pop();
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("tutorial.Stack", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Stack<Integer> stack0 = new Stack<Integer>();
      assertNotNull(stack0);
      assertTrue(stack0.isEmpty());
      
      stack0.push((Integer) null);
      assertFalse(stack0.isEmpty());
      
      Integer integer0 = stack0.pop();
      assertNull(integer0);
      assertTrue(stack0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Stack<Integer> stack0 = new Stack<Integer>();
      assertNotNull(stack0);
      assertTrue(stack0.isEmpty());
      
      // Undeclared exception!
      try { 
        stack0.pop();
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("tutorial.Stack", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Stack<String> stack0 = new Stack<String>();
      assertNotNull(stack0);
      assertTrue(stack0.isEmpty());
      
      // Undeclared exception!
      try { 
        stack0.pop();
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("tutorial.Stack", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Stack<Object> stack0 = new Stack<Object>();
      assertNotNull(stack0);
      assertTrue(stack0.isEmpty());
      
      stack0.push("");
      assertFalse(stack0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Stack<Object> stack0 = new Stack<Object>();
      assertNotNull(stack0);
      assertTrue(stack0.isEmpty());
      
      boolean boolean0 = stack0.isEmpty();
      assertTrue(boolean0);
      assertTrue(stack0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Stack<Integer> stack0 = new Stack<Integer>();
      assertNotNull(stack0);
      assertTrue(stack0.isEmpty());
      
      Integer integer0 = new Integer(206);
      assertNotNull(integer0);
      assertEquals(206, (int)integer0);
      
      stack0.push(integer0);
      assertFalse(stack0.isEmpty());
      
      Integer integer1 = new Integer(242);
      assertNotNull(integer1);
      assertEquals(242, (int)integer1);
      assertFalse(integer1.equals((Object)integer0));
      
      stack0.push(integer1);
      assertFalse(stack0.isEmpty());
      assertFalse(integer1.equals((Object)integer0));
      
      stack0.push(integer1);
      assertFalse(stack0.isEmpty());
      assertFalse(integer1.equals((Object)integer0));
      
      stack0.push(integer0);
      assertFalse(stack0.isEmpty());
      assertFalse(integer0.equals((Object)integer1));
      
      stack0.push(integer1);
      assertFalse(stack0.isEmpty());
      assertFalse(integer1.equals((Object)integer0));
      
      stack0.push(integer1);
      assertFalse(stack0.isEmpty());
      assertFalse(integer1.equals((Object)integer0));
      
      stack0.push(integer1);
      assertFalse(stack0.isEmpty());
      assertFalse(integer1.equals((Object)integer0));
      
      Integer integer2 = new Integer(206);
      assertNotNull(integer2);
      assertEquals(206, (int)integer2);
      assertTrue(integer2.equals((Object)integer0));
      assertFalse(integer2.equals((Object)integer1));
      
      stack0.push(integer2);
      assertFalse(stack0.isEmpty());
      assertTrue(integer2.equals((Object)integer0));
      assertFalse(integer2.equals((Object)integer1));
      
      stack0.push(integer1);
      assertFalse(stack0.isEmpty());
      assertFalse(integer1.equals((Object)integer0));
      assertFalse(integer1.equals((Object)integer2));
      
      Stack<String> stack1 = new Stack<String>();
      assertNotNull(stack1);
      assertTrue(stack1.isEmpty());
      
      stack1.push("tutorial.Stack");
      assertFalse(stack1.isEmpty());
      
      stack1.push("HVC2cAn-7Sj");
      assertFalse(stack1.isEmpty());
      
      String string0 = stack1.pop();
      assertNotNull(string0);
      assertEquals("HVC2cAn-7Sj", string0);
      assertFalse(stack1.isEmpty());
      
      boolean boolean0 = stack1.isEmpty();
      assertFalse(boolean0);
      assertFalse(stack1.isEmpty());
      
      boolean boolean1 = stack1.isEmpty();
      assertFalse(boolean1);
      assertFalse(stack1.isEmpty());
      assertTrue(boolean1 == boolean0);
      
      Stack<Object> stack2 = new Stack<Object>();
      assertNotNull(stack2);
      assertTrue(stack2.isEmpty());
      
      Integer integer3 = new Integer(206);
      assertNotNull(integer3);
      assertEquals(206, (int)integer3);
      assertTrue(integer3.equals((Object)integer0));
      assertFalse(integer3.equals((Object)integer1));
      assertTrue(integer3.equals((Object)integer2));
      
      stack2.push(integer3);
      assertFalse(stack2.isEmpty());
      assertTrue(integer3.equals((Object)integer0));
      assertFalse(integer3.equals((Object)integer1));
      assertTrue(integer3.equals((Object)integer2));
      
      stack2.push("HVC2cAn-7Sj");
      assertFalse(stack2.isEmpty());
      
      stack1.push("");
      assertFalse(stack1.isEmpty());
      
      Integer integer4 = new Integer((-1788));
      assertNotNull(integer4);
      assertEquals((-1788), (int)integer4);
      assertFalse(integer4.equals((Object)integer1));
      assertFalse(integer4.equals((Object)integer2));
      assertFalse(integer4.equals((Object)integer0));
      assertFalse(integer4.equals((Object)integer3));
      
      stack0.push(integer4);
      assertFalse(stack0.isEmpty());
      assertFalse(integer4.equals((Object)integer1));
      assertFalse(integer4.equals((Object)integer2));
      assertFalse(integer4.equals((Object)integer0));
      assertFalse(integer4.equals((Object)integer3));
      
      Object object0 = stack2.pop();
      assertNotNull(object0);
      assertEquals("HVC2cAn-7Sj", object0);
      assertFalse(stack2.isEmpty());
      assertTrue(object0.equals((Object)string0));
      
      boolean boolean2 = stack1.isEmpty();
      assertFalse(boolean2);
      assertFalse(stack1.isEmpty());
      assertTrue(boolean2 == boolean1);
      assertTrue(boolean2 == boolean0);
      
      boolean boolean3 = stack2.isEmpty();
      assertFalse(boolean3);
      assertFalse(stack2.isEmpty());
      assertTrue(boolean3 == boolean1);
      assertTrue(boolean3 == boolean0);
      assertTrue(boolean3 == boolean2);
      
      stack2.push(stack0);
      assertFalse(stack0.isEmpty());
      assertFalse(stack2.isEmpty());
      
      String string1 = stack1.pop();
      assertNotNull(string1);
      assertEquals("", string1);
      assertFalse(stack1.isEmpty());
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)object0));
      
      Object object1 = new Object();
      assertNotNull(object1);
      
      stack2.push(object1);
      assertFalse(stack2.isEmpty());
  }
}
