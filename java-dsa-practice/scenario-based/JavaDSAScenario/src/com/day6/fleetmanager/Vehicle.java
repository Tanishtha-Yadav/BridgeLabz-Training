package com.day6.fleetmanager;

class Vehicle {
    String id;
    int mileage;

    Vehicle(String id, int mileage) {
        this.id = id;
        this.mileage = mileage;
    }

    public String toString() {
        return id + " -> " + mileage;
    }
}
