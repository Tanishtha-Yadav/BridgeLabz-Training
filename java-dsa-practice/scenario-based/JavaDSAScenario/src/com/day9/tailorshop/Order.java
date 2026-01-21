package com.day9.tailorshop;

public class Order {
    String customerName;
    String deadline; // format "YYYY-MM-DD"
    
    public Order(String customerName, String deadline) {
        this.customerName = customerName;
        this.deadline = deadline;
    }
    
    @Override
    public String toString() {
        return customerName + " (" + deadline + ")";
    }
}

