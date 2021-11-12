package com.company;
import java.awt.*;
import java.util.Random;

public class Tetrahedron extends GeometryFiqure{

    protected double length;
    protected int color;
    public Tetrahedron(double length) {
        if(length > 0)
            this.length = length;
        setTitle("Тэтраэдр");
    }
    public double squareSide()
    {
        return (Math.sqrt(3)/4)*Math.pow(length,2);
    }
    public double square()
    {
        return squareSide()*4;
    }
    public double size()
    {
        return Math.pow(length,3)*Math.sqrt(2) * 1/12;
    }
    public void setColor(int color){
        this.color = color;
    }
    public double getBlue() {
        if(color == 1){
            return squareSide();
        }
        else{
            return 0;
        }
    }

    public double getRed() {
        if(color == 2){
            return squareSide();
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
            return squareSide();
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
