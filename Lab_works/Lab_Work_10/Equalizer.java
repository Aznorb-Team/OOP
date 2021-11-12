package com.company;

public class Equalizer extends CakeDecorator{

    public double value;
    public Equalizer(Tools tool, String name) {
        super(tool, name, 0, 0, 0);
        if(getToolLength() <= getToolWidth()){
            this.value = getToolLength();
        }else{
            this.value = getToolWidth();
        }
    }
    @Override
    public double getWidth() {
        return value;
    }
    public double getLength() {
        return value;
    }
}
