package com.day5.parkease;

class Truck extends Vehicle {

    Truck(String vehicleNumber) {
        super(vehicleNumber, 80);
    }

    @Override
    public double calculateCharges(int hours) {
        double charge = baseRate * hours;
        if (hours > 4)
            charge += 200;
        return charge;
    }
}

