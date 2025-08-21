**PART 1**

# AttendanceSystem

This is the initial setup for the Attendance System project.  
It contains a simple Java application that prints **"Welcome to Attendance System"**.

## Steps I Followed

1. **Installed Java JDK**  
   - Downloaded and installed Java JDK from the [Oracle website](https://www.oracle.com/java/technologies/javase-downloads.html).  
   - Verified installation with:  
     ```bash
     java -version
     javac -version
     ```

2. **Set Up VS Code**  
   - Installed [Visual Studio Code](https://code.visualstudio.com/).  
   - Installed the **Code Runner** extension for running Java code easily.

3. **Created Project Structure**  
   - Created the following folders inside the project:  
     ```
     src/com/school/
     ```
   - Inside `src/com/school/`, created `Main.java`.


**code along project**
compile- javac src/Component/src/Main.java
run - java -cp src com.school.Main.

screenshot = https://drive.google.com/file/d/1ZFPg-nVIpQAdG3iOe8u_7gCvMBcSWaJv/view?usp=sharing


**PART 2**

# School Management System - Part 2: Core Domain Modelling

This session focuses on setting up the core domain model for the school management system by defining the main entities: `Student` and `Course`. Arrays are used to manage multiple instances of each.

## Features Implemented

Defined `Student` class with:
Attributes: `studentId`, `name`
Methods: `setDetails()`, `displayDetails()`

Defined `Course` class with:
Attributes: `courseId`, `courseName`
Methods: `setDetails()`, `displayDetails()`

Arrays of `Student` and `Course` objects are created and utilized in `Main.java`
Introduced usage of the `this` keyword for better code clarity

## screenshot

1. https://drive.google.com/file/d/1sZFlvtvzMpiYHGjYKNMHrQJaoSrym17Y/view?usp=sharing
2. https://drive.google.com/file/d/1c54huky5xGFjS37LPNMDFW3_ZjwwLw3f/view?usp=sharing
