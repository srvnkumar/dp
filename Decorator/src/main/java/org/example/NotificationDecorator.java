package org.example;

public abstract class NotificationDecorator implements Notification{
    private final Notification notification;

    public NotificationDecorator(Notification notification){
        this.notification = notification;
    }
    @Override
    public void sendNotification(String message) {
        notification.sendNotification(message);
    }
}
