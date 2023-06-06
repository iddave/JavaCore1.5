package com.Laliev.javacore.basepatterns.behavioral.Visitor;
import java.util.ArrayList;
import java.util.List;

public class Project implements ProdElement{
    ProdElement[] prodElements;

    public Project() {
        this.prodElements = new ProdElement[]{
                new Database(),
                new Test()
        };
    }

    @Override
    public void doElement(Developer developer) {
        for (var prodElement : prodElements){
            prodElement.doElement(developer);
        }
    }
}
