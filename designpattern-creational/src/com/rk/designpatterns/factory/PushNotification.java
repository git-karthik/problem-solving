package com.rk.designpatterns.factory;

public class PushNotification extends Notification {

    @Override
    public void notifyUser() {

        System.out.println("Sending Push Notification...");
        
    }
    
}
