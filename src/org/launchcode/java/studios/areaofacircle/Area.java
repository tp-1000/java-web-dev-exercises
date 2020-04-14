package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.Math.round;


public class Area {

    public static void main (String[] args) {
        //ask for radius -- repeat until valid input is provided -- methodcall with output
        //request radius
        System.out.println("What is your radius: ");
        Scanner input = new Scanner(System.in);
        double r;

        //start loop and continue until valid input is provided.
        while (!input.hasNextDouble()) {
            System.out.println("You must choose a number,\nwhat is your radius: ");
            input.next();
        }

        //validated input assigned to r
        r = input.nextDouble();
        input.close();

        //area of circle method call and final output
        double area = Circle.getArea(r);
        System.out.println("The area for circle of radius " + r + " is: " + round(area*1000)/1000.);
    }
}
