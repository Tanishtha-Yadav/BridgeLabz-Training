package com.inheritance.singleinheritance.smarthome;

public class Device 
{
	int deviceID;
	String status;
	
	 Device(int deviceID, String status)
	 {
	        this.deviceID = deviceID;
	        this.status = status;
	    }
	
		    void displayStatus() 
		    {
		        System.out.println("Device is active");
		    }
		}


