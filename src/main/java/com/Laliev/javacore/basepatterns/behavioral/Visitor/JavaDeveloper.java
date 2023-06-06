package com.Laliev.javacore.basepatterns.behavioral.Visitor;
public class JavaDeveloper implements Developer{
    @Override
    public void create(Database database) {
        System.out.println("Create database on java");
    }

    @Override
    public void create(Test test) {
        System.out.println("Testing on java");
    }
}
