package com.day3.smartcheckout;

import java.util.*;

class SmartCheckout {

    Queue<Customer> queue = new LinkedList<>();
    HashMap<String, Item> inventory = new HashMap<>();

    // Add item to inventory
    void addItem(String name, int price, int stock) {
        inventory.put(name, new Item(price, stock));
    }

    // Add customer to queue
    void addCustomer(Customer customer) {
        queue.offer(customer);
        System.out.println(customer.name + " joined the queue");
    }

    // Process billing
    void processCustomer() {

        if (queue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer c = queue.poll();
        int total = 0;

        System.out.println("Billing for " + c.name);

        for (String itemName : c.items) {
            Item item = inventory.get(itemName);

            if (item == null) {
                System.out.println(itemName + " not found");
                continue;
            }

            if (item.stock <= 0) {
                System.out.println(itemName + " out of stock");
                continue;
            }

            total += item.price;
            item.stock--;
        }

        System.out.println("Total bill: ₹" + total);
    }
}
