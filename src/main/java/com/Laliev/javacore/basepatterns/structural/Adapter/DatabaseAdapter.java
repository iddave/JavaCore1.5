package com.Laliev.javacore.basepatterns.structural.Adapter;

public class DatabaseAdapter extends JavaApplication implements Database{
    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void insert() {
        saveObject();
    }
}
