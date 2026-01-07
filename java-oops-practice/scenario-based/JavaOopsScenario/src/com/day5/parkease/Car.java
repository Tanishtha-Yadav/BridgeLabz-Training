package com.day5.parkease;

class Car extends Vehicle {

    Car(String vehicleNumber) {
        super(vehicleNumber, 50);
    }

    @Override
    public double calculateCharges(int hours) {
        double charge = baseRate * hours;
        if (hours > 5)
            charge += 100;   // overtime penalty
        return charge;
    }
}

