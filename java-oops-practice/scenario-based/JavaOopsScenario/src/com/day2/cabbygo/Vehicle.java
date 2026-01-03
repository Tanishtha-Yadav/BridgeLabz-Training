package com.day2.cabbygo;

abstract class Vehicle implements IRideService {
    private String vehicleNumber;
    private int capacity;
    private double fare;  
    protected double ratePerKm; 

    Vehicle(String vehicleNumber, int capacity, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getFare() {
        return fare;
    }

    protected void setFare(double fare) {
        this.fare = fare;
    }
}
