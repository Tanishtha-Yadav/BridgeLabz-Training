package com.day5.bookbazaar;

abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;

    private int stock;          // encapsulated inventory

    Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Optional offer constructor
    Book(String title, String author, double price) {
        this(title, author, price, 10);
    }

    // Inventory control
    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public int getStock() {
        return stock;
    }
}
