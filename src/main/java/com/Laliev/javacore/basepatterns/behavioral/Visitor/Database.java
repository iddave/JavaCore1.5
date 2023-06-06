package com.Laliev.javacore.basepatterns.behavioral.Visitor;
public class Database implements ProdElement{
    @Override
    public void doElement(Developer developer) {
        developer.create(this);
    }
}
