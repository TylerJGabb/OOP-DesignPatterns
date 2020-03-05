package com.gabb.sb.pluralsightdesignpatterns.factorymethod;

public class ThingTwo extends AbstractThing {

    @Override
    public void createParent() {
        greeting = "Hello from ChildB!";
    }

}
