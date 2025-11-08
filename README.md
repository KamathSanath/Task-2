# Task-2
contents code of Task 2
Student Exam Score Logger

About

This is a simple Java program made to show how threads can write to a file safely.
Each student is a thread, and they all try to save their exam marks to one file.
To stop the data from getting messed up, I used Java’s synchronized keyword so that only one thread writes at a time.


---

What it does

Creates a few student threads

Each thread writes the student’s name, roll number and marks to a csv file

Uses synchronization to avoid mixing data

Has a small JUnit test to check if file writing works properly



---

Files used

Student.java – holds student info

StudentTask.java – runs as a thread

FileHandler.java – writes to the file safely

Main.java – starts all threads

FileHandlerTest.java – has JUnit test cases



---

Output

When I run the program, it creates a file called student_scores.csv like this:

Sanath,101,89
Rahul,102,90
Neha,103,95

Console shows:

Saved: Sanath
Saved: Rahul
Saved: Neha
All student scores logged successfully!

JUnit output:

Tests run: 2, Failures: 0


---

How to run

1. Open the project in any Java IDE


2. Run Main.java


3. Check the file created in the same folder


4. To test, run FileHandlerTest.java




---

Info

Name: K Sanath Kamath
USN: NNM24IS099
Section: B
Course: CS2002-1 – Object Oriented Programming with Java
Date: 07 November 2025
