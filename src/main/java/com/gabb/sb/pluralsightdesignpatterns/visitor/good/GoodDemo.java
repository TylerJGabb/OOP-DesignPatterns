package com.gabb.sb.pluralsightdesignpatterns.visitor.good;

public class GoodDemo {

    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());
        AtvPartsShippingVisitor shippingVisitor = new AtvPartsShippingVisitor();
        order.accept(shippingVisitor);
        System.out.println("Shipping cost is " + shippingVisitor.getShipping());
        order.accept(new AtvPartDisplayVisitor());
    }
}
