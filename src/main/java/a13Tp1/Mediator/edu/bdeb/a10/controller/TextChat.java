package a13Tp1.Mediator.edu.bdeb.a10.controller;

import a13Tp1.Mediator.edu.bdeb.a10.model.Administrator;
import a13Tp1.Mediator.edu.bdeb.a10.model.SimpleUser;
import a13Tp1.Mediator.edu.bdeb.a10.model.IUser;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {
    private IUser admin;
    private List<IUser> users = new ArrayList<>();

    public void setAdmin(IUser admin) {
        if (admin instanceof Administrator) {
            this.admin = admin;
        } else {
            throw new RuntimeException("Not enough the rights");
        }
    }

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
