package com.Laliev.javacore.basepatterns.behavioral.Template;

public abstract class AllDaysDo {
    void mundaneDo(){
        System.out.println("Get up");
        doWholeDay();
        System.out.println("Go to sleep");
    }

    abstract void doWholeDay();
}
