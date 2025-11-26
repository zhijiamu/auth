package org.test.auth.design.pattern.creational.newinstances.clone;

public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
