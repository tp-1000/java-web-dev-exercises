package org.launchcode.java.studios.charactercount;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Totalcharacters {

    public static void main(String[] args) throws FileNotFoundException {
        //File to use
        System.out.println("Getting character count from message.txt file...");
        FileReader fr = new FileReader("src/org/launchcode/java/studios/charactercount/message.txt");
        Scanner input = new Scanner(fr);


        //consolidate file lines
        ArrayList<String> text = new ArrayList<>();
        while(input.hasNext()) {
            String[] line = input.nextLine().toLowerCase().split("");
            Collections.addAll(text,line);
        }
        input.close();

        //Could add method to handle passing each letter to buildCountList and address efficiency issue.
        //Currently is Capable of redundant method calls.
        for (Map.Entry<String, Integer> entry: buildCountList((text)).entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static HashMap<String, Integer> buildCountList(ArrayList<String> text) {
        HashMap<String, Integer> counts = new HashMap<>();

        //build hashmap  -- only alpha chars
        for (String letter : text) {
            if (letter.matches("[a-z]")) {
                int k = countChar(letter, text);
                counts.put(letter, k);
            }
        }
        return counts;
    }

    private static int countChar(String letter, ArrayList<String> text) {
        //count occurrences of letter in text -- return the count
        int charCount = 0;
        for (String aLetter: text) {
            if (aLetter.toLowerCase().equals(letter)) {
                charCount++;
            }
        }
        return charCount;
    }
}
