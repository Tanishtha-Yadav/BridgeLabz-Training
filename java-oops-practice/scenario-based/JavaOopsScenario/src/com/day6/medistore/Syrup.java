package com.day6.medistore;

class Syrup extends Medicine {
    public Syrup(String name, double price, String expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        return true; // liquid meds expire faster (demo logic)
    }
}
