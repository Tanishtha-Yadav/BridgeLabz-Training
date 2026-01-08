package com.day6.medistore;

class Injection extends Medicine {
    public Injection(String name, double price, String expiryDate) {
        super(name, price, expiryDate, 20); // lower default stock
    }

    @Override
    public boolean checkExpiry() {
        return false;
    }
}
