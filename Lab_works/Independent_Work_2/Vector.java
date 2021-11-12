package com.company;
import java.io.Serializable;

public class Vector  implements Serializable{
    public double a,b;
    public Vector(double a, double b)
    {
        this.a = a;
        this.b = b;
    }
    public double heightVector()
    {
        return Math.sqrt(a*a + b*b);
    }
    public String info()
    {
        return "Длина вектора = " + this.heightVector();
    }
}
