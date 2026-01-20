# 📝 Simple Task Management System (Java – Console App)

A lightweight **console-based Task Management System** built using **Core Java**. This project demonstrates fundamental Java concepts such as **OOP**, **Collections**, **Enums**, and **user input handling** through a clean command-line interface.

---

## 🎯 Objective

To build a **simple console-based Task Management System** using **Core Java**, focusing on:

* Object-Oriented Programming (OOP)
* Enum usage for fixed status values
* Collection framework (`ArrayList`)
* User input handling via `Scanner`

This project is designed for **Java beginners** to practice clean code, logic building, and CLI interaction.

---

## 📌 Task Details

Each **Task** contains the following attributes:

| Field       | Type   | Description                    |
| ----------- | ------ | ------------------------------ |
| id          | int    | Unique identifier for the task |
| title       | String | Short title of the task        |
| description | String | Detailed task description      |
| status      | enum   | Current task status            |

### 🔄 Task Status (`enum`)

* `PENDING`
* `IN_PROGRESS`
* `DONE`

---

## ⚙️ Features

✔ Add a new task using console input
✔ View all existing tasks
✔ Update task status using Task ID
✔ Delete a task by Task ID
✔ Enum-based status handling (`PENDING`, `IN_PROGRESS`, `DONE`)
✔ Clear console messages & feedback

---

✔ Add a new task
✔ View all tasks
✔ Update task status
✔ Delete a task
✔ Input validation with user-friendly messages

---

## 🖥️ Command Line Interface (Actual Program Flow)

The following interaction is taken directly from the running application:

```
WELCOME TO TASK MANAGEMENT SYSTEM

############## MAIN MENU ##############

PLEASE SELECT AN OPTION: ADD TASK, VIEW TASK, UPDATE STATUS, DELETE TASK, EXIT

ADD TASK

Enter Task ID(integer):

100

Enter Title(string):

TITLE 1

Enter Description(string):

DESCRITION 1

Please enter Status(PENDING, IN_PROGRESS, DONE):

PENDING

ID: 100, Title: TITLE 1, Description: DESCRITION 1, Status: PENDING has been successfully created



VIEW TASK

ID: 100, Title: TITLE 1, Description: DESCRITION 1, Status: PENDING

UPDATE STATUS

Enter Task ID

100

Please enter New Status(PENDING, IN_PROGRESS, DONE)

IN_PROGRESS

TASK ID: 100 Has been successfully updagted to: IN_PROGRESS




DELETE TASK

Enter Task ID

100

TASK ID: 100 Has been successfully deleted

EXIT
```

WELCOME TO TASK MANAGEMENT SYSTEM
############## MAIN MENU ##############
PLEASE SELECT AN OPTION: ADD TASK, VIEW TASK, UPDATE STATUS, DELETE TASK, EXIT

ADD TASK
Enter Task ID(integer):
100
Enter Title(string):
TITLE 1
Enter Description(string):
DESCRIPTION 1
Please enter Status(PENDING, IN_PROGRESS, DONE):
PENDING
Task successfully created.

VIEW TASK
ID: 100, Title: TITLE 1, Description: DESCRIPTION 1, Status: PENDING

UPDATE STATUS
Enter Task ID:
100
Enter New Status:
IN_PROGRESS
Task status updated successfully.

DELETE TASK
Enter Task ID:
100
Task deleted successfully.

EXIT

```

---

## 🧠 Technical Guidelines

- **Language:** Java (Core Java only)
- **Storage:** In-memory (`ArrayList<Task>`)
- **Input Handling:** `Scanner`
- **Architecture:** Simple procedural flow with OOP model
- **No database / No frameworks**

### 🔧 Java Concepts Used

- `class` & `object`
- `enum` for task status management
- `ArrayList` for dynamic task storage
- `Scanner` for command-line input
- Loops & conditional statements

---

## 📂 Project Structure

```

TaskManagementSystem/
│
├── main.java          // Entry point, menu loop & user interaction
├── Task.java          // Task entity (OOP model)
├── Status.java        // Enum for task status
└── README.md          // Project documentation

```
TaskManagementSystem/
│
├── Main.java          // Entry point & menu handling
├── Task.java          // Task model class
├── Status.java        // Enum for task status
└── README.md          // Project documentation
```

---

## 🚀 How to Run

1. Clone the repository

   ```bash
   git clone https://github.com/abu112bakr/java_task_managementv1.git
   ```
2. Compile the program

   ```bash
   javac Main.java
   ```
3. Run the application

   ```bash
   java Main
   ```

---

## 📈 Future Improvements (Optional)

* Input validation for duplicate task IDs
* Case-insensitive menu options
* Search task by ID or title
* Persist data using files or a database

---

## 👨‍💻 Author

Developed as a **Java learning project** to strengthen understanding of core programming concepts.

---

⭐ If you find this project helpful, feel free to star the repository!
