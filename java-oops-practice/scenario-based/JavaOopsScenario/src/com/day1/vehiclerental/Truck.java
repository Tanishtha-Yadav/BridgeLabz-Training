package com.day1.vehiclerental;

class Truck extends Vehicle implements Rentable {

    Truck(String model, double baseRate) {
        super(model, baseRate);
    }

    private double calculateHeavyLoadCharge() {
        return 1000;
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + calculateHeavyLoadCharge();
    }
}
