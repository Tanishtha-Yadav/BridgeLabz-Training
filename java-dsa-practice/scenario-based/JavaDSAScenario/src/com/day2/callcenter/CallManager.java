package com.day2.callcenter;

import java.util.*;

class CallManager {

    private Queue<Customer> normalQueue;
    private PriorityQueue<Customer> vipQueue;
    private HashMap<String, Integer> callCountMap;

    public CallManager() {
        normalQueue = new LinkedList<>();
        vipQueue = new PriorityQueue<>(
                (a, b) -> a.getName().compareTo(b.getName())
        );
        callCountMap = new HashMap<>();
    }

    // Receive incoming call
    public void receiveCall(Customer customer) {

        if (customer.isVIP()) {
            vipQueue.add(customer);
        } else {
            normalQueue.add(customer);
        }

        callCountMap.put(
                customer.getName(),
                callCountMap.getOrDefault(customer.getName(), 0) + 1
        );

        System.out.println("Call received from: " + customer.getName());
    }

    // Serve next call
    public void serveCall() {

        Customer customer;

        if (!vipQueue.isEmpty()) {
            customer = vipQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            customer = normalQueue.poll();
        } else {
            System.out.println("No calls to serve.");
            return;
        }

        System.out.println("Serving customer: " + customer.getName());
    }

    // Show call statistics
    public void showCallStats() {
        System.out.println("\nMonthly Call Count:");
        for (Map.Entry<String, Integer> entry : callCountMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
