import java.util.*;
public class WindChill{

    // method to calculate wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed)
	{
        double windChill = 35.74+0.6215*temperature+(0.4275*temperature-35.75)*Math.pow(windSpeed,0.16);
        return windChill;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        WindChill calculator = new WindChill();

        // Taking user input
        System.out.print("Enter temperature : ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter wind speed : ");
        double windSpeed = scanner.nextDouble();

        // Calculate wind chill
        double windChill = calculator.calculateWindChill(temperature, windSpeed);

        // Display result
        System.out.println("Wind Chill Temperature: " + windChill);

        scanner.close();
    }
}
