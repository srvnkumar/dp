package org.example;

public class UserImpl extends  User{

    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    void send(String msg) {
        System.out.println(name + "Sends: "+ msg);
        mediator.sendMessage(msg,this);
    }

    @Override
    void receive(String msg) {
        System.out.println(name + " receives: "+ msg);
    }
}
