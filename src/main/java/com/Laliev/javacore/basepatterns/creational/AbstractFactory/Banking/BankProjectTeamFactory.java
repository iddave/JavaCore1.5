package com.Laliev.javacore.basepatterns.creational.AbstractFactory.Banking;

import com.Laliev.javacore.basepatterns.creational.AbstractFactory.Developer;
import com.Laliev.javacore.basepatterns.creational.AbstractFactory.ProjectManager;
import com.Laliev.javacore.basepatterns.creational.AbstractFactory.ProjectTeamFactory;

public class BankProjectTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new BankDeveloper();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankProjectManager();
    }
}
