import java.util.*;
public class ChocolateDistribution
{
	public static int[] findRemainderAndQuotient(int number, int divisor)
	{
		int remainder = number%divisor;
		int quotient = number/divisor;
		int array[]=new int[2];
		array[0]=remainder;
		array[1]=quotient;
		return array;
	}	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number of chocolates : ");
		int chocolates = sc.nextInt();
		System.out.println("Enter the number of children : ");
		int children = sc.nextInt();
		int result[] = ChocolateDistribution.findRemainderAndQuotient(chocolates,children);
		System.out.println("Chocolate each student : "+result[0]);
		System.out.println("Chocolate remaining : "+result[1]);
		
	}
}