package org.example;

public class EmailNotifier implements Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("Send Email :"+ message);
    }
}
