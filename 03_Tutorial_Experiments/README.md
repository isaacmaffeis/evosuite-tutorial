# Tutorial Part 3: Running Experiments
https://www.evosuite.org/documentation/tutorial-part-3/

## What you will learn in this tutorial
- Collecting data on test generation results
- Choosing output variables for data collection
- Basic analysis of the generated data
- Running large experiments with EvoSuite

## Preparing the experiment
For the third part of the tutorial, we will be looking at how one can collect data about the test 
generation, which is usually needed when running experiments on test generation. We will use a 
simple example scenario: EvoSuite by default uses a combination of different coverage criteria. 
What are the effects of this combination over using just branch coverage as target criterion? 
A reasonable hypothesis would be that the combination leads to more tests, and better test suites.
But is that actually true? Let’s do some experiments do find out!

The experiments will involve to run EvoSuite on a number of classes with its default configuration
and configured to only use branch coverage, and then to take different measurements of the resulting
test suites. When doing experiments of this kind, the selection of classes has implications on how 
much our results generalize: If we use a very specific and small selection of classes, then whatever
our findings, they may only be relevant to that particular type of classes. Therefore, we generally 
would want to select as many as possible, as diverse as possible, and as representative as possible 
classes in order to get results that generalize. However, this is not the aim of this tutorial, 
so let’s just use a selection of classes we’ve prepared for this tutorial. As in the previous parts,
please download and extract the archive containing the selection of example classes:

As this is a Maven project, we can compile the classes in the project using Maven again:
```shell
mvn compile
```
e will be invoking EvoSuite directly in this part of the tutorial. To avoid having to set the
classpath repeatedly, let’s set up EvoSuite. First, we need to download all dependency jar files 
of the example project. To make things slightly more challenging, the class tutorial.Bank has a 
(quite artificial) dependency on the Apache Commons Collections library. When running EvoSuite from
Maven, then Maven downloads all dependencies and sets up the classpath for us automatically – 
but when we run EvoSuite directly it is our responsibility to set up a correct classpath. 
Fortunately, this is easy enough: To download all dependencies, type the following Maven command:
```shell
mvn dependency:copy-dependencies -DincludeScope=runtime
```
This command downloads all dependency jar files, and puts them into the target/dependency directory.
The reason for specifying the scope to be runtime using -DincludeScope=runtime is that the project 
has test dependencies on JUnit and EvoSuite – but neither of these dependencies are necessary in
order to generate some tests for the classe under test, we really just need the compile and runtime
dependencies.

Thus, the full project classpath consists of the classes in target/classes and the jar file
`target/dependency/commons-collections-3.2.2.jar`. To create an evosuite.properties file that saves 
this classpath, use the following command:
```shell
java -jar evosuite-1.0.6.jar -setup target/classes target/dependency/commons-collections-3.2.2.jar
```
(you need the evosuite-1.0.6.jar in the root directory of the project)

Check that the resulting `evosuite-files/evosuite.properties` at the top has the correct classpath set:
```
CP=target/classes;target/dependency/commons-collections-3.2.2.jar
```
## Collecting data with EvoSuite
Let’s start by invoking EvoSuite on one of the classes in the project:
```shell
java -jar evosuite-1.0.6.jar -class tutorial.Person
```
We have already had a closer look at the test suites that EvoSuite produces. 
However, EvoSuite also produces data to document what happened. 
This is stored in the following file:
```
evosuite-report/statistics.csv
```
Use your favourite editor to have a closer look at this file. You should see something like this:
```
TARGET_CLASS,criterion,Coverage,Total_Goals,Covered_Goals
tutorial.Person,LINE;BRANCH;EXCEPTION;WEAKMUTATION;OUTPUT;METHOD;METHODNOEXCEPTION;CBRANCH,1.0,25,25
```
This file is in comma-separated value format.
The first row contains headers showing what the individual columns contain, 
and then the rows contain the actual data. The first column contains the name of the 
class we tested (`tutorial.Person`). The second column shows us the coverage criteria 
that we used – in this case we see the full list of criteria that EvoSuite uses by
default, separated by semicolons. The third column tells us the achieved coverage 
– 1.0 in this case, which means we have 100% coverage. This is calculated based 
on the ratio of coverage goals covered to total goals (last two columns).

