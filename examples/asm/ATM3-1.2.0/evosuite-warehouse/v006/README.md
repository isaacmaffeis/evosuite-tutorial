# V005
In this version I tested the generated class directly:
- I incorporated the abstract signature class directly into the main class,
  in this way I could make all the methods private except the set, step and get methods which are
  the only public ones and visible from evosuite
- Criterion LINE:BRANCH
- version with monitored setters
- turned on all the translator option in asmetal2java (`-Dformatter=true -DshuffleRandom=true
  -DoptimizeSeqMacroRule=true`)
- fixed the .value issue in the java generator (manually, only in this class)

I added a final state condition, but this doesn't seem to help evosuite much, 
the test cases are longer but the coverage is the same 
and the final state condition is not reached.

## Problems

with the new version of the java class with the translator options active the coverage is improved 
because unused methods are removed, but we still have the same problem as before.

A single manually built test case achieves more coverage than the entire evosuite suite.

## How to
```shell
mvn compile
```
```shell
mvn dependency:copy-dependencies -DincludeScope=runtime
```
```shell
java -jar ../../../resources/evosuite-1.2.0.jar -setup target/classes target/dependency/commons-collections-3.2.2.jar
```
```shell
java -jar ../../../resources/evosuite-1.2.0.jar -class org.evoservice.atm3.ATM3v2 -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=150 -generateMOSuite
```
### log
* EvoSuite 1.2.0
* Going to generate test cases for class: org.evoservice.atm3.ATM3v2
* Starting Client-0
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\evosuite-files\evosuite.properties
* Connecting to master process on port 9031
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.atm3.ATM3v2
* Test criteria:
  - Line Coverage
  - Branch Coverage
    [Progress:>                             0%] [Cov:>                                  0%]* Total number of test goals for DYNAMOSA: 408
* Using seed 1728476118897
* Starting evolution
* Initial Number of Goals in DynaMOSA = 277 / 408
  [Progress:==============================100%] [Cov:=====================>             62%]
* Search finished after 153s and 12 generations, 2571 statements, best individual has fitness: 134.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
  [MASTER] 14:19:18.382 [logback-1] WARN  TestSuiteMinimizer - Minimization timeout. Roll back to original test suite
