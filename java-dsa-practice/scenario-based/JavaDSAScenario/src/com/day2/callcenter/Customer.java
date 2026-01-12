package com.day2.callcenter;

class Customer {
    private String name;
    private boolean isVIP;

    public Customer(String name, boolean isVIP) {
        this.name = name;
        this.isVIP = isVIP;
    }

    public String getName() {
        return name;
    }

    public boolean isVIP() {
        return isVIP;
    }
}
