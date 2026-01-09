package com.day7.foodloop;

import java.util.*;

class Order implements IOrderable {

    List<FoodItem> items;
    double total;

    // Constructor for combo meal
    Order(List<FoodItem> items) {
        this.items = items;
    }

    void calculateTotal() {
        total = 0;
        for (FoodItem item : items) {
            total += item.price;
        }
        total -= applyDiscount();   // operator usage
    }

    // Polymorphism
    double applyDiscount() {
        if (total > 500)
            return total * 0.10;
        else
            return 0;
    }

    @Override
    public void placeOrder() {
        calculateTotal();
        System.out.println("Order placed. Total: " + total);
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled");
    }
}
