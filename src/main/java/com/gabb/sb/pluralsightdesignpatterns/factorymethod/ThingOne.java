package com.gabb.sb.pluralsightdesignpatterns.factorymethod;

public class ThingOne extends AbstractThing {

    @Override
    public void createParent() {
        this.greeting = "Hello from ChildA!";
    }
}
