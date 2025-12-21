import java.util.*;
public class Factors
{
    // method to find factors
    public static int[] findFactors(int number) 
	{
        int count = 0;

        // count factors
        for(int i=1;i<=number;i++)
		{
            if(number%i==0)
			{
                count++;
            }
        }
		
        int factors[] = new int[count];
        int index = 0;

        // store factors
        for(int i=1;i<=number;i++)
		{
            if(number%i==0)
			{
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // method to find sum
    public static int findSum(int[] factors)
	{
        int sum = 0;
        for(int i=0;i<factors.length;i++)
		{
            sum+=factors[i];
        }
        return sum;
    }

    // method to find product
    public static long findProduct(int[] factors)
	{
        long product = 1;
        for(int i=0;i<factors.length;i++)
		{
            product*=factors[i];
        }
        return product;
    }

    // method to find sum of squares
    public static double findSumOfSquares(int[] factors) 
	{
        double sum = 0;
        for(int i = 0;i<factors.length;i++)
		{
            sum+=Math.pow(factors[i],2);
        }
        return sum;
    }

    public static void main(String[]args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int factors[] = findFactors(number);

        System.out.print("Factors: ");
        for(int i = 0;i<factors.length;i++) 
		{
            System.out.print(factors[i]+" ");
        }
		
		System.out.println();
        System.out.println("Sum of factors: " + findSum(factors));
        System.out.println("Product of factors: " + findProduct(factors));
        System.out.println("Sum of squares of factors: " + findSumOfSquares(factors));
    }
}