* Coverage of criterion LINE: 79%
* Total number of goals: 259
* Number of covered goals: 204
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 47%
* Total number of goals: 149
* Number of covered goals: 70
* Generated 31 tests with total length 295
* Resulting test suite's coverage: 63% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
  [MASTER] 14:19:31.878 [logback-2] ERROR AgentLoader - Exception class java.lang.IllegalStateException: Error during attachment using: org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent$AttachmentProvider$Compound@2268f026 , cause class java.lang.reflect.InvocationTargetException null
  java.lang.IllegalStateException: Error during attachment using: org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent$AttachmentProvider$Compound@2268f026
  at org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent.install(ByteBuddyAgent.java:636)
  at org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent.attach(ByteBuddyAgent.java:296)
  at org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent.attach(ByteBuddyAgent.java:261)
  at org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent.attach(ByteBuddyAgent.java:243)
  at org.evosuite.runtime.agent.AgentLoader.attachAgent(AgentLoader.java:129)
  at org.evosuite.runtime.agent.AgentLoader.loadAgent(AgentLoader.java:90)
  at org.evosuite.runtime.agent.InstrumentingAgent.initialize(InstrumentingAgent.java:102)
  at org.evosuite.runtime.EvoRunner.getClass(EvoRunner.java:101)
  at org.evosuite.runtime.EvoRunner.<init>(EvoRunner.java:76)
  at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
  at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
  at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
  at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
  at org.junit.internal.builders.AnnotatedBuilder.buildRunner(AnnotatedBuilder.java:104)
  at org.junit.internal.builders.AnnotatedBuilder.runnerForClass(AnnotatedBuilder.java:86)
  at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
  at org.junit.internal.builders.AllDefaultPossibilitiesBuilder.runnerForClass(AllDefaultPossibilitiesBuilder.java:37)
  at org.junit.runner.Computer.getRunner(Computer.java:50)
  at org.junit.runner.Computer$1.runnerForClass(Computer.java:31)
  at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
  at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:125)
  at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:111)
  at org.junit.runners.Suite.<init>(Suite.java:81)
  at org.junit.runner.Computer$2.<init>(Computer.java:33)
  at org.junit.runner.Computer.getSuite(Computer.java:28)
  at org.junit.runner.Request.classes(Request.java:77)
  at org.junit.runner.JUnitCore.run(JUnitCore.java:105)
  at org.junit.runner.JUnitCore.run(JUnitCore.java:94)
  at org.evosuite.junit.JUnitAnalyzer$JUnit4Analyzing.runJUnitOnCurrentProcess(JUnitAnalyzer.java:713)
  at org.evosuite.junit.JUnitAnalyzer.runJUnitOnCurrentProcess(JUnitAnalyzer.java:291)
  at org.evosuite.junit.JUnitAnalyzer.runTests(JUnitAnalyzer.java:286)
  at org.evosuite.junit.JUnitAnalyzer.handleTestsThatAreUnstable(JUnitAnalyzer.java:187)
  at org.evosuite.TestSuiteGenerator.compileAndCheckTests(TestSuiteGenerator.java:571)
  at org.evosuite.TestSuiteGenerator.postProcessTests(TestSuiteGenerator.java:516)
  at org.evosuite.TestSuiteGenerator.generateTestSuite(TestSuiteGenerator.java:218)
  at org.evosuite.rmi.service.ClientNodeImpl.lambda$startNewSearch$0(ClientNodeImpl.java:140)
  at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
  at java.util.concurrent.FutureTask.run(FutureTask.java:266)
  at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
  at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
  at java.lang.Thread.run(Thread.java:750)
  Caused by: java.lang.reflect.InvocationTargetException: null
  at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
  at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
  at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
  at java.lang.reflect.Method.invoke(Method.java:498)
  at org.evosuite.shaded.net.bytebuddy.agent.Attacher.install(Attacher.java:106)
  at org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent.install(ByteBuddyAgent.java:631)
  ... 40 common frames omitted
  Caused by: com.sun.tools.attach.AttachNotSupportedException: no providers installed
  at com.sun.tools.attach.VirtualMachine.attach(VirtualMachine.java:203)
  ... 46 common frames omitted
  [MASTER] 14:19:36.880 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
  VM: 6300@IsaacPC
  PID: 6300

[MASTER] 14:19:36.933 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.IllegalStateException: Error during attachment using: org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent$AttachmentProvider$Compound@2268f026
[MASTER] 14:19:37.112 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@43e96d69
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@43e96d69
at org.evosuite.runtime.agent.AgentLoader.attachAgent(AgentLoader.java:123)
at org.evosuite.runtime.agent.AgentLoader.loadAgent(AgentLoader.java:90)
at org.evosuite.runtime.agent.InstrumentingAgent.initialize(InstrumentingAgent.java:102)
at org.evosuite.runtime.EvoRunner.getClass(EvoRunner.java:101)
at org.evosuite.runtime.EvoRunner.<init>(EvoRunner.java:76)
at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
at org.junit.internal.builders.AnnotatedBuilder.buildRunner(AnnotatedBuilder.java:104)
at org.junit.internal.builders.AnnotatedBuilder.runnerForClass(AnnotatedBuilder.java:86)
at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
at org.junit.internal.builders.AllDefaultPossibilitiesBuilder.runnerForClass(AllDefaultPossibilitiesBuilder.java:37)
at org.junit.runner.Computer.getRunner(Computer.java:50)
at org.junit.runner.Computer$1.runnerForClass(Computer.java:31)
at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:125)
at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:111)
at org.junit.runners.Suite.<init>(Suite.java:81)
at org.junit.runner.Computer$2.<init>(Computer.java:33)
at org.junit.runner.Computer.getSuite(Computer.java:28)
at org.junit.runner.Request.classes(Request.java:77)
at org.junit.runner.JUnitCore.run(JUnitCore.java:105)
at org.junit.runner.JUnitCore.run(JUnitCore.java:94)
at org.evosuite.junit.JUnitAnalyzer$JUnit4Analyzing.runJUnitOnCurrentProcess(JUnitAnalyzer.java:713)
at org.evosuite.junit.JUnitAnalyzer.runJUnitOnCurrentProcess(JUnitAnalyzer.java:291)
at org.evosuite.junit.JUnitAnalyzer.runTests(JUnitAnalyzer.java:286)
at org.evosuite.junit.JUnitAnalyzer.handleTestsThatAreUnstable(JUnitAnalyzer.java:187)
at org.evosuite.TestSuiteGenerator.compileAndCheckTests(TestSuiteGenerator.java:571)
at org.evosuite.TestSuiteGenerator.postProcessTests(TestSuiteGenerator.java:516)
at org.evosuite.TestSuiteGenerator.generateTestSuite(TestSuiteGenerator.java:218)
at org.evosuite.rmi.service.ClientNodeImpl.lambda$startNewSearch$0(ClientNodeImpl.java:140)
at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
at java.util.concurrent.FutureTask.run(FutureTask.java:266)
at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
at java.lang.Thread.run(Thread.java:750)
[MASTER] 14:19:42.113 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 6300@IsaacPC
PID: 6300

