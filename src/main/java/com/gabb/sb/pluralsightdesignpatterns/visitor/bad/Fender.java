package com.gabb.sb.pluralsightdesignpatterns.visitor.bad;

public class Fender implements AtvPart {
    @Override
    public double calculateShipping() {
        return 9;
    }
}