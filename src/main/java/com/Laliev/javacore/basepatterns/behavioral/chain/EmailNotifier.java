package com.Laliev.javacore.basepatterns.behavioral.chain;

public class EmailNotifier extends Notifier{
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String str) {
        System.out.println("Sending email: "+ str);
    }
}
