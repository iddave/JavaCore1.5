package com.Laliev.javacore.basepatterns.creational.AbstractFactory.Banking;

import com.Laliev.javacore.basepatterns.creational.AbstractFactory.ProjectManager;

public class BankProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages banking");
    }
}
