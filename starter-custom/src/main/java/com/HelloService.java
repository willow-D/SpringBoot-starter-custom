package com;

public class HelloService {

    private String name;
    public String sayHello(){
        return this.name + ": hello";
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
