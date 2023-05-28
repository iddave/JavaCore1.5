package com.Laliev.javacore.basepatterns.creational.Singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logInfo = "";

    public static synchronized ProgramLogger getProgramLogger(){
        if(programLogger == null)
            programLogger =  new ProgramLogger();
        return programLogger;
    }
    private ProgramLogger(){}

    public void addLogInfo(String str){
        logInfo+=str+"\n";
    }

    public void showLogInfo(){
        System.out.println(logInfo);
    }


}
