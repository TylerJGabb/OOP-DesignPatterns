package com.gabb.sb.pluralsightdesignpatterns.factorymethod;

public class CatInTheHat extends AbstractThing {

    @Override
    public void createParent() {
        this.greeting = "I am the cat in the hat!";
    }
}
