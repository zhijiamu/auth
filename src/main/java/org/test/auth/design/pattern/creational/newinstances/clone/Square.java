package org.test.auth.design.pattern.creational.newinstances.clone;

public class Square extends Shape{
    public Square(){
        type = "Square";
    }
    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
