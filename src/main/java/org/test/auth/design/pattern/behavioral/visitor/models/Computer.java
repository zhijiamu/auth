package org.test.auth.design.pattern.behavioral.visitor.models;

import org.test.auth.design.pattern.behavioral.visitor.ComputerPart;
import org.test.auth.design.pattern.behavioral.visitor.ComputerPartVisitor;

public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
