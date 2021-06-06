package com.demo.sync;

import java.util.HashMap;
import java.util.Map;

public class MyProcessor {

    private int input;
    private Map<String, String> capitals = new HashMap<>();
    

    MyProcessor(int input){
        this.input = input;
    }
    
    public synchronized void processRequest(int multipler){
        System.out.println("Request Processed-->"+input*multipler);
        System.out.println(Thread.currentThread().getName());
    }

    public Map<String, String> populateCapitals() throws InterruptedException{
        capitals.put("TamilNadu", "Chennai");
        capitals.put("Karnataka", "Bengaluru");
        Thread.sleep(60000);

        return capitals;
    }
}
