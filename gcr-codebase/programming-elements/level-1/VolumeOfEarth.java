import java.util.*;
public class VolumeOfEarth{
	public static void main(String[]args){
	double radius = 6378;
	double pi = 3.14;
	double kmPerMile = 0.6;
	
	// computing volume of earth in kilometers
	double volumeKilometer = (4/3)*pi*(radius*3);
	//computing volume of earth in miles
	double volumeMiles = volumeKilometer/(kmPerMile*3);
	
	// displaying results
	System.out.println("The volume of earth in cubic kilometer is "+volumeKilometer+" and cubic miles is "+volumeMiles);
	}
}

