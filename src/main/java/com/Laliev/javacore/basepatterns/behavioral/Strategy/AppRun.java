package com.Laliev.javacore.basepatterns.behavioral.Strategy;
public class AppRun {
    public static void main(String[] args) {
        Condition condition = new Including();
        TV tv = new TV();

        tv.setCondition(condition);
        tv.doIt();

        Condition condition2 = new Turning();

        tv.setCondition(condition2);
        tv.doIt();


    }
}
