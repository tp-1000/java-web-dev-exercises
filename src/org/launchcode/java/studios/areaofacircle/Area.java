package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.round;

public class Area {

    public static void main (String[] args) {
        //ask for radius
        System.out.println("What is your radius: ");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        input.close();

        // print area calculation
        double area = PI*r*r;
        System.out.println("The area for circle of radius " + r + " is: " + round(area*1000)/1000.);
    }
}

