# V001
I compared the use of version 1.0.6 of Evosuite with random search and version 1.2.0 with MOSA
algorithm and in the case study of traffic light I obtained the same result.

Considering that with version 1.2.0 during the generation of tests, Evosuite throws 
various exceptions, I prefer the more stable version 1.0.6, at least in this case study.

## Problems
-  Evosuite throws various exceptions

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
java -jar ../../../resources/evosuite-1.2.0.jar -class org.evoservice.trafficLight.TrafficLightv2_ASM -criterion LINE:BRANCH -Dminimize=true -Dassertion_strategy=all -Dsearch_budget=150
```
### log
* EvoSuite 1.2.0
* Going to generate test cases for class: org.evoservice.trafficLight.TrafficLightv2_ASM
* Starting Client-0
* Properties loaded from C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\TrafficLight-1.2.0\evosuite-files\evosuite.properties
* Connecting to master process on port 15825
* Analyzing classpath:
  - target/classes
  - target/dependency/commons-collections-3.2.2.jar
* Finished analyzing classpath
* Generating tests for class org.evoservice.trafficLight.TrafficLightv2_ASM
* Test criteria:
  - Line Coverage
  - Branch Coverage
* Total number of test goals for DYNAMOSA: 63
  [Progress:>                             0%] [Cov:>                                  0%]* Using seed 1725865913699
* Starting evolution
* Initial Number of Goals in DynaMOSA = 56 / 63
  [Progress:==============================100%] [Cov:=================================> 97%]
* Search finished after 151s and 1847 generations, 426253 statements, best individual has fitness: 1.0
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion LINE
* Coverage of criterion LINE: 100%
* Total number of goals: 42
* Number of covered goals: 42
* Coverage analysis for criterion BRANCH
* Coverage of criterion BRANCH: 95%
* Total number of goals: 21
* Number of covered goals: 20
* Generated 2 tests with total length 24
* Resulting test suite's coverage: 98% (average coverage for all fitness functions)
* Generating assertions
* Compiling and checking tests
  [MASTER] 09:14:32.027 [logback-2] ERROR AgentLoader - Exception class java.lang.IllegalStateException: Error during attachment using: org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent$AttachmentProvider$Compound@4016cb6d , cause class java.lang.reflect.InvocationTargetException null
  java.lang.IllegalStateException: Error during attachment using: org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent$AttachmentProvider$Compound@4016cb6d
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
  [MASTER] 09:14:37.032 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\TrafficLight-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
  VM: 11356@IsaacPC
  PID: 11356

[MASTER] 09:14:37.126 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.IllegalStateException: Error during attachment using: org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent$AttachmentProvider$Compound@4016cb6d
[MASTER] 09:14:37.417 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@36169c4
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@36169c4
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
[MASTER] 09:14:42.419 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\TrafficLight-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 11356@IsaacPC
PID: 11356

[MASTER] 09:14:42.422 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@36169c4
[MASTER] 09:14:42.834 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@3ebc1464
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@3ebc1464
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
at org.evosuite.TestSuiteGenerator.checkAllTestsIfTime(TestSuiteGenerator.java:614)
at org.evosuite.TestSuiteGenerator.compileAndCheckTests(TestSuiteGenerator.java:585)
at org.evosuite.TestSuiteGenerator.postProcessTests(TestSuiteGenerator.java:516)
at org.evosuite.TestSuiteGenerator.generateTestSuite(TestSuiteGenerator.java:218)
at org.evosuite.rmi.service.ClientNodeImpl.lambda$startNewSearch$0(ClientNodeImpl.java:140)
at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
at java.util.concurrent.FutureTask.run(FutureTask.java:266)
at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
at java.lang.Thread.run(Thread.java:750)
[MASTER] 09:14:47.847 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\TrafficLight-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 11356@IsaacPC
PID: 11356

[MASTER] 09:14:47.849 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@3ebc1464
[MASTER] 09:14:48.132 [logback-2] ERROR AgentLoader - Exception class java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@65be0609
java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@65be0609
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
at org.evosuite.TestSuiteGenerator.checkAllTestsIfTime(TestSuiteGenerator.java:614)
at org.evosuite.TestSuiteGenerator.compileAndCheckTests(TestSuiteGenerator.java:591)
at org.evosuite.TestSuiteGenerator.postProcessTests(TestSuiteGenerator.java:516)
at org.evosuite.TestSuiteGenerator.generateTestSuite(TestSuiteGenerator.java:218)
at org.evosuite.rmi.service.ClientNodeImpl.lambda$startNewSearch$0(ClientNodeImpl.java:140)
at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
at java.util.concurrent.FutureTask.run(FutureTask.java:266)
at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
at java.lang.Thread.run(Thread.java:750)
[MASTER] 09:14:53.135 [logback-2] ERROR AgentLoader - Trying again to attach agent:C:\Users\isaac\Documents\GitHub\evosuite-tutorial\examples\asm\TrafficLight-1.2.0\..\..\..\resources\evosuite-1.2.0.jar
VM: 11356@IsaacPC
PID: 11356

[MASTER] 09:14:53.138 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: java.lang.RuntimeException: AttachProvider.providers() failed to return any provider. Tool classloader: java.net.FactoryURLClassLoader@65be0609
* Writing tests to file
* Writing JUnit test case 'TrafficLightv2_ASM_ESTest' to evosuite-tests
* Done!

* Computation finished

## Scenario
### test0
```
<State 0 (controlled)>
count = 0
status = RED
Set pedestrian = false
</State 0 (controlled)>

