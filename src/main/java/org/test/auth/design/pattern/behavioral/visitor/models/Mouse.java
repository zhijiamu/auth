package org.test.auth.design.pattern.behavioral.visitor.models;

import org.test.auth.design.pattern.behavioral.visitor.ComputerPart;
import org.test.auth.design.pattern.behavioral.visitor.ComputerPartVisitor;

public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}