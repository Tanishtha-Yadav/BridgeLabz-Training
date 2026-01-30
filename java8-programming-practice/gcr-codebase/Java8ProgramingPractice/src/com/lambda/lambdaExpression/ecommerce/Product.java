package com.lambda.lambdaExpression.ecommerce;

public class Product {
	
	String name;
	int price;
	int rating;
	int discount;
	
	public Product(String name,int price,int rating,int discount)
	{
		this.name=name;
		this.price=price;
		this.rating=rating;
		this.discount=discount;
	}
	
	public String toString()
	{
		return name+","+price+","+rating+","+discount;
	}
}


