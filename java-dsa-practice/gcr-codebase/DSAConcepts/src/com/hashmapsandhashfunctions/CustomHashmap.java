package com.hashmapsandhashfunctions;

import java.util.LinkedList;

class CustomHashMap<K, V> {

    private class Node {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size = 16; // number of buckets
    private LinkedList<Node>[] buckets;

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        buckets = new LinkedList[size];
        for (int i = 0; i < size; i++)
            buckets[i] = new LinkedList<>();
    }

    // Hash function to get bucket index
    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % size;
    }

    // Insert or update key-value pair
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        LinkedList<Node> bucket = buckets[index];

        for (Node node : bucket) {
            if (node.key.equals(key)) {
                node.value = value; // update value
                return;
            }
        }

        bucket.add(new Node(key, value)); // insert new node
    }

    // Retrieve value for a key
    public V get(K key) {
        int index = getBucketIndex(key);
        LinkedList<Node> bucket = buckets[index];

        for (Node node : bucket) {
            if (node.key.equals(key)) return node.value;
        }

        return null; // key not found
    }

    // Remove key-value pair
    public void remove(K key) {
        int index = getBucketIndex(key);
        LinkedList<Node> bucket = buckets[index];

        Node toRemove = null;
        for (Node node : bucket) {
            if (node.key.equals(key)) {
                toRemove = node;
                break;
            }
        }

        if (toRemove != null) bucket.remove(toRemove);
    }

    // Display all key-value pairs
    public void display() {
        for (int i = 0; i < size; i++) {
            LinkedList<Node> bucket = buckets[i];
            for (Node node : bucket) {
                System.out.println(node.key + " -> " + node.value);
            }
        }
    }

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        map.put("Apple", 50);
        map.put("Banana", 30);
        map.put("Orange", 20);

        System.out.println("Value for Apple: " + map.get("Apple"));

        map.put("Apple", 60); // update
        System.out.println("Updated value for Apple: " + map.get("Apple"));

        map.remove("Banana");
        System.out.println("After removing Banana:");
        map.display();
    }
}
