package com.gabb.sb.pluralsightdesignpatterns.visitor.bad;

public class Wheel implements AtvPart {
    @Override
    public double calculateShipping() {
        return 40;
    }
}
