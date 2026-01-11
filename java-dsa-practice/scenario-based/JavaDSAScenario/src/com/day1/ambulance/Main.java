package com.day1.ambulance;

public class Main {
    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency", true);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", false);
        route.addUnit("ICU", true);

        route.displayRoute();

        route.findAvailableUnit();

        route.removeUnit("Radiology");
        route.displayRoute();

        route.findAvailableUnit();
    }
}

