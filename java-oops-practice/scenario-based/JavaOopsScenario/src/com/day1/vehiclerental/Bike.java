package com.day1.vehiclerental;

class Bike extends Vehicle implements Rentable {

    Bike(String model, double baseRate) {
        super(model, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;
    }
}
