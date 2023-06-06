package com.Laliev.javacore.basepatterns.behavioral.Visitor;
public class CppDeveloper implements Developer{
    @Override
    public void create(Database database) {
        System.out.println("Create database on cpp");
    }

    @Override
    public void create(Test test) {
        System.out.println("Testing on cpp");
    }
}
