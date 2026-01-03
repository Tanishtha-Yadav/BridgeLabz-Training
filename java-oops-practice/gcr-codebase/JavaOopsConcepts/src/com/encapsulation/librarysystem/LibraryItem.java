package com.encapsulation.librarysystem;

abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;
    private boolean available = true;

    private String borrowerName;

    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + available);
    }

    protected void reserve(String borrower) {
        this.borrowerName = borrower;
        this.available = false;
    }

    protected boolean isAvailable() {
        return available;
    }
}
