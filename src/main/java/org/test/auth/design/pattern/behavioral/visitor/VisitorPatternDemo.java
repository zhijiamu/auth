package org.test.auth.design.pattern.behavioral.visitor;

import org.test.auth.design.pattern.behavioral.visitor.models.Computer;
import org.test.auth.design.pattern.behavioral.visitor.models.Keyboard;

public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

        Keyboard keyboard=new Keyboard();
        keyboard.accept(new ComputerPartDisplayVisitor());
    }
}
