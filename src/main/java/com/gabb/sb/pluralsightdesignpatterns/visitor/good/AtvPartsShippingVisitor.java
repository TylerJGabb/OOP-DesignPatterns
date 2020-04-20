package com.gabb.sb.pluralsightdesignpatterns.visitor.good;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

    double shipping = 0;

    @Override
    public void visit(Oil aOil) {
        System.out.println("Visitor Encountered OIL, shipping cost increased by 15");
        shipping += 15;
    }

    @Override
    public void visit(Fender aFender) {
        System.out.println("Visitor Encountered FENDER, shipping cost increased by 20");
        shipping += 20;
    }

    @Override
    public void visit(Wheel aWheel) {
        System.out.println("Visitor Encountered WHEEL, shipping cost increased by 105");
        shipping += 105;
    }

    @Override
    public void visit(PartsOrder aPartsOrder) {
        if(aPartsOrder.getParts().size() > 3) {
            System.out.println("Visitor Encountered more than three parts in order, discounting by 5");
            shipping -= 5;
        }
    }

    public double getShipping() {
        return shipping;
    }
}
