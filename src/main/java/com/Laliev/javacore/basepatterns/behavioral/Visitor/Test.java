package com.Laliev.javacore.basepatterns.behavioral.Visitor;
public class Test implements ProdElement{
    @Override
    public void doElement(Developer developer) {
        developer.create(this);
    }
}
