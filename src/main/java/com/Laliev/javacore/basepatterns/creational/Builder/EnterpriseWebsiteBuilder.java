package com.Laliev.javacore.basepatterns.creational.Builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        website.setName("Enterprise website builder");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
