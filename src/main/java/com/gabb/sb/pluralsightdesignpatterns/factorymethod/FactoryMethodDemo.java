package com.gabb.sb.pluralsightdesignpatterns.factorymethod;

public class FactoryMethodDemo {


    public static void main(String[] args) {
        for(var type : ThingType.values()){
            ThingFactory.getThing(type).sayHello();
        }
    }


}
