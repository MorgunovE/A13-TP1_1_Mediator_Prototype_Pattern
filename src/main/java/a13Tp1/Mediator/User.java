package a13Tp1.Mediator;

abstract class User {
    Chat chat;
    String name;
    boolean isEnable = true;

    public boolean isEnable() {return isEnable;}
    public void setEnable(boolean isEnable) {this.isEnable = isEnable;}
    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }
    public String getName() {return name;}

    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    abstract void receiveMessage(String message);

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}


