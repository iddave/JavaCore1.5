package net.georgihugaev.patterns.behaivor.ObserverPattern;

public class AppRun {
    public static void main(String[] args) {
        WorkerSite site = new WorkerSite();

        site.addMessages("Hello, do this work");

        Worker worker1 = new Worker("Geor");
        Worker worker2 = new Worker("Azamat");
        site.addObserve(worker1);
        site.addObserve(worker2);
        site.addMessages("Do second work");
    }
}
