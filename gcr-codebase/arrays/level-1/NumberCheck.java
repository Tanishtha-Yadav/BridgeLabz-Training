import java.util.*;
public class NumberCheck{
	public static void main(String[]args)
	{
		// Scanner object for user input
		Scanner sc = new Scanner(System.in);
		
		// user input through loop
		int number[]=new int[5];
		System.out.println("Enter 5 numbers : ");
		for(int i=0;i<number.length;i++)
		{
			number[i]=sc.nextInt();
		}
		
		// Check condition
		for(int i=0;i<number.length;i++)
		{
			if(number[i]>0){
				if(number[i]%2==0)
				{
					System.out.println(number[i]+" is a positive even number");
				}
				else
				{
					System.out.println(number[i]+" is a positive odd number");
				}
			}
			else if(number[i]<0)
			{
				System.out.println("Negative number");
			}
			else
			{
				System.out.println("Zero");
			}
		}
		sc.close();
	}
}