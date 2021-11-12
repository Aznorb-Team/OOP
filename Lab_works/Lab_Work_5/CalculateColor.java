package com.company;

public class CalculateColor{
    protected double sumW = 0;
    protected double sumR = 0;
    protected double sumG = 0;
    protected double sumB = 0;

    public void paintQuantity(GeometryFiqure geometryFiqure, int squarePaint) {
        sumW += geometryFiqure.getWhite() * squarePaint;
        sumG += geometryFiqure.getGreen() * squarePaint;
        sumB += geometryFiqure.getBlue() * squarePaint;
        sumR += geometryFiqure.getRed() * squarePaint;
    }
    public void info(){
        System.out.println(sumW);
        System.out.println(sumR);
        System.out.println(sumG);
        System.out.println(sumB);
    }
}
