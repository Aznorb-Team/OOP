package com.company;

public class Decorating extends CakeDecorator{
    public Decorating(Tools tool, String name, double length) {
        super(tool, name, length, 0, 0);
    }
}
