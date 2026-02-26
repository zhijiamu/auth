package org.test.auth.design.pattern.behavioral.visitor;

import org.test.auth.design.pattern.behavioral.visitor.models.Computer;
import org.test.auth.design.pattern.behavioral.visitor.models.Keyboard;
import org.test.auth.design.pattern.behavioral.visitor.models.Monitor;
import org.test.auth.design.pattern.behavioral.visitor.models.Mouse;

public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
