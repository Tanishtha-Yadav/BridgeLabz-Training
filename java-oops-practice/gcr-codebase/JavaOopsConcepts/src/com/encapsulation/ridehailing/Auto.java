package com.encapsulation.ridehailing;

class Auto extends Vehicle {
    public Auto(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20; 
    }
}
