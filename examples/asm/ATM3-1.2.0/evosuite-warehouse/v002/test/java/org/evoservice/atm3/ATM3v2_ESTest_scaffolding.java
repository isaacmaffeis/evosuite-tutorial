/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 08 22:25:55 GMT 2024
 */

package org.evoservice.atm3;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ATM3v2_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) System.getProperties().clone();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.evoservice.atm3.ATM3v2"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = SandboxMode.RECOMMENDED;
    Sandbox.initializeSecurityManagerForSUT();
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    System.setProperties((java.util.Properties) defaultProperties.clone());
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    Sandbox.goingToExecuteSUTCode();
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    Sandbox.doneWithExecutingSUTCode();
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    System.setProperties((java.util.Properties) defaultProperties.clone());
    System.setProperty("user.dir", "C:\\Users\\isaac\\Documents\\GitHub\\evosuite-tutorial\\examples\\asm\\ATM3-1.2.0");
    System.setProperty("java.io.tmpdir", "C:\\Users\\isaac\\AppData\\Local\\Temp\\");
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ATM3v2_ESTest_scaffolding.class.getClassLoader() ,
      "org.evoservice.atm3.ATM3v2$Service",
      "org.evoservice.atm3.ATM3v2",
      "org.evoservice.atm3.ATM3v2$NumCard",
      "org.evoservice.atm3.ATM3v2$State",
      "org.evoservice.atm3.ATM3v2$Fun0",
      "org.evoservice.atm3.ATM3v2$FunN",
      "org.evoservice.atm3.ATM3v2$Fun0Ctrl",
      "org.evoservice.atm3.ATM3v2$MoneySize",
      "org.evoservice.atm3.ATM3v2$MoneySizeSelection",
      "org.evoservice.atm3.ATM3v2$FunNCtrl"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ATM3v2_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.evoservice.atm3.ATM3v2",
      "org.evoservice.atm3.ATM3v2$MoneySize",
      "org.evoservice.atm3.ATM3v2$Fun0Ctrl",
      "org.evoservice.atm3.ATM3v2$FunNCtrl",
      "org.evoservice.atm3.ATM3v2$Fun0",
      "org.evoservice.atm3.ATM3v2$NumCard",
      "org.evoservice.atm3.ATM3v2$State",
      "org.evoservice.atm3.ATM3v2$MoneySizeSelection",
      "org.evoservice.atm3.ATM3v2$Service"
    );
  }
}
