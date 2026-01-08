package com.day6.tourmate;

class Hotel {
    private double cost;   // hidden cost

    public Hotel(double cost) {
        this.cost = cost;
    }

    double getCost() {
        return cost;
    }
}