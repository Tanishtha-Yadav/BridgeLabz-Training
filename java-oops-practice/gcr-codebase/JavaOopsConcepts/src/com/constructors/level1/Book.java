package com.constructors.level1;
import java.util.*;

public class Book 
{
	String title;
	String author;
	int price;
	

    // Default constructor
	Book() 
	{
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }
	
	// Parameterized constructor
	Book(String title, String author, int price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void display() 
	{
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println();
    }

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Book book1 = new Book();	
		book1.display();
		Book book2 = new Book("The three mistakes of my life","Chetan Bhagat",200);
		book2.display();
		
		
	}

}
