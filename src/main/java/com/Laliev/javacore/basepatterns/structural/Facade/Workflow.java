package com.Laliev.javacore.basepatterns.structural.Facade;

public class Workflow {
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();
    Developer developer = new Developer();

    public void solveProblem(){
        job.doJop();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
