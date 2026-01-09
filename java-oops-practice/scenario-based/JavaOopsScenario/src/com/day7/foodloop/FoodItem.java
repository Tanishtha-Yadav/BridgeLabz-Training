package com.day7.foodloop;

public abstract class FoodItem {

    protected String name;
    protected String category;
    protected double price;
    private boolean available;   // encapsulation

    public FoodItem(String name, String category, double price, boolean available) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }
}

