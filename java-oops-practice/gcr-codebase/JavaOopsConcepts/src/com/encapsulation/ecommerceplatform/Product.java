package com.encapsulation.ecommerceplatform;

abstract class Product {

    private int productId;
    private String name;
    protected double price;   

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

  
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

 
    abstract double calculateDiscount();


    public void displayDetails() {
        System.out.println("ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

