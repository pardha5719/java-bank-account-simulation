# Java Bank Account Simulation
Overview
This project is a simple bank account simulation implemented in Java, based on the requirements from Task 5 in the provided internship PDF.
It demonstrates object-oriented programming concepts such as classes, inheritance, and method overriding.

The program allows users to perform basic banking operations for both Savings and Current accounts through a console menu.

Features
Deposit and withdraw money from Savings and Current accounts.

Savings account enforces a minimum balance rule.

Current account allows overdraft up to a specified limit.

Transaction history for each account type.

Displays confirmation messages for each transaction.

Shows the actual balance when viewing transaction history.

Technologies Used
Java 17

Console-based user interface

Classes
Account

Base class for all accounts

Contains common methods for deposit, withdraw, balance check, and transaction history

SavingsAccount

Inherits from Account

Overrides withdraw method to enforce minimum balance requirement

CurrentAccount

Inherits from Account

Overrides withdraw method to allow overdraft up to a limit

BankAccountSimulation

Contains the main method and menu-driven program logic

How to Run
Save the program as BankAccountSimulation.java.

Open a terminal in the program's folder.

Compile the program:

nginx
Copy
Edit
javac BankAccountSimulation.java
Run the program:

nginx
Copy
Edit
java BankAccountSimulation
Menu Options
Deposit to Savings Account

Withdraw from Savings Account

Deposit to Current Account

Withdraw from Current Account

Show Savings Account transaction history and current balance

Show Current Account transaction history and current balance

Exit the program

Example Workflow
Select option 1 to deposit money into Savings.

Select option 2 to withdraw money from Savings.

Select option 5 to see all transactions and current balance for Savings.

Repeat similar steps for Current account using options 3, 4, and 6.

Project Structure
Copy
Edit
BankAccountSimulation.java
README.md
