package com.Laliev.javacore.basepatterns.structural.Proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www/github.com/iddave/realproj");
        project.run();
    }
}
