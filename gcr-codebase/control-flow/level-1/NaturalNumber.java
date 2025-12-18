import java.util.*;
public class NaturalNumber{
	public static void main(String[]args){
		// Scanner class object for user input
		Scanner sc =new Scanner(System.in);
		
		// user input of number
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		// initialising sum variable 
		int sum=0;
		
		// condition check if the number is nautral number or not
		if(number>=0)
		{
			for(int i=1;i<=number;i++)
			{
				sum+=i;
			}
			System.out.println("The sum of "+number+" natural numbers is "+ sum);
		}
		else
		{
			 System.out.println("The number "+number+" is not a natural number");
		}
		
		sc.close();
	}
}