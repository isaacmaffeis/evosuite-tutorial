# Tutorial Part 2: Maven integration
https://www.evosuite.org/documentation/tutorial-part-2/
## What you will learn in this tutorial
- Setting up Maven projects to run EvoSuite tests
- Generating tests from Maven
- Updating generated tests with Maven
- Making EvoSuite part of continuous integration
## Preparing the project under test
For the second part of the tutorial, we will be testing a simple library consisting of a couple of 
(dummy) container classes, including the Stack implementation from part 1. 
Please download and extract the archive containing this example:
http://evosuite.org/files/tutorial/Tutorial_Maven.zip .
We can compile the classes in the project using the following command:
```shell
mvn compile
```
This puts the compiled bytecode of these classes in the `target/classes` directory. 
Make sure that this worked correctly.
There are some tests included in `src/test/java`, which we can run using the following command:
```shell
mvn test
```
If this worked correctly, then you are ready to integrate EvoSuite. In order to do this, 
we need to have a closer look at how to configure Maven.
## A closer look at the pom.xml file
f you are already well familiar with Maven this section will likely not tell you anything new.
However, it is important to understand how to configure Maven projects in order to configure the 
project to use EvoSuite. Therefore, we will now take a closer look at the main Maven 
configuration file of our example project, which is the file `pom.xml`.

The `pom.xml` in our example project is based on a basic version generated using 
`mvn archetype:generate`. It starts with some basic meta-information about the project:
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>org.evosuite.tutorial</groupId>
  <artifactId>Tutorial_Maven</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>jar</packaging>

  <name>Tutorial_Maven</name>
  <url>http://maven.apache.org</url>
```
Besides some generic stuff (e.g., URL and name of the project)
the main aspects are `groupId`, `artifactId`, and `version`. Maven identifies projects using these
three items. This is important to know when it comes to declaring dependencies. 
Our example project currently has one dependency, which is **JUnit** to execute the tests. 
This is declared in the `<dependency>` section:
```xml
<dependencies>
  <dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>
  </dependency>
</dependencies>
```
As you can see, junit is identified by its `groupId`, `artifactId`, and `version`, like we defined for 
our project above. The scope defines that this dependency is only needed when running tests,
not for compiling or executing the project itself.

## Generating EvoSuite tests with Maven
The dependencies section only declares what the code we are working with depends on. However, 
what we would like to do is to tell Maven that we would like to use EvoSuite as part of our
build – so we need to declare a build dependency on EvoSuite, not a project dependency. 
Dependencies of the build are specified as plugins in the build section of the `pom.xml`.
Add the following snippet to the `pom.xml` as a child node of `<project>`, 
for example beneath the `</dependencies>` section:
```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.evosuite.plugins</groupId>
      <artifactId>evosuite-maven-plugin</artifactId>
      <version>1.0.6</version>
    </plugin>
  </plugins>
</build>
```
What this tells Maven is that during our build, we want to make use of the EvoSuite Maven plugin. 
Maven can automatically resolve build dependencies just like it resolves project dependencies, 
by looking for a plugin with the given groupId, artifactId, and version on Maven central.

At this point, one caveat is that the EvoSuite plugin is not yet available on Maven Central. 
Therefore, we need to tell Maven that it should also look at EvoSuite’s Maven repository when 
trying to resolve dependencies. To achieve this, we need to add a `<pluginRepositories>` section
where we specify EvoSuite’s URL:
```xml
<pluginRepositories>
  <pluginRepository>
    <id>EvoSuite</id>
    <name>EvoSuite Repository</name>
    <url>http://www.evosuite.org/m2</url>
  </pluginRepository>
</pluginRepositories>
```
The `<pluginRepositories>` section is again a child of the `<project>` tag, so for example you could 
add it at the end, before the closing `</project>` tag.

Now we can check if our setup works correctly by invoking the Evosuite plugin. 
The plugin is called evosuite, and as is normal for Maven plugins, we call it by providing 
the plugin name separated with a colon from the plugin goal. For example, if we want to execute 
the plugin goal help of the evosuite plugin, we would type the following command:

```shell
mvn evosuite:help
```
he first time you invoke the EvoSuite plugin, Maven will download EvoSuite and its dependencies 
and this may take a while. Once everything is downloaded, you should see the following help message:
```
  This plugin has 7 goals:

  evosuite:clean
    Remove all local files created by EvoSuite so far

  evosuite:coverage
    Execute the manually written test suites (usually located under src/test/java)
    and return the coverage of each class.

  evosuite:export
    When run, EvoSuite generate tests in a specific folder. New runs of EvoSuite
    can exploit the tests in such folder, and/or modify them.

    So, with 'export' we can copy all generated tests to a specific folder, which
    by default points to where Maven searches for tests. If another folder is
    rather used (or if we want to run with Maven the tests in the default EvoSuite
    folder), then Maven plugins like build-helper-maven-plugin are needed

  evosuite:generate
    Generate JUnit tests

  evosuite:help
    Display help information on evosuite-maven-plugin.
    Call mvn evosuite:help -Ddetail=true -Dgoal=<goal-name> to display parameter
    details.

  evosuite:info
    Obtain info of generated tests so far

  evosuite:prepare
    Workaround mojo to overcome bug in Maven. Needed when EvoSuite tests are run
    together with manual ones
