package a13Tp1.Mediator;

public class SimpleUser extends User {

    public SimpleUser(Chat chat, String name) {super(chat, name);}

    /*public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }*/

    public void receiveMessage(String message) {
        System.out.println("User " + getName() + " received message: '" + message + "'");
    }
}
