package com.gabb.sb.pluralsightdesignpatterns.singleton;

public class DbSingleton {

    //volatile to ensure instance stays the same across threads
    private static volatile DbSingleton instance;

    private DbSingleton() {
        //prevent reflection
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance() {
        var name = Thread.currentThread().getName();
        System.out.println(name + " 1");
        if(instance == null){ //check once to prevent performance hit introduced by synchronization
            System.out.println(name + " 2");
            synchronized (DbSingleton.class) { // synchronize on the DbSingleton class
                System.out.println(name + " 3");
                if(instance == null) {              //if the instance is still null then we need to create it
                    System.out.println(name + " 4");
                    instance = new DbSingleton();   // otherwise, another thread already got here
                }
            }
        }
        return instance;
    }

}
