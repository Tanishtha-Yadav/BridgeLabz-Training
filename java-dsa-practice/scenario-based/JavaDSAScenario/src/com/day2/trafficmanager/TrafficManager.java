package com.day2.trafficmanager;

public class TrafficManager {
    public static void main(String[] args) {

        VehicleQueue waitingQueue = new VehicleQueue(3);
        Roundabout roundabout = new Roundabout();

        // Vehicles arrive
        waitingQueue.enqueue("CAR-101");
        waitingQueue.enqueue("CAR-102");
        waitingQueue.enqueue("CAR-103");
        waitingQueue.enqueue("CAR-104"); // overflow

        // Vehicles enter roundabout
        roundabout.addVehicle(waitingQueue.dequeue());
        roundabout.addVehicle(waitingQueue.dequeue());

        roundabout.printRoundabout();

        // Vehicle exits
        roundabout.removeVehicle();
        roundabout.printRoundabout();

        // Next vehicle enters
        roundabout.addVehicle(waitingQueue.dequeue());
        roundabout.printRoundabout();
    }
}
