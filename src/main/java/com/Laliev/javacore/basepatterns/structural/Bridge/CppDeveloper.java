package com.Laliev.javacore.basepatterns.structural.Bridge;

public class CppDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("cpp dev writes cpp Code");
    }
}
