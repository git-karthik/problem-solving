package com.rk.designpatterns.factory;

public class SMSNotification extends Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending SMS Notification");        
    }
    
}
