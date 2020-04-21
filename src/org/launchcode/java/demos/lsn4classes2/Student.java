package org.launchcode.java.demos.lsn4classes2;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    public String getGradeLevel() {
        if(0 <= numberOfCredits && numberOfCredits <= 24) {
            return this.name + " is a Freshman";
        } else if(25 <= numberOfCredits && numberOfCredits <= 54) {
            return this.name + " is a Sophomore";
        } else if(55 <= numberOfCredits && numberOfCredits <= 88) {
            return this.name + " is a Junior";
        } else if(89 <= numberOfCredits) {
            return this.name + " is a Senior";
        }

        return "invalid grade level";
    }

    public void addGrade(int courseCredits, double grade) {
        this.numberOfCredits += courseCredits;
        this.gpa = grade;
    }

    public String toString() {
        return this.name + "[ID: " + studentId + "]" + " has taken " + numberOfCredits + " credit hours – " +
                "GPA is " + this.gpa;
     }

     //custom equal method, based on student ID
     public int hashCode() {
        return this.studentId;
     }



    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }


    public void setName(String name) {
        this.name = name;
    }

    private void setStudentId(int studentId) {
        this.studentId = studentId;
        studentId++;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }


    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        Student lilly = new Student("Lilly");
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally.studentInfo());
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally.studentInfo());
        Student tom = new Student("Tom");
        tom.addGrade(1, 4.0);


        Teacher andrewP = new Teacher("Andrew", "Petty", "Archetecture", 4 );
        Course english = new Course(andrewP, "Revit");
        english.addStudent(sally);
        english.addStudent(tom);
        english.addStudent(lilly);
        System.out.println(english);
        System.out.println(english.getEnrolledStudents());
    }
}
