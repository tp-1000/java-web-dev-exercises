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


/*write a class for Area
It will:
    1. prompt user for radius
    2. print calculated area.

1-- use of: scanner, sytstem.in/out, println, data types wiil be decimal use double for consitency

2-- use of: System out println, calculatoin will be done and set to area variable which will be used in the println statment.
    Will need: var for pi (check java librabry) rest should be r*r*pi = A
*/