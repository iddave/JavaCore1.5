package net.georgihugaev.patterns.behaivor.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WorkerSite implements Observed{
    List<String> messages = new ArrayList<>();

    List<Observer> allWorkers = new ArrayList<>();

    public void addMessages(String message){
        this.messages.add(message);
        notifyObserver();
    }
    public void removeMessages(String message){
        this.messages.remove(message);
        notifyObserver();
    }


    @Override
    public void addObserve(Observer observer) {
        this.allWorkers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
this.allWorkers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (var observer : allWorkers){
            observer.handleEvent(messages);
        }
    }
}
