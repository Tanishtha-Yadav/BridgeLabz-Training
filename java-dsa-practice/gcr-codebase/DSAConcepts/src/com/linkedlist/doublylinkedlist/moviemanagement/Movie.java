package com.linkedlist.doublylinkedlist.moviemanagement;

class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode prev, next;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}

public class Movie {
    MovieNode head, tail;

    // Add at beginning
    void addAtBeginning(String t, String d, int y, double r) {
        MovieNode newNode = new MovieNode(t, d, y, r);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add at end
    void addAtEnd(String t, String d, int y, double r) {
        MovieNode newNode = new MovieNode(t, d, y, r);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Add at specific position
    void addAtPosition(int pos, String t, String d, int y, double r) {
        if (pos == 1) {
            addAtBeginning(t, d, y, r);
            return;
        }
        MovieNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp == tail) {
            addAtEnd(t, d, y, r);
            return;
        }

        MovieNode newNode = new MovieNode(t, d, y, r);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Remove by Movie Title
    void removeByTitle(String title) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by Director
    void searchByDirector(String director) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director))
                System.out.println(temp.title + " (" + temp.rating + ")");
            temp = temp.next;
        }
    }

    // Search by Rating
    void searchByRating(double rating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.rating == rating)
                System.out.println(temp.title + " - " + temp.director);
            temp = temp.next;
        }
    }

    // Update rating by title
    void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    // Display forward
    void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " +
                               temp.year + " | " + temp.rating);
            temp = temp.next;
        }
    }

    // Display reverse
    void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " +
                               temp.year + " | " + temp.rating);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        Movie list = new Movie();

        list.addAtBeginning("Inception", "Nolan", 2010, 8.8);
        list.addAtEnd("Interstellar", "Nolan", 2014, 8.6);
        list.addAtPosition(2, "Avatar", "Cameron", 2009, 7.8);

        list.displayForward();
        list.updateRating("Avatar", 8.0);
        list.removeByTitle("Inception");

        System.out.println("Reverse Order:");
        list.displayReverse();
    }
}

