import java.util.Scanner;

public class SquareSide{
    public static void main(String[] args){
		// Scanner class object for user input
        Scanner sc = new Scanner(System.in);

		// user input
        System.out.print("Enter perimeter: ");
        double perimeter = sc.nextDouble();

		// computation of side
        double side = perimeter / 4;

		// displaying result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}