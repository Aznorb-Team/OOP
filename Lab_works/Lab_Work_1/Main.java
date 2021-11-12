package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Decision des = new Decision();

        Scanner in = new Scanner(System.in);

            des.a = in.nextInt();
            des.b = in.nextInt();

            System.out.println(des.Sum());
            System.out.println(des.Difference());
            System.out.println(des.Multinomial());
            System.out.println(des.Division());
    }
}
