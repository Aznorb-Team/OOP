package com.company;

public class Cake extends Tools{
    public Cake(String name, double length, double width, double height){
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
    }
    @Override
    public double getLength() {
        return this.length;
    }

    @Override
    public double getWidth() {
        return this.width;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
