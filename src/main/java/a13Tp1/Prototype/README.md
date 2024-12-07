# Prototype Pattern with JavaFX

This project demonstrates the Prototype Design Pattern using JavaFX. It includes various tests to ensure the functionality, compliance, integration, and performance of the `MainController` class.

## Project Structure

- `src/main/java/a13Tp1/Prototype/controller`: Contains the `MainController` class.
- `src/main/java/a13Tp1/Prototype/model`: Contains the `ButtonPrototype` and `PrototypeRegistry` classes.
- `src/main/java/a13Tp1/Prototype/view`: Contains the `MainView` class.
- `src/test/java/a13Tp1/Prototype/acceptance`: Contains the acceptance tests for the `MainController` class.
- `src/test/java/a13Tp1/Prototype/controller`: Contains the unit tests for the `MainController` class.
- `src/test/java/a13Tp1/Prototype/integration`: Contains the integration tests for the `MainController` class.
- `src/test/java/a13Tp1/Prototype/performance`: Contains the performance tests for the `MainController` class.

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

2. Compile and run the application using Maven:
    ```sh
    mvn clean javafx:run
    ```

### Running the Tests

1. Run all tests using Maven:
    ```sh
    mvn test
    ```

2. Verify the project using Maven:
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