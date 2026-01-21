package com.day9.medwarehouse;

public class Medicine {
    private String name;
    private String expiry; // format "YYYY-MM-DD"

    public Medicine(String name, String expiry) {
        this.name = name;
        this.expiry = expiry;
    }

    public String getName() {
        return name;
    }

    public String getExpiry() {
        return expiry;
    }

    @Override
    public String toString() {
        return name + " (" + expiry + ")";
    }
}
