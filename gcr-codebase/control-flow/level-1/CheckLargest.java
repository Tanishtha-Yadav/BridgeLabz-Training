import java.util.*;
public class CheckLargest{
	public static void main(String[]args){
		//Scanner class object for user input
		Scanner sc = new Scanner(System.in);
		
		//user input of number 1 number 2 number 3
		System.out.println("Enter 1st number : ");
		int number1 = sc.nextInt();
		System.out.println("Enter 2st number : ");
		int number2 = sc.nextInt();
		System.out.println("Enter 3rd number : ");
		int number3 = sc.nextInt();
		
		String first = "No";
		String second = "No";
		String third = "No";
		
		// condition check for largest number 
		if(number1>number2 && number1>number3)
		{
			first = "Yes";
		}
		else if(number2>number1 && number2>number3)
		{
			second = "Yes";
		}
		else
		{
			third = "Yes";
		} 
		
		// Printing Result
		System.out.println("Is the first number the largest? " + first + 
			"\nIs the second number the largest? "+ second +
				"\nIs the third number the largest? "+ third);
		
		// Scanner closing
		sc.close();
	}
}