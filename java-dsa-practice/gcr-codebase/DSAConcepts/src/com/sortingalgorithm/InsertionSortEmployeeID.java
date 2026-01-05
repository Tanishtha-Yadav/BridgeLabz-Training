package com.sortingalgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortEmployeeID {
	
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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees : ");
		int n=sc.nextInt();
		System.out.println("Enter the employee IDs of "+n+ " employees : ");
		int empID[]=new int[n];
		for(int i =0;i<n;i++)
		{
			empID[i]=sc.nextInt();
		}
		System.out.println("Array before sorting : ");
		System.out.println(Arrays.toString(empID));
		System.out.println("Array after sorting : ");
		System.out.println(employeeID(empID));
	}

}
