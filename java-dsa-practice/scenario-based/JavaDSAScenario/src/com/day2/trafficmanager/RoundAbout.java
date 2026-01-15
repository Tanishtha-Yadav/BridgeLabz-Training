package com.day2.trafficmanager;

class Roundabout {
    Vehicle head = null;

    void addVehicle(String number) {
        Vehicle newVehicle = new Vehicle(number);

        if (head == null) {
            head = newVehicle;
            newVehicle.next = head;
            return;
        }

        Vehicle temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newVehicle;
        newVehicle.next = head;
    }

    void removeVehicle() {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        if (head.next == head) {
            System.out.println("Vehicle exited: " + head.number);
            head = null;
            return;
        }

        Vehicle temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        System.out.println("Vehicle exited: " + head.number);
        temp.next = head.next;
        head = head.next;
    }

    void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        Vehicle temp = head;
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}
