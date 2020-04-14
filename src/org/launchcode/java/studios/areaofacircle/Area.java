package org.launchcode.java.studios.areaofacircle;

import java.util.InputMismatchException;
import java.util.Scanner;
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
            System.out.println("You must choose a number.\nWhat is your radius: ");
            input.next();
        }

        //assign validated input to r
        r = input.nextDouble();

        //area of circle method call and final output
        double area = Circle.getArea(r);
        System.out.println("The area for circle of radius " + r + " is: " + round(area*1000)/1000.);
    }
}