```
If you don’t see this but get to see an error message, then likely there is a problem in your pom.xml.
Make sure you copied all the above additions to the pom.xml correctly and try again.

We can set properties for our plugin goals just like we would set properties for any Java process,
using the `-Dproperty=value` syntax. 
For example, to get more detailed information about the generate plugin goal when executing the help
plugin goal, we can run the following command:
```shell
mvn evosuite:help -Ddetail=true -Dgoal=generate
```
If you run this command, you should see a list of all the properties that you can set for the 
generate plugin goal.

Let’s waste no more time and generate some tests! Type:
```shell
mvn evosuite:generate
```
The output tells us that EvoSuite will generate tests for 4 classes, which it estimates to take 
around 8 minutes. The first job it started is the class tutorial.LinkedList. Now is the time to
wait and get some coffee, until Evosuite has finished testing all the classes.

If you have a powerful machine with multiple cores, you can also parallelise the EvoSuite jobs 
in order to save time. For example, to run 4 EvoSuite jobs in parallel you could add the 
`-Dcores=4` property to the `evosuite:generate command`:
```shell
mvn -Dcores=4 evosuite:generate
```
## Integrating generated tests into the source tree
So, what have we generated? To find out the current state of what EvoSuite has generated for us,
use the following command:
```shell
mvn evosuite:info
```
We’ve got a test suite for each of our classes, and the coverage is great. But, where are these 
test suites?

Right now, they are in a hidden directory `.evosuite`. This is a directory where EvoSuite keeps
information, in order to improve test generation over time. For example, if a class hasn't 
changed, and we already have a test suite, we don’t want to invoke EvoSuite on it again 
– but more about this later. For now, you can see what EvoSuite has put into `.evosuite`; 
in particular, you will find the generated tests in `.evosuite/best-tests`.

Assuming you are happy with these test suites, we can integrate them into the source tree. 
By default, JUnit tests are expected to be located in `src/test/java` in Maven projects,
so this is where EvoSuite will put the test suites. To do this, invoke the following command:
```shell
mvn evosuite:export
```
You should now have the test suites copied over to `src/test/java` – make sure they are there.
## Executing EvoSuite tests with Maven
Now that we have these tests in our source tree, it would be great to execute them. With Maven,
this is done by invoking the test lifecycle phase `mvn test`.
However, if you try this now, what you will see are plenty of error messages about package 
`org.evosuite.runtime` does not exist. Recall that EvoSuite tests have a dependency on the
EvoSuite runtime library, because they do bytecode instrumentation and all sorts of other stuff 
to avoid flaky tests. Therefore, we need to tell Maven to use this runtime library. 
We already know how to add dependencies to Maven projects; this time it is a project dependency,
and so we add a new item to the `<dependencies>` tag in your `pom.xml`:
```xml
<dependency>
  <groupId>org.evosuite</groupId>
  <artifactId>evosuite-standalone-runtime</artifactId>
  <version>1.0.6</version>
  <scope>test</scope>
</dependency>
```
Once you’ve done that, try executing the tests again:
```shell
mvn test
```
Note that the number of tests will vary inevitably – EvoSuite uses a randomized algorithm to 
generate tests, so every time you invoke it you will get a different result.

## Keeping EvoSuite tests separate from developer-written tests
When we exported the tests using `mvn evosuite:export` they were copied to `src/test/java`, 
which is where Maven expects all tests to be. Sometimes, developers may prefer to keep their
own tests separated from generated tests.

Let’s assume we do not want the generated tests in `src/test/java`. 
Remove the tests we have already exported there:
```shell
rm src/test/java/*ESTest*.java
```
The export goal offers a property to specify where to export tests to – recall that we can get 
details about this goal by using the following command:
```shell
mvn evosuite:help -Ddetail=true -Dgoal=export
```
The output reveals the property we are looking for:
```
Available parameters:

  targetFolder (Default: src/test/java)

    User property: targetFolder
```
There are two ways we can specify the targetFolder. The first one is to do so explicitly 
on the command line:
```shell
mvn evosuite:export -DtargetFolder=src/test/evosuite
```
Alternatively, we can specify it in the pom.xml as part of the `<properties>` section. 
Add the following entry (as a child to `<project>`):
```xml
<properties>
  <targetFolder>src/test/evosuite</targetFolder>
</properties>
```
Now, try exporting EvoSuite tests again:
```shell
mvn evosuite:export
```
You should now see your tests exported to `src/test/evosuite` rather than `src/test/java`. Great!

However, not quite so great yet: If we run `mvn test` then this will by default not include 
`src/test/evosuite`, and will just execute our existing test.

We thus need to tell it where to find our tests. Add the following plugin configuration to the
`<plugins>` section of the `<build>` part of the `pom.xml`:
```xml
<plugin>
  <groupId>org.codehaus.mojo</groupId>
  <artifactId>build-helper-maven-plugin</artifactId>
  <version>1.8</version>
  <executions>
    <execution>
      <id>add-test-source</id>
      <phase>generate-test-sources</phase>
      <goals>
        <goal>add-test-source</goal>
      </goals>
      <configuration>
        <sources>
          <source>${targetFolder}</source>
        </sources>
      </configuration>
    </execution>
  </executions>
</plugin>
```
After this change, try running the tests again:
```shell
mvn test
```
This time, the tests in `src/test/evosuite` should be compiled and executed together with the other
tests.

## Executing EvoSuite tests together with developer written tests
Although our tests executed nicely together with the existing tests, there is potential for 
problems: As you already know, EvoSuite instruments the code under test heavily in order to avoid 
flaky tests. If manually written tests are executed in the same process, they will use the same 
instrumented versions of the classes. To make sure that the instrumentation is only active for
EvoSuite tests, we need to add an initializing listener for the EvoSuite tests. To do this, 
add the following section to the <plugins> section in the <build> part of the pom.xml file:
```xml
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-surefire-plugin</artifactId>
  <version>2.17</version>
  <configuration>
    <properties>
      <property>
        <name>listener</name>
        <value>org.evosuite.runtime.InitializingListener</value>
      </property>
    </properties>
  </configuration>
</plugin>
```
In our small example you will not see a difference, but in practice you might.
