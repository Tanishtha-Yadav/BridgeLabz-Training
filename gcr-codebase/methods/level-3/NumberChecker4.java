import java.util.*;
public class NumberChecker4
{
    // Method to calculate sum of proper divisors of a number
    public static int sumOfProperDivisors(int number)
	{
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) 
		{
			if (number % i == 0) 
			{
                sum += i;
            }
        }
        return sum;
    }

    // Method to check if a number is perfect
    public static boolean isPerfect(int number) 
	{
        return number > 0 && sumOfProperDivisors(number) == number;
    }

    // Method to check if a number is abundant
    public static boolean isAbundant(int number)
	{
        return sumOfProperDivisors(number) > number;
    }

    // Method to check if a number is deficient
    public static boolean isDeficient(int number)
	{
        return sumOfProperDivisors(number) < number;
    }

    // Method to calculate factorial of a number
    public static int factorial(int n) 
	{
        int fact = 1;
        for (int i = 2; i <= n; i++)
		{
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a strong number
    public static boolean isStrong(int number)
	{
        int sum = 0;
        int temp = number;
        while (temp > 0)
		{
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) 
	{
        int[] testNumbers = {6, 12, 15, 145, 28}; // Example numbers

        for (int number : testNumbers) {
            System.out.println("Number: " + number);
            System.out.println("Is Perfect: " + isPerfect(number));
            System.out.println("Is Abundant: " + isAbundant(number));
            System.out.println("Is Deficient: " + isDeficient(number));
            System.out.println("Is Strong: " + isStrong(number));
        }
    }
}
