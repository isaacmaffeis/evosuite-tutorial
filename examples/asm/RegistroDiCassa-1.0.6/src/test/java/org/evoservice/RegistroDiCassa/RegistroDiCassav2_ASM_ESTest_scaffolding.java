/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Aug 26 21:33:30 GMT 2024
 */

package org.evoservice.RegistroDiCassa;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;

@EvoSuiteClassExclude
public class RegistroDiCassav2_ASM_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.evoservice.RegistroDiCassa.RegistroDiCassav2_ASM"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
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
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\isaac\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "IT"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\isaac\\Documents\\GitHub\\evosuite-tutorial\\examples\\asm\\RegistroDiCassa-1.0.6"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\isaac"); 
    java.lang.System.setProperty("user.language", "it"); 
    java.lang.System.setProperty("user.name", "isaac"); 
    java.lang.System.setProperty("user.timezone", "Europe/Berlin"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RegistroDiCassav2_ASM_ESTest_scaffolding.class.getClassLoader() ,
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig$Pizza",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig$Fun0Ctrl",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig$Stati",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2_ASM",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig$AggiungiPizza",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig$PrezzoDomain",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig$FunNCtrl",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig$QuantitaDomain",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig$Servizio",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig$FunN",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig$SelezioneTipoDiPizza",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig$Fun0"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RegistroDiCassav2_ASM_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2_ASM",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig$PrezzoDomain",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig$QuantitaDomain",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig$Fun0Ctrl",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig$Fun0",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig$Pizza",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav2Sig$Stati"
    );
  }
}
