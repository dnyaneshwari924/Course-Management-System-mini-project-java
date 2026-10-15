
# Course Management System

A Java console-based mini project to manage **courses**, **students**, and **student enrollments**. It is built with Core Java concepts such as classes, objects, constructors, methods, `ArrayList`, loops, conditional statements, `switch` cases, and exception handling.

This project is designed for beginners to understand how a menu-driven Java application works.

---

## Objectives

- Add, display, search, update, and delete courses
- Add and display student details
- Enroll students in available courses
- View student-course enrollment records
- Practice Object-Oriented Programming (OOP) and exception handling in Java

## Technologies Used

| Item             | Details                    |
| ---------------- | -------------------------- |
| Language         | Java                       |
| Application Type | Console-based application  |
| IDE              | Eclipse                    |
| Data Storage     | `ArrayList` (in-memory)    |
| Input            | `Scanner`                  |

> **Note:** This version does **not** use MySQL or JDBC. Data is stored in memory and is cleared when the program stops.

## Project Structure

```
CourseManagementSystem
└── src
    └── coursemanagement
        ├── Course.java
        ├── Student.java
        ├── Enrollment.java
        └── CourseManagementSystem.java
```

## Features

1. Add Course
2. View Courses
3. Search Course by ID
4. Update Course
5. Delete Course
6. Add Student
7. View Students
8. Enroll Student in a Course
9. View Enrollments
10. Exit

The program also checks for duplicate course and student IDs, and validates that the selected student and course exist before creating an enrollment.

## Concepts Used

- **Class and Object** – `Course`, `Student`, and `Enrollment` represent the project entities
- **Constructor** – initializes course, student, and enrollment objects
- **Methods** – separate methods perform individual operations
- **ArrayList** – stores course, student, and enrollment objects while the program is running
- **Scanner** – reads user input from the console
- **Control Statements** – `if`, `for`, `while`, and `switch` control program flow
- **Exception Handling** – `try-catch` blocks handle invalid input and prevent many input errors from terminating the program immediately

## How to Run the Project in Eclipse

1. Open Eclipse and create or open the `CourseManagementSystem` Java project.
2. Under `src`, create the package `coursemanagement`.
3. Add the four Java files shown in the project structure.
4. Make sure every file starts with `package coursemanagement;`.
5. Save all files using `Ctrl + S`.
6. Right-click `CourseManagementSystem.java`.
7. Select **Run As → Java Application**.
8. Enter the menu option in the Console and follow the prompts.

## Sample Output

> This is an illustrative sample. Your exact output may vary depending on the inputs you enter.

### Main Menu

```
=================================
     COURSE MANAGEMENT SYSTEM
=================================
1. Add Course
2. View Courses
3. Search Course
4. Update Course
5. Delete Course
6. Add Student
7. View Students
8. Enroll Student
9. View Enrollments
10. Exit
=================================
Enter your choice:
```

### Add Course

```
Enter your choice: 1

----- ADD COURSE -----
Enter Course ID: 101
Enter Course Name: Java
Enter Instructor Name: Dnyaneshwari
Enter Duration in Months: 3
Enter Fees: 5000
Course added successfully!
```

### View Courses

```
Enter your choice: 2

----- ALL COURSES -----
Course ID: 101
Course Name: Java
Instructor: Dnyaneshwari
Duration: 3 months
Fees: 5000.0
-----------------------------
```

### Search Course

```
Enter your choice: 3
Enter Course ID: 101

Course Found:
Course ID: 101
Course Name: Java
Instructor: Dnyaneshwari
Duration: 3 months
Fees: 5000.0
-----------------------------
```

### Update Course

```
Enter your choice: 4
Enter Course ID to update: 101
Enter New Course Name: Advanced Java
Enter New Instructor: Dnyanu
Enter New Duration in Months: 3
Enter New Fees: 6000
Course updated successfully!
```

### Add Student

```
Enter your choice: 6

----- ADD STUDENT -----
Enter Student ID: 201
Enter Student Name: Dnyaneshwari
Enter Email: student@example.com
Student added successfully!
```

### View Students

```
Enter your choice: 7

----- ALL STUDENTS -----
Student ID: 201
Student Name: Dnyaneshwari
Email: student@example.com
-----------------------------
```

### Enroll Student

```
Enter your choice: 8

----- ENROLL STUDENT -----
Enter Student ID: 201
Enter Course ID: 101
Student enrolled successfully!
```

### View Enrollments

```
Enter your choice: 9

----- ALL ENROLLMENTS -----
Student ID: 201
Course ID: 101
-----------------------------
```

### Exception Handling Example

Entering text where a number is expected may display a message such as:

```
Invalid input! Please enter a valid number.
```

The exact message depends on which menu operation is receiving the invalid input.

### Exit

```
Enter your choice: 10
Thank you for using Course Management System!
```

## Limitations

- Data is not permanently saved; it is lost when the application closes
- The current version is a console application, not a graphical user interface
- Authentication and role-based access are not included
- Enrollment records display student and course IDs rather than their full names

## Future Enhancements

- Connect the application to MySQL using JDBC for permanent storage
- Add login and admin access
- Validate email addresses and prevent duplicate enrollments
- Display student and course names in enrollment reports
- Add a graphical interface using Java Swing or JavaFX

## Conclusion

The Course Management System demonstrates how Core Java can be used to build a menu-driven application for managing courses, students, and enrollments. It provides practical experience with OOP, constructors, methods, collections, control statements, and exception handling, and it can be extended with database connectivity and a graphical interface in the future.
