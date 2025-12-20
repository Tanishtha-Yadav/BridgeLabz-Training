import java.util.*;
public class SmallestLargest
{
	public static int[] findSmallestAndLargest(int number1,int number2,int number3)
	{
		int small=0;
		int large=0;
		int array[]=new int[2];
		if(number1<number2 && number1<number3)
		{
			if(number2<number3)
			{
				large=number3;
			}
			else
			{
				large=number2;
			}
			small=number1;
		}
		else if(number2<number1 && number2<number3)
		{
			if(number1<number3)
			{
				large=number3;
			}
			else
			{
				large=number1;
			}
			small=number2;
		}
		else
		{
			if(number1<number2)
			{
				large=number2;
			}
			else
			{
				large=number1;
			}
			small=number3;
		}
		array[0]=small;
		array[1]=large;
		return array;
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers : ");
		int number1  = sc.nextInt();
		int number2  = sc.nextInt();
		int number3  = sc.nextInt();
		
		int result[]=SmallestLargest.findSmallestAndLargest(number1,number2,number3);
		System.out.println("Smallest and Largest number respectively :"+Arrays.toString(result));
		
		sc.close();
	}

}