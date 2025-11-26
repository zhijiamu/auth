package org.test.auth.lambda;

public class Operation {
    public int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
