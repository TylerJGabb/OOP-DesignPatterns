package com.gabb.sb.pluralsightdesignpatterns.visitor.good;

public interface AtvPart {
    public void accept(AtvPartVisitor visitor);
}
