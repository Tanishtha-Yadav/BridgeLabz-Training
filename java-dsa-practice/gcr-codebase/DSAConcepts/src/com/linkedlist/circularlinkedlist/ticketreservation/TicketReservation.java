package com.linkedlist.circularlinkedlist.ticketreservation;

class TicketNode {
    int ticketId;
    String customerName, movieName, seatNumber, bookingTime;
    TicketNode next;

    TicketNode(int id, String cust, String movie, String seat, String time) {
        ticketId = id;
        customerName = cust;
        movieName = movie;
        seatNumber = seat;
        bookingTime = time;
        next = this;
    }
}

public class TicketReservation {
    TicketNode head;

    // Add ticket at end
    void addTicket(int id, String cust, String movie, String seat, String time) {
        TicketNode newTicket = new TicketNode(id, cust, movie, seat, time);
        if (head == null) {
            head = newTicket;
            return;
        }
        TicketNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newTicket;
        newTicket.next = head;
    }

    // Remove ticket by ID
    void removeTicket(int id) {
        if (head == null) return;

        TicketNode temp = head, prev = null;
        do {
            if (temp.ticketId == id) {
                if (prev != null)
                    prev.next = temp.next;
                else { // deleting head
                    TicketNode last = head;
                    while (last.next != head)
                        last = last.next;
                    head = head.next;
                    last.next = head;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    // Display all tickets
    void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }
        TicketNode temp = head;
        do {
            System.out.println(temp.ticketId + " | " + temp.customerName + " | " +
                    temp.movieName + " | " + temp.seatNumber + " | " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by Customer Name
    void searchByCustomer(String cust) {
        if (head == null) return;
        TicketNode temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(cust))
                System.out.println(temp.ticketId + " | " + temp.movieName + " | " + temp.seatNumber);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by Movie Name
    void searchByMovie(String movie) {
        if (head == null) return;
        TicketNode temp = head;
        do {
            if (temp.movieName.equalsIgnoreCase(movie))
                System.out.println(temp.ticketId + " | " + temp.customerName + " | " + temp.seatNumber);
            temp = temp.next;
        } while (temp != head);
    }

    // Total tickets
    int totalTickets() {
        if (head == null) return 0;
        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    public static void main(String[] args) {
        TicketReservation tickets = new TicketReservation();

        tickets.addTicket(1, "Alice", "Avatar", "A1", "10:00 AM");
        tickets.addTicket(2, "Bob", "Inception", "B5", "10:30 AM");
        tickets.addTicket(3, "Charlie", "Avatar", "A2", "10:45 AM");

        System.out.println("All Tickets:");
        tickets.displayTickets();

        System.out.println("\nTickets for Movie Avatar:");
        tickets.searchByMovie("Avatar");

        System.out.println("\nTotal Tickets Booked: " + tickets.totalTickets());

        tickets.removeTicket(2);
        System.out.println("\nAfter Removing Ticket 2:");
        tickets.displayTickets();
    }
}
	