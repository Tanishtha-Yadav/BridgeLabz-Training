package com.constructors.level1;

public class Course 
{
    // Instance variables 
    private String courseName;
    private int duration;      
    private double fee;

    // Class variable 
    private static String instituteName = "RICR Institute";

    // Constructor
    Course(String courseName, int duration, double fee)
    {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails()
    {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
        System.out.println();
    }

    // Class method
    static void updateInstituteName(String newInstituteName) 
    {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) 
    {

        Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("Data Science", 8, 60000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name for all courses
        Course.updateInstituteName("Raj Digital");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
