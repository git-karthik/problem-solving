package com.demo.concur;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapImplUsages {
    
    private Map<String, String> hashMapObject = null;
    private Map<String, String> concurrentHashMapObject = null;
    private Map<String, String> syncHashMapObject = null;

    private Map<String, String> cMap = new HashMap<>();
    

    MapImplUsages(){
        cMap.put("TamilNadu", "Chennai");
        cMap.put("Karnataka", "Bengaluru");
        cMap.put("Telangana", "Hyderabad");

        hashMapObject = new HashMap<>(cMap);
        concurrentHashMapObject = new ConcurrentHashMap<>(cMap);
        syncHashMapObject = Collections.synchronizedMap(new HashMap<>(cMap));
    }

    private void perform(Map<String, String> mapObject) {
        
        mapObject.entrySet().iterator().forEachRemaining(entry -> {
            System.out.println("Entry-->"+entry);
            mapObject.put("Chattisgarh", "Raipur");
        });

    }

    private void executeTest(){
        
        try {
            System.out.println("Performing HashMapObject Test");
            perform(hashMapObject);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Performing Concurrent HashMapObject");
            perform(concurrentHashMapObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println("Performing Synchronized HashMapObject");
            perform(syncHashMapObject);
        } catch (Exception e) {
            e.printStackTrace();
        }        
        
    }

    public static void main(String[] args) {
        MapImplUsages usages = new MapImplUsages();
        usages.executeTest();

    }

}
