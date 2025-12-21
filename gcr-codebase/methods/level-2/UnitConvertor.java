import java.util.*;
public class UnitConvertor 
{
    // kilometers to miles
    public static double convertKmToMiles(double km)
	{
        double kmToMiles = 0.621371;
        return km*kmToMiles;
    }

    // miles to kilometers
    public static double convertMilesToKm(double miles)
	{
        double milesToKm = 1.60934;
        return miles*milesToKm;
    }

    // meters to feet
    public static double convertMetersToFeet(double meters) 
	{
        double metersToFeet = 3.28084;
        return meters*metersToFeet;
    }

    // feet to meters
    public static double convertFeetToMeters(double feet) 
	{
        double feetToMeters = 0.3048;
        return feet*feetToMeters;
    }

    public static void main(String[] args) 
	{
        System.out.println("10 km in miles: " + convertKmToMiles(10));
        System.out.println("5 miles in km: " + convertMilesToKm(5));
        System.out.println("3 meters in feet: " + convertMetersToFeet(3));
        System.out.println("10 feet in meters: " + convertFeetToMeters(10));
    }
}
