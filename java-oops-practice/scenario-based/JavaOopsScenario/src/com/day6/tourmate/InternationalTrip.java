package com.day6.tourmate;

class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public double book() {
        System.out.println("Booking international trip to " + destination);
        return budget * 1.15; // visa + insurance charges
    }
}
