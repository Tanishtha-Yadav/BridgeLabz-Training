package com.day6.tourmate;

class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration,
                        Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public double book() {
        System.out.println("Booking domestic trip to " + destination);
        return budget;
    }
}

