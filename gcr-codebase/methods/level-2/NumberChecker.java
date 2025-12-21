import java.util.*;
public class NumberChecker
{
    // method to check if number is positive
    public static boolean isPositive(int number)
	{
        return number>=0;
    }

    // method to check if number is even
    public static boolean isEven(int number) 
	{
        return number % 2==0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2)
	{
        if(number1 > number2) 
		{
            return 1;
        } 
		else if(number1 == number2)
		{
            return 0;
        } 
		else 
		{
            return -1;
        }
    }

    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        for(int i = 0; i < numbers.length; i++) 
		{
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check positive/negative and even/odd
        for(int i = 0; i < numbers.length; i++)
		{
            if(isPositive(numbers[i])) 
			{
                System.out.print(numbers[i] + " is positive");
                if(isEven(numbers[i])) 
				{
                    System.out.println(" and even.");
                } 
				else 
				{
                    System.out.println(" and odd.");
                }
            } 
			else
			{
                System.out.println(numbers[i] + " is negative.");
            }
        }

        // Compare first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if(result == 1) 
		{
            System.out.println("First element is greater than last element.");
        } 
		else if(result == 0) 
		{
            System.out.println("First and last elements are equal.");
        } 
		else 
		{
            System.out.println("First element is less than last element.");
        }
    }
}
