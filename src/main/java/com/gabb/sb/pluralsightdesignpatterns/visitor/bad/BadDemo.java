package com.gabb.sb.pluralsightdesignpatterns.visitor.bad;

public class BadDemo {

    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());
        double cost = order.calculateShipping();
        System.out.println(cost);
    }
}
