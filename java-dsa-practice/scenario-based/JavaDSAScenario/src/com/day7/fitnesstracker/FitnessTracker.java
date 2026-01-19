package com.day7.fitnesstracker;

public class FitnessTracker {
    public static void main(String[] args) {

        User[] users = {
            new User("Aman", 8200),
            new User("Riya", 10500),
            new User("Neha", 9400),
            new User("Karan", 7600),
            new User("Pooja", 11000)
        };

        BubbleSort.sort(users);

        int rank = 1;
        for (User u : users) {
            System.out.println("Rank " + rank++ + " -> " + u);
        }
    }
}
