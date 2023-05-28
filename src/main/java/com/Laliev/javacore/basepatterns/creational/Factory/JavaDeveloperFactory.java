package com.Laliev.javacore.basepatterns.creational.Factory;

import com.Laliev.javacore.basepatterns.creational.Factory.Developer;
import com.Laliev.javacore.basepatterns.creational.Factory.DeveloperFactory;
import com.Laliev.javacore.basepatterns.creational.Factory.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
