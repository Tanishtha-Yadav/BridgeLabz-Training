import java.util.*;
public class FizzBuzzWhile{
	public static void main(String[]args){
	// Scanner class object for user input
	Scanner sc = new Scanner(System.in);

	// user input
	System.out.println("Enter a number : ");
	int number = sc.nextInt();
	
	// conditional logic
	if(number>0)
	{
		int i=1;
		while(i<=number){
			if(i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz");
			}
			else if(i%3==0)
			{
				System.out.println("Fizz");
			}
			else if(i%5==0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
			i++;
		}
		sc.close();
		}
	}
	
}
