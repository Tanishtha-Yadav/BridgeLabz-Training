package com.day5.robowarehouse;

import java.util.Arrays;

public class ShelfLoadingRobot {
	
	public static void insertionSortWeight(int weight[])
	{
		int n=weight.length;
		for(int i=1;i<n;i++)
		{
			int key=weight[i];
			int j=i-1;
			while(j>=0 && weight[j]>key)
			{
				weight[j+1]=weight[j];
				j--;
			}
			weight[j+1]=key;
			
		}
		System.out.println(Arrays.toString(weight));
	}
	
	public static void main(String[] args) 
	{
		int weight[]= {45,67,98,101,34,68,54,72,65};
		
		System.out.println("Weight before sorting : ");
		System.out.println(Arrays.toString(weight));
		System.out.println("Weight after sorting : ");
		insertionSortWeight(weight);
		
	}

}
