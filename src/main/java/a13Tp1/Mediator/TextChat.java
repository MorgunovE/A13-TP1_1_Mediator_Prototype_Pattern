package a13Tp1.Mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {

    User admin;
    List<User> users = new ArrayList<>();
    public void setAdmin(User admin) {
        if(admin != null && admin instanceof Administrator) {
            this.admin = admin;
        }
        else{
            throw new RuntimeException("Not enough the rights");
        }
    }

    public void addUser(User u) {
        if(admin==null) {
            throw new RuntimeException("Admin is not online");
        }
        if(u instanceof SimpleUser) {
            users.add(u);
        }
        else {
            throw new RuntimeException("Admin can not use another chat");
        }
    }


    public void sendMessage(String message, User user) {
        if(user instanceof  Administrator) {
            for (User u : users) {
                u.receiveMessage(user.getName() + ": " + message);
            }
        }
        if(user instanceof  SimpleUser) {
            for (User u : users) {
                if (u != user && u.isEnable())
                    u.receiveMessage(user.getName() + ": " + message);
            }
            if (admin.isEnable())
                admin.receiveMessage(user.getName() + ": " + message);
        }
    }
}

