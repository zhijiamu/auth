package org.test.auth.lambda;

public interface MathOperation {
    int operation(int a, int b);

    default MathOperation action() {
        System.out.println("action");
        return this;
    }
}
