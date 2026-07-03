package org.example;

public class SMSNotification implements Notification{
    @Override
    public void notifyData() {
        System.out.println("SMS Notification");
    }
}
