package com.gabb.sb.pluralsightdesignpatterns.factorymethod;

public class ThingOne extends AbstractThing {

    @Override
    public void create() {
        this.greeting = "Hello from ThingOne!";
    }
}
