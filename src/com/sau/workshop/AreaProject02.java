package com.sau.workshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class AreaProject02 {
    public static void main(String[] args) throws IOException {
        int menu;
        double widths, longs, bases, highs, radius;
        double areaSquare, areaTriangle, areaCircle;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("+++++++++++++++++++++++");
        System.out.println("   Shap Area Program");
        System.out.println("+++++++++++++++++++++++");
        System.out.println("1. Square Area");
        System.out.println("2. Triangle Area");
        System.out.println("3. Circle Area");
        System.out.println("+++++++++++++++++++++++");
        System.out.print("Select menu: ");
        menu = Integer.parseInt(reader.readLine());
        System.out.println("+++++++++++++++++++++++");
        switch (menu){
            case 1:
                System.out.print("Input widths: ");
                widths = Double.parseDouble(reader.readLine());
                System.out.print("Input longs: ");
                longs = Double.parseDouble(reader.readLine());
                areaSquare = widths * longs;
                System.out.println("Area of Square is : " + df.format(areaSquare));
                break;
            case 2:
                System.out.print("Input bases: ");
                bases = Double.parseDouble(reader.readLine());
                System.out.print("Input highs: ");
                highs = Double.parseDouble(reader.readLine());
                areaTriangle = bases * highs / 2;
                System.out.println("Area of Square is : " + df.format(areaTriangle));
                break;
            case 3:
                System.out.print("Input radius: ");
                radius = Double.parseDouble(reader.readLine());
                areaCircle = Math.PI * Math.pow(radius, 2);
                System.out.println("Area of Circle is : " + df.format(areaCircle));
                break;
            default:
                System.out.println("Thank you...bye...bye ^_^");
        }
        System.out.println("+++++++++++++++++++++++");
    }
}
