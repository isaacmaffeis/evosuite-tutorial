/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 04 09:54:40 GMT 2024
 */

package org.evoservice.RegistroDiCassa;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class RegistroDiCassav4_ASM_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) System.getProperties().clone();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.evoservice.RegistroDiCassa.RegistroDiCassav4_ASM"; 
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
    System.setProperty("file.encoding", "Cp1252");
    System.setProperty("java.awt.headless", "true");
    System.setProperty("java.io.tmpdir", "C:\\Users\\isaac\\AppData\\Local\\Temp\\");
    System.setProperty("user.country", "IT");
    System.setProperty("user.dir", "C:\\Users\\isaac\\Documents\\GitHub\\evosuite-tutorial\\examples\\asm\\RegistroDiCassa-1.0.6");
    System.setProperty("user.home", "C:\\Users\\isaac");
    System.setProperty("user.language", "it");
    System.setProperty("user.name", "isaac");
    System.setProperty("user.timezone", "Europe/Berlin");
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RegistroDiCassav4_ASM_ESTest_scaffolding.class.getClassLoader() ,
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$Fun0Ctrl",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$QuantitaDomain",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4_ASM",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$Stati",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$Servizio",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$Pizza",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$AggiungiPizza",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$Fun0",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4_ASM$1",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$PrezzoDomain",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$FunN",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$FunNCtrl",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$SelezioneTipoDiPizza"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RegistroDiCassav4_ASM_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4_ASM",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$SelezioneTipoDiPizza",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$AggiungiPizza",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$Servizio",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$Stati",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4_ASM$1",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$PrezzoDomain",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$QuantitaDomain",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$Fun0Ctrl",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$Fun0",
      "org.evoservice.RegistroDiCassa.RegistroDiCassav4Sig$Pizza"
    );
  }
}
