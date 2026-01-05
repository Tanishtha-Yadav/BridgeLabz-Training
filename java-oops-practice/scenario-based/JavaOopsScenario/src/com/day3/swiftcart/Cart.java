package com.day3.swiftcart;

import java.util.ArrayList;

public class Cart implements ICheckout 
{

    private ArrayList<Product> products;
    private double totalPrice;

    // Constructor
    public Cart() 
    {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    // cart with pre-selected items
    public Cart(ArrayList<Product> items) 
    {
        this();
        for (Product p : items) 
        {
            addProduct(p);
        }
    }

    // Only Cart can update totalPrice
    public void addProduct(Product product) 
    {
        products.add(product);
        totalPrice += product.getPrice();
    }

    private void calculateProductDiscounts() 
    {
        for (Product p : products) 
        {
            totalPrice -= p.getDiscount(); 
        }
    }

    @Override
    public void applyDiscount(double couponAmount) 
    {
        totalPrice -= couponAmount; 
    }

    @Override
    public void generateBill()
    {
        calculateProductDiscounts();
        System.out.println("Total Items: " + products.size());
        System.out.println("Final Amount to Pay: ₹" + totalPrice);
    }
}
