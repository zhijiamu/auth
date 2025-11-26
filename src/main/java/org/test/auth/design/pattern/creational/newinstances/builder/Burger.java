package org.test.auth.design.pattern.creational.newinstances.builder;

public abstract  class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
