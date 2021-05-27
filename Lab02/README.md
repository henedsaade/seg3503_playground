# SEG3503 Laboratory 2

| Information | Value |
| --- | --- |
| Course | SEG 3503 |
| Semester | Summer 2021 |
| Professor | Andrew Forward |
| TA | Aymen Mhamdi |
| Student | Hened Saade (3000111592) |

This is the second laboratory for the course SEG3103.

I am running Java openjdk 16.0.1

![java](assets/java.jpg)

## Exercise 1:

I am running jar file 'user-registration-app-0.1.0.jar' (in `registration`):

```bash
java -jar  user-registration-app-0.1.0.jar
```
![runningreg](https://user-images.githubusercontent.com/55165910/119901397-dbeda300-bf13-11eb-9638-761737c6f2f6.jpg)
![localhost](assets/localhost.PNG)

I used the test cases given in the tutorial

Here is the results:

Test Case |  Expected Results             | Actual Results                   | Verdict(Pass, Fail, Inconclusive)
----------|-------------------------------|----------------------------------|----------------------------------
1         | registration request accepted | registration request accepted    | Pass
2         | registration request accepted | registration request accepted    | Pass
3         | registration request accepted | registration request accepted    | Pass
4         | registration request accepted | registration request accepted    | Pass
5         | Err1                          | Err1 and Err3                    | Fail
6         | Err3                          | Err1 and Err3                    | Fail
7         | Err3                          | Err3                             | Pass
8         | Err1                          | Err1                             | Pass

![case1](assets/case1.JPG)
![case1result](assets/case1result.JPG)
![case2](assets/case2.JPG)
![case2result](assets/case2result.JPG)
![case3](assets/case3.JPG)
![case3result](assets/case3result.JPG)
![case4](assets/case4.JPG)
![case4result](assets/case4result.JPG)
![case5](assets/case5.JPG)
![case6](assets/case6.JPG)
![case7](assets/case7.JPG)
![case8](assets/case8.JPG)

To run the tests, I use the command

```bash
bin/test
```

Here is the result:

![testing](https://user-images.githubusercontent.com/55165910/119901462-f1fb6380-bf13-11eb-8f07-09cce490a69a.jpg)
![testing21](https://user-images.githubusercontent.com/55165910/119901475-f4f65400-bf13-11eb-9649-7eca25aecb49.jpg)
![testing22](https://user-images.githubusercontent.com/55165910/119901478-f6c01780-bf13-11eb-9443-a598b1f064af.jpg)
