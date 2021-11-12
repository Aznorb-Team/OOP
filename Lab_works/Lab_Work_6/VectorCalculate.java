package com.company;
import java.io.PrintWriter;
import java.io.IOException;

public class VectorCalculate implements VectorInterface, TXTFileSaver{
    Vector vector;

    public VectorCalculate(Vector vector)
    {
        this.vector = vector;
        try {
            save();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public double lengthVector()
    {
        return Math.sqrt(Math.pow(vector.x,2) + Math.pow(vector.y,2) + Math.pow(vector.z,2));
    }
    public void save() throws IOException
    {
        PrintWriter writer = new PrintWriter("save.txt", "UTF-8");
        writer.print(vector.x + "\n" + vector.y + "\n" + vector.z + "\n" + lengthVector());
        writer.close();
    }
}