[MASTER] 14:19:42.115 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@43e96d69
[MASTER] 14:19:42.306 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@741aa151
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@741aa151
at org.evosuite.runtime.agent.AgentLoader.attachAgent(AgentLoader.java:123)
at org.evosuite.runtime.agent.AgentLoader.loadAgent(AgentLoader.java:90)
at org.evosuite.runtime.agent.InstrumentingAgent.initialize(InstrumentingAgent.java:102)
at org.evosuite.runtime.EvoRunner.getClass(EvoRunner.java:101)
at org.evosuite.runtime.EvoRunner.<init>(EvoRunner.java:76)
at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
at org.junit.internal.builders.AnnotatedBuilder.buildRunner(AnnotatedBuilder.java:104)
at org.junit.internal.builders.AnnotatedBuilder.runnerForClass(AnnotatedBuilder.java:86)
at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
at org.junit.internal.builders.AllDefaultPossibilitiesBuilder.runnerForClass(AllDefaultPossibilitiesBuilder.java:37)
at org.junit.runner.Computer.getRunner(Computer.java:50)
at org.junit.runner.Computer$1.runnerForClass(Computer.java:31)
at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:125)
at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:111)
at org.junit.runners.Suite.<init>(Suite.java:81)
at org.junit.runner.Computer$2.<init>(Computer.java:33)
at org.junit.runner.Computer.getSuite(Computer.java:28)
at org.junit.runner.Request.classes(Request.java:77)
at org.junit.runner.JUnitCore.run(JUnitCore.java:105)
at org.junit.runner.JUnitCore.run(JUnitCore.java:94)
at org.evosuite.junit.JUnitAnalyzer$JUnit4Analyzing.runJUnitOnCurrentProcess(JUnitAnalyzer.java:713)
at org.evosuite.junit.JUnitAnalyzer.runJUnitOnCurrentProcess(JUnitAnalyzer.java:291)
at org.evosuite.junit.JUnitAnalyzer.runTests(JUnitAnalyzer.java:286)
at org.evosuite.junit.JUnitAnalyzer.handleTestsThatAreUnstable(JUnitAnalyzer.java:187)
at org.evosuite.TestSuiteGenerator.compileAndCheckTests(TestSuiteGenerator.java:571)
at org.evosuite.TestSuiteGenerator.postProcessTests(TestSuiteGenerator.java:516)
at org.evosuite.TestSuiteGenerator.generateTestSuite(TestSuiteGenerator.java:218)
at org.evosuite.rmi.service.ClientNodeImpl.lambda$startNewSearch$0(ClientNodeImpl.java:140)
at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
at java.util.concurrent.FutureTask.run(FutureTask.java:266)
at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
at java.lang.Thread.run(Thread.java:750)
[MASTER] 14:19:47.314 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 6300@IsaacPC
PID: 6300

