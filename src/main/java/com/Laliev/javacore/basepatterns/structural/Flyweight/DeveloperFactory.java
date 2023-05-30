package com.Laliev.javacore.basepatterns.structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty){
        Developer developer = developers.get(specialty);
        if(developer == null){
            switch(specialty){
                case "java":
                    developer = new JavaDeveloper();
                    break;
                case "cpp":
                    developer = new CppDeveloper();
            }
            developers.put(specialty, developer);
        }
        return developer;
    }
}
