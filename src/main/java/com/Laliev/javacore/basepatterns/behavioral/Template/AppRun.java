package com.Laliev.javacore.basepatterns.behavioral.Template;
public class AppRun {
    public static void main(String[] args) {
        AllDaysDo georDay = new David();
        AllDaysDo eugeneDay = new Eugene();

        georDay.mundaneDo();
        eugeneDay.mundaneDo();
    }
}
