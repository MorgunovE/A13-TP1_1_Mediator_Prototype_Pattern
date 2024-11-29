package a13Tp1.Mediator;

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

