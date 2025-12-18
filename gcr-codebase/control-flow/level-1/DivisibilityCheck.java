import java.util.*;
public class DivisibilityCheck{
	public static void main(String[]args){
		//Scanner object for user input
		Scanner sc = new Scanner(System.in);
		
		// user input using Scanner class
		System.out.println("Enter a number to  check divisiblity : "); 
		int number = sc.nextInt();
		
		//Divisibility Check and result check
		if(number%5==0)
		{
			System.out.println("Is the number "+number+" divisible by 5? : Yes");
		}
		
	}
}