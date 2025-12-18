import java.util.Scanner;
public class DistanceConverter{
    public static void main(String[] args){
		// Scanner object for user input
        Scanner sc = new Scanner(System.in);
		
		// user input of distance
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

		// Computation of yards and miles
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

		// Display result
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
    }
}