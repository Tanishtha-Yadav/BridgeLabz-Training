package com.day4.smartshelf;

import java.util.Arrays;

public class BookArrangement {
	
	public static void insertionSort(String title[])
	{
		 int n = title.length;

	    
	        for (int i = 1; i < n; i++) 
	        {
	            String key = title[i]; 
	            int j = i - 1;
	      
	            while (j >= 0 && title[j].compareToIgnoreCase(key) > 0) 
	            {
	                title[j + 1] = title[j];
	                j = j - 1;
	            }
	            title[j + 1] = key;
	        }
	        System.out.println(Arrays.toString(title));
	}
	
	public static void main(String[] args) 
	{
		String title[]= {"To Kill a Mockingbird","1984","Pride and Prejudice",
		                 "The Great Gatsby","Moby Dick","The Lord of the Rings",
		                  "Frankenstein", "One Hundred Years of Solitude",
		                  "War and Peace","The Odyssey"
		                 };
		System.out.println("Books in Alphabetical order : ");
		insertionSort(title);
	}
}



   