package com.gabb.sb.pluralsightdesignpatterns.visitor.good;

public class Wheel implements AtvPart {

    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }

}
