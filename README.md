

                                          Student Biodata Project
This project is a Java application for managing student biodata using JDBC with Oracle database. It provides functionality to add, remove, update, and display student information, accessible only by administrators.


Table of Contents

Introduction

Features

Requirements

Setup

Usage

Contributing



Introduction

The Student Biodata Project is designed to store and manage biodata information of students in a database. It offers a user-friendly interface for administrators to perform CRUD (Create, Read, Update, Delete) operations on student records.

Features

Add Student: Allows administrators to add new student records with details such as name, age, gender, and contact information.
Remove Student: Enables administrators to remove existing student records from the database based on student ID.
Update Student Details: Provides functionality to update student details including name, age, gender, and contact information.
Display All Students: Displays a list of all student records stored in the database.
Check Student: Allows administrators to search for a specific student record by student ID and view their details.

Requirements

To run this project locally, ensure you have the following installed:

Java Development Kit (JDK)
Oracle Database
JDBC Driver for Oracle

Setup

Clone the repository to your local machine:
bash
Copy code
git clone https://github.com/rahul-thatipamula/studentBioDataProject.git

Set up your Oracle database and configure the JDBC connection properties in the project.

Compile the Java files using the following command:

javac *.java

Run the LoginWindow class file to start the application:

java LoginWindow

Usage

Upon running the application, you will be prompted with a login window where you can enter your admin credentials.
After successful login, you can access various functionalities provided by the application from the Admin Panel.
Only administrators have permission to manipulate the data.

Contributing

Contributions are welcome! If you have any suggestions, bug fixes, or enhancements, feel free to open an issue or create a pull request.

