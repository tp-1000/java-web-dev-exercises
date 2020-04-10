package exercises;
import java.util.Scanner;

public class Rectangle {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("length of left side: ");
        float width = input.nextFloat();
        System.out.println("length of left side: ");

        float heigth = input.nextFloat();

        input.close();

        float area = (width * heigth);
        System.out.println("The area of your rectange is: " + area);
    }

}
