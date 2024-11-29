package edu.bdeb.a10.cc;

public class Administrator extends User{

    public Administrator(Chat chat, String name) {
        super(chat, name);
    }

   /* public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }*/

    public void receiveMessage(String message) {
        System.out.println("Administrator " + getName() + " received message: '" + message + "'");
    }
}

