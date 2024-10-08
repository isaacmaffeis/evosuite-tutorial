# V001
In this version I tested the generated class directly:
- I incorporated the abstract signature class directly into the main class,
  in this way I could make all the methods private except the set, step and get methods which are
  the only public ones and visible from evosuite
- Criterion LINE:BRANCH:CBRANCH
- version with monitored setters
- low rules coverage
- same coverage as the 1.0.6 version


## Problems
- CBRANCH criterion did not increase the coverage


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
* Connecting to master process on port 14444
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.atm3.ATM3v2
* Test criteria:
  - Line Coverage
  - Branch Coverage
    [Progress:>                             0%] [Cov:>                                  0%]* Total number of test goals for DYNAMOSA: 532
* Using seed 1728425435661
* Starting evolution
* Initial Number of Goals in DynaMOSA = 316 / 532
  [Progress:==============================100%] [Cov:===============>                   45%]
* Search finished after 151s and 13 generations, 2510 statements, best individual has fitness: 277.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
  [MASTER] 00:14:29.568 [logback-1] WARN  TestSuiteMinimizer - Minimization timeout. Roll back to original test suite
* Coverage of criterion LINE: 62%
* Total number of goals: 300
* Number of covered goals: 185
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 30%
* Total number of goals: 232
* Number of covered goals: 70
* Generated 33 tests with total length 224
* Resulting test suite's coverage: 46% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
  [MASTER] 00:14:43.102 [logback-2] ERROR AgentLoader - Exception class java.lang.IllegalStateException: Error during attachment using: org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent$AttachmentProvider$Compound@2bdc598b , cause class java.lang.reflect.InvocationTargetException null
  java.lang.IllegalStateException: Error during attachment using: org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent$AttachmentProvider$Compound@2bdc598b
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
  [MASTER] 00:14:48.117 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
  VM: 13944@IsaacPC
  PID: 13944

[MASTER] 00:14:48.185 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.IllegalStateException: Error during attachment using: org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent$AttachmentProvider$Compound@2bdc598b
[MASTER] 00:14:48.313 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@61883b3a
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@61883b3a
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
[MASTER] 00:14:53.314 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 13944@IsaacPC
PID: 13944

[MASTER] 00:14:53.315 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@61883b3a
[MASTER] 00:14:53.464 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@44ba4cad
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@44ba4cad
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
[MASTER] 00:14:58.476 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 13944@IsaacPC
PID: 13944

[MASTER] 00:14:58.477 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@44ba4cad
[MASTER] 00:14:58.577 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@37fca155
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@37fca155
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
[MASTER] 00:15:03.583 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 13944@IsaacPC
PID: 13944

[MASTER] 00:15:03.585 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@37fca155
[MASTER] 00:15:03.714 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@3730683f
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@3730683f
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
[MASTER] 00:15:08.718 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 13944@IsaacPC
PID: 13944

[MASTER] 00:15:08.718 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@3730683f
[MASTER] 00:15:08.890 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@26acda53
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@26acda53
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
[MASTER] 00:15:13.892 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 13944@IsaacPC
PID: 13944

[MASTER] 00:15:13.892 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@26acda53
[MASTER] 00:15:14.083 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@5067885e
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@5067885e
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
[MASTER] 00:15:19.086 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 13944@IsaacPC
PID: 13944

[MASTER] 00:15:19.087 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@5067885e
[MASTER] 00:15:19.198 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@678096fe
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@678096fe
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
[MASTER] 00:15:24.209 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 13944@IsaacPC
PID: 13944

[MASTER] 00:15:24.211 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@678096fe
[MASTER] 00:15:24.348 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@73558552
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@73558552
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
[MASTER] 00:15:29.360 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 13944@IsaacPC
PID: 13944

[MASTER] 00:15:29.361 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@73558552
[MASTER] 00:15:29.562 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@139b5c66
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@139b5c66
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
[MASTER] 00:15:34.574 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\ATM3-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 13944@IsaacPC
PID: 13944

[MASTER] 00:15:34.574 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@139b5c66
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