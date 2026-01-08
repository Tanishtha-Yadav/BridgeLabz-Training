package com.day6.medistore;

class Tablet extends Medicine {
    public Tablet(String name, double price, String expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        return false; // assumed preserved longer
    }
}

