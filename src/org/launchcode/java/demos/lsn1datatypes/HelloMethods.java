package org.launchcode.java.demos.lsn1datatypes;

import javax.print.DocFlavor;
import java.util.Scanner;

public class HelloMethods {

    public static void main(String[] args) {
        Scanner input;

        System.out.println("whats your name?");
        input = new Scanner(System.in);
        String aName = input.next();
        input.close();
        String message = Message.getMessage("Eng", aName);
        System.out.println(message);
    }

}
