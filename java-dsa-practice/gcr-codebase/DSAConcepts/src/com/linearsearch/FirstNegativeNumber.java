package com.linearsearch;

import java.util.Scanner;

public class FirstNegativeNumber {

	// linear search method
	public static int linearSearch(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<0)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element for array : ");
		int n=sc.nextInt();
		
		int array[]=new int[n];
		
		System.out.println("Enter "+n+" elements for array : ");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		int res = linearSearch(array);
		if(res==-1)
		{
			System.out.println("Number not found " + res);
		}
		else
		{
			System.out.println("Number found at index "+res);
		}
		
		
	}

}
