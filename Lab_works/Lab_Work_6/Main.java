package com.company;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	    Vector v = new Vector(3, 4, 5);
	    VectorCalculate vCalculate = new VectorCalculate(v);
	    System.out.println("Длина вектора = " + vCalculate.lengthVector());
    }
}
