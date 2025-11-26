package org.test.auth.lambda;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args)
    {

        Runnable runnable2 = () -> System.out.println("Hello World!");
        runnable2.run();


        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(System.out::println);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.parallelStream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);

        MathOperation addition = (int a, int b) -> a + b;

        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        division.action();
        Operation tester = new Operation() ;
        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");
    }
}
