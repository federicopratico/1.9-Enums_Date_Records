# 📅 Java Enums & Date Time API

## 📄 Description
This repository contains a set of practical Java exercises designed to master **Type Safety** and **Temporal Logic**. The goal is to write clearer and more modern code by utilizing **Enums** to represent controlled finite values and the **Java Time API** (`java.time`) to handle dates and times robustly, avoiding the pitfalls of legacy classes.



## 📚 Exercise Details

### Level 1: Enums (Enumerations)
**Focus:** Defining constant values, adding logic to enums, and type safety.

* **Exercise 1: Days of the Week**
    * Create an Enum called `Day` containing the days of the week.
    * Implement a method that receives a `Day` object and prints whether it is a **Workday** or a **Weekend**.
* **Exercise 2: Task Priority**
    * Create an Enum called `Level` with values: `LOW`, `MEDIUM`, and `HIGH`.
    * Create a `Task` class that possesses a `Level` attribute.
    * Demonstrate how the behavior of the task changes based on its assigned level.
* **Exercise 3: Enum Behavior**
    * Add methods inside the Enum itself. For example, implement `getColor()` which returns a specific string color code for each `Level`.
* **Exercise 4: String to Enum Conversion**
    * Implement logic to convert a `String` (input by user) into an Enum constant using `valueOf()`.
    * Handle errors gracefully if the provided string does not match any valid Enum constant.

### Level 2: Dates & Times (java.time)
**Focus:** Using `LocalDate`, `LocalTime`, and `LocalDateTime` for precise temporal management.

* **Exercise 1: Current Time**
    * Display the current date and time using `LocalDate` (Date only), `LocalTime` (Time only), and `LocalDateTime` (Both).
* **Exercise 2: Time Differences**
    * Calculate the difference between two specific dates using `Period` (for days/months/years) or `Duration` (for time-based difference).
* **Exercise 3: Date Arithmetic**
    * Perform calculations by adding or subtracting days, months, and hours to a given date.
* **Exercise 4: Formatting**
    * Format a date object into a readable String using `DateTimeFormatter` with various patterns (e.g., "dd/MM/yyyy").
* **Exercise 5: Comparison**
    * Create a function that verifies if a specific date passed as a parameter is **before** the current date (today).
* **Exercise 6: Scheduler/Agenda**
    * Create a simple Agenda system where appointments are stored as `LocalDateTime`.
    * Implement logic to display upcoming appointments.

## 💻 Technologies Used
* **Java 21** - Core language for Enums and Time API.
* **IDE** (IntelliJ IDEA / Eclipse) - Development environment.
* **Git** - Version control.

## 📋 Requirements
* **Java SDK 17** or higher installed locally.
* Basic understanding of:
    * Java Class structures.
    * `try-catch` blocks for validation.
    * Static methods and Object instantiation.

## 🛠️ Installation
1.  Clone this repository:
    ```bash
    git clone https://github.com/federicopratico/1.9-Enums_Date_Records.git
    ```
    or with SSH:
    ```bash
    git clone git@github.com:federicopratico/1.9-Enums_Date_Records.git
    ```

2.  Navigate to the project directory:
    ```bash
    cd 1.9-Enums_Date_Records
    ```
3.  Open the project in your preferred IDE.

## 🚀 Execute
Each level is separated into its own package. To run the exercises:

1.  **Compile the project** using your IDE or terminal.
2.  **Run Level 1:**
    Find the `Main` class in the `Level1` package and run it to see the Enum logic and task prioritization.
3.  **Run Level 2:**
    Find the `Main` class in the `Level2` package. This will output the date calculations, formatted strings, and scheduler results to the console.

## 🤝 Contributions
Contributions are welcome! If you find a bug or want to add a new complexity level (e.g., using `ZonedDateTime`):

1.  **Fork** the repository.
2.  Create a **branch** for your feature:
    ```bash
    git checkout -b feature/TimeZones
    ```
3.  **Commit** your changes:
    ```bash
    git commit -m "feat: Added ZonedDateTime examples"
    ```
4.  **Push** to the branch:
    ```bash
    git push origin feature/TimeZones
    ```
5.  Open a **Pull Request**.
