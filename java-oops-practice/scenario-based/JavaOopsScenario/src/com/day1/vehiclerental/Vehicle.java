package com.day1.vehiclerental;

class Vehicle {
    protected String model;
    protected double baseRate;

    Vehicle(String model, double baseRate) {
        this.model = model;
        this.baseRate = baseRate;
    }

    public String getModel() {
        return model;
    }
}
