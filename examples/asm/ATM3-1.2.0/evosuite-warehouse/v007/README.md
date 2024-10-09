# V007
In this version I tested the generated class directly:
- I incorporated the abstract signature class directly into the main class,
  in this way I could make all the methods private except the set, step and get methods which are
  the only public ones and visible from evosuite
- Criterion LINE:BRANCH
- version with monitored setters
- turned on all the translator option in asmetal2java (`-Dformatter=true -DshuffleRandom=true
  -DoptimizeSeqMacroRule=true`)
- fixed the .value issue in the java generator (manually, only in this class)

Time budget increased to 1000, the cover level rises lightly up to 66% from 62%

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
* Connecting to master process on port 21549
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.atm3.ATM3v2
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Total number of test goals for DYNAMOSA: 408
  [Progress:>                             0%] [Cov:>                                  0%]* Using seed 1728485681417
* Starting evolution
* Initial Number of Goals in DynaMOSA = 277 / 408
  [Progress:==============================100%] [Cov:=======================>           68%]
* Search finished after 1007s and 26 generations, 5419 statements, best individual has fitness: 115.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
  [MASTER] 17:14:18.679 [logback-1] WARN  TestSuiteMinimizer - Minimization timeout. Roll back to original test suite
  [MASTER] 17:14:18.679 [logback-1] WARN  TimeController - Phase MINIMIZATION lasted too long, 25 seconds more than allowed.
* Coverage of criterion LINE: 81%
* Total number of goals: 259
* Number of covered goals: 210
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 56%
* Total number of goals: 149
* Number of covered goals: 83
* Generated 36 tests with total length 252
* Resulting test suite's coverage: 68% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
  [MASTER] 17:14:51.660 [logback-2] ERROR AgentLoader - Exception class java.lang.IllegalStateException: Error during attachment using: org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent$AttachmentProvider$Compound@199f8230 , cause class java.lang.reflect.InvocationTargetException null
  java.lang.IllegalStateException: Error during attachment using: org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent$AttachmentProvider$Compound@199f8230
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
  [MASTER] 17:14:56.671 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
  VM: 5016@IsaacPC
  PID: 5016

[MASTER] 17:14:56.695 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.IllegalStateException: Error during attachment using: org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent$AttachmentProvider$Compound@199f8230
[MASTER] 17:14:56.815 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@75e8b77d
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@75e8b77d
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
[MASTER] 17:15:01.821 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 5016@IsaacPC
PID: 5016

[MASTER] 17:15:01.822 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@75e8b77d
[MASTER] 17:15:02.069 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@3be90b4f
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@3be90b4f
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
[MASTER] 17:15:07.083 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 5016@IsaacPC
PID: 5016

[MASTER] 17:15:07.084 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@3be90b4f
[MASTER] 17:15:07.362 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@904818d
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@904818d
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
[MASTER] 17:15:12.367 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 5016@IsaacPC
PID: 5016

[MASTER] 17:15:12.368 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@904818d
[MASTER] 17:15:12.506 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@5f6c4f0f
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@5f6c4f0f
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
[MASTER] 17:15:17.517 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 5016@IsaacPC
PID: 5016

[MASTER] 17:15:17.517 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@5f6c4f0f
[MASTER] 17:15:17.723 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@4a20e190
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@4a20e190
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
[MASTER] 17:15:22.736 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 5016@IsaacPC
PID: 5016

[MASTER] 17:15:22.737 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@4a20e190
[MASTER] 17:15:22.909 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@347bf85d
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@347bf85d
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
[MASTER] 17:15:27.922 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 5016@IsaacPC
PID: 5016

[MASTER] 17:15:27.922 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@347bf85d
[MASTER] 17:15:28.055 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@15d2c631
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@15d2c631
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
[MASTER] 17:15:33.065 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 5016@IsaacPC
PID: 5016

[MASTER] 17:15:33.066 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@15d2c631
[MASTER] 17:15:33.201 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@2851b25
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@2851b25
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
[MASTER] 17:15:38.202 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 5016@IsaacPC
PID: 5016

[MASTER] 17:15:38.203 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@2851b25
[MASTER] 17:15:38.339 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@4b733740
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@4b733740
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
[MASTER] 17:15:43.339 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 5016@IsaacPC
PID: 5016

[MASTER] 17:15:43.340 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@4b733740
* Permissions denied during test execution:
  - java.lang.RuntimePermission:
    writeFileDescriptor: 11
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