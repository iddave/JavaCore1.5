package com.Laliev.javacore.basepatterns.structural.Decorator;

public class JavaTeamLead extends DeveloperDecorator{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String makeWeekReport(){
        return "week report";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeWeekReport();
    }
}
