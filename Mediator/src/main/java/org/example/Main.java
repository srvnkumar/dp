package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User u1 = new UserImpl(mediator, "alice");
        User u2 = new UserImpl(mediator, "Bob");
        User u3 = new UserImpl(mediator, "Charlie");

        mediator.addUser(u1);
        mediator.addUser(u2);
        mediator.addUser(u3);

        u1.send("How are you my friend");
    }
}