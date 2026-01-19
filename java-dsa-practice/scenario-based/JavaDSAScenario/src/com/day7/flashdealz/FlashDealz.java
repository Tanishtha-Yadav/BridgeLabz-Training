package com.day7.flashdealz;

public class FlashDealz {
    public static void main(String[] args) {

        Product[] products = {
            new Product("Laptop", 30),
            new Product("Shoes", 50),
            new Product("Phone", 20),
            new Product("Watch", 40),
            new Product("Headphones", 60)
        };

        QuickSort.quickSort(products, 0, products.length - 1);

        for (Product p : products)
            System.out.println(p);
    }
}
