package exercises;
import java.util.Scanner;

public class Milespergallon {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many gallons of gas have you used? ");
        float gasUsed = input.nextFloat();

        System.out.println("How many miles have you dirven? ");
        float milesDriven = input.nextFloat();
        input.close();

        System.out.println("You just got" + milesDriven/gasUsed + "MPG");

    }

}
