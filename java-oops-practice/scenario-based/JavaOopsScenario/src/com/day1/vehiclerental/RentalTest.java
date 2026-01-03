package com.day1.vehiclerental;

public class RentalTest {
    public static void main(String[] args) {

        Customer c1 = new Customer("Rohit");

        Rentable bike = new Bike("Yamaha", 300);
        Rentable car = new Car("Honda City", 1200);
        Rentable truck = new Truck("Tata Truck", 2000);

        c1.rentVehicle(bike, 3);
        c1.rentVehicle(car, 3);
        c1.rentVehicle(truck, 3);
    }
}
