package com.Laliev.javacore.basepatterns.behavioral.Command;

public class UpdateCommand implements Command{
    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
