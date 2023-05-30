package com.Laliev.javacore.basepatterns.behavioral.chain;

public class SMSNotifier extends Notifier{
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String str) {
        System.out.println("Sending sms to manager "+str);
    }
}
