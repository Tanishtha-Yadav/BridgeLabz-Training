import java.util.*;
public class RemainderAndQuotient
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
		
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		System.out.println("Enter divisor : ");
		int divisor = sc.nextInt();
		int result[] = RemainderAndQuotient.findRemainderAndQuotient(number,divisor);
		System.out.println("Remainder And Quotient respectively are : "+Arrays.toString(result));
	}
}