package com.inheritance.singleinheritance.smarthome;

public class Thermostat extends Device {

	int temperatureSetting;

	Thermostat(int deviceID, String status , int temperatureSetting) 
	{
		super(deviceID, status);
		this.temperatureSetting = temperatureSetting;
		// TODO Auto-generated constructor stub
		 
	}
	 void displayStatus() 
	 {
		 super.displayStatus();
		 System.out.println("Temperature Setting: " + temperatureSetting + "°C");
	 }

}
