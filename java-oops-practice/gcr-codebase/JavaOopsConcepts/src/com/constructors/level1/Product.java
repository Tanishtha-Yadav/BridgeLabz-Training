package com.constructors.level1;

public class Product 
{
    // Instance variables
    private String productName;
    private double price;

    // Class variable 
    private static int totalProducts = 0;

    // Constructor
    Product(String productName, double price)
    {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
    }

    // Instance method
    void displayProductDetails()
    {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method
    static void displayTotalProducts() 
    {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) 
    {
        Product p1 = new Product("Laptop", 65000);
        Product p2 = new Product("Mobile", 25000);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts(); 
    }
}
