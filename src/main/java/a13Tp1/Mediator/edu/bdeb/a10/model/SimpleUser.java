package a13Tp1.Mediator.edu.bdeb.a10.model;

import a13Tp1.Mediator.edu.bdeb.a10.controller.Chat;

public class SimpleUser extends User {

    public SimpleUser(Chat chat, String name) {super(chat, name);}

    /*public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }*/

    public void receiveMessage(String message) {
        System.out.println("User " + getName() + " received message: '" + message + "'");
    }
}
