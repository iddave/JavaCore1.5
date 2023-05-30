package com.Laliev.javacore.basepatterns.behavioral.iterator;

import java.sql.SQLOutput;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"spring", "java", "cpp"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("David Laliev", skills);
        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: "+javaDeveloper.getName());
        System.out.println("Skills: ");

        while(iterator.hasNext()){
            System.out.println(iterator.next().toString()+ " ");
        }
    }
}
