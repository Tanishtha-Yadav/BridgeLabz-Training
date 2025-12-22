import java.util.*;
public class NumberFactors
{
    // Method to find factors of a number
    public static int[] findFactors(int number) 
	{
        // First loop to count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) 
		{
            if (number % i == 0) 
			{
                count++;
            }
        }

        // Second loop to store factors in array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) 
		{
            if (number % i == 0) 
			{
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find greatest factor
    public static int greatestFactor(int[] factors) 
	{
        int max = factors[0];
        for (int i = 1; i < factors.length; i++) 
		{
            if (factors[i] > max) 
			{
                max = factors[i];
            }
        }
        return max;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) 
	{
        int sum = 0;
        for (int i = 0; i < factors.length; i++) 
		{
            sum += factors[i];
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) 
	{
        long product = 1;
        for (int i = 0; i < factors.length; i++) 
		{
            product *= factors[i];
        }
        return product;
    }

    // Method to find product of cubes of factors
    public static long productOfCubes(int[] factors) 
	{
        long product = 1;
        for (int i = 0; i < factors.length; i++) 
		{
            product *= Math.pow(factors[i], 3);
        }
        return product;
    }

    public static void main(String[] args) 
	{
        int number = 12; // Example number

        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": " + Arrays.toString(factors));

        System.out.println("Greatest factor: " + greatestFactor(factors));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Product of cubes of factors: " + productOfCubes(factors));
    }
}
