package org.example;

public class SMSNotifier extends NotificationDecorator{
    public SMSNotifier(Notification notification) {
        super(notification);
    }

    @Override
    public void sendNotification(String message) {
        super.sendNotification(message);
        System.out.println("SMSNotifier:"+message);
    }
}
