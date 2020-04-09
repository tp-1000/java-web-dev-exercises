package org.launchcode.java.demos.lsn1datatypes;

import javax.print.DocFlavor;
import java.util.Scanner;

public class HelloMethods {

    public static void main(String[] args) {
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("whats your name?");
        String aName = input.next();
        String message = Message.getMessage("Eng", aName);
        System.out.println(message);
    }

}
