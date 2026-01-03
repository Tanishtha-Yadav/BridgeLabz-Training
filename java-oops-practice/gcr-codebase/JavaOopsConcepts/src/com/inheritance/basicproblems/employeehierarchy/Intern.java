package com.inheritance.basicproblems.employeehierarchy;

public class Intern extends Employee 
{
    int duration; 

    public Intern(String name, int id, double salary, int duration)
    {
        super(name, id, salary);
        this.duration = duration;
    }

    public void displayDetails() 
    {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
    }
}
