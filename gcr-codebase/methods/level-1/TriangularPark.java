import java.util.*;
public class TriangularPark{

	public double roundsOfPark(double side1,double side2,double side3)
	{
		double perimeter = side1+side2+side3;
		
		
		System.out.println("Number of rounds : ");
		return perimeter/5000;
	}

	// main method
	public static void main(String[]args)
	{
		// Scanner class object for user input
		Scanner sc = new Scanner(System.in);
		
		// user input 
		System.out.println("Enter the sides of triangle : ");
		double side1=sc.nextInt();
		double side2=sc.nextInt();
		double side3=sc.nextInt();
		
		// class object 
		TriangularPark triangle = new TriangularPark();
		
		System.out.println(triangle.roundsOfPark(side1,side2,side3));
		
		
	}
}