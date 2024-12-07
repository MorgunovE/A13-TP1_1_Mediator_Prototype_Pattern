# Mediator and Prototype Patterns

## Overview
This project demonstrates the implementation of the **Mediator Design Pattern** using a chat system and the **Prototype Design Pattern** using JavaFX. It includes various tests to ensure the functionality, compliance, integration, and performance of the `MainController` class.

## Project Structure

### Mediator Pattern: Chat System
- **Model**:
    - `IUser`: Interface representing a user.
    - `User`: Abstract base class for users.
    - `SimpleUser`: Represents a regular user.
    - `Administrator`: Represents a chat administrator.
- **Controller**:
    - `Chat`: Mediator interface for communication.
    - `TextChat`: Implementation of the `Chat` interface, managing users and message exchange.
- **Main**:
    - Demonstrates the interaction between components.

### Prototype Pattern with JavaFX
- **Controller**:
    - `MainController`: Manages the creation of buttons and prototype management.
- **Model**:
    - `ButtonPrototype`: Represents a button prototype.
    - `PrototypeRegistry`: Registry for storing and retrieving prototypes.
- **View**:
    - `MainView`: Responsible for displaying the JavaFX interface.
- **Tests**:
    - `src/test/java/a13Tp1/Prototype/acceptance`: Acceptance tests for the `MainController` class.
    - `src/test/java/a13Tp1/Prototype/controller`: Unit tests for the `MainController` class.
    - `src/test/java/a13Tp1/Prototype/integration`: Integration tests for the `MainController` class.
    - `src/test/java/a13Tp1/Prototype/performance`: Performance tests for the `MainController` class.

## Prerequisites

- Java 11 or higher
- Maven 3.6.0 or higher

## How to Run

### Running the Application

1. Clone the repository:
    ```sh
    git clone <repository-url>
    cd <repository-directory>
    ```

2. Compile and run the application Prototype using Maven from root:
    ```sh
    mvn clean javafx:run
    ```
3. Run the application Mediator  from src/main/java/a13Tp1/Mediator/Main.java

### Running the Tests

1. Run all tests Prototype using Maven from root:
    ```sh
    mvn test
    ```

2. Verify the project Prototype using Maven from root:
    ```sh
    mvn verify
    ```

## Dependencies

The project uses the following dependencies:
- JavaFX
- JUnit 5
- TestFX

These dependencies are managed in the `pom.xml` file.

## Checking Java JDK Version

Ensure you have the correct Java JDK version installed:
```sh
java -version