Let’s test the same class again, but this time only using branch coverage:
```shell
java -jar evosuite-1.0.6.jar -class tutorial.Person -criterion branch
```
If we look at `evosuite-report/statistics.csv` again we’ll see a new row:
```
TARGET_CLASS,criterion,Coverage,Total_Goals,Covered_Goals
tutorial.Person,LINE;BRANCH;EXCEPTION;WEAKMUTATION;OUTPUT;METHOD;METHODNOEXCEPTION;CBRANCH,1.0,25,25
tutorial.Person,BRANCH,1.0,3,3
```
As you can see, we now have a new entry for our second call to EvoSuite,
where we specified only branch coverage as target criterion. There are three branches,
and EvoSuite successfully covered all three of them.

Let’s try another class and criterion:
```shell
java -jar evosuite-1.0.6.jar -class tutorial.Company -criterion line
```
Again, the `evosuite-report/statistics.csv` file will now contain a new line:
```
TARGET_CLASS,criterion,Coverage,Total_Goals,Covered_Goals
tutorial.Person,LINE;BRANCH;EXCEPTION;WEAKMUTATION;OUTPUT;METHOD;METHODNOEXCEPTION;CBRANCH,1.0,25,25
tutorial.Person,BRANCH,1.0,3,3
tutorial.Company,LINE,1.0,3,3   
```
The `tutorial.Company` class has three lines of code, and the generated tests cover all of them. 
Great!

## Setting output variables
We now know where to find data about the test generation. However, the data we have seen does not
help us to answer the questions we would like to investigate. Recall that our scenario was that we
wanted to know if the default combination of criteria leads to more tests, and better test suites. 
We cannot answer this with the data in the `statistics.csv` files currently – the coverage values 
cannot be compared (they refer to different criteria), and neither can the numbers of goals.

Fortunately, we can generate more data than just the columns our data file has shown us so far. 
EvoSuite has a property `output_variables` which determines which values should be written to the 
`statistics.csv` file.

Before we do that, let’s remove the old `statistics.csv` file:
```shell
rm evosuite-report/statistics.csv
```
This is important if we decide to change the columns of the data files – our data file currently 
has a header row and three data rows that assume there are five columns; if we change the columns,
and additional rows will not match the existing data.

Now, let’s include some new values. There are two main types of output variables: runtime variables 
are the result of computation (e.g., the coverage), whereas properties are the input properties we 
can set. For example, TARGET_CRITERION and coverage are properties, whereas Total_Goals and 
Covered_Goals are runtime variables. There are some inconsistencies in terms of which variables 
are capitalised – this is for historic reasons, as changing the runtime variable names may break 
existing experimental infrastructure. However, in a future major release we may decide to change 
the variable names to a consistent format._

Let’s think about what values we would like to include. Our first question is whether the 
combination of criteria leads to more tests. The corresponding output variable is ‘Size’, which
reports the number of tests. However, let’s not forget that these are unit tests, where a single 
test can consist of several statements. Thus, we can also use the ‘Length’ variable to count the 
total number of statements, which is maybe a better representation of the size of a test suite.

