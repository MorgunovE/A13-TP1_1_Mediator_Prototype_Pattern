# Mediator Pattern: Chat System

## Overview
This project demonstrates the implementation of the **Mediator Design Pattern** using a chat system. In this system:
- Users interact indirectly through a mediator (`TextChat`).
- Administrators and simple users have distinct roles and communication privileges.

## Structure
The project is divided into the following components:
1. **Model**:
    - `IUser`: Interface representing a user.
    - `User`: Abstract base class for users.
    - `SimpleUser`: Represents a regular user.
    - `Administrator`: Represents a chat administrator.
2. **Controller**:
    - `Chat`: Mediator interface for communication.
    - `TextChat`: Implementation of the `Chat` interface, managing users and message exchange.
3. **Main**:
    - Demonstrates the interaction between components.

## Features
- Users can send and receive messages through the `TextChat` mediator.
- Only administrators can add users to the chat.
- Messages are filtered based on the user's status (enabled/disabled).

## How to Run
1. Compile all Java files in the project.
2. Run the `Main` class to see the chat system in action.

## Design Principles
- **Encapsulation**: The mediator encapsulates the logic of interaction between users.
- **Loose Coupling**: Users do not interact directly, promoting separation of concerns.

## Example Output
User Abby received message: 'Hi!!' Administrator Big Boss received message: 'Abby: Hi!!'


## License
This project is open-source and free to use for educational purposes.