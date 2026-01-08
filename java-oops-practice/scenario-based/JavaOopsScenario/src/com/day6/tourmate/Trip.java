package com.day6.tourmate;

abstract class Trip implements IBookable {
    protected String destination;
    protected int duration;
    protected double budget;

    protected Transport transport;
    protected Hotel hotel;
    protected Activity activity;

    // Constructor builds complete trip package
    public Trip(String destination, int duration,
                Transport transport, Hotel hotel, Activity activity) {

        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;

        // Operator usage: total budget
        this.budget = transport.getCost() + hotel.getCost() + activity.getCost();
    }

    public void cancel() {
        System.out.println("Trip to " + destination + " cancelled");
    }
}
