package com.Laliev.javacore.basepatterns.creational.Singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("first");
        ProgramLogger.getProgramLogger().addLogInfo("second");
        ProgramLogger.getProgramLogger().addLogInfo("third");

        ProgramLogger.getProgramLogger().showLogInfo();
    }
}
