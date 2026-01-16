package com.day4.hospitalqueue;

import java.util.Arrays;

public class PatientSort {
	
	// method to sort patients according to their criticality level
	public static void criticalPatient(int records[])
	{
		int n= records.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(records[j]>records[j+1])
				{
					int temp=records[j];
					records[j]=records[j+1];
					records[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(records));
	}
	
	public static void main(String[] args) {
		
		// patient records of critical level
		int records[]= {2,3,6,8,9,4,3,2,6,8,9,5,4,3,2,5};
		
		System.out.println("Record of patients according to criticality level");
		criticalPatient(records);
		
		
	
	}

}
