import java.util.*;
public class MultiplicationSixToNine{
	public static void main(String[]args)
	{
		// Scanner object for user input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		int multiplicationResult[]=new int[4];
		int count =6;
		
		for(int i=0;i<multiplicationResult.length;i++)
		{
			multiplicationResult[i]=number*count;
			System.out.println(number+"*"+count+"="+multiplicationResult[i]);
			count++;
		}
		
	}
}