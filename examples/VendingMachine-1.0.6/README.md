# EvoSuite Examples - version 1.0.6

## Prerequisites

- Java 8
- Maven

## Getting EvoSuite

Go here https://github.com/EvoSuite/evosuite/releases/tag/v1.0.6 and download the JAR file:
`evosuite-1.0.6.jar` that contains the entire EvoSuite logic for generating tests and move it
into the project's root directory

## EvoSuite in Action

### Basic Setup

1. Run `mvn compile`
2. Run `mvn dependency:copy-dependencies -DincludeScope=runtime`
3. Run `java -jar evosuite-1.0.6.jar -setup target/classes target/dependency/commons-collections-3.2.2.jar`
4. Run `java -jar evosuite-1.0.6.jar -class org.example.vendingMachine.VendingMachineASM`
5. Run `xcopy evosuite-tests\* src\test\java /E /I /Y`
6. Run `mvn test` 

You should see all tests pass (OK).

## Issue of this version
### Many Objective Test Generation (MOSA)
Failed to Run `java -jar evosuite-1.0.6.jar -class org.example.vendingMachine.VendingMachineASM -generateMOSuite`
with this exception java.lang.ClassCastException: org.evosuite.testcase.TestChromosome cannot be 
cast to org.evosuite.testsuite.TestSuiteChromosome
