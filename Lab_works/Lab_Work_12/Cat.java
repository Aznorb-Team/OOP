package com.company;

public class Cat implements JSONImportable{
    private String name;
    private int age;
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getJson(){
        return "title: "+this.name+"; description: "+this.age+";";
    }
}
