package com.day5.bookbazaar;

class PrintedBook extends Book {

    PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(int quantity) {
        // Bulk discount
        if (quantity >= 3)
            return price * quantity * 0.10;
        return 0;
    }
}

