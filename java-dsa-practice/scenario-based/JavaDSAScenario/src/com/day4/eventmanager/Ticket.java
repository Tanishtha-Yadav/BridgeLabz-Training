package com.day4.eventmanager;

class Ticket {
    double price;

    Ticket(double price) {
        this.price = price;
    }

    public String toString() {
        return "" + price;
    }
}
