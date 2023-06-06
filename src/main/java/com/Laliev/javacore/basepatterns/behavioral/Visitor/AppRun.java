package com.Laliev.javacore.basepatterns.behavioral.Visitor;
public class AppRun {
    public static void main(String[] args) {
        Project project = new Project();
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        CppDeveloper cppDeveloper = new CppDeveloper();


        project.doElement(javaDeveloper);

        System.out.println();
        System.out.println();

        project.doElement(cppDeveloper);
    }
}
