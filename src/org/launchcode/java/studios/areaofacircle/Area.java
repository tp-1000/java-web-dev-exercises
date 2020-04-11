package org.launchcode.java.studios.areaofacircle;

import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Math.round;


public class Area {

    public static void main (String[] args) {
        //ask for radius -- validate with message -- repeat until valid input is provided
        //request radius
        System.out.println("What is your radius: ");
        Scanner input = new Scanner(System.in);
        double r;

        //start loop and continue until valid input is provided.
        while(true) {
            try {
                r = input.nextDouble();
                if(r <= 0) {
                    System.out.println("Invalid entry,\nplease enter a number above 0: ");
                    input = new Scanner(System.in);
                } else {
                    input.close();
                    break;
                }
            }
            catch (InputMismatchException nfe) {
                System.out.println("Invalid entry,\nplease enter a number above 0: ");
                input = new Scanner(System.in);
            }
        }



        // print getArea() result.
        double area = Circle.getArea(r);
        System.out.println("The area for circle of radius " + r + " is: " + round(area*1000)/1000.);
    }
}
