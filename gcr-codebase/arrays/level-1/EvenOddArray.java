import java.util.*;
public class EvenOddArray{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number=sc.nextInt();
		
		if(number<=0)
		{
			return;
		}
		int size=(number/2)+1;
		
		int even[]=new int[size];
		int odd[]=new int[size];
		
		int indexEven=0;
		int indexOdd=0;
		
		for(int i=1;i<=number;i++)
		{
			if(i%2==0)
			{
				even[indexEven]=i;
				indexEven++;
			}
			else
			{
				odd[indexOdd]=i;
				indexOdd++;
			}
		}
		
		System.out.println("Even Array: ");
		for(int j=0;j<indexEven;j++)
		{
			System.out.print(even[j]+" ");
		}
		System.out.println();
		System.out.println("Odd Array: ");
		for(int j=0;j<indexOdd;j++)
		{
			System.out.print(odd[j]+" ");
		}
	}
}