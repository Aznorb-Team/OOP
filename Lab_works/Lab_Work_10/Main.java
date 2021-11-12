package com.company;

public class Main {

    public static void main(String[] args) {
    Tools cake = new Cake(" Торт ", 5,5,3);
	Tools cream = new Cream(cake," Крем + ", 2,2);
    Tools decor = new Decorating(cream," Украшения + ", 3 );

    System.out.println("Название = " + decor.getName());
    System.out.println("Длина = " + decor.getLength());
    System.out.println("Ширина = " + decor.getWidth());
    System.out.println("Высота = " + decor.getHeight());

    Tools equalizer = new Equalizer(decor, " Эквалайзер + ");
        Tools cream1 = new Cream(equalizer," Крем + ", 20,20);
    System.out.println();
    System.out.println("Название = " + equalizer.getName());
    System.out.println("Длина = " + equalizer.getLength());
    System.out.println("Ширина = " + equalizer.getWidth());
    System.out.println("Высота = " + equalizer.getHeight());

    System.out.println();
    System.out.println("Название = " + cake.getName());
    System.out.println("Длина = " + cake.getLength());
    System.out.println("Ширина = " + cake.getWidth());
    System.out.println("Высота = " + cake.getHeight());
        System.out.println();
        System.out.println("Название = " + cream1.getName());
        System.out.println("Длина = " + cream1.getLength());
        System.out.println("Ширина = " + cream1.getWidth());
        System.out.println("Высота = " + cream1.getHeight());
    }
}
