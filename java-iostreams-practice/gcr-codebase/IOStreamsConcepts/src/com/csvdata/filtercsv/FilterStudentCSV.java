package com.csvdata.filtercsv;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilterStudentCSV {
    public static void main(String[] args) {
    	
    	String filePath="CSVData/Employee/employee.csv";
    	
    	try (BufferedReader reader = new BufferedReader(new FileReader(filePath)))
    	{
    		String line;
    		boolean header=true;
    		while((line=reader.readLine())!=null)
    		{
    			if(header)
    			{
    				header=false;
    				continue;
    			}
    			
    			String arr[]=line.split(",");
    			
    			int salary=Integer.parseInt(arr[4]);
    			
    			if(salary<0)
    			{
    				System.out.println("Salary is invalid : "+arr[3]+" of "+ arr[1]);
    			}
    		
    		}
    
		}
    	catch (Exception e) 
    	{
			
    		System.out.println("Not Able to file");
		}
		
	}
}