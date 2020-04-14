package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraytest2 {

    public static void aMethod(ArrayList<Double> theList) {
        Double sum = Double.valueOf(0);

        for(Double aNum: theList) {
            sum += aNum;
        }
        System.out.println("Number totals: " + sum);
    }


    public static void bMethod(String text) {
        int wordLength = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("what length word are you looking for? : ");


        while (!input.hasNextInt()) {
            System.out.println("Please pick an integer.\nWhat length word are you looking for? : ");
            input.next();
        }
            wordLength = input.nextInt();

        String[] wordList = text.split("\\b");
        for (String word: wordList) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }

    }
}

