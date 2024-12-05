package a13Tp1.Mediator.model;
/**
 * Represents a user in the chat system. Defines the basic behavior
 * of a chat participant, such as sending and receiving messages.
 */
public interface IUser {
    /**
     * Gets the name of the user.
     *
     * @return the name of the user.
     */
    String getName();

    /**
     * Sends a message to the chat.
     *
     * @param message the message to be sent.
     */
    void sendMessage(String message);

    /**
     * Receives a message from the chat.
     *
     * @param message the received message.
     */
    void receiveMessage(String message);

    /**
     * Checks if the user is enabled.
     *
     * @return true if the user is enabled, false otherwise.
     */
    boolean isEnable();

    /**
     * Sets the enabled state of the user.
     *
     * @param isEnable true to enable the user, false to disable.
     */
    void setEnable(boolean isEnable);
}
