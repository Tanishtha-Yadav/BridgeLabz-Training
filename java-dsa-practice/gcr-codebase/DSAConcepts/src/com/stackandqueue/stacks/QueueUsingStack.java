package com.stackandqueue.stacks;

import java.util.Stack;
class QueueUsingStacks {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    // Enqueue operation: push to s1
    public void enqueue(int data) {
        s1.push(data);
        System.out.println("Enqueued: " + data);
    }

    // Dequeue operation: pop from s2; transfer if s2 is empty
    public int dequeue() {
        if (s2.isEmpty()) {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty!");
                return -1; // or throw exception
            }
            // Transfer all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        int removed = s2.pop();
        System.out.println("Dequeued: " + removed);
        return removed;
    }

    // Peek front element
    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty())
                s2.push(s1.pop());
        }
        if (!s2.isEmpty())
            return s2.peek();
        return -1;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.dequeue();
        queue.enqueue(40);
        queue.dequeue();

        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue empty? " + queue.isEmpty());
    }
}
