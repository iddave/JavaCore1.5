package com.Laliev.javacore.basepatterns.structural.Decorator;

public class DeveloperDecorator implements Developer{
    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
