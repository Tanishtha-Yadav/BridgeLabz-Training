import java.util.*;
public class NumberCheck{
	public static void main(String[]args){
	    // Scanner object for user input
		Scanner sc = new Scanner(System.in);
		
		//user input using scanner
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		// comdition check whether positive negative or zero
		if(number>0)
		{
			System.out.println("Positive");
		}
		else if(number<0)
		{
			System.out.println("Negative");
		}
		else 
		{	
			System.out.println("Zero");
		}
		
		sc.close();
	}
}
