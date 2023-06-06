package com.Laliev.javacore.basepatterns.behavioral.State;
public class TV {
    Condition condition;

    public TV(Condition condition) {
        this.condition = condition;
    }

    void changeCondition(){
        if (condition instanceof Including){
            condition = new Turning();
        } else if (condition instanceof Turning) {
            condition = new Including();
        }
    }

    void doIt(){
        condition.act();
    }

}
