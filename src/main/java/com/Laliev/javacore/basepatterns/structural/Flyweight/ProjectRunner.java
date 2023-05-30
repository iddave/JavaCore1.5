package com.Laliev.javacore.basepatterns.structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory factory = new DeveloperFactory();
        List<Developer> developers = new ArrayList<>();
        developers.add(factory.getDeveloperBySpecialty("java"));
        developers.add(factory.getDeveloperBySpecialty("java"));
        developers.add(factory.getDeveloperBySpecialty("java"));
        developers.add(factory.getDeveloperBySpecialty("cpp"));
        developers.add(factory.getDeveloperBySpecialty("cpp"));
        developers.add(factory.getDeveloperBySpecialty("cpp"));

        for(Developer developer: developers){
            developer.writeCode();
        }

    }
}
