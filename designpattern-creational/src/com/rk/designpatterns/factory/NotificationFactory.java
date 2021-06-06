package com.rk.designpatterns.factory;

public class NotificationFactory {

    public static Notification createNotification(){
        return new EmailNotification();
    }
    
    public static Notification createNotification(NotificationType notificationType){

        switch (notificationType) {
            case SMS:
                return new SMSNotification();

            case EMAIL:
                return new EmailNotification();
            
            case PUSH:
                return new PushNotification();
        
            default:
                return new EmailNotification();
        }
    }
}
