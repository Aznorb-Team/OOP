package com.company;

public class Cream extends CakeDecorator{
    public Cream(Tools tool, String name, double width, double height) {
        super(tool, name, 0, width, height);
    }
}
