package com.gabb.sb.pluralsightdesignpatterns.factorymethod;

public class ThingFactory {

    public static AbstractThing getThing(ThingType type) {
        switch (type) {
            case ONE: {
                return new ThingOne();
            } case TWO: {
                return new ThingTwo();
            } case CAT_IN_THE_HAT:
                return new CatInTheHat();
            default: {
                throw new RuntimeException("ChildFactory does not support type " + type.toString());
            }
        }
    }

}
