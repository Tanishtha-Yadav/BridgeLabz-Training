package com.constructors.level1;

public class BookSystem 
{
	private String title;
	private String author;
	private int price;
	private boolean availability;
	
	 // Constructor
    BookSystem(String title, String author, int price,boolean availability)
    {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow the book
    void borrowBook() 
    {
        if (availability)
        {
            availability = false;
            System.out.println("Book borrowed successfully");
        } 
        else
        {
            System.out.println("Book already borrowed");
        }
    }

    void display() 
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BookSystem book1 = new BookSystem("One Arranged Murder","Chetan Bhagat",200,false);
		book1.display();
		book1.borrowBook();

	}

}
