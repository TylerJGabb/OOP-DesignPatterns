package com.gabb.sb.pluralsightdesignpatterns.factorymethod;

public class ThingTwo extends AbstractThing {

    @Override
    public void create() {
        greeting = "Hello from ThingTwo!";
    }

}