[MASTER] 14:19:47.317 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@741aa151
[MASTER] 14:19:47.551 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@62c2e7f9
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@62c2e7f9
at org.evosuite.runtime.agent.AgentLoader.attachAgent(AgentLoader.java:123)
at org.evosuite.runtime.agent.AgentLoader.loadAgent(AgentLoader.java:90)
at org.evosuite.runtime.agent.InstrumentingAgent.initialize(InstrumentingAgent.java:102)
at org.evosuite.runtime.EvoRunner.getClass(EvoRunner.java:101)
at org.evosuite.runtime.EvoRunner.<init>(EvoRunner.java:76)
at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
at org.junit.internal.builders.AnnotatedBuilder.buildRunner(AnnotatedBuilder.java:104)
at org.junit.internal.builders.AnnotatedBuilder.runnerForClass(AnnotatedBuilder.java:86)
at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
at org.junit.internal.builders.AllDefaultPossibilitiesBuilder.runnerForClass(AllDefaultPossibilitiesBuilder.java:37)
at org.junit.runner.Computer.getRunner(Computer.java:50)
at org.junit.runner.Computer$1.runnerForClass(Computer.java:31)
at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:125)
at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:111)
at org.junit.runners.Suite.<init>(Suite.java:81)
at org.junit.runner.Computer$2.<init>(Computer.java:33)
at org.junit.runner.Computer.getSuite(Computer.java:28)
at org.junit.runner.Request.classes(Request.java:77)
at org.junit.runner.JUnitCore.run(JUnitCore.java:105)
at org.junit.runner.JUnitCore.run(JUnitCore.java:94)
at org.evosuite.junit.JUnitAnalyzer$JUnit4Analyzing.runJUnitOnCurrentProcess(JUnitAnalyzer.java:713)
at org.evosuite.junit.JUnitAnalyzer.runJUnitOnCurrentProcess(JUnitAnalyzer.java:291)
at org.evosuite.junit.JUnitAnalyzer.runTests(JUnitAnalyzer.java:286)
at org.evosuite.junit.JUnitAnalyzer.handleTestsThatAreUnstable(JUnitAnalyzer.java:187)
at org.evosuite.TestSuiteGenerator.compileAndCheckTests(TestSuiteGenerator.java:571)
at org.evosuite.TestSuiteGenerator.postProcessTests(TestSuiteGenerator.java:516)
at org.evosuite.TestSuiteGenerator.generateTestSuite(TestSuiteGenerator.java:218)
at org.evosuite.rmi.service.ClientNodeImpl.lambda$startNewSearch$0(ClientNodeImpl.java:140)
at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
at java.util.concurrent.FutureTask.run(FutureTask.java:266)
at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
at java.lang.Thread.run(Thread.java:750)
[MASTER] 14:19:52.558 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 6300@IsaacPC
PID: 6300

