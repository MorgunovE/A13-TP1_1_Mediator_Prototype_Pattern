package a13Tp1.Mediator;


public class Main {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Administrator(chat, "Big Boss");
        User u1 = new SimpleUser(chat, "Abby");
        User u2 = new SimpleUser(chat, "Bobby");
        User u3 = new SimpleUser(chat, "Chelsea");
        u2.setEnable(false);

        chat.setAdmin(admin);
        chat.addUser(u1);
        chat.addUser(u2);
        chat.addUser(u3);

        admin.sendMessage("Hi!!"); // try to send message as u1 or u2 

    }
}


