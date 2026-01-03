package com.encapsulation.fooddelivery;

abstract class FoodItem {

    private String itemName;
    protected double price;
    protected int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public String getItemName() {
        return itemName;
    }
}

