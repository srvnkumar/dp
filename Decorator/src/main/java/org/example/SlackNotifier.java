package org.example;

public class SlackNotifier extends NotificationDecorator{
    public SlackNotifier(Notification notification) {
        super(notification);
    }

    @Override
    public void sendNotification(String message) {
        super.sendNotification(message);
        System.out.println("Slack Notification:"+ message);
    }
}