[MASTER] 14:19:52.560 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@62c2e7f9
[MASTER] 14:19:52.782 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@77c73b03
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@77c73b03
at org.evosuite.runtime.agent.AgentLoader.attachAgent(AgentLoader.java:123)
at org.evosuite.runtime.agent.AgentLoader.loadAgent(AgentLoader.java:90)
at org.evosuite.runtime.agent.InstrumentingAgent.initialize(InstrumentingAgent.java:102)
at org.evosuite.runtime.EvoRunner.getClass(EvoRunner.java:101)
at org.evosuite.runtime.EvoRunner.<init>(EvoRunner.java:76)
at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
at org.junit.internal.builders.AnnotatedBuilder.buildRunner(AnnotatedBuilder.java:104)
at org.junit.internal.builders.AnnotatedBuilder.runnerForClass(AnnotatedBuilder.java:86)
at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
at org.junit.internal.builders.AllDefaultPossibilitiesBuilder.runnerForClass(AllDefaultPossibilitiesBuilder.java:37)
at org.junit.runner.Computer.getRunner(Computer.java:50)
at org.junit.runner.Computer$1.runnerForClass(Computer.java:31)
at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:125)
at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:111)
at org.junit.runners.Suite.<init>(Suite.java:81)
at org.junit.runner.Computer$2.<init>(Computer.java:33)
at org.junit.runner.Computer.getSuite(Computer.java:28)
at org.junit.runner.Request.classes(Request.java:77)
at org.junit.runner.JUnitCore.run(JUnitCore.java:105)
at org.junit.runner.JUnitCore.run(JUnitCore.java:94)
at org.evosuite.junit.JUnitAnalyzer$JUnit4Analyzing.runJUnitOnCurrentProcess(JUnitAnalyzer.java:713)
at org.evosuite.junit.JUnitAnalyzer.runJUnitOnCurrentProcess(JUnitAnalyzer.java:291)
at org.evosuite.junit.JUnitAnalyzer.runTests(JUnitAnalyzer.java:286)
at org.evosuite.junit.JUnitAnalyzer.handleTestsThatAreUnstable(JUnitAnalyzer.java:187)
at org.evosuite.TestSuiteGenerator.compileAndCheckTests(TestSuiteGenerator.java:571)
at org.evosuite.TestSuiteGenerator.postProcessTests(TestSuiteGenerator.java:516)
at org.evosuite.TestSuiteGenerator.generateTestSuite(TestSuiteGenerator.java:218)
at org.evosuite.rmi.service.ClientNodeImpl.lambda$startNewSearch$0(ClientNodeImpl.java:140)
at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
at java.util.concurrent.FutureTask.run(FutureTask.java:266)
at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
at java.lang.Thread.run(Thread.java:750)
[MASTER] 14:19:57.786 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 6300@IsaacPC
PID: 6300

[MASTER] 14:19:57.788 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@77c73b03
[MASTER] 14:19:58.010 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@41515d61
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@41515d61
at org.evosuite.runtime.agent.AgentLoader.attachAgent(AgentLoader.java:123)
at org.evosuite.runtime.agent.AgentLoader.loadAgent(AgentLoader.java:90)
at org.evosuite.runtime.agent.InstrumentingAgent.initialize(InstrumentingAgent.java:102)
at org.evosuite.runtime.EvoRunner.getClass(EvoRunner.java:101)
at org.evosuite.runtime.EvoRunner.<init>(EvoRunner.java:76)
at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
at org.junit.internal.builders.AnnotatedBuilder.buildRunner(AnnotatedBuilder.java:104)
at org.junit.internal.builders.AnnotatedBuilder.runnerForClass(AnnotatedBuilder.java:86)
at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
at org.junit.internal.builders.AllDefaultPossibilitiesBuilder.runnerForClass(AllDefaultPossibilitiesBuilder.java:37)
at org.junit.runner.Computer.getRunner(Computer.java:50)
at org.junit.runner.Computer$1.runnerForClass(Computer.java:31)
at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:125)
at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:111)
at org.junit.runners.Suite.<init>(Suite.java:81)
at org.junit.runner.Computer$2.<init>(Computer.java:33)
at org.junit.runner.Computer.getSuite(Computer.java:28)
at org.junit.runner.Request.classes(Request.java:77)
at org.junit.runner.JUnitCore.run(JUnitCore.java:105)
at org.junit.runner.JUnitCore.run(JUnitCore.java:94)
at org.evosuite.junit.JUnitAnalyzer$JUnit4Analyzing.runJUnitOnCurrentProcess(JUnitAnalyzer.java:713)
at org.evosuite.junit.JUnitAnalyzer.runJUnitOnCurrentProcess(JUnitAnalyzer.java:291)
at org.evosuite.junit.JUnitAnalyzer.runTests(JUnitAnalyzer.java:286)
at org.evosuite.junit.JUnitAnalyzer.handleTestsThatAreUnstable(JUnitAnalyzer.java:187)
at org.evosuite.TestSuiteGenerator.compileAndCheckTests(TestSuiteGenerator.java:571)
at org.evosuite.TestSuiteGenerator.postProcessTests(TestSuiteGenerator.java:516)
at org.evosuite.TestSuiteGenerator.generateTestSuite(TestSuiteGenerator.java:218)
at org.evosuite.rmi.service.ClientNodeImpl.lambda$startNewSearch$0(ClientNodeImpl.java:140)
at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
at java.util.concurrent.FutureTask.run(FutureTask.java:266)
at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
at java.lang.Thread.run(Thread.java:750)
[MASTER] 14:20:03.012 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 6300@IsaacPC
PID: 6300

