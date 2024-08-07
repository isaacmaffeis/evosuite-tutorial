# EvoSuite Examples - version 1.2.0

## Prerequisites

- Java 8
- Maven

## Getting EvoSuite

Go here https://github.com/EvoSuite/evosuite/releases/tag/v1.2.0 and download the two JAR files:

- `evosuite-1.2.0.jar` contains the entire EvoSuite logic for generating tests
- `evosuite-standalone-runtime-1.2.0.jar` contains the dependencies needed by the JUnit tests generated by EvoSuite

Place them in the root directory of the project.

Add the `evosuite-standalone-runtime-1.2.0.jar` as library of the project

## EvoSuite in Action

### Basic Setup

1. Run `mvn install:install-file -Dfile="evosuite-standalone-runtime-1.2.0.jar" -DgroupId="org.evosuite" -DartifactId="evosuite-standalone-runtime" -Dversion="1.2.0" -Dpackaging="jar"`
2. Run `mvn compile`
3. Run `mvn dependency:copy-dependencies -DincludeScope=runtime`
4. Run `java -jar evosuite-1.2.0.jar -setup target/classes target/dependency/commons-collections-3.2.2.jar`
5. Run `java -jar evosuite-1.2.0.jar -class org.example.vendingMachine.VendingMachineASM`
6. Run `xcopy evosuite-tests\* src\test\java /E /I /Y`
7. Run `mvn test`

You should see all tests pass (OK).

## Issue of this version
### ERROR AgentLoader
Several exceptions while trying to generate the test suite, but eventually it works

ERROR AgentLoader - Exception class java.lang.IllegalStateException: Error during attachment using: org.evosuite.shaded.net.bytebuddy.agent.ByteBuddyAgent$AttachmentProvider$Compound@266041ec , cause class java.lang.reflect.InvocationTargetException null
java.lang.IllegalStateException

### No 1.2.0 version at Maven Central Repository
Adding local jar to maven is deprecated: In new releases this feature is marked as deprecated but
still working and not removed yet