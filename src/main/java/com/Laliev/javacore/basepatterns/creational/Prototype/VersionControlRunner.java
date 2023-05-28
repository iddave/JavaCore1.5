package com.Laliev.javacore.basepatterns.creational.Prototype;

public class VersionControlRunner {


    public static void main(String[] args) {
        Project master = new Project(1,"SuperProject", "SourceCode");
        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println("\n\n"+masterClone);
    }

}