[MASTER] 14:20:03.014 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@41515d61
[MASTER] 14:20:03.253 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@ccd0bab
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@ccd0bab
at org.evosuite.runtime.agent.AgentLoader.attachAgent(AgentLoader.java:123)
at org.evosuite.runtime.agent.AgentLoader.loadAgent(AgentLoader.java:90)
at org.evosuite.runtime.agent.InstrumentingAgent.initialize(InstrumentingAgent.java:102)
at org.evosuite.runtime.EvoRunner.getClass(EvoRunner.java:101)
at org.evosuite.runtime.EvoRunner.<init>(EvoRunner.java:76)
at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
at org.junit.internal.builders.AnnotatedBuilder.buildRunner(AnnotatedBuilder.java:104)
at org.junit.internal.builders.AnnotatedBuilder.runnerForClass(AnnotatedBuilder.java:86)
at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
at org.junit.internal.builders.AllDefaultPossibilitiesBuilder.runnerForClass(AllDefaultPossibilitiesBuilder.java:37)
at org.junit.runner.Computer.getRunner(Computer.java:50)
at org.junit.runner.Computer$1.runnerForClass(Computer.java:31)
at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:125)
at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:111)
at org.junit.runners.Suite.<init>(Suite.java:81)
at org.junit.runner.Computer$2.<init>(Computer.java:33)
at org.junit.runner.Computer.getSuite(Computer.java:28)
at org.junit.runner.Request.classes(Request.java:77)
at org.junit.runner.JUnitCore.run(JUnitCore.java:105)
at org.junit.runner.JUnitCore.run(JUnitCore.java:94)
at org.evosuite.junit.JUnitAnalyzer$JUnit4Analyzing.runJUnitOnCurrentProcess(JUnitAnalyzer.java:713)
at org.evosuite.junit.JUnitAnalyzer.runJUnitOnCurrentProcess(JUnitAnalyzer.java:291)
at org.evosuite.junit.JUnitAnalyzer.runTests(JUnitAnalyzer.java:286)
at org.evosuite.junit.JUnitAnalyzer.handleTestsThatAreUnstable(JUnitAnalyzer.java:187)
at org.evosuite.TestSuiteGenerator.compileAndCheckTests(TestSuiteGenerator.java:571)
at org.evosuite.TestSuiteGenerator.postProcessTests(TestSuiteGenerator.java:516)
at org.evosuite.TestSuiteGenerator.generateTestSuite(TestSuiteGenerator.java:218)
at org.evosuite.rmi.service.ClientNodeImpl.lambda$startNewSearch$0(ClientNodeImpl.java:140)
at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
at java.util.concurrent.FutureTask.run(FutureTask.java:266)
at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
at java.lang.Thread.run(Thread.java:750)
[MASTER] 14:20:08.268 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 6300@IsaacPC
PID: 6300

