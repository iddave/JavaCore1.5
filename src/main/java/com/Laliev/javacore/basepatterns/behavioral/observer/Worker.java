package net.georgihugaev.patterns.behaivor.ObserverPattern;

import java.util.List;

public class Worker implements Observer{
    String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> messages) {
        System.out.println("Hear, " + name + " please , read this messages " + messages);
    }
}