Our second question is whether the combination of criteria leads to better tests. A standard way 
to evaluate test suites is by measuring coverage – but which criterion would we use to measure this?
A better way might be to compare the test suites in terms of their mutation scores. The mutation 
score is a metric based on the idea of 
[Mutation Analysis (https://en.wikipedia.org/wiki/Mutation_testing)], and quantifies how many
artificial faults a test suite can find. There are several mutation analysis frameworks for 
Java available, but EvoSuite also has a basic mutation functionality integrated, as it can aim
to generate tests that kill mutants directly. The output variable for this is ‘MutationScore’.

To summarize, for our experiment we would like to have the following data:
`* Class under test(TARGET_CLASS) * Criteria (criterion) * Size (Size) * Length (Length)* Mutation score (MutationScore)`

The list of variables is passed as a comma separated list to the output_varibles property. 
Let’s try this out:
```shell
java -jar evosuite-1.0.6.jar -class tutorial.Company -criterion branch "-Doutput_variables=TARGET_CLASS,criterion,Size,Length,MutationScore"
```
If you look at the resulting evosuite-report/statistics.csv file, you should see something like this:
```
TARGET_CLASS,criterion,Size,Length,MutationScore
tutorial.Company,BRANCH,1,2,1.0
```
Thus, we have just generated one test consisting of two statements, 
and this test killed all the mutants EvoSuite generated for the class.

If we look at the test suite in `evosuite-tests/tutorial/Company_ESTest.java` you should see 
something like this:
```java
@Test(timeout = 4000)
public void test0()  throws Throwable  {
    Company company0 = new Company("");
    String string0 = company0.getName();
    assertEquals("", string0);
}
```
Note that the assertion is not included in EvoSuite’s statement count. This is because assertions
are not generated as part of the search-based test generation, but are added in a post-processing
step.

## Running an experiment
Now let’s run an actual experiment and gather some data. We would like to get information on all
classes in our project, so we need to run EvoSuite on all of them. Furthermore, let’s not forget 
that EvoSuite is randomized: If you run it twice in sequence, you will get different results. 
That also means that if you get a very large test suite in one run, you may get a test suite with
a different size in the next run. In general, when we have randomized algorithms, we need to run 
repetitions, and statistically analyze our data. Therefore, we’ll generate tests on all our classes,
and repeat this 10 times. Furthermore, we need to do all this twice, once with only branch coverage,
and once with the default criteria.

Before we start the experiment, let’s remove the old statistics.csv file again:
```shell
rm evosuite-report/statistics.csv
```
Now, let’s run the experiment. We will tell EvoSuite to test all classes in the tutorial package 
using the `-prefix` argument, and pass in the target criterion (branch) as well as our output 
variables.
```shell
java -jar evosuite-1.0.6.jar -criterion branch -prefix tutorial "-Doutput_variables=TARGET_CLASS,criterion,Size,Length,MutationScore"
```
If you look at the data file, you should see something like this:
```
TARGET_CLASS,criterion,Size,Length,MutationScore
tutorial.ATM,BRANCH,10,75,0.3888888888888889
tutorial.ATMCard,BRANCH,8,40,1.0
tutorial.Bank,BRANCH,4,15,0.8
tutorial.BankAccount,BRANCH,2,6,0.8
tutorial.Owner,BRANCH,1,1,1.0
tutorial.CurrentAccount,BRANCH,2,7,0.6521739130434783
tutorial.SavingsAccount,BRANCH,2,7,0.8529411764705882
tutorial.Company,BRANCH,1,2,1.0
tutorial.Person,BRANCH,2,4,0.0
```
We now have data for all classes, for the first configuration we are interested in (branch coverage).
If we re-run this command without the `-criterion` branch argument, we’ll get some more data for all
classes for the other configuration. When analysing this data, we can distinguish between the two 
configurations using the value of the column criterion, but considering that the value in the 
default configuration will be 
`LINE;BRANCH;EXCEPTION;WEAKMUTATION;OUTPUT;METHOD;METHODNOEXCEPTION;CBRANCH` 
this is a bit cumbersome. However, we can tell EvoSuite to include a name for the particular
configuration we are running, using the `-Dconfiguration_id=<name>` syntax, and then including 
this property in the output variables. Thus, to run our experiment, we will need the following 
two commands, one for branch coverage, one for the default combination:
```shell
java -jar evosuite-1.0.6.jar -Dconfiguration_id=Branch -criterion branch -prefix tutorial "-Doutput_variables=configuration_id,TARGET_CLASS,criterion,Size,Length,MutationScore"
java -jar evosuite-1.0.6.jar -Dconfiguration_id=Default -prefix tutorial "-Doutput_variables=configuration_id,TARGET_CLASS,criterion,Size,Length,MutationScore"
```
The result will be something like the following in our evosuite-report/statistics.csv:
```
configuration_id,TARGET_CLASS,criterion,Size,Length,MutationScore
Default,tutorial.ATM,LINE;BRANCH;EXCEPTION;WEAKMUTATION;OUTPUT;METHOD;METHODNOEXCEPTION;CBRANCH,14,109,0.3611111111111111
Default,tutorial.ATMCard,LINE;BRANCH;EXCEPTION;WEAKMUTATION;OUTPUT;METHOD;METHODNOEXCEPTION;CBRANCH,13,65,1.0
Default,tutorial.Bank,LINE;BRANCH;EXCEPTION;WEAKMUTATION;OUTPUT;METHOD;METHODNOEXCEPTION;CBRANCH,6,22,0.8
Default,tutorial.BankAccount,LINE;BRANCH;EXCEPTION;WEAKMUTATION;OUTPUT;METHOD;METHODNOEXCEPTION;CBRANCH,8,24,1.0
Default,tutorial.Owner,LINE;BRANCH;EXCEPTION;WEAKMUTATION;OUTPUT;METHOD;METHODNOEXCEPTION;CBRANCH,1,1,1.0
Default,tutorial.CurrentAccount,LINE;BRANCH;EXCEPTION;WEAKMUTATION;OUTPUT;METHOD;METHODNOEXCEPTION;CBRANCH,4,12,0.7608695652173914
Default,tutorial.SavingsAccount,LINE;BRANCH;EXCEPTION;WEAKMUTATION;OUTPUT;METHOD;METHODNOEXCEPTION;CBRANCH,4,12,0.8823529411764706
Default,tutorial.Company,LINE;BRANCH;EXCEPTION;WEAKMUTATION;OUTPUT;METHOD;METHODNOEXCEPTION;CBRANCH,3,6,1.0
Default,tutorial.Person,LINE;BRANCH;EXCEPTION;WEAKMUTATION;OUTPUT;METHOD;METHODNOEXCEPTION;CBRANCH,6,12,1.0
Branch,tutorial.ATM,BRANCH,10,77,0.4166666666666667
Branch,tutorial.ATMCard,BRANCH,8,40,1.0
Branch,tutorial.Bank,BRANCH,4,15,0.8
Branch,tutorial.BankAccount,BRANCH,2,6,0.8
Branch,tutorial.Owner,BRANCH,1,1,1.0
Branch,tutorial.CurrentAccount,BRANCH,2,7,0.6739130434782609
Branch,tutorial.SavingsAccount,BRANCH,3,8,0.6470588235294118
Branch,tutorial.Company,BRANCH,1,2,1.0
Branch,tutorial.Person,BRANCH,2,4,0.0
```
Just by eyeballing the results, we can see that the default configuration leads to more tests in 
all classes except `tutorial.Owner`. Your specific data will look different – in the data down above, 
the mutation score is higher for `tutorial.Person`, `tutorial.SavingsAccount`, `tutorial.CurrentAccount`, 
but surprisingly, lower for `tutorial.ATM`. How can that be the case? Recall that EvoSuite is 
randomized – sometimes test generation will be lucky to hit a specific value that is good at 
killing some mutants, sometimes it isn’t. What we need to establish, then, is not whether one 
configuration is better than the other in one particular run, but on average. Thus, we need to 
repeat our experiment several times, and do some more rigorous analysis.

A simple way to do the repetitions would be to simply wrap the call in a `bash-loop` to run it, 
for example, 5 times:
```shell
for ($I = 1; $I -le 5; $I++) {
    & java -jar evosuite-1.0.6.jar -Dconfiguration_id=Branch -criterion branch -prefix tutorial "-Doutput_variables=configuration_id,TARGET_CLASS,criterion,Size,Length,MutationScore"
}

for ($I = 1; $I -le 5; $I++) {
    & java -jar evosuite-1.0.6.jar -Dconfiguration_id=Default -prefix tutorial "-Doutput_variables=configuration_id,TARGET_CLASS,criterion,Size,Length,MutationScore"
}
```
This is going to take quite a while. In fact, 5 repetitions is not even a suitably large number for
serious experiments, ideally you’d want 30 repetitions or more to get representative results. 
We will talk about how to run larger experiments a bit later.

You might notice that the branch coverage runs are quicker – this is because EvoSuite stops 
generating tests once it achieves 100% branch coverage. The default configuration will include
some infeasible test goals, i.e., test goals for which there exist no tests, and in this case
EvoSuite will try to generate tests until it has used up the entire time budget.

## Analyzing results
Google Colab Notebook:
https://colab.research.google.com/drive/1zqrI0P_82_8S3Q4-pYzHDhqqjl93Ta-r?usp=sharing

Now we have some data – from at least one run, and if you were patient enough, maybe from 5 or more
additional runs. What are we going to do with that data? The best thing to do now is to use 
statistical analysis package to process and analyze the data. A popular statistical analysis 
package is the [R Project for Statistical Computing](https://www.r-project.org), 
which is also what we use to do analyzes for scientific papers based on EvoSuite.

For a quick and easy way to analyze the data, let’s simply use Python in this tutorial. 
This step assumes you have Python installed on your system. You will need the numpy, matplotlib,
and pandas Python libraries, which you can install using your operating system’s package manager,
or using easy_install:
```shell
easy_install numpy
easy_install matplotlib
easy_install pandas
```
If this is all installed, then we can easily read our statistics.csv file using pandas 
(pandas.read_csv('statistics.csv)) and then use the resulting data frame object to do some plots. 
For example, the following script creates three boxplots that compare branch coverage and the 
default criteria in terms of the number of tests (Size), number of statements (Length) and 
mutation score (MutationScore):
```python
#!/usr/bin/python

import matplotlib.pyplot as plt
import pandas as pd

df = pd.read_csv('statistics.csv') # Make sure the path is correct
bp = df.boxplot(column='Size', by='configuration_id')
bp = df.boxplot(column='Length', by='configuration_id')
bp = df.boxplot(column='MutationScore', by='configuration_id')
plt.show()
```
The final command (plt.show()) will use matplotlib to open up three windows for the three plots.
In all plots we can clearly see that branch coverage, on average, produces fewer tests, 
fewer statements, and these tests achieve lower mutation scores.

Although the difference is visible in the boxplots, in a scientific context it is always good to 
demonstrate such differences using statistical analysis. In particular, we typically want to 
quantify the size of the effect, and we want to quantify our confidence in the difference. 
For the first of these values, there are different effect size measurements available. 
Let’s use [Cohen’s-d](https://en.wikiversity.org/wiki/Cohen%27s_d), which is a value in the 
range of [-1, 1]. To quantify our confidence in the result, we will use the well-known 
[p-value](https://en.wikipedia.org/wiki/P-value), which is the probability that the observed 
result is not an effect of what we are actually testing for. To calculate the p-value we need to 
choose an appropriate statistical test. Let’s use a Wilcoxon rank test, but the choice of 
statistical test is really beyond this tutorial. Statistical tests are fortunately all available
as part of SciPy, so let’s make sure this is installed:
```shell
easy_install scipy
```
All we have to do to perform a statistical test is create to arrays of values, and pass them in as
parameters of to the scipy.stats.wilcoxon function, which will then give us the p-value. Typically,
a p-value of less than 0.05 is seen as evidence of a statistically significant result, so that’s
what we’re hoping for.

To produce the input arrays to the statistical test, we can use the pandas library again; 
we just need to select subsets of the data. For example, to select all data belonging to the 
Default configuration, we would filter our dataset using `df[df['configuration_id]=='Default']`. 
Within the resulting data, we can select columns, e.g. Size. To calculate Cohen’s-d, we simply take 
a snippet from Stackoverflow:
```python
#!/usr/bin/python

import pandas as pd
from scipy.stats import wilcoxon
from numpy import mean, std # version >= 1.7.1 && <= 1.9.1
from math import sqrt

# From http://stackoverflow.com/questions/21532471/how-to-calculate-cohens-d-in-python
def cohen_d(x,y):
  return (mean(x) - mean(y)) / sqrt((std(x, ddof=1) ** 2 + std(y, ddof=1) ** 2) / 2.0)


df = pd.read_csv('statistics.csv')

cat1 = df[df['configuration_id']=='Default']
cat2 = df[df['configuration_id']=='Branch']

for column in ['Size', 'Length', 'MutationScore']:
  print "%s: %.2f (%f)" % (column, cohen_d(cat1[column], cat2[column]), wilcoxon(cat1[column], cat2[column]).pvalue)
```
If we run the script, we will see some output similar to the following:
```
Size: 0.76 (0.000402)
Length: 0.38 (0.000430)
MutationScore: 0.67 (0.006838)
```
In this case, all three p-values are smaller than 0.05 so we now know that with 95% confidence the
test suites generated for branch coverage have different sizes, numbers of statements,
and mutation scores than those generated for the default criteria. The effect size tells us
that for all three of these properties there is a medium increase when using the default
configuration over the branch configuration. So all in all, it sounds like a good idea to use
the default configuration! (After all, that is why it is the default configuration…).

## Other useful variables
To get a full overview of the available output variables, the best place is currently the source 
code, in particular the file 
[RuntimeVariable.java](https://github.com/EvoSuite/evosuite/blob/master/client/src/main/java/org/evosuite/statistics/RuntimeVariable.java).

For example, if you want to know how certain values evolved over time, there are timeline variables
that capture this data for you. Assume we would like to see how branch coverage evolves over the 
first 30 seconds of the search, and we want to sample once every second. To do this, we would add 
an output variable “CoverageTimeline”, and specify the sampling interval using
`-Dtimeline_interval=1000`:
```shell
java -jar evosuite-1.0.6.jar -class tutorial.ATM -criterion branch  "-Doutput_variables=TARGET_CLASS,BranchCoverage,CoverageTimeline" -Dtimeline_interval=1000 -Dsearch_budget=30
```
As we specified a time budget of 30 seconds in total `-Dsearch_budget=30`, the statistics.csv file 
will now have 30 columns labeled `CoverageTimeline_T1` up to `CoverageTimeline_T30`, with the individual
values for each second of the search.

As another interesting example, the `BranchCoverageBitString` variable will produce a string of ‘0’ 
and ‘1’ digits, where each digit represents one branch in the program, and 1 indicates that the
branch was covered. This bitstring allows us to compare whether specific branches were covered 
by specific configurations.

## Running large scale experiments
Running just our small experiment already took quite some time. If you want to run some serious 
experiments, for example because you want to write a scientific paper for a software engineering
research conference, then the experiment would require to be run on many more classes. For example,
if we run experiments on a new feature of EvoSuite, we typically use all classes of the 
[SF110](http://www.evosuite.org/experimental-data/sf110/) corpus of classes 
(which has more than 20,000 classes) or at least a large sample thereof. How does that scale up?

We are in a lucky position where we have access to large clusters of computers, 
managed using the Sun Grid Engine software. This allows us to heavily parallelize the experiment, 
which makes larger experiments feasible. Some notes if you want to take a similar approach:

- When running large experiments, the progress bar that EvoSuite shows on the command line will waste space in your log files. Deactivate it by adding -Dshow_progress=false.
- When running multiple EvoSuite jobs in parallel, make sure they do not attempt to write to the same evosuite-report/statistics.csv, as simultaneous access would break this file. Instead, use the property -Dreport_dir=<directory> to set different directories for different jobs. When the experiments are done, you will need to aggregate the individual result files into one large data file again.
