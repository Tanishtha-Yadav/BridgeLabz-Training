package com.day1.ambulance;

public class AmbulanceRoute {

    private HospitalUnit head;

    // Add unit to circular list
    public void addUnit(String name, boolean available) {
        HospitalUnit newUnit = new HospitalUnit(name, available);

        if (head == null) {
            head = newUnit;
            newUnit.next = head;
            return;
        }

        HospitalUnit temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newUnit;
        newUnit.next = head;
    }

    // Find nearest available unit
    public void findAvailableUnit() {
        if (head == null) {
            System.out.println("No hospital units available");
            return;
        }

        HospitalUnit temp = head;
        do {
            if (temp.available) {
                System.out.println("Redirect patient to: " + temp.name);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("No units currently available");
    }

    // Remove unit under maintenance
    public void removeUnit(String name) {
        if (head == null) return;

        HospitalUnit curr = head;
        HospitalUnit prev = null;

        do {
            if (curr.name.equals(name)) {

                // Only one node
                if (curr == head && curr.next == head) {
                    head = null;
                    return;
                }

                // Removing head
                if (curr == head) {
                    HospitalUnit last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println(name + " removed (maintenance)");
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);
    }

    // Display circular path
    public void displayRoute() {
        if (head == null) return;

        HospitalUnit temp = head;
        do {
            System.out.print(temp.name + " → ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to " + head.name + ")");
    }
}
