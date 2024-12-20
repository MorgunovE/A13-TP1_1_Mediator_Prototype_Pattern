package a13Tp1.Mediator.model;

import a13Tp1.Mediator.controller.Chat;

/**
 * Represents an administrator in the chat system.
 */
public class Administrator extends User{

    public Administrator(Chat chat, String name) {

        super(chat, name);
    }


    @Override
    public void receiveMessage(String message) {
        System.out.println("Administrator " + getName() + " received message: '" + message + "'");
    }
}

