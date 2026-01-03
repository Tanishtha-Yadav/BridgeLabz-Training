package com.encapsulation.ridehailing;

public class RideHailingTest {
    public static void main(String[] args) {

        Vehicle v1 = new Car(1, "Rohit", 15);
        Vehicle v2 = new Bike(2, "Amit", 8);
        Vehicle v3 = new Auto(3, "Suresh", 12);

        v1.updateLocation("MG Road");
        v2.updateLocation("Railway Station");
        v3.updateLocation("Bus Stand");

        RideService.printFare(v1, 10);
        RideService.printFare(v2, 10);
        RideService.printFare(v3, 10);
    }
}
