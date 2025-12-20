import java.util.*;
public class SumOfNatural
{
	// method for sum of n natural numbers
	public int naturalNumbers(int number)
	{
		int sum=0;
		for(int i=1; i<=number; i++)
		{
			sum+=i;
		}
		System.out.print("Sum of "+number+" natural numbers : ");
		return sum;
	}
	
	// main method
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		SumOfNatural sum = new SumOfNatural();
		System.out.println(sum.naturalNumbers(number));
		
		
	}
}