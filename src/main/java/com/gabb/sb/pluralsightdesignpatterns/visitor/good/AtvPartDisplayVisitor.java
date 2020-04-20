package com.gabb.sb.pluralsightdesignpatterns.visitor.good;

public class AtvPartDisplayVisitor implements AtvPartVisitor {
    @Override
    public void visit(Oil aOil) {
        System.out.println(aOil);
    }

    @Override
    public void visit(Fender aFender) {
        System.out.println(aFender);
    }

    @Override
    public void visit(Wheel aWheel) {
        System.out.println(aWheel);
    }

    @Override
    public void visit(PartsOrder aPartsOrder) {
        System.out.println(aPartsOrder + " parts=" + aPartsOrder.getParts().size());
    }
}
