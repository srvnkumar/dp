package org.example;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{

    private final List<User> users = new ArrayList<>();
    @Override
    public void sendMessage(String msg, User sender) {
        for (User user: users){
            if(user != sender){
                user.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
