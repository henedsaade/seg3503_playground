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
![compiling](https://user-images.githubusercontent.com/55165910/126541762-8e0c269f-bd73-4902-817f-8b9df90c427e.png)

Ran the program with:
```bash
java -cp ./dist Main
```
![running_app](https://user-images.githubusercontent.com/55165910/126541814-b5905b02-f072-4f74-b2c1-4ad303fe3c08.png)

## Running SpotBugs:

Ran SpotBugs with:
```bash
java -jar ./lib/spotbugs/lib/spotbugs.jar 
```
![new_project_spotsbugs](https://user-images.githubusercontent.com/55165910/126541893-5daa117f-67bb-4509-8fda-14d61bfa2663.png)

After running, we see there is a total of 18 bugs:

![18_bugs](https://user-images.githubusercontent.com/55165910/126541922-52815d35-55cc-4207-ac40-f82f5af371e0.png)

### Bug 1: Comparison of String parameter using == or !=

Image of bug 1:

![bug1](https://user-images.githubusercontent.com/55165910/126541949-272e5bf3-e3ed-427e-9366-8a5154b95dab.png)

Image of bug 1 fix:

![bug1_fix](https://user-images.githubusercontent.com/55165910/126541975-761743f7-ec20-4d26-acdd-3b3be775575a.png)

### Bug 2: Certain swing methods needs to be invoked in Swing thread

Image of bug 2:

![bug2](https://user-images.githubusercontent.com/55165910/126541987-8f755e50-e532-4388-a670-b6d0ec8e4bd2.png)

Swing method isVisible() is not thread-safe in Java, so it might cause some deadlock or threading issues.

### Bug 3: Could be refactored into a named static inner class

Image of bug 3:

![bug3](https://user-images.githubusercontent.com/55165910/126542023-f2a72dbe-df76-4993-98d6-19faf6b3c6fd.png)

In CalCFrame class, creating a new inner class WindowAdapter.WindowClosing(WindowEvent e), passing in a WindowEvent as as argument, instead of using a new WindowAdapter. 

### Bug 4: Private method is never called

Image of bug 4:

![bug4](https://user-images.githubusercontent.com/55165910/126542043-b730c314-5bdc-4f17-bc6b-8c28bcad4d97.png)

Image of bug 4 fix:

![bug4_fix](https://user-images.githubusercontent.com/55165910/126542053-92246045-c464-4cdf-89e8-b1394c50173d.png)

Since the code is never called and it's not a test at all, we can either delete or comment out the block.

### Bug 5 and 6: Boxing/unboxing to parse a primitive

Image of bug 5 and 6:

![bug5](https://user-images.githubusercontent.com/55165910/126542068-4d0a0fad-c399-4dbd-a42b-10def8478b37.png)

![bug6](https://user-images.githubusercontent.com/55165910/126542091-25224947-5d0c-4bb2-b289-a3497204f156.png)

Image of bug 5 and 6 fix:

![bug5_fix](https://user-images.githubusercontent.com/55165910/126542108-90bf2585-479f-4345-8160-3ad16ca2d01b.png)

![bug6_fix](https://user-images.githubusercontent.com/55165910/126542117-af8975b8-b189-45c1-94f3-cd18e230eba3.png)

We just need to change the line of code from Double.valueOf(input).doubeValue() to Double.parseDouble(input) method.

### Bug 7 to Bug 12: Unread field: should this field be static?

Image of bug 7-12:

![bug7_to_12](https://user-images.githubusercontent.com/55165910/126542143-bc30cc92-99f3-4b1a-bb60-1acf41da647e.png)

Image of bug 7-12 fix:

![bug7_to_12_fix](https://user-images.githubusercontent.com/55165910/126542164-3d608ed3-a283-4282-9fa9-a7c8731b34ea.png)

All we need to do is just make them a static value.

### Bug 13: Method uses the same code for two branches

Image of bug 13:

![bug13](https://user-images.githubusercontent.com/55165910/126542174-bc0c4994-653c-4666-92a8-142744e7c825.png)

Image of bug 13 fix:

![bug13_fix](https://user-images.githubusercontent.com/55165910/126542182-6b953a95-c348-475d-9bf6-745ff8045dff.png)

Combined the last 2 statement into one else statement. 

### Bug 14: Switch statement found where default case is missing

Image of bug 14:

![bug14](https://user-images.githubusercontent.com/55165910/126542196-033287f7-846d-4d4d-a241-e2e9aaf1e602.png)

Image of bug 14 fix:

![bug14_fix](https://user-images.githubusercontent.com/55165910/126542206-0ee6c9cf-4eee-47e5-a96e-53e94aed241a.png)

Since we are missing a default case statement, we can just add it towards the end of all the other cases. 

### Bug 15-17: Condition has no effect

Image of bug 15-17:

![bug15_to_17](https://user-images.githubusercontent.com/55165910/126542234-56c16f66-5e36-43f6-9abc-f8c7bf7ce881.png)

Image of bug 15-17 fix:

![bug15_to_17_fix](https://user-images.githubusercontent.com/55165910/126542244-9afdfb7b-23b3-447d-a77e-07bc1d917cbd.png)

The whole block of code is unnecessary since the result is regardless of value of i. So we can either delete the statements or comment them out. 

### Bug 18: Condition has no effect 

Image of bug 18:

![bug18](https://user-images.githubusercontent.com/55165910/126542265-0e2bc13f-7433-4220-b100-5416ee6764de.png)

Image of bug 18 fix:

![bug18_fix](https://user-images.githubusercontent.com/55165910/126542277-bd6f2df6-1af2-4243-8c35-d0d764054ac8.png)

morenums==true, so we can just replace else if (morenums) with else.

## Compiling and running SpotBugs again
Compiled and ran the program again. As expected, all bugs that we fixed no longer showed up in the analysis. 

![analysis2_bug](https://user-images.githubusercontent.com/55165910/126542312-cb69ae9c-7efd-4ce5-a645-7b7e87f214bc.png)

Then, we fix the bug exactly as we did for bug 5 and bug 6:

![analysis2_bug_fix](https://user-images.githubusercontent.com/55165910/126542322-08a83f5a-7d3b-4c14-b09f-74aa4611ed1b.png)

## Final compilation and running of SpotBugs

Now, there are only 2 bugs (bug 2 and bug 3, since we didn't fix them. 

![analysis3](https://user-images.githubusercontent.com/55165910/126542330-1ee834bc-0d8e-4e18-8263-9add5b4ed8e4.png)

