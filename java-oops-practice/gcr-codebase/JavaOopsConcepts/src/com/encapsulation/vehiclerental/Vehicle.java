package com.encapsulation.vehiclerental;

abstract class Vehicle {

    private String vehicleNumber;          
    protected String type;
    protected double rentalRate;

    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    abstract double calculateRentalCost(int days);

    public void displayVehicle() {
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Type: " + type);
    }
}
