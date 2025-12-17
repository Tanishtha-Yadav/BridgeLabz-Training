import java.util.*;
public class KilometersToMilesUser {
    public static void main(String[] args) {
        double kilometers;

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

		System.out.println("Enter kilometers : ");
        // user input
        kilometers = input.nextDouble();

        // Conversion  1 mile = 1.6 km
        double kmPerMile = 1.6;

        // Compute miles
        double miles = kilometers / kmPerMile;

        // Display result
        System.out.println("The total miles is " + miles +" mile for the given " + kilometers + " km");

        // Close scanner
        input.close();
    }
}
