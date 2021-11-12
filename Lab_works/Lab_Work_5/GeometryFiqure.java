package com.company;
import java.util.Random;

public abstract class GeometryFiqure {

    protected String title;
    protected double border;

    protected abstract double square();
    protected abstract double size();

    public void setBorder(double border){
        if(border > 0) {
            this.border = border;
        }
        else{
            this.border = 0;
        }
    }

    public abstract double getGreen();
    public abstract double getWhite();
    public abstract double getBlue();
    public abstract double getRed();

    public void setTitle(String title) {
        this.title = title;
    }
    public abstract String getTitle();
}
