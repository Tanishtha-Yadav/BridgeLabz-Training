package com.day6.fleetmanager;

public class FleetManager {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Vehicle("V101", 45000),
            new Vehicle("V102", 12000),
            new Vehicle("V103", 78000),
            new Vehicle("V104", 30000)
        };

        MergeSort.mergeSort(vehicles, 0, vehicles.length - 1);

        for (Vehicle v : vehicles)
            System.out.println(v);
    }
}

