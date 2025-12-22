import java.util.*;
public class NumberChecker
{
    // Method to count digits in a number
    public static int countDigits(int number) 
	{
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store digits of number in an array
    public static int[] getDigitsArray(int number) 
	{
        number = Math.abs(number); 
        int n = countDigits(number);
        int[] digits = new int[n];
        for (int i = n - 1; i >= 0; i--) 
		{
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to check if number is a duck number
    public static boolean isDuckNumber(int[] digits) 
	{
        for (int d : digits)
		{
            if (d != 0) 
			{
                return true;
            }
        }
        return false;
    }

    // Method to check if number is an Armstrong number
    public static boolean isArmstrong(int[] digits) 
	{
        int n = digits.length;
        int sum = 0;
        for (int d : digits)
		{
            sum += Math.pow(d, n);
        }

        // Reconstruct original number from digits
        int original = 0;
        for (int d : digits) 
		{
            original = original * 10 + d;
        }

        return sum == original;
    }

    // Method to find largest and second largest digits
    public static int[] largestAndSecondLargest(int[] digits) 
	{
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int d : digits) 
		{
            if (d > largest)
			{
                secondLargest = largest;
                largest = d;
            } 
			else if (d > secondLargest && d != largest) 
			{
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest digits
    public static int[] smallestAndSecondSmallest(int[] digits)
	{
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int d : digits)
		{
            if (d < smallest) 
			{
                secondSmallest = smallest;
                smallest = d;
            } 
			else if (d < secondSmallest && d != smallest)
			{
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args)
	{
        int number = 153; 
        System.out.println("Number: " + number);

        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        int[] digits = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        System.out.println("Is Duck number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong number: " + isArmstrong(digits));

        int[] largest = largestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largest[0] + ", Second Largest: " + largest[1]);

        int[] smallest = smallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}
