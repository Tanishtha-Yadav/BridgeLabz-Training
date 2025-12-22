import java.util.*;
public class NumberChecker2 
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

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) 
	{
        int sum = 0;
        for (int d : digits) 
		{
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) 
	{
        int sum = 0;
        for (int d : digits) 
		{
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshad(int number, int[] digits) 
	{
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }

    // Method to find frequency of each digit (0-9)
    public static int[][] digitFrequency(int[] digits) 
	{
        int[][] freq = new int[10][2]; // 10 digits, column 0 = digit, column 1 = count
        for (int i = 0; i < 10; i++) 
		{
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int d : digits) 
		{
            freq[d][1]++;
        }
        return freq;
    }

    public static void main(String[] args) 
	{
        int number = 1729; // Example number

        System.out.println("Number: " + number);

        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        int[] digits = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        int sumSquares = sumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);

        System.out.println("Is Harshad number: " + isHarshad(number, digits));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int i = 0; i < freq.length; i++) 
		{
            if (freq[i][1] > 0) 
			{
                System.out.println("Digit " + freq[i][0] + " appears " + freq[i][1] + " times");
            }
        }
    }
}
