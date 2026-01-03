package com.day2.cabbygo;

class Mini extends Vehicle {
    private static final double BASE_FARE = 50;

    Mini(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, 10); 
    }

    @Override
    public void bookRide(int distance) {
        double totalFare = BASE_FARE + distance * ratePerKm;
        setFare(totalFare);
        System.out.println("Mini ride booked. Fare: ₹" + getFare());
    }

    @Override
    public void endRide() {
        System.out.println("Mini ride ended. Total fare: ₹" + getFare());
    }
}

class Sedan extends Vehicle {
    private static final double BASE_FARE = 100;

    Sedan(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, 15); 
    }

    @Override
    public void bookRide(int distance) {
        double totalFare = BASE_FARE + distance * ratePerKm;
        setFare(totalFare);
        System.out.println("Sedan ride booked. Fare: ₹" + getFare());
    }

    @Override
    public void endRide() {
        System.out.println("Sedan ride ended. Total fare: ₹" + getFare());
    }
}

class SUV extends Vehicle {
    private static final double BASE_FARE = 200;

    SUV(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, 25); 
    }

    @Override
    public void bookRide(int distance) {
        double totalFare = BASE_FARE + distance * ratePerKm;
        setFare(totalFare);
        System.out.println("SUV ride booked. Fare: ₹" + getFare());
    }

    @Override
    public void endRide() {
        System.out.println("SUV ride ended. Total fare: ₹" + getFare());
    }
}
