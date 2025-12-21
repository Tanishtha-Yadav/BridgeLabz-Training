import java.util.*;
public class UnitConvertorTemperatureWeight
{
    // fahrenheit to celsius
    public static double convertFarhenheitToCelsius(double farhenheit)
	{
        double farhenheitToCelsius = (farhenheit-32)*5/9;
        return farhenheitToCelsius;
   }

    // celsius to fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) 
	{
        double celsiusTofarhenheit = (celsius*9/5)+32;
        return celsiusTofarhenheit;
    }

    // pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) 
	{
        double poundsTokilograms = 0.453592;
        return pounds*poundsTokilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) 
	{
        double kilogramsTopounds = 2.20462;
        return kilograms*kilogramsTopounds;
    }

    // gallons to liters
    public static double convertGallonsToLiters(double gallons)
	{
        double gallonsToliters = 3.78541;
        return gallons*gallonsToliters;
    }

    // liters to gallons
    public static double convertLitersToGallons(double liters) {
        double litersTogallons = 0.264172;
        return liters * litersTogallons;
    }

    public static void main(String[] args)
	{
        System.out.println("98.6 F in Celsius: " +convertFarhenheitToCelsius(98.6));
        System.out.println("37 C in Fahrenheit: " +convertCelsiusToFarhenheit(37));
        System.out.println("10 pounds in kg: " +convertPoundsToKilograms(10));
        System.out.println("5 kg in pounds: " +convertKilogramsToPounds(5));
        System.out.println("2 gallons in liters: " +convertGallonsToLiters(2));
        System.out.println("5 liters in gallons: " +convertLitersToGallons(5));
    }
}
