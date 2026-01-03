package com.inheritance.basicproblems.employeehierarchy;

public class Manager extends Employee 
{
    int teamSize;

    public Manager(String name, int id, double salary, int teamSize) 
    {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails() 
    {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
