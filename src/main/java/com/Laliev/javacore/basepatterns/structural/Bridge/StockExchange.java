package com.Laliev.javacore.basepatterns.structural.Bridge;

public class StockExchange extends Program{
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("stock ex development in progress");
        developer.writeCode();
    }
}
