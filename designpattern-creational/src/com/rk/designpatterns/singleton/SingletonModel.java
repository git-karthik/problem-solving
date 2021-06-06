package com.rk.designpatterns.singleton;
import static java.util.Objects.isNull;

public class SingletonModel {
    /**
     * The instance variable is set to null so that the object will be lazy loaded.
     * Lazy loaded objects provide better performance compared to eagerly loaded ones.
     * 
     * The instance variable is declared volatile. This ensures the instance is Singleton for any changes in JVM.
     */
    private static volatile SingletonModel instance = null; 

    /**
     * Rule 1: Singleton Classes should always have a private constructor.
     * Reason: The class cannot be instantiated externally
     */
    private SingletonModel(){
        //This check is performed to ensure that the object is not instanciated through Reflection method.
        if(!isNull(instance)){
            throw new RuntimeException("I am a singleton class. Use the getInstance() function");
        }
    }

    /**
     * If the instance is null, the creates a new instance and returns the object.
     * 
     * @return instance of the Singleton class
     */
    public static SingletonModel getInstance() {

        // Let's check if the instance is null. Otherwise return the existing instance.
        if(isNull(instance)){
            
            /* The block is synchronized to ensure it is thread safe. Otherwise, getInstance() invoked from different threads
            can return different instances */
            synchronized(SingletonModel.class) {
                /*This check is required to check the state after thread synchronization*/
                if(isNull(instance)){
                    // The instance is always going to be unique.
                    instance = new SingletonModel();
                }
            }        
        }
        
        return instance;
    }
    
}
