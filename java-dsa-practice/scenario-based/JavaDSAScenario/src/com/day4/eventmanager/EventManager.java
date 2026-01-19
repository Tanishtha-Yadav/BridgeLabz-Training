package com.day4.eventmanager;

public class EventManager {
    public static void main(String[] args) {

        Ticket[] tickets = {
            new Ticket(1200),
            new Ticket(450),
            new Ticket(800),
            new Ticket(300),
            new Ticket(1500)
        };

        QuickSort.quickSort(tickets, 0, tickets.length - 1);

        // Top 50 cheapest (example: print all sorted)
        for (Ticket t : tickets)
            System.out.println(t);
    }
}
