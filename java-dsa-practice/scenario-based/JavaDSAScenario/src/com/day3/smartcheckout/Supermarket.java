package com.day3.smartcheckout;

import java.util.*;

public class Supermarket {
    public static void main(String[] args) {

        SmartCheckout checkout = new SmartCheckout();

        checkout.addItem("Milk", 50, 5);
        checkout.addItem("Bread", 30, 3);
        checkout.addItem("Eggs", 10, 10);

        Customer c1 = new Customer("Alice", Arrays.asList("Milk", "Bread"));
        Customer c2 = new Customer("Bob", Arrays.asList("Eggs", "Milk", "Eggs"));

        checkout.addCustomer(c1);
        checkout.addCustomer(c2);

        checkout.processCustomer();
        checkout.processCustomer();
        checkout.processCustomer(); // empty queue
    }
}
