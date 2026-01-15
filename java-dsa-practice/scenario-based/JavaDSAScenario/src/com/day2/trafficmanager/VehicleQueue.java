package com.day2.trafficmanager;

class VehicleQueue {
    String[] queue;
    int front = 0, rear = -1, size = 0, capacity;

    VehicleQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(String vehicle) {
        if (isFull()) {
            System.out.println("Queue Overflow: Vehicle cannot enter now");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = vehicle;
        size++;
    }

    String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow: No waiting vehicles");
            return null;
        }
        String vehicle = queue[front];
        front = (front + 1) % capacity;
        size--;
        return vehicle;
    }
}
