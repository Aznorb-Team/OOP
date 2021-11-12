package com.company;

public class Cube extends GeometryFiqure{
    protected double length;
    protected int color;

    public Cube(double length) {
        if(length > 0)
            this.length = length;
        setTitle("Куб");
    }
    public double square()
    {
        return length*length*4;
    }
    public double size()
    {
        return length*length*length;
    }
    public double getBlue() {
        if(color == 1){
            return square();
        }
        else{
            return 0;
        }
    }

    public double getRed() {
        if(color == 2){
            return square();
        }
        else{
            return 0;
        }
    }

    public double getWhite() {
        return border * size();
    }

    public double getGreen() {
        if(color == 3){
            return square();
        }
        else{
            return 0;
        }
    }
    public String getTitle()
    {
        return title;
    }
}
