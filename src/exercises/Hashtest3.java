package exercises;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashtest3 {

    public static void GradeBookHashMap() {
        HashMap<String, String> enrolmentList = new HashMap<>();
        String iD;
        String studentName;

        Scanner input = new Scanner(System.in);
        // get student name(values) and ID number(key)
        do {
            System.out.println("Enter a student ID: ");
            iD = input.nextLine();
            
            if(!iD.equals("")) {
                System.out.println("Enter the name of the student associated with " + iD + ": ");
                studentName = input.nextLine();
                enrolmentList.put(iD, studentName);
                continue;
            }
                System.out.println("End of setup\n______________________");
        } while (!iD.equals(""));

        System.out.println("\nCurrent Enrolment");
        for (Map.Entry<String,String> student: enrolmentList.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }
    }
}
