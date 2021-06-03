# SEG3503 Laboratory 2

| Information | Value |
| --- | --- |
| Course | SEG 3503 |
| Semester | Summer 2021 |
| Professor | Andrew Forward |
| TA | Aymen Mhamdi |
| Student | Hened Saade (3000111592) |

This is the third laboratory for the course SEG3103.

I am running Java openjdk 16.0.1

## Exercise 1

**Derive a test suite for 100% X coverage for class Date: statement coverage, branch coverage, condition coverage, and condition/branch coverage.**

First, we ran Jacoco against the existing Date tests and observed the coverage.

*PUT COVERAGE REPORT BEFORE AND DATE COVERAGE BEFORE*

To do this we used the following series of commands.  

Compiled the application: `javac -encoding UTF-8 --source-path src -d dist src/*.java`  

Compiled the tests: `javac -encoding UTF-8 --source-path test -d dist -cp dist:lib/junit-platform-console-standalone-1.7.1.jar test/*.java`  

Ran the agent: `java -javaagent:lib/jacocoagent.jar -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path`  

Generated report: `java -jar lib/jacococli.jar report jacoco.exec --classfiles dist --sourcefiles src --html report`  

Then we added additional tests in the DateTest.java file to achieve better coverage. The following image shows the results we obtained.

*PUT COVERAGE REPORT AFTER AND DATE COVERAGE AFTER*

## Exercise 2

**Refactor Date.java. Run coverage after refactoring.**

To refactor Date.java, we decided to make small changes to the methods **setDay()** and **isThirtyDayMonth**. 

Here is the setDay() method before we made any changes : 

*PUT REFACTOR SETDAY BEFORE*

and here is the setDay() method after we refactored it : 

*PUT REFACTOR SETDAY AFTER*

As for the isThirtyDayMonth method, here is the method before we made any changes : 

*PUT REFACTOR ISTHIRTYDAYS BEFORE*

and here is the isThirtyDayMonth method after we refactored it :

*PUT REFACTOR ISTHIRTYDAYS AFTER*

NOTE: I did not use the new tests developed from the first exercice when running this coverage just to observe clearly if the refactor did improve the coverage.

Here is the report that was generated after the refactorisation of both methods : 

*PUT REFACTOR COVERAGE REPORT AFTER REFACTORING*

Compared to the very first coverage report in the first exercise, we can see that the coverage for both refactored method improved. setDay() went from 64% instruction coverage to 80% and isThirtyDayMonth went from 87% branch coverage to 100% branch coverage. 

The instruction coverage for setDay improved due to having less if statement to test. Initially, this method had 5 if statements and after our refactorisation, it only has 3. This is what makes the instruction coverage change for the better.

As for isThirtyDayMonth, the branch coverage improved due to having less possibilites inside the if statement. Before we made changes, the method had 4 OR statements. Now, it only has to check if the month is part of a list of month that have 30 days. This makes the code a bit cleaner and reduces the number of branches to check while testing.


