package com.constructors.level1;

public class Vehicle {

    // Instance variables 
    private String ownerName;
    private String vehicleType;

    // Class variable
    private static double registrationFee = 5000;

    // Constructor
    Vehicle(String ownerName, String vehicleType) 
    {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails()
    {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method
    static void updateRegistrationFee(double newFee) 
    {
        registrationFee = newFee;
    }

    public static void main(String[] args) 
    {

        Vehicle v1 = new Vehicle("Amit", "Car");
        Vehicle v2 = new Vehicle("Neha", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6500);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
