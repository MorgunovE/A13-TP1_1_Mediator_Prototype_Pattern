package a13Tp1.Mediator.model;

import a13Tp1.Mediator.controller.Chat;
/**
 * Abstract class representing a generic user in the chat.
 * Implements the common behavior for all users.
 */
abstract class User implements IUser {
    protected Chat chat;
    protected String name;
    protected boolean isEnable = true;

    /**
     * Constructs a user with the specified chat and name.
     *
     * @param chat the chat system the user belongs to.
     * @param name the name of the user.
     */

    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    @Override
    public boolean isEnable() {
        return isEnable;
    }

    @Override
    public void setEnable(boolean isEnable) {
        this.isEnable = isEnable;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    abstract public void receiveMessage(String message);

}
