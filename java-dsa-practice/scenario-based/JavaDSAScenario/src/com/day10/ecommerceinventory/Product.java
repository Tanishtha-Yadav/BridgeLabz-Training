package com.day10.ecommerceinventory;


//Class to represent a Product
public class Product {
 int sku;        // SKU number (unique key)
 String name;    // Product name
 double price;   // Product price

 public Product(int sku, String name, double price) {
     this.sku = sku;
     this.name = name;
     this.price = price;
 }

 @Override
 public String toString() {
     return "SKU: " + sku + ", Name: " + name + ", Price: $" + price;
 }
}
