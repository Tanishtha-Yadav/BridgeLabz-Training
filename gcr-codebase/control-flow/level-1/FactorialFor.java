import java.util.*;
public class FactorialFor{
	public static void main(String[]args){
	// Scanner class object for user input
	Scanner sc = new Scanner(System.in);

	// user input
	System.out.println("Enter the number : ");
	int number = sc.nextInt();
	
	// logic
	int factorial=1;
	if(number>0)
	{
		for(int i=number;i>0;i--)
		{
			factorial*=i;
		}
	}
	
	// printing result
	System.out.println("Factorial : "+factorial);
	
	sc.close();
	}
}