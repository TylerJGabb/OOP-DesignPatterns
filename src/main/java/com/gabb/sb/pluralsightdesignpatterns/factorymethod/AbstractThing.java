package com.gabb.sb.pluralsightdesignpatterns.factorymethod;

public abstract class AbstractThing {

    protected String greeting;

    public AbstractThing(){
        createParent();
    }

    public abstract void createParent();

    public void sayHello(){
        System.out.println(this + " says: " + greeting);
    }

}
