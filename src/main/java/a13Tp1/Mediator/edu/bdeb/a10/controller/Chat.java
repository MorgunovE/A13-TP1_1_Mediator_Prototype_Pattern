package a13Tp1.Mediator.edu.bdeb.a10.controller;

import a13Tp1.Mediator.edu.bdeb.a10.model.IUser;

/**
 * Mediator interface that facilitates communication between users.
 */
public interface Chat {
    /**
     * Sends a message from a user to the chat.
     *
     * @param message the message to be sent.
     * @param user the user sending the message.
     */
    void sendMessage(String message, IUser user);
}
