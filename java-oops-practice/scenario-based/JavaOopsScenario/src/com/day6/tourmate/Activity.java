package com.day6.tourmate;


class Activity {
    private double cost;   // hidden cost

    public Activity(double cost) {
        this.cost = cost;
    }

    double getCost() {
        return cost;
    }
}
