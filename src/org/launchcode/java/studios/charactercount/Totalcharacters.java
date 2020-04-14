package org.launchcode.java.studios.charactercount;


public class Totalcharacters {

    public static void main(String[] args) {

        //pass string and char (obtained through grex or maybe a unicode iterationloop, return int for passed char
        countChar('a', "Diablo");
    }

    private static int countChar(char letter, String text) {
        System.out.println(letter + text);
        return 1;
    }
}
