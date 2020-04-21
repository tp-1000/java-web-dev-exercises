package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;


public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();
    private int courseNumber = 0;

    public Course(Teacher instructor, String topic) {
        this.instructor = instructor;
        this.topic = topic;
        this.courseNumber = setCourseNumber();
    }




    public String toString(){
        return "This is a course about " + topic + " that " + instructor.getFirstName() + " " + instructor.getLastName() + " teaches. Its course number is: " + courseNumber;
    }

    public int hashCode(){
        return courseNumber;
    }




    private int getCourseNumber() {
        return this.courseNumber;
    }
    private int setCourseNumber() {
        return this.courseNumber++;
    }

    public Teacher getInstructor() {
        return instructor;
    }
    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getEnrolledStudents() {
        return getTopic() + " class roster:\n" +  enrolledStudents.toString();
    }
    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public String addStudent(Student student) {
        this.enrolledStudents.add(student);
        return student.getName() + "added to " + this.topic + " class.";
    }
}