[MASTER] 14:20:08.270 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@ccd0bab
[MASTER] 14:20:08.498 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@3116ec64
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@3116ec64
at org.evosuite.runtime.agent.AgentLoader.attachAgent(AgentLoader.java:123)
at org.evosuite.runtime.agent.AgentLoader.loadAgent(AgentLoader.java:90)
at org.evosuite.runtime.agent.InstrumentingAgent.initialize(InstrumentingAgent.java:102)
at org.evosuite.runtime.EvoRunner.getClass(EvoRunner.java:101)
at org.evosuite.runtime.EvoRunner.<init>(EvoRunner.java:76)
at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
at org.junit.internal.builders.AnnotatedBuilder.buildRunner(AnnotatedBuilder.java:104)
at org.junit.internal.builders.AnnotatedBuilder.runnerForClass(AnnotatedBuilder.java:86)
at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
at org.junit.internal.builders.AllDefaultPossibilitiesBuilder.runnerForClass(AllDefaultPossibilitiesBuilder.java:37)
at org.junit.runner.Computer.getRunner(Computer.java:50)
at org.junit.runner.Computer$1.runnerForClass(Computer.java:31)
at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:125)
at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:111)
at org.junit.runners.Suite.<init>(Suite.java:81)
at org.junit.runner.Computer$2.<init>(Computer.java:33)
at org.junit.runner.Computer.getSuite(Computer.java:28)
at org.junit.runner.Request.classes(Request.java:77)
at org.junit.runner.JUnitCore.run(JUnitCore.java:105)
at org.junit.runner.JUnitCore.run(JUnitCore.java:94)
at org.evosuite.junit.JUnitAnalyzer$JUnit4Analyzing.runJUnitOnCurrentProcess(JUnitAnalyzer.java:713)
at org.evosuite.junit.JUnitAnalyzer.runJUnitOnCurrentProcess(JUnitAnalyzer.java:291)
at org.evosuite.junit.JUnitAnalyzer.runTests(JUnitAnalyzer.java:286)
at org.evosuite.junit.JUnitAnalyzer.handleTestsThatAreUnstable(JUnitAnalyzer.java:187)
at org.evosuite.TestSuiteGenerator.compileAndCheckTests(TestSuiteGenerator.java:571)
at org.evosuite.TestSuiteGenerator.postProcessTests(TestSuiteGenerator.java:516)
at org.evosuite.TestSuiteGenerator.generateTestSuite(TestSuiteGenerator.java:218)
at org.evosuite.rmi.service.ClientNodeImpl.lambda$startNewSearch$0(ClientNodeImpl.java:140)
at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
at java.util.concurrent.FutureTask.run(FutureTask.java:266)
at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
at java.lang.Thread.run(Thread.java:750)
[MASTER] 14:20:13.512 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 6300@IsaacPC
PID: 6300

[MASTER] 14:20:13.515 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@3116ec64
[MASTER] 14:20:13.777 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@4e8176fa
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@4e8176fa
at org.evosuite.runtime.agent.AgentLoader.attachAgent(AgentLoader.java:123)
at org.evosuite.runtime.agent.AgentLoader.loadAgent(AgentLoader.java:90)
at org.evosuite.runtime.agent.InstrumentingAgent.initialize(InstrumentingAgent.java:102)
at org.evosuite.runtime.EvoRunner.getClass(EvoRunner.java:101)
at org.evosuite.runtime.EvoRunner.<init>(EvoRunner.java:76)
at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
at org.junit.internal.builders.AnnotatedBuilder.buildRunner(AnnotatedBuilder.java:104)
at org.junit.internal.builders.AnnotatedBuilder.runnerForClass(AnnotatedBuilder.java:86)
at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
at org.junit.internal.builders.AllDefaultPossibilitiesBuilder.runnerForClass(AllDefaultPossibilitiesBuilder.java:37)
at org.junit.runner.Computer.getRunner(Computer.java:50)
at org.junit.runner.Computer$1.runnerForClass(Computer.java:31)
at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:125)
at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:111)
at org.junit.runners.Suite.<init>(Suite.java:81)
at org.junit.runner.Computer$2.<init>(Computer.java:33)
at org.junit.runner.Computer.getSuite(Computer.java:28)
at org.junit.runner.Request.classes(Request.java:77)
at org.junit.runner.JUnitCore.run(JUnitCore.java:105)
at org.junit.runner.JUnitCore.run(JUnitCore.java:94)
at org.evosuite.junit.JUnitAnalyzer$JUnit4Analyzing.runJUnitOnCurrentProcess(JUnitAnalyzer.java:713)
at org.evosuite.junit.JUnitAnalyzer.runJUnitOnCurrentProcess(JUnitAnalyzer.java:291)
at org.evosuite.junit.JUnitAnalyzer.runTests(JUnitAnalyzer.java:286)
at org.evosuite.junit.JUnitAnalyzer.handleTestsThatAreUnstable(JUnitAnalyzer.java:187)
at org.evosuite.TestSuiteGenerator.compileAndCheckTests(TestSuiteGenerator.java:571)
at org.evosuite.TestSuiteGenerator.postProcessTests(TestSuiteGenerator.java:516)
at org.evosuite.TestSuiteGenerator.generateTestSuite(TestSuiteGenerator.java:218)
at org.evosuite.rmi.service.ClientNodeImpl.lambda$startNewSearch$0(ClientNodeImpl.java:140)
at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
at java.util.concurrent.FutureTask.run(FutureTask.java:266)
at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
at java.lang.Thread.run(Thread.java:750)
[MASTER] 14:20:18.786 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 6300@IsaacPC
PID: 6300

