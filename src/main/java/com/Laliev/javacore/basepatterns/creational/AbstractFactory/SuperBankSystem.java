package com.Laliev.javacore.basepatterns.creational.AbstractFactory;

import com.Laliev.javacore.basepatterns.creational.AbstractFactory.Banking.BankProjectTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory teamFactory = new BankProjectTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        ProjectManager pm = teamFactory.getProjectManager();

        developer.writeCode();
        pm.manageProject();
    }
}
