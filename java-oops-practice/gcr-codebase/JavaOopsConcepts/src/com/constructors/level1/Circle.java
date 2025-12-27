package com.constructors.level1;

public class Circle 
{
    private double radius;

    // Default constructor
    Circle() 
    {
        radius = 1.0;
    }

    // Parameterized constructor
    Circle(double radius) 
    {
        this.radius = radius;
    }

    void display() 
    {
        System.out.println("Radius : " + radius);
    }

    public static void main(String[] args) 
    {

        // Calls default constructor
        Circle c1 = new Circle();
        c1.display();

        // Calls parameterized constructor
        Circle c2 = new Circle(5.5);
        c2.display();
    }
}
