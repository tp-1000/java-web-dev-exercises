package org.launchcode.java.studios.charactercount;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Totalcharacters {

    public static void main(String[] args) {
        //ToDo Bonus input file
        //ToDo input string

        //import string
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text for character counts: ");
        String[] text = input.nextLine().toLowerCase().split("");


        for (Map.Entry<String, Integer> entry: buildCountList((text)).entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }

    private static HashMap<String, Integer> buildCountList(String[] text) {
        HashMap<String, Integer> counts = new HashMap<>();

        //build hashmap from first letter in text[0] -- only alph chars
        for (String letter : text) {
            if (letter.matches("[a-z]")) {
                int k = countChar(letter, text);
                counts.put(letter, k);
            }
        }
        return counts;
    }

    private static int countChar(String letter, String[] text) {
        //count times letter is in text -- return the count
        int charCount = 0;
        for (String aLetter: text) {
            if (aLetter.toLowerCase().equals(letter)) {
                charCount++;
            }
        }
        return charCount;
    }
}
