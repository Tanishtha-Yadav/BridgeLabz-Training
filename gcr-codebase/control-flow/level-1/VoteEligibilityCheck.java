import java.util.*;
public class VoteEligibilityCheck{
	public static void main(String[]args){
		// Scanner class object for user input 
		Scanner sc = new Scanner(System.in);
	
		// user input of age 
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		// vote condition check
		if(age>=18)
		{
			System.out.println( "The person can vote." );
		}
		else
		{
			System.out.println("The person cannot vote.");
		}
		
		//Scanner class closed
		sc.close();
	}
}