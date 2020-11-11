package com;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "animal")
public class HelloProperties {
    private static final String DEFAULT_NAME = "数码暴龙";

    private String name = DEFAULT_NAME;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
