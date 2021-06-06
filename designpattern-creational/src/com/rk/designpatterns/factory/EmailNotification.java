package com.rk.designpatterns.factory;

public class EmailNotification extends Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending E-mail Notification");
    }
    
}
