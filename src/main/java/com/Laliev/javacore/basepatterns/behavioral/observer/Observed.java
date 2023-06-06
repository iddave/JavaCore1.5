package net.georgihugaev.patterns.behaivor.ObserverPattern;

public interface Observed {
    void addObserve(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
