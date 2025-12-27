package com.constructors.level1;

// Public class 
public class Student {

    // Access modifiers
    public int rollNumber;      
    protected String name;    
    private double CGPA;       

    // Constructor
    public Student(int rollNumber, String name, double CGPA) 
    {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA()
    {
        return CGPA;
    }

    public void setCGPA(double CGPA)
    {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student
{

    private String specialization;

    public PostgraduateStudent(int rollNumber, String name,double CGPA, String specialization) 
    {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber); 
        System.out.println("Name: " + name);       
        System.out.println("CGPA: " + getCGPA()); 
        System.out.println("Specialization: " + specialization);
        System.out.println();
    }

    public static void main(String[] args) {

        PostgraduateStudent pg = new PostgraduateStudent(101, "Suhani", 8.7, "Data Science");

        pg.displayDetails();


        pg.setCGPA(9.2);
        System.out.println("Updated CGPA : " + pg.getCGPA());
    }
}
