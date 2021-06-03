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

First, I ran Jacoco against the existing Date tests and observed the coverage.

![Coverage Report Before](https://user-images.githubusercontent.com/55165910/120568633-41dd9d00-c3e2-11eb-8ea3-582da9a0a64a.png)

![Date Coverage Report Before](https://user-images.githubusercontent.com/55165910/120568674-4efa8c00-c3e2-11eb-86e3-9d54a7108a28.png)

To do this we used the following series of commands.  

Compiled the application: `javac -encoding UTF-8 --source-path src -d dist src/*.java`  

Compiled the tests: `javac -encoding UTF-8 --source-path test -d dist -cp dist:lib/junit-platform-console-standalone-1.7.1.jar test/*.java`  

Ran the agent: `java -javaagent:lib/jacocoagent.jar -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path`  

Generated report: `java -jar lib/jacococli.jar report jacoco.exec --classfiles dist --sourcefiles src --html report`  

Then we added additional tests in the DateTest.java file to achieve better coverage. The following image shows the results obtained

![Coverage Report After Additional Test Pt1](https://user-images.githubusercontent.com/55165910/120568766-8c5f1980-c3e2-11eb-9275-69498d0d7826.png)

![Coverage Report After Additional Test Pt2](https://user-images.githubusercontent.com/55165910/120568770-8f5a0a00-c3e2-11eb-95ce-f6a9da4a8166.png)

## Exercise 2

**Refactor Date.java. Run coverage after refactoring.**

To refactor Date.java, we decided to make small changes to the methods **setDay()** and **isThirtyDayMonth**. 

Here is the setDay() method before I made any changes : 

![Refactor Before Any Changes setDay](https://user-images.githubusercontent.com/55165910/120568796-a0a31680-c3e2-11eb-936d-d74ce411422b.png)

and here is the setDay() method after I refactored it : 

![Refactor After Changes setDay](https://user-images.githubusercontent.com/55165910/120568802-aac51500-c3e2-11eb-9ff4-041c9e514b4a.png)

As for the isThirtyDayMonth method, here is the method before I made any changes : 

![Refactor Before Changes isThirtyDayMonth](https://user-images.githubusercontent.com/55165910/120568813-b0225f80-c3e2-11eb-8cab-ef1d1a2aeaf7.png)

and here is the isThirtyDayMonth method after I refactored it :

![Refactor After Changes isThirtyDayMonth](https://user-images.githubusercontent.com/55165910/120568823-b6184080-c3e2-11eb-82a5-09d5d95b4f46.png)

NOTE: I did not use the new tests developed from the first exercice when running this coverage just to observe clearly if the refactor did improve the coverage.

Here is the report that was generated after the refactorisation of both methods : 

![Coverage Report After Refactoring](https://user-images.githubusercontent.com/55165910/120568840-bd3f4e80-c3e2-11eb-9cb2-520dd7d2a287.png)

Compared to the very first coverage report in the first exercise, we can see that the coverage for both refactored method improved. setDay() went from 64% instruction coverage to 80% and isThirtyDayMonth went from 87% branch coverage to 100% branch coverage. 

The instruction coverage for setDay improved due to having less if statement to test. Initially, this method had 5 if statements and after our refactorisation, it only has 3. This is what makes the instruction coverage change for the better.

As for isThirtyDayMonth, the branch coverage improved due to having less possibilites inside the if statement. Before we made changes, the method had 4 OR statements. Now, it only has to check if the month is part of a list of month that have 30 days. This makes the code a bit cleaner and reduces the number of branches to check while testing.


