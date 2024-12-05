package a13Tp1.Mediator.model;

import a13Tp1.Mediator.controller.Chat;

/**
 * Represents a regular user in the chat system.
 */
public class SimpleUser extends User {

    public SimpleUser(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("User " + getName() + " received message: '" + message + "'");
    }
}
