import java.util.*;
public class QuotientRemainder{
	public static void main(String[]args)
	{ 
		// Scanner class object for user input
		Scanner sc = new Scanner(System.in);

		// User input 
		System.out.println("Enter 1st number: ");
		int number1 = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int number2 = sc.nextInt();
		
		// quotient and remainder calculation
		int quotient = number1/number2;
		int remainder = number1%number2;
		
		// Displaying message
		System.out.println("The Quotient is "+quotient +" and Reminder is "+ remainder+" of two number "+number1 +" and "+number2);
	
	}
}