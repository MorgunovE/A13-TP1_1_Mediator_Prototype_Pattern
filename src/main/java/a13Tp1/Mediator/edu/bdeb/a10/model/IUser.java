package a13Tp1.Mediator.edu.bdeb.a10.model;

public interface IUser {
    String getName();
    void sendMessage(String message);
    void receiveMessage(String message);
    boolean isEnable();
    void setEnable(boolean isEnable);
}
