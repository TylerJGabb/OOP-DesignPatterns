package com.gabb.sb.pluralsightdesignpatterns.singleton;

public class DbSingleton {

    private static volatile DbSingleton instance;

    private DbSingleton() {
        //prevent reflection
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance() {
        if(instance == null){
            synchronized (DbSingleton.class) {
                if(instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }

}
