package com.day3.parceltracker;

public class ParcelSystem {
    public static void main(String[] args) {

        ParcelTracker tracker = new ParcelTracker();

        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");

        tracker.insertAfter("Shipped", "Custom Checkpoint");

        tracker.trackParcel();
    }
}
