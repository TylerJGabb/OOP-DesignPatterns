package com.gabb.sb.pluralsightdesignpatterns.visitor.bad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart{

    private final ArrayList<AtvPart> parts;

    public PartsOrder() {
        parts = new ArrayList<AtvPart>();
    }

    public void addPart(AtvPart part){
        parts.add(part);
    }

    public List<AtvPart> getParts() {
        return Collections.unmodifiableList(parts);
    }

    public double calculateShipping() {
        double sum = 0;
        for(var part : parts){
            sum += part.calculateShipping();
        }
        return sum;
    }
}
