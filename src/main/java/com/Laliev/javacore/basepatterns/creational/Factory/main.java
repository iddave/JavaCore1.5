package com.Laliev.javacore.basepatterns.creational.Factory;

import com.Laliev.javacore.basepatterns.creational.Factory.CppDeveloperFactory;
import com.Laliev.javacore.basepatterns.creational.Factory.Developer;
import com.Laliev.javacore.basepatterns.creational.Factory.DeveloperFactory;
import com.Laliev.javacore.basepatterns.creational.Factory.JavaDeveloperFactory;

public class main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactory("java");
        Developer developer = developerFactory.createDeveloper();

        developer.write();
    }
    public static DeveloperFactory createDeveloperFactory(String dev) throws RuntimeException{
        if(dev.equalsIgnoreCase("cpp"))
            return new CppDeveloperFactory();
        else if(dev.equalsIgnoreCase("java"))
            return new JavaDeveloperFactory();
        else
            throw new RuntimeException();

    }
}
