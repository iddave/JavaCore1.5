package com.Laliev.javacore.basepatterns.behavioral.memento;

public class Save {
    private final String version;

    public Save(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
}
