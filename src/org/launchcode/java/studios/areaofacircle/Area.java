package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {


        //double area;
        double radius;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        radius = input.nextDouble();
        input.close();
        Double circle = Circle.getArea(radius);
//        area = Math.PI * radius * radius;
        if (radius < 0) {
            System.err.println("No negative numbers.");
            System.exit(0);
        }
        System.out.println("The area of a circle of radius " + radius + " is: " + circle);

    }
}
