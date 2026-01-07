package com.day5.parkease;

abstract class Vehicle implements IPayable {
    protected String vehicleNumber;
    protected double baseRate;

    Vehicle(String vehicleNumber, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
    }
}
