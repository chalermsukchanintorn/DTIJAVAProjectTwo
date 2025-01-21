package com.sau.workshop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaProject01 {
    public static void main(String[] args) {
        int menu;
        double widths, longs, bases, highs, radius;
        double areaSquare, areaTriangle, areaCircle;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("+++++++++++++++++++++++");
        System.out.println("   Shap Area Program");
        System.out.println("+++++++++++++++++++++++");
        System.out.println("1. Square Area");
        System.out.println("2. Triangle Area");
        System.out.println("3. Circle Area");
        System.out.println("+++++++++++++++++++++++");
        System.out.print("Select menu: ");
        menu = sc.nextInt();
        System.out.println("+++++++++++++++++++++++");
        switch (menu){
            case 1:
                System.out.print("Input widths: ");
                widths = sc.nextDouble();
                System.out.print("Input longs: ");
                longs = sc.nextDouble();
                areaSquare = widths * longs;
                System.out.println("Area of Square is : " + df.format(areaSquare));
                break;
            case 2:
                System.out.print("Input bases: ");
                bases = sc.nextDouble();
                System.out.print("Input highs: ");
                highs = sc.nextDouble();
                areaTriangle = bases * highs / 2;
                System.out.println("Area of Square is : " + df.format(areaTriangle));
                break;
            case 3:
                System.out.print("Input radius: ");
                radius = sc.nextDouble();
                areaCircle = Math.PI * Math.pow(radius, 2);
                System.out.println("Area of Circle is : " + df.format(areaCircle));
                break;
            default:
                System.out.println("Thank you...bye...bye ^_^");
        }
        System.out.println("+++++++++++++++++++++++");
    }
}












