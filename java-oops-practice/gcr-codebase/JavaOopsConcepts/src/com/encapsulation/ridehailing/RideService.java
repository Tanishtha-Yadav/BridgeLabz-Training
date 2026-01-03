package com.encapsulation.ridehailing;

class RideService {
    public static void printFare(Vehicle v, double distance) {
        System.out.println(v.getVehicleDetails());
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + v.calculateFare(distance));
        System.out.println("Location: " + v.getCurrentLocation());
        System.out.println("--------------------");
    }
}
