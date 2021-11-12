package com.company;

public abstract class CakeDecorator extends Tools {
    protected Tools tool;

    public CakeDecorator(Tools tool, String name, double length,double width,double height) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.tool = tool;
    }
    @Override
    public double getLength() {
        return this.length + tool.getLength();
    }

    @Override
    public double getWidth() {
        return this.width + tool.getWidth();
    }

    @Override
    public double getHeight() {
        return this.height + tool.getHeight();
    }

    @Override
    public String getName() {
        return this.name + tool.getName();
    }
    public double getToolWidth() {
        return tool.getWidth();
    }
    public double getToolLength() {
        return tool.getLength();
    }
}
