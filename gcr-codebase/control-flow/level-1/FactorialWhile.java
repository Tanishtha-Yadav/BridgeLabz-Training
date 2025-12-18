import java.util.*;
public class FactorialWhile{
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
		while(number>0)
		{
			 factorial*=number;
			 number--;
		}
	}
	
	// printing result
	System.out.println("Factorial : "+factorial);
	
	sc.close();
	}
}