[MASTER] 14:20:18.791 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@4e8176fa
[MASTER] 14:20:19.077 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@4c44267a
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@4c44267a
at org.evosuite.runtime.agent.AgentLoader.attachAgent(AgentLoader.java:123)
at org.evosuite.runtime.agent.AgentLoader.loadAgent(AgentLoader.java:90)
at org.evosuite.runtime.agent.InstrumentingAgent.initialize(InstrumentingAgent.java:102)
at org.evosuite.runtime.EvoRunner.getClass(EvoRunner.java:101)
at org.evosuite.runtime.EvoRunner.<init>(EvoRunner.java:76)
at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
at org.junit.internal.builders.AnnotatedBuilder.buildRunner(AnnotatedBuilder.java:104)
at org.junit.internal.builders.AnnotatedBuilder.runnerForClass(AnnotatedBuilder.java:86)
at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
at org.junit.internal.builders.AllDefaultPossibilitiesBuilder.runnerForClass(AllDefaultPossibilitiesBuilder.java:37)
at org.junit.runner.Computer.getRunner(Computer.java:50)
at org.junit.runner.Computer$1.runnerForClass(Computer.java:31)
at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:70)
at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:125)
at org.junit.runners.model.RunnerBuilder.runners(RunnerBuilder.java:111)
at org.junit.runners.Suite.<init>(Suite.java:81)
at org.junit.runner.Computer$2.<init>(Computer.java:33)
at org.junit.runner.Computer.getSuite(Computer.java:28)
at org.junit.runner.Request.classes(Request.java:77)
at org.junit.runner.JUnitCore.run(JUnitCore.java:105)
at org.junit.runner.JUnitCore.run(JUnitCore.java:94)
at org.evosuite.junit.JUnitAnalyzer$JUnit4Analyzing.runJUnitOnCurrentProcess(JUnitAnalyzer.java:713)
at org.evosuite.junit.JUnitAnalyzer.runJUnitOnCurrentProcess(JUnitAnalyzer.java:291)
at org.evosuite.junit.JUnitAnalyzer.runTests(JUnitAnalyzer.java:286)
at org.evosuite.junit.JUnitAnalyzer.handleTestsThatAreUnstable(JUnitAnalyzer.java:187)
at org.evosuite.TestSuiteGenerator.compileAndCheckTests(TestSuiteGenerator.java:571)
at org.evosuite.TestSuiteGenerator.postProcessTests(TestSuiteGenerator.java:516)
at org.evosuite.TestSuiteGenerator.generateTestSuite(TestSuiteGenerator.java:218)
at org.evosuite.rmi.service.ClientNodeImpl.lambda$startNewSearch$0(ClientNodeImpl.java:140)
at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
at java.util.concurrent.FutureTask.run(FutureTask.java:266)
at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
at java.lang.Thread.run(Thread.java:750)
[MASTER] 14:20:24.084 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 6300@IsaacPC
PID: 6300

[MASTER] 14:20:24.086 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@4c44267a
[MASTER] 14:20:24.108 [logback-1] WARN  TestSuiteGenerator - JUnit checking timed out
* Writing tests to file
* Writing JUnit test case 'ATM3v2_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test00
```
```
#### Avalla
```
```