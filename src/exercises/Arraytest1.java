package exercises;

import java.util.Arrays;

public class Arraytest1 {
    //        int[] students = new int[6];
    public static void aMethod() {

        int[] students = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < 6; i++) {
            if (students[i] % 2 != 0) {
                System.out.println(students[i]);
            }
        }
    }


    public static void bMethod() {
        String text = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not " +
                "eat them in a house. I will not eat them with a mouse.";
        String[] textArray = text.split("\\.");
        System.out.println(Arrays.toString(textArray));

    }
}