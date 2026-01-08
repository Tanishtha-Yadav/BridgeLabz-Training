package com.day6.tourmate;

public class TourMateApp {
    public static void main(String[] args) {

        Trip t1 = new DomesticTrip(
                "Goa", 5,
                new Transport(6000),
                new Hotel(12000),
                new Activity(3000)
        );

        Trip t2 = new InternationalTrip(
                "Paris", 7,
                new Transport(45000),
                new Hotel(70000),
                new Activity(15000)
        );

        System.out.println("Domestic Trip Cost: ₹" + t1.book());
        System.out.println("International Trip Cost: ₹" + t2.book());
    }
}

