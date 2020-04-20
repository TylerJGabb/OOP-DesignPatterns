package com.gabb.sb.pluralsightdesignpatterns.visitor.good;

public interface AtvPartVisitor {
    void visit(Oil aOil);
    void visit(Fender aFender);
    void visit(Wheel aWheel);
    void visit(PartsOrder aPartsOrder);
}
