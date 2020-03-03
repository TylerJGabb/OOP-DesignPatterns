package com.gabb.sb.pluralsightdesignpatterns.singleton;

public class DbSingetonDemo {

    private static volatile boolean start = false;
    private static DbSingleton i1 = null;
    private static DbSingleton i2 = null;

    public static void main(String[] args) throws InterruptedException {

        var t1 = new Thread(() -> {
            while(!start) Thread.onSpinWait();
            i1 = DbSingleton.getInstance();
        });
        t1.setName("A");
        var t2 = new Thread(() -> {
            while(!start) Thread.onSpinWait();
            i2 = DbSingleton.getInstance();
        });
        t2.setName("B");

        t1.start();
        t2.start();

        //set the start flag, instantly triggering both threads to begin competing for the reference
        start = true;

        t1.join();
        t2.join();

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i1 == i2);
    }
}
