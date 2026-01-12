package com.day2.compartmentnavigation;

class Train {

    private Compartment head;
    private Compartment tail;

    // Insert compartment at end
    public void addCompartment(String name) {
        Compartment newComp = new Compartment(name);

        if (head == null) {
            head = tail = newComp;
        } else {
            tail.next = newComp;
            newComp.prev = tail;
            tail = newComp;
        }
    }

    // Remove a compartment
    public void removeCompartment(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {

                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;

                System.out.println("Removed: " + name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found.");
    }

    // Traverse forward
    public void traverseForward() {
        Compartment temp = head;
        while (temp != null) {
            System.out.print(temp.name + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Traverse backward
    public void traverseBackward() {
        Compartment temp = tail;
        while (temp != null) {
            System.out.print(temp.name + " ⇄ ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    // Show adjacent compartments
    public void showAdjacent(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {
                System.out.println("Current: " + temp.name);
                System.out.println("Previous: " +
                        (temp.prev != null ? temp.prev.name : "None"));
                System.out.println("Next: " +
                        (temp.next != null ? temp.next.name : "None"));
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found.");
    }
}

