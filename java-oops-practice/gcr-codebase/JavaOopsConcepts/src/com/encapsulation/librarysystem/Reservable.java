package com.encapsulation.librarysystem;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

