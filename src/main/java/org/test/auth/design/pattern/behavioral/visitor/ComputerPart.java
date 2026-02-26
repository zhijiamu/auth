package org.test.auth.design.pattern.behavioral.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
