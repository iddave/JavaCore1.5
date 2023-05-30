package com.Laliev.javacore.basepatterns.behavioral.Command;

import javax.swing.*;
import javax.xml.crypto.Data;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
                new InsertCommand(database),
                new DeleteCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database)
        );
        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}
