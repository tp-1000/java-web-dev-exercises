package exercises;


import java.util.ArrayList;

public class Arrayspractice {


    public static void main(String[] args) {

        // a set of methods that explore basic array use
        Arraytest1.aMethod();
        Arraytest1.bMethod();

        // a set of methods that explore basic arraylist use
        ArrayList<Double> numList = new ArrayList<>();
        for (double i = 0; i < 15; i++) {
            numList.add(i*i);
        }
        Arraytest2.aMethod(numList);

        String text = "Write a static method to find the sum of all the even numbers in an ArrayList. Within main, " +
                "create a list with at least 10 integers and call your method on the list.\n" +
                "Write a static method to print out each word in a list that has exactly 5 letters.\n" +
                "Modify your code to prompt the user to enter the word length for the search.";
        Arraytest2.bMethod(text);

        // a set of methods that explore basic HashMap use
        Hashtest3.GradeBookHashMap();





    }
}
