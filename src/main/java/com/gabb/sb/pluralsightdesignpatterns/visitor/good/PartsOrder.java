package com.gabb.sb.pluralsightdesignpatterns.visitor.good;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {

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

    @Override
    public void accept(AtvPartVisitor visitor) {
        for(var part : parts){
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
