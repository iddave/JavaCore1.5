package com.Laliev.javacore.basepatterns.structural.Adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new DatabaseAdapter();

        database.insert();
        database.remove();
        database.select();
        database.update();
    }
}
