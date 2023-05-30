package com.Laliev.javacore.basepatterns.structural.Proxy;

public class ProxyProject implements Project{
    public String url;
    public RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if(realProject == null)
            realProject = new RealProject(url);
        realProject.run();
    }
}
