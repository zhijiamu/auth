package org.test.auth.reflect;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void greet(String str) {
        System.out.println(str + name);
    }

    public void sayHello() {
        System.out.println("HELLO"
        );
    }
}
