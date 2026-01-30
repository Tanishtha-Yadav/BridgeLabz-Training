package com.lambda.lambdaExpression.ecommerce;

import java.util.ArrayList;

public class ECommerceSort {
	
	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList();
		
		products.add(new Product("Apple", 600, 4,10));
		products.add(new Product("Mango", 300, 3,15));
		products.add(new Product("Pineapple", 500, 5,20));
		
		products.sort((product1,product2)-> Integer.compare(product1.price,product2.price));
		System.out.println("Sorted by price: ");
		products.forEach(System.out::println);
		
		products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
	    System.out.println("\nSorted by Rating:");
	    products.forEach(System.out::println);

	    products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
	    System.out.println("\nSorted by Discount:");
	    products.forEach(System.out::println);	    
		
		
	}
}
