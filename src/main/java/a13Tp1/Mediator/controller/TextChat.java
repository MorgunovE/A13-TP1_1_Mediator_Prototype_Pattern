package a13Tp1.Mediator.controller;

import a13Tp1.Mediator.model.Administrator;
import a13Tp1.Mediator.model.SimpleUser;
import a13Tp1.Mediator.model.IUser;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements the Chat interface, managing communication between users.
 * Acts as the mediator in the chat system.
 */
public class TextChat implements Chat {
    private IUser admin;
    private List<IUser> users = new ArrayList<>();

    /**
     * Sets the administrator of the chat.
     *
     * @param admin the administrator.
     * @throws RuntimeException if the user is not an administrator.
     */
    public void setAdmin(IUser admin) {
        if (admin instanceof Administrator) {
            this.admin = admin;
        } else {
            throw new RuntimeException("Not enough the rights");
        }
    }

    /**
     * Adds a user to the chat.
     *
     * @param user the user to be added.
     * @throws RuntimeException if the admin is not set or the user is invalid.
     */
    public void addUser(IUser user) {
        if (admin == null) {
            throw new RuntimeException("Admin is not online");
        }
        if (user instanceof SimpleUser) {
            users.add(user);
        } else {
            throw new RuntimeException("Only simple users can join the chat");
        }
    }

    @Override
    public void sendMessage(String message, IUser user) {
        if (user instanceof Administrator) {
            for (IUser u : users) {
                u.receiveMessage(user.getName() + ": " + message);
            }
        }
        if (user instanceof SimpleUser) {
            for (IUser u : users) {
                if (u != user && u.isEnable()) {
                    u.receiveMessage(user.getName() + ": " + message);
                }
            }
            if (admin.isEnable()) {
                admin.receiveMessage(user.getName() + ": " + message);
            }
        }
    }
}
