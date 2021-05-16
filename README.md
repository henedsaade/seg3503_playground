## Synopsis

This repository includes the work for a lab which is used in order to learn and familiarize students with Git/GitHub as well as Java, JUnit and Elixir

## Code Example

Show what the library does as concisely as possible, developers should be able to figure out **how** your project solves their problem by looking at the code example. Make sure the API you are showing off is obvious, and that your code is short and concise.

## Motivation

This project is a the first lab for the course SEG 3503 (Software Quality Assurance) at the University of Ottawa

## Installation

In order to install this project, click on the code button in green and select "Download as ZIP" option

## Tests

**NOTE: the follwing steps will be for a Windows environment. I have included in the Screenshots folder pictures for both the Windows and MacBook environment**

**Java section**

To run the java files, go through the following steps:

1. Go to the directory where you saved the folder "newmath_java"
2. Go to the src folder
3. Enter "javac Main.java" in the command line
4. Enter "Java Main" afterwards 
5. You will now be able to enter values for the numerator and denominator for as long as you'd like.
6. To exit the command prompt, simply enter "exit".

Here is an example:

![running_java_windows](https://user-images.githubusercontent.com/55165910/117217878-2aee5f80-add0-11eb-9a48-db88fb486fed.png)

**JUnit section**

To test the java files, go through the following steps:

1. Go to the directory where you saved the folder "newmath_java"
2. Enter "java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path" in the command line (the junit depends on what you would have in test folder)
3. It will test the file and here is what the output should be:

![testing_java_windows](https://user-images.githubusercontent.com/55165910/117217903-36418b00-add0-11eb-8766-f96e32b426d0.png)

**Elixir section**

To run the elixir files, go through the following steps:

1. Go to the directory where you saved the folder "newmath_ex"
2. Enter "mix compile" in the command line
3. You will now be able to enter values to be divided with the NewmathEx.div method

Here is an example:

![running_elixir_windows](https://user-images.githubusercontent.com/55165910/117218097-86205200-add0-11eb-9b08-d5f6949f58fa.png)

**Elixir tests section**

To test the elixir files, go through the following steps:

1. Go to the directory where you saved the folder "newmath_ex"
2. Enter "mix test" in the command line
3. It will test the files and here's what the output should be:

![testing_elixir_windows](https://user-images.githubusercontent.com/55165910/117218204-b536c380-add0-11eb-9433-a85291baf569.png)

## Contributors

Hened Saade (Student #: 300111592)
