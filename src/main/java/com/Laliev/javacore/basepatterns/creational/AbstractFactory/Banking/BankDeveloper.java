package com.Laliev.javacore.basepatterns.creational.AbstractFactory.Banking;

import com.Laliev.javacore.basepatterns.creational.AbstractFactory.Developer;

public class BankDeveloper implements Developer {


    @Override
    public void writeCode() {
        System.out.println("bank dev writes code");
    }
}
