package com.day2.compartmentnavigation;

public class TrainApp {

    public static void main(String[] args) {

        Train train = new Train();

        train.addCompartment("Engine");
        train.addCompartment("Sleeper");
        train.addCompartment("Pantry");
        train.addCompartment("AC");
        train.addCompartment("WiFi");

        train.traverseForward();
        train.traverseBackward();

        train.showAdjacent("Pantry");

        train.removeCompartment("Sleeper");
        train.traverseForward();
    }
}
