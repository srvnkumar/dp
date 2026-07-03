package org.example;

public class EmailNotfication implements Notification{
    @Override
    public void notifyData() {
        System.out.println("Email Notification");
    }
}
