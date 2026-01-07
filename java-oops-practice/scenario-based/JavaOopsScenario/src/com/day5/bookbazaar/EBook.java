package com.day5.bookbazaar;

class EBook extends Book {

    EBook(String title, String author, double price) {
        super(title, author, price, Integer.MAX_VALUE);
    }

    @Override
    public double applyDiscount(int quantity) {
        // Flat 20% digital discount
        return price * quantity * 0.20;
    }
}
