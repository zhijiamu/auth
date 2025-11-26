package org.test.auth.design.pattern.behavioral.command;

public class SellStock implements Order{
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
