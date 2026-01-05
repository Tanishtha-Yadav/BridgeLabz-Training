package com.linkedlist.doublylinkedlist.librarymanagement;

class BookNode {
    int bookId;
    String title, author, genre;
    boolean available;
    BookNode prev, next;

    BookNode(int id, String t, String a, String g, boolean avail) {
        bookId = id;
        title = t;
        author = a;
        genre = g;
        available = avail;
        prev = next = null;
    }
}

public class Library {
    BookNode head, tail;

    // Add at beginning
    void addAtBeginning(int id, String t, String a, String g, boolean avail) {
        BookNode newNode = new BookNode(id, t, a, g, avail);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add at end
    void addAtEnd(int id, String t, String a, String g, boolean avail) {
        BookNode newNode = new BookNode(id, t, a, g, avail);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Add at specific position
    void addAtPosition(int pos, int id, String t, String a, String g, boolean avail) {
        if (pos == 1) {
            addAtBeginning(id, t, a, g, avail);
            return;
        }
        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp == tail) {
            addAtEnd(id, t, a, g, avail);
            return;
        }

        BookNode newNode = new BookNode(id, t, a, g, avail);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Remove by Book ID
    void removeById(int id) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by Title
    void searchByTitle(String title) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title))
                printBook(temp);
            temp = temp.next;
        }
    }

    // Search by Author
    void searchByAuthor(String author) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author))
                printBook(temp);
            temp = temp.next;
        }
    }

    // Update availability
    void updateAvailability(int id, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.available = status;
                return;
            }
            temp = temp.next;
        }
    }

    // Display forward
    void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }

    // Count books
    int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Helper method
    void printBook(BookNode b) {
        System.out.println(b.bookId + " | " + b.title + " | " +
                b.author + " | " + b.genre + " | " +
                (b.available ? "Available" : "Issued"));
    }

    public static void main(String[] args) {
        Library lib = new Library();

        lib.addAtEnd(1, "Java Basics", "Herbert Schildt", "Programming", true);
        lib.addAtEnd(2, "Clean Code", "Robert Martin", "Software", true);
        lib.addAtBeginning(3, "DSA Made Easy", "Narasimha", "Data Structures", false);

        lib.displayForward();
        lib.updateAvailability(2, false);

        System.out.println("Reverse Order:");
        lib.displayReverse();

        System.out.println("Total Books: " + lib.countBooks());
    }
}

