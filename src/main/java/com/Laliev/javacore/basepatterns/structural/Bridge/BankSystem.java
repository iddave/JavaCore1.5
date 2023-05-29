package com.Laliev.javacore.basepatterns.structural.Bridge;

public class BankSystem extends Program{
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system dev in progress");
        developer.writeCode();
    }


}
