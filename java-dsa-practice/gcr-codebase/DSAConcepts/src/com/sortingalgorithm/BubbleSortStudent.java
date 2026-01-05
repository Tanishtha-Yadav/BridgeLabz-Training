package com.sortingalgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortStudent {
	
	public static void bubbleSort(int marks[])
	{
		
		int n = marks.length;
		
		
		System.out.println("Array before sorting : ");
		System.out.println(Arrays.toString(marks));
		
		for(int i=0;i<n-1;i++)
		{
			for(int j =0;j<n-1-i;j++)
			{
				if(marks[j]>marks[j+1])
				{
					int temp=marks[j];
					marks[j]=marks[j+1];
					marks[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array using bubble sort : ");
		System.out.println(Arrays.toString(marks));
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		int n=sc.nextInt();
		
		int marks[]=new int[n];
		
		System.out.println("Enter the marks of "+n+" Students :");
		for(int i =0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}
		bubbleSort(marks);
		
		

	}

}