<Stato attuale>
count = 1
status = RED
Branch States RED covered
<State 1 (controlled)>
count = 1
status = RED
Set pedestrian = false
</State 1 (controlled)>

<Stato attuale>
count = 2
status = RED
Branch States RED covered
<State 2 (controlled)>
count = 2
status = RED
Set pedestrian = false
</State 2 (controlled)>

<Stato attuale>
count = 3
status = RED
Branch States RED covered
<State 3 (controlled)>
count = 3
status = RED
Set pedestrian = false
</State 3 (controlled)>

<Stato attuale>
count = 4
status = RED
Branch States RED covered
<State 4 (controlled)>
count = 4
status = RED
Set pedestrian = false
</State 4 (controlled)>

<Stato attuale>
count = 5
status = RED
Branch States RED covered
<State 5 (controlled)>
count = 5
status = RED
Set pedestrian = false
</State 5 (controlled)>

<Stato attuale>
count = 6
status = RED
Branch States RED covered
<State 6 (controlled)>
count = 6
status = RED
Set pedestrian = false
</State 6 (controlled)>

<Stato attuale>
count = 0
status = GREEN
Branch States GREEN covered
<State 7 (controlled)>
count = 0
status = GREEN
Set pedestrian = false
</State 7 (controlled)>

<Stato attuale>
count = 1
status = GREEN
Branch States GREEN covered
<State 8 (controlled)>
count = 1
status = GREEN
Set pedestrian = false
</State 8 (controlled)>

<Stato attuale>
count = 2
status = GREEN
Branch States GREEN covered
<State 9 (controlled)>
count = 2
status = GREEN
Set pedestrian = false
</State 9 (controlled)>

<Stato attuale>
count = 3
status = GREEN
Branch States GREEN covered
<State 10 (controlled)>
count = 3
status = GREEN
Set pedestrian = false
</State 10 (controlled)>

<Stato attuale>
count = 4
status = GREEN
Branch States GREEN covered
<State 11 (controlled)>
count = 4
status = GREEN
Set pedestrian = false
</State 11 (controlled)>

<Stato attuale>
count = 5
status = GREEN
Branch States GREEN covered
<State 12 (controlled)>
count = 5
status = GREEN
Set pedestrian = false
</State 12 (controlled)>

<Stato attuale>
count = 6
status = GREEN
Branch States GREEN covered
<State 13 (controlled)>
count = 6
status = GREEN
Set pedestrian = false
</State 13 (controlled)>

<Stato attuale>
count = 0
status = YELLOW
Branch States YELLOW covered
```
#### Avalla
```
```

### test1
```
<State 0 (controlled)>
count = 0
status = RED
Set pedestrian = true
</State 0 (controlled)>

<Stato attuale>
count = 1
status = RED
Branch States RED covered
<State 1 (controlled)>
count = 1
status = RED
Set pedestrian = true
</State 1 (controlled)>

<Stato attuale>
count = 2
status = RED
Branch States RED covered
<State 2 (controlled)>
count = 2
status = RED
Set pedestrian = true
</State 2 (controlled)>

<Stato attuale>
count = 3
status = RED
Branch States RED covered
<State 3 (controlled)>
count = 3
status = RED
Set pedestrian = true
</State 3 (controlled)>

<Stato attuale>
count = 4
status = RED
Branch States RED covered
<State 4 (controlled)>
count = 4
status = RED
Set pedestrian = true
</State 4 (controlled)>

<Stato attuale>
count = 5
status = RED
Branch States RED covered
<State 5 (controlled)>
count = 5
status = RED
Set pedestrian = true
</State 5 (controlled)>

<Stato attuale>
count = 6
status = RED
Branch States RED covered
<State 6 (controlled)>
count = 6
status = RED
Set pedestrian = true
</State 6 (controlled)>

<Stato attuale>
count = 0
status = GREEN
Branch States GREEN covered
<State 7 (controlled)>
count = 0
status = GREEN
Set pedestrian = true
</State 7 (controlled)>

<Stato attuale>
count = 0
status = PENDING
Branch States PENDING covered
```
#### Avalla
```
```