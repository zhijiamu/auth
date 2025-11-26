package org.test.auth.design.pattern.behavioral.visitor;

import org.test.auth.design.pattern.behavioral.visitor.models.Computer;
import org.test.auth.design.pattern.behavioral.visitor.models.Keyboard;
import org.test.auth.design.pattern.behavioral.visitor.models.Monitor;
import org.test.auth.design.pattern.behavioral.visitor.models.Mouse;

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
