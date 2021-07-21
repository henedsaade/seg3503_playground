# SEG 3503 Laboratory 4

| Information | Value |
| --- | --- |
| Course | SEG 3503 |
| Semester | Summer 2021 |
| Professor | Andrew Forward |
| TA | Aymen Mhamdi |
| Student | Hened Saade (3000111592) |

This is the 7th laboratory for the course SEG3503.

## Compiling and running the program:

Compiled the program with:
```bash
javac -encoding UTF-8 --source-path test -d dist -cp lib/junit-platform-console-standalone-1.7.1.jar test/*.java src/*.java
```

**insert image compiling**

Ran the program with:
```bash
java -cp ./dist Main
```

**insert image running**

## Running SpotBugs:

Ran SpotBugs with:
```bash
java -jar ./lib/spotbugs/lib/spotbugs.jar 
```

**insert image of new_project_spotbugs**

After running, we see there is a total of 18 bugs:

**insert 18bugs image**

### Bug 1: Comparison of String parameter using == or !=

Image of bug 1:
**bug1**

Image of bug 1 fix:
**bug1_fix**

### Bug 2: Certain swing methods needs to be invoked in Swing thread

Image of bug 2:
**bug 2**

Swing method isVisible() is not thread-safe in Java, so it might cause some deadlock or threading issues.

### Bug 3: Could be refactored into a named static inner class

Image of bug 3:
**bug 3**

In CalCFrame class, creating a new inner class WindowAdapter.WindowClosing(WindowEvent e), passing in a WindowEvent as as argument, instead of using a new WindowAdapter. 

### Bug 4: Private method is never called

Image of bug 4:
**bug 4**

Image of bug 4 fix:
**bug 4 fix**

Since the code is never called and it's not a test at all, we can either delete or comment out the block.

### Bug 5 and 6: Boxing/unboxing to parse a primitive

Image of bug 5 and 6:
**bug 5 and 6**

Image of bug 5 and 6 fix:
**bug 5 and 6 fix**

We just need to change the line of code from Double.valueOf(input).doubeValue() to Double.parseDouble(input) method.

### Bug 7 to Bug 12: Unread field: should this field be static?

Image of bug 7-12:
**bug 7 to 12**

Image of bug 7-12 fix:
**bug 7 to 12 fix**

All we need to do is just make them a static value.

### Bug 13: Method uses the same code for two branches

Image of bug 13:
**bug 13**

Image of bug 13 fix:
**bug 13 fix**

Combined the last 2 statement into one else statement. 

### Bug 14: Switch statement found where default case is missing

Image of bug 14:
**bug 14**

Image of bug 14 fix:
**bug 14 fix**

Since we are missing a default case statement, we can just add it towards the end of all the other cases. 

### Bug 15-17: Condition has no effect

Image of bug 15-17:
**bug 15 to 17**

Image of bug 15-17 fix:
**bug 15 to 17 fix**

The whole block of code is unnecessary since the result is regardless of value of i. So we can either delete the statements or comment them out. 

### Bug 18: Condition has no effect 

Image of bug 18:
**bug 18**

Image of bug 18 fix:
**bug 18 fix**

morenums==true, so we can just replace else if (morenums) with else.

## Compiling and running SpotBugs again
Compiled and ran the program again. As expected, all bugs that we fixed no longer showed up in the analysis. 
**analysis 2 bug**
Then, we fix the bug exactly as we did for bug 5 and bug 6:
**analysis 2 bug fix**

## Final compilation and running of SpotBugs

Now, there are only 2 bugs (bug 2 and bug 3, since we didn't fix them. 
**analysis 3**
