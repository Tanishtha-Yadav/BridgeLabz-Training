import java.util.*;
public class ArmstrongNumber{
    public static void main(String[] args)
    {
        // Scanner object
        Scanner input = new Scanner(System.in);

        // Taking integer input
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Declaring variables
        int sum = 0;
        int originalNumber = number;

        // Loop until originalNumber becomes 0
        while(originalNumber!=0)
        {
            // Find the last digit
            int digit = originalNumber%10;

            // Find the cube of the digit and add to sum
            sum = sum+(digit*digit*digit);

            // Remove the last digit
            originalNumber=originalNumber/10;
        }

        // Checking Armstrong condition
        if(sum==number)
        {
            System.out.println(number + " is an Armstrong Number");
        }
        else
        {
            System.out.println(number + " is not an Armstrong Number");
        }

        // Closing Scanner object
        input.close();
    }
}