package com.gabb.sb.pluralsightdesignpatterns.factorymethod;

public abstract class AbstractThing {

    protected String greeting;

    public AbstractThing(){
        create();
    }

    public abstract void create();

    public void sayHello(){
        System.out.println(this + " says: " + greeting);
    }

}
