import java.util.*;
public class CheckSmallest{
	public static void main(String[]args){
		// Scanner class object for user input
		Scanner sc =new Scanner(System.in);
		
		// user input of number1 number2 number3
		System.out.println("Enter 1st number : ");
		int number1 = sc.nextInt();
		System.out.println("Enter 2nd number : ");
		int number2 = sc.nextInt();
		System.out.println("Enter 3rd number : ");
		int number3 = sc.nextInt();
		
		//Condition check is number 1 smallest of other 2
		if(number1<number2 && number1<number3)
		{
			System.out.println(" Is the first number the smallest? Yes");
		}
		
	}
}