package com.day3.parceltracker;

class ParcelTracker {

    Stage head;

    // Add stage at end
    void addStage(String name) {
        Stage newStage = new Stage(name);

        if (head == null) {
            head = newStage;
            return;
        }

        Stage temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStage;
    }

    // Insert custom checkpoint after a stage
    void insertAfter(String afterStage, String newStage) {

        Stage temp = head;
        while (temp != null && !temp.name.equals(afterStage)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found");
            return;
        }

        Stage node = new Stage(newStage);
        node.next = temp.next;
        temp.next = node;
    }

    // Track parcel forward
    void trackParcel() {
        if (head == null) {
            System.out.println("Parcel missing (no tracking info)");
            return;
        }

        Stage temp = head;
        while (temp != null) {
            System.out.print(temp.name + " → ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
