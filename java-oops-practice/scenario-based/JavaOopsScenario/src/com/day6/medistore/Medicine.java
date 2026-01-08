package com.day6.medistore;

abstract class Medicine implements ISellable {
    private double price;          // sensitive pricing logic hidden
    private int quantity;           // internal stock hidden
    protected String name;
    protected String expiryDate;    // YYYY-MM-DD

    // Constructor with default quantity
    public Medicine(String name, double price, String expiryDate) {
        this(name, price, expiryDate, 50); // default stock
    }

    public Medicine(String name, double price, String expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Encapsulated price calculation
    protected double calculatePrice(int qty) {
        double total = price * qty;
        if (qty >= 10) total *= 0.9; // 10% discount
        return total;
    }

    // Stock adjustment
    protected void reduceStock(int qty) {
        quantity -= qty;
    }

    @Override
    public double sell(int qty) {
        if (qty > quantity || checkExpiry()) {
            System.out.println("Sale not allowed for " + name);
            return 0;
        }
        reduceStock(qty);
        return calculatePrice(qty);
    }
}
