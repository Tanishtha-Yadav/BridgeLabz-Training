package com.constructors.level1;

public class CarRental 
{
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    // Default constructor
    CarRental()
    {
        this("Unknown Customer", "Standard", 1);
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) 
    {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateTotalCost();
    }

    // Method to calculate total cost
    void calculateTotalCost() 
    {
        double costPerDay = 1000;
        totalCost = rentalDays * costPerDay;
    }

    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args)
    {

        // Default rental
        CarRental r1 = new CarRental();
        r1.display();

        // Parameterized rental
        CarRental r2 = new CarRental("Neha Verma", "SUV", 5);
        r2.display();
    }
}
