package com.sortingalgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortEmployeeID {
	 
	// method for sorting array using insertion sort
	public static String employeeID(int empID[])
	{
		
		int n = empID.length;
		
		for(int i=1;i<n;i++)
		{
			int key = empID[i];
			int j = i-1;
			
			while (j>=0 && empID[j]>key )
			{
				empID[j+1]=empID[j];
				j--;
			}
			empID[j+1]=key;
		} 
		return Arrays.toString(empID);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// scanner class
		Scanner sc = new Scanner(System.in);
		
		//user input of size
		System.out.println("Enter the number of employees : ");
		int n=sc.nextInt();
		
		
		int empID[]=new int[n];
		
		// user input of arrays
		System.out.println("Enter the employee IDs of "+n+ " employees : ");
		for(int i =0;i<n;i++)
		{
			empID[i]=sc.nextInt();
		}
		
		// display results
		System.out.println("Array before sorting : ");
		System.out.println(Arrays.toString(empID));
		System.out.println("Array after sorting : ");
		System.out.println(employeeID(empID));
	}

}
