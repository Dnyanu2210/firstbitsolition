🖤💼 EMPLOYEE MANAGEMENT SYSTEM – JAVA PROJECT

⚡ NEON EMS – CONSOLE BASED JAVA PROJECT (MVC-1)
👤 Employee | 🧑‍💼 HR | 🧾 Admin | 📊 Sales Manager | 🧠 OOP | MVC-1

🌌 Overview

This Employee Management System (EMS) is built completely using Object-Oriented Programming in Java and follows the MVC-1 architecture.
It is a console-based application designed to manage different types of employees such as HR, Admin, and Sales Manager.

Employee data is maintained in memory using arrays and handled through a DAO layer.
This project focuses on clean design, OOP principles, and MVC-1 flow.

🔥 Highlight Features

⚫ Employee Types Supported	Neon Mode Description
👤 HR	Basic salary with incentives
🧾 Admin	Salary + allowance calculation
📊 Sales Manager	Salary + commission
📦 DAO Layer	Centralized employee data handling
🧠 MVC-1	View and Controller combined

🧩 Core Functionalities

✔ Add Employee (HR / Admin / Sales Manager)
✔ Search Employee by ID
✔ Update Employee Salary
✔ Delete Employee
✔ Display All Employees

🧠 OOP Concepts Used (Neon Edition)

Abstraction – Employee is the base abstract class

Inheritance – HR, Admin, SalesManager extend Employee

Polymorphism – calculateSalary() overridden in subclasses

Encapsulation – Employee data wrapped inside classes

DAO Pattern – EmployeeDAO manages employee storage

🗂️ Project Folder Structure 🖤

EmployeeManagementSystem/
│
├── Model/
│   ├── Employee.java
│   ├── HR.java
│   ├── Admin.java
│   ├── SalesManager.java
│
├── Controller/
│   ├── EmployeeController.java
│   ├── EmployeeDAO.java
│
├── View/
│   ├── EmployeeView.java
│
├── TestClass/
│   ├── TestApp.java
│
└── README.md


🎮 Console Menu Preview

===== EMPLOYEE MANAGEMENT SYSTEM =====
1. Add an Employee
2. Search an Employee
3. Update an Employee
4. Delete an Employee
5. Display all Employees
0. Exit


🖥️ How to Run This Project 🔥

⚡ Compile

javac TestApp.java


💀 Run

java TestApp


⚡ Sample Neon Output

Admin added successfully!
Employee ID: 101 | Name: Rahul

Employee Found Successfully!
Salary Updated Successfully!
Employee Deleted Successfully!


📸 Screenshots (Optional Section)

Add your console screenshots here:

/screenshots/menu.png
/screenshots/output.png


🧩 Future Enhancements (Neon Wishlist)

🌑 Replace Array with List
💾 Add File Handling
🗄 Database Integration (MySQL)
🖥 GUI using JavaFX

👨‍💻 Author

Dnyaneshwari Rokade
⭐ GitHub: https://github.com/Dnyanu2210

📧 Email: dnyaneshwarirokade21@gmail.com

🎤 Viva-Ready One Line

“This project is a console-based Employee Management System built using MVC-1 architecture and OOP concepts with in-memory data storage.”
