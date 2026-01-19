# README – TP_JAVA

## 📌 General Overview

This practical work (TP) is part of the **Object-Oriented Programming in Java (OOP)** course. Its main objective is to practice and consolidate the following concepts:

* Input / Output in Java
* File and directory manipulation
* Exception handling
* Object serialization
* Object-Oriented Programming principles (classes, interfaces, implementations)

The project is divided into **three main parts**, each addressing a specific problem.

---

## 📂 Project Structure

```
TP_JAVA
 ├── exe1
 │   ├── Application.java
 │   ├── Product.java
 │   ├── IProduitMetier.java
 │   └── MetierProduitImpl.java
 ├── EXE2
 │   ├── SimulateLs.java
 │   ├── Calculator.java
 │   ├── Vehicle.java
 │   └── TooFastException.java
 └── README.md
```

---

## 🟦 PART 1: Getting into Practice – Input / Output

### 🔹 Exercise 1: Simulating the `ls` Command

#### 🧩 Problem

The goal of this exercise is to develop a Java program that **simulates the Linux `ls` command**.

The program should:

* Ask the user to enter the **full path of a directory**
* Display the list of files and subdirectories contained in that directory
* Indicate:

  * `<DIR>` for directories
  * `<FILE>` for files
  * Access permissions:

    * `r` if the file is readable
    * `w` if the file is writable
    * `h` if the file is hidden

---

#### 💡 Solution

The solution is based on the `File` class from the `java.io` package.

* The `listFiles()` method is used to retrieve the directory content
* The methods `isDirectory()`, `isFile()`, `canRead()`, `canWrite()`, and `isHidden()` are used to determine the properties of each file

The program then displays the information in a format similar to the `ls` command.

---

#### ▶️ Program Execution

<img width="1037" height="500" alt="image" src="https://github.com/user-attachments/assets/9d05daf5-88df-4de4-a628-ceb68942baa1" />

---

## 🟩 PART 2: Object Serialization – products.dat

### 🔹 Exercise 2: Product Management and Serialization

#### 🧩 Problem

This exercise consists of creating a Java application that **manages a collection of products** and **saves them to a file** using object serialization.

Each product has the following attributes:

* id
* name
* brand
* price
* description
* number in stock

The application must provide a menu that allows the user to:

1. Display the list of products
2. Search for a product by its ID
3. Add a new product
4. Delete a product by its ID
5. Save all products to `products.dat`
6. Exit the program

---

#### 💡 Solution

* The `Product` class implements the `Serializable` interface
* The `IProduitMetier` interface defines the product management methods
* The `MetierProduitImpl` class implements these methods and handles file reading and writing
* The `Application` class contains the `main` method and displays an interactive menu using a `while` loop

Serialization is performed using:

* `ObjectOutputStream` for saving objects
* `ObjectInputStream` for loading objects

---

#### ▶️ Program Execution

<img width="1021" height="510" alt="image" src="https://github.com/user-attachments/assets/33c21042-ba87-4eda-bbf6-b71bf4b5ab97" />
<img width="1026" height="756" alt="image" src="https://github.com/user-attachments/assets/c6a36129-ea20-49af-99c5-69725457f629" />


## 🟨 PART 3: Getting into Practice – Handling Exceptions

### 🔹 Exercise 1: Calculator Error Handling

#### 🧩 Problem

Create a `Calculator` class capable of:

* Performing division while handling division by zero
* Converting a string into a number
* Performing arithmetic operations (+, -, *, /)

The program must display clear error messages when an exception occurs.

---

#### 💡 Solution

* Use of `try / catch` blocks
* Handling `ArithmeticException` and `NumberFormatException`
* Manual validation of unsupported operations

---

#### ▶️ Program Execution

<img width="1041" height="342" alt="image" src="https://github.com/user-attachments/assets/1d369183-89be-4a72-9d85-9ccdfcdcda00" />


### 🔹 Exercise 2: Custom Exception – TooFastException

#### 🧩 Problem

Create a custom exception `TooFastException` that is thrown when a vehicle speed exceeds 90 km/h.

---

#### 💡 Solution

* Creation of the `TooFastException` class extending `Exception`
* Creation of the `Vehicle` class with the `testSpeed()` method
* Throwing the exception if the speed is greater than 90
* Displaying the exception call stack (stack trace)

---

#### ▶️ Program Execution

<img width="1245" height="278" alt="image" src="https://github.com/user-attachments/assets/f80f9293-98d4-44a1-9c94-47931b3534fc" />

## ✅ Conclusion

This practical work helped reinforce the fundamentals of Java object-oriented programming, file handling, exception management, and object serialization. It provides a solid foundation for more advanced Java projects.

**Academic Year:** 2025 / 2026

