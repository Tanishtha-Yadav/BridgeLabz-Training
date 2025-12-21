import java.util.*;
public class UnitConvertorYardsFeet
{
    // convert yards to feet
    public static double convertYardsToFeet(double yards)
	{
        double yardsToFeet = 3;
        return yards*yardsToFeet;
    }

    // convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feetToYards = 0.333333;
        return feet*feetToYards;
    }

    // convert meters to inches
    public static double convertMetersToInches(double meters) {
        double metersToInches = 39.3701;
        return meters*metersToInches;
    }

    // convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inchesToMeters = 0.0254;
        return inches*inchesToMeters;
    }

    // convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inchesTocm = 2.54;
        return inches*inchesTocm;
    }

    public static void main(String[] args)
	{
        System.out.println("5 yards in feet: " + convertYardsToFeet(5));
        System.out.println("12 feet in yards: " + convertFeetToYards(12));
        System.out.println("2 meters in inches: " + convertMetersToInches(2));
        System.out.println("10 inches in meters: " + convertInchesToMeters(10));
        System.out.println("8 inches in centimeters: " + convertInchesToCentimeters(8));
    }
}
