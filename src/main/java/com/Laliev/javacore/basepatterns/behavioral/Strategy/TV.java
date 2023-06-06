package com.Laliev.javacore.basepatterns.behavioral.Strategy;
public class TV {
    Condition condition;

    public void setCondition(Condition condition) {
        this.condition = condition;
    }


    void doIt(){
        condition.act();
    }

}
