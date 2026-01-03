package com.day1.vehiclerental;

class Customer {
    private String name;

    Customer(String name) {
        this.name = name;
    }

    public void rentVehicle(Rentable vehicle, int days) {
        System.out.println(
            name + " rented vehicle for " + days + " days. Rent = ₹" +
            vehicle.calculateRent(days)
        );
    }
}
