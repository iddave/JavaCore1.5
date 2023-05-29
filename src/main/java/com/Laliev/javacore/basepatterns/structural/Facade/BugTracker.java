package com.Laliev.javacore.basepatterns.structural.Facade;

public class BugTracker {
    boolean activeSprint;

    public boolean isActiveSprint(){
        return activeSprint;
    }

    public void startSprint(){
        System.out.println("Sprint is active ");
        activeSprint = true;
    }

    public void finishSprint(){
        System.out.println("Sprint is NOT active ");
        activeSprint = false;
    }

}
