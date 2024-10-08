# V002
Generating test for RegistroDiCassav4 with evosuite 1.2.0 using DynaMOSA search. 
- version with setters

In this version the result is slightly better, we've increased the branch coverage to 87% from 84%

In this example I saw that the Java class with setters performs better with the DynaMOSA algorithm,
while the step function with args version works better with random search.

## Problems


## How to
```shell
mvn compile
```
```shell
mvn dependency:copy-dependencies -DincludeScope=runtime
```
```shell
java -jar evosuite-1.2.0.jar -setup target/classes target/dependency/commons-collections-3.2.2.jar
```
```shell
java -jar .\evosuite-1.2.0jar -class org.evoservice.RegistroDiCassa.RegistroDiCassav4 -criterion LINE:BRANCH:CBRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=60 -generateMOSuite
```

### log
* EvoSuite 1.2.0
* Going to generate test cases for class: org.evoservice.RegistroDiCassa.RegistroDiCassav4
* Starting Client-0
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.2.0\evosuite-files\evosuite.properties
* Connecting to master process on port 17732
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.RegistroDiCassa.RegistroDiCassav4
* Test criteria:
  - Line Coverage
  - Branch Coverage
  - Context Branch Coverage
* Total number of test goals for DYNAMOSA: 434
  [Progress:>                             0%] [Cov:>                                  0%]* Using seed 1728317092366
* Starting evolution
* Initial Number of Goals in DynaMOSA = 240 / 434
  [Progress:==============================100%] [Cov:============================>      82%]
* Search finished after 152s and 1288 generations, 330312 statements, best individual has fitness: 72.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 86%
* Total number of goals: 232
* Number of covered goals: 200
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 80%
* Total number of goals: 101
* Number of covered goals: 81
* Coverage analysis for criterion CBRANCH
* Coverage of criterion CBRANCH: 80%
* Total number of goals: 101
* Number of covered goals: 81
* Generated 10 tests with total length 74
* Resulting test suite's coverage: 82% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
  [MASTER] 18:07:38.637 [logback-2] ERROR AgentLoader - Exception class java.lang.IllegalStateException: Error during attachment using: org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent$AttachmentProvider$Compound@37f51499 , cause class java.lang.reflect.InvocationTargetException null
  java.lang.IllegalStateException: Error during attachment using: org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent$AttachmentProvider$Compound@37f51499
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
  [MASTER] 18:07:43.648 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.2.0\.\evosuite-1.2.0.jar
  VM: 9676@IsaacPC
  PID: 9676

[MASTER] 18:07:43.679 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.IllegalStateException: Error during attachment using: org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent$AttachmentProvider$Compound@37f51499
[MASTER] 18:07:43.903 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@73325eda
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@73325eda
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
[MASTER] 18:07:48.930 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.2.0\.\evosuite-1.2.0.jar
VM: 9676@IsaacPC
PID: 9676

[MASTER] 18:07:48.930 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@73325eda
[MASTER] 18:07:49.133 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@59191655
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@59191655
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
[MASTER] 18:07:54.140 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.2.0\.\evosuite-1.2.0.jar
VM: 9676@IsaacPC
PID: 9676

[MASTER] 18:07:54.142 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@59191655
[MASTER] 18:07:54.415 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@4873c2bf
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@4873c2bf
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
[MASTER] 18:07:59.429 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.2.0\.\evosuite-1.2.0.jar
VM: 9676@IsaacPC
PID: 9676

[MASTER] 18:07:59.429 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@4873c2bf
[MASTER] 18:07:59.665 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@e2592bc
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@e2592bc
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
[MASTER] 18:08:04.676 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.2.0\.\evosuite-1.2.0.jar
VM: 9676@IsaacPC
PID: 9676

[MASTER] 18:08:04.677 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@e2592bc
[MASTER] 18:08:05.097 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@344dfd99
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@344dfd99
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
[MASTER] 18:08:10.101 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.2.0\.\evosuite-1.2.0.jar
VM: 9676@IsaacPC
PID: 9676

[MASTER] 18:08:10.101 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@344dfd99
[MASTER] 18:08:10.335 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@2f5fcc31
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@2f5fcc31
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
[MASTER] 18:08:15.350 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.2.0\.\evosuite-1.2.0.jar
VM: 9676@IsaacPC
PID: 9676

[MASTER] 18:08:15.350 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@2f5fcc31
[MASTER] 18:08:15.475 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@b378095
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@b378095
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
[MASTER] 18:08:20.476 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.2.0\.\evosuite-1.2.0.jar
VM: 9676@IsaacPC
PID: 9676

[MASTER] 18:08:20.476 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@b378095
[MASTER] 18:08:20.648 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@41c72c86
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@41c72c86
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
[MASTER] 18:08:25.667 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.2.0\.\evosuite-1.2.0.jar
VM: 9676@IsaacPC
PID: 9676

[MASTER] 18:08:25.667 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@41c72c86
[MASTER] 18:08:26.199 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@4b34b0b2
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@4b34b0b2
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
[MASTER] 18:08:31.211 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\RegistroDiCassa-1.2.0\.\evosuite-1.2.0.jar
VM: 9676@IsaacPC
PID: 9676

[MASTER] 18:08:31.211 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@4b34b0b2
[MASTER] 18:08:31.227 [logback-1] WARN  TestSuiteGenerator - JUnit checking timed out
* Writing tests to file
* Writing JUnit test case 'RegistroDiCassav4_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
```
#### Avalla
```
```
