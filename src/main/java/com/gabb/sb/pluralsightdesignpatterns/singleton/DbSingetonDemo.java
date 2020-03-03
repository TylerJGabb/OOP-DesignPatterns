package com.gabb.sb.pluralsightdesignpatterns.singleton;

public class DbSingetonDemo {

    public static void main(String[] args) {
        var instance1 = DbSingleton.getInstance();
        var instance2 = DbSingleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1 == instance2);
    }
}
