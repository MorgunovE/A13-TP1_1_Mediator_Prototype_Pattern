package a13Tp1.Mediator.edu.bdeb.a10.model;

import a13Tp1.Mediator.edu.bdeb.a10.controller.Chat;

abstract class User implements IUser {
    protected Chat chat;
    protected String name;
    protected boolean isEnable = true;

    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public boolean isEnable() { return isEnable; }
    public void setEnable(boolean isEnable) { this.isEnable = isEnable; }
    public String getName() { return name; }
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    abstract public void receiveMessage(String message);
}
