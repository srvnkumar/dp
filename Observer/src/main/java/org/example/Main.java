package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer mobile = new MobileObserver();
        Observer email = new EmailObserver();

        subject.attach(mobile);
        subject.attach(email);

        subject.setState(10);
        subject.setState(20);

        subject.detach(email);

        subject.setState(30);
    }
}