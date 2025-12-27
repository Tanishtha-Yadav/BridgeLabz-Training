package com.constructors.level1;

public class HotelBooking {

    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor (constructor chaining)
    HotelBooking() {
        this("guest", "Regular", 1);
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking hb) {
        this(hb.guestName, hb.roomType, hb.nights);
    }

    void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type : " + roomType);
        System.out.println("Nights    : " + nights);
        System.out.println();
    }

    public static void main(String[] args) {

        HotelBooking b1 = new HotelBooking();
        b1.display();

        HotelBooking b2 = new HotelBooking("Suhani", "Premium", 3);
        b2.display();

        HotelBooking b3 = new HotelBooking(b2);
        b3.display();
    }
}
