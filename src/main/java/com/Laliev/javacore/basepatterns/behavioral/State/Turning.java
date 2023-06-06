package com.Laliev.javacore.basepatterns.behavioral.State;
public class Turning implements Condition{
    @Override
    public void act() {
        System.out.println("System is off");
    }
}
