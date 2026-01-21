package com.day9.tailorshop;

import java.util.ArrayList;

public class TailorShop {
    
    public static void insertOrder(ArrayList<Order> orders, Order newOrder) {
        int i = orders.size() - 1;
        orders.add(newOrder); // temporarily add at end
        while (i >= 0 && orders.get(i).deadline.compareTo(newOrder.deadline) > 0) {
            orders.set(i + 1, orders.get(i)); // shift right
            i--;
        }
        orders.set(i + 1, newOrder); // insert at correct position
    }
    
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        
        insertOrder(orders, new Order("Alice", "2026-01-22"));
        insertOrder(orders, new Order("Bob", "2026-01-20"));
        insertOrder(orders, new Order("Charlie", "2026-01-21"));
        
        System.out.println("Orders sorted by deadline:");
        for(Order o : orders) {
            System.out.println(o);
        }
    }
}