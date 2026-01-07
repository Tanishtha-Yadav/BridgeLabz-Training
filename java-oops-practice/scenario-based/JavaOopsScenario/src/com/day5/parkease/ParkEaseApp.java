package com.day5.parkease;

public class ParkEaseApp {
    public static void main(String[] args) {

        ParkingSlot slot1 =
            new ParkingSlot(101, "City Mall", "Car");

        Vehicle car = new Car("MP09AB1234");

        if (slot1.assignSlot(car)) {
            System.out.println("Slot assigned successfully");

            int hoursParked = 6;
            System.out.println("Parking Charges: ₹" +
                car.calculateCharges(hoursParked));

            slot1.showBookingLog();
            slot1.releaseSlot();
        } else {
            System.out.println("Slot not available for this vehicle");
        }
    }
}
