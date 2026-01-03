package com.day1.vehiclerental;

class Car extends Vehicle implements Rentable {

    Car(String model, double baseRate) {
        super(model, baseRate);
    }

    private double calculateSurcharge() {
        return 500;   // flat surcharge
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + calculateSurcharge();
    }
}
