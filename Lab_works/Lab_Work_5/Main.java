package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        Tetrahedron a = new Tetrahedron(5);

        System.out.println("Название фигуры: " + a.getTitle());
        System.out.println("Площадъ = " + a.square() + "; Объём = " + a.size());

        CalculateColor cc = new CalculateColor();
        a.setBorder(2);
        a.setColor(1);
        cc.paintQuantity(a, 20);
        a.setColor(2);
        cc.paintQuantity(a, 20);
        a.setColor(3);
        cc.paintQuantity(a, 20);
        cc.info();
    }
}
