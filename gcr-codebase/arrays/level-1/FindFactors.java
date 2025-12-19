import java.util.*;
public class FindFactors{
	public static void main(String[]args)
	{
		// Scanner object for user input
		Scanner sc = new Scanner(System.in);
		
		// User input through Scanner object
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		// initialising variable and array
		int maxFactor = 10;
		int factor[]=new int[maxFactor];
		int index =0;
		
		// checking factors
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				if(index==maxFactor)
				{
                    maxFactor = maxFactor * 2;
                    int temp[] = new int[maxFactor];

                    for (int j = 0; j < index; j++)
					{
                        temp[j] = factor[j];
                    }
                    factor = temp;
                }
				factor[index]=i;
				index++;
			}
		}
		
		// Displaying Results
		System.out.println("Factors : ");
		for(int i=0;i<index;i++)
		{
			System.out.print(factor[i]+" ");
		}
		
		sc.close();
	}
}