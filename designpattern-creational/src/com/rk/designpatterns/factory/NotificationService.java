package com.rk.designpatterns.factory;

public class NotificationService {
    public static void main(String[] args) {
        Notification smsNotification = NotificationFactory.createNotification(NotificationType.SMS);        
        smsNotification.notifyUser();

        Notification defaultNotification = NotificationFactory.createNotification(NotificationType.DEFAULT);
        defaultNotification.notifyUser();
    }
}
