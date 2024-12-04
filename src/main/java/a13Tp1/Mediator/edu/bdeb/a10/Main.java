package a13Tp1.Mediator.edu.bdeb.a10;

import a13Tp1.Mediator.edu.bdeb.a10.controller.TextChat;
import a13Tp1.Mediator.edu.bdeb.a10.model.Administrator;
import a13Tp1.Mediator.edu.bdeb.a10.model.SimpleUser;
import a13Tp1.Mediator.edu.bdeb.a10.model.IUser;

public class Main {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        IUser admin = new Administrator(chat, "Big Boss");
        IUser u1 = new SimpleUser(chat, "Abby");
        IUser u2 = new SimpleUser(chat, "Bobby");
        IUser u3 = new SimpleUser(chat, "Chelsea");
        u2.setEnable(false);

        chat.setAdmin(admin);
        chat.addUser(u1);
        chat.addUser(u2);
        chat.addUser(u3);

        u1.sendMessage("Hi!!");
    }
}
