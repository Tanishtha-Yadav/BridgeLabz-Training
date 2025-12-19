import java.util.*;
public class HarshadNumber{
    public static void main(String[] args){
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take integer input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Store original number to check later
        int originalNumber = number;

        // Variable to store sum of digits
        int sum = 0;

        // Loop to extract each digit and add to sum
        while(number!=0)
        {
            int digit = number%10; // Get last digit
            sum += digit;            // Add digit to sum
            number = number/10;    // Remove last digit
        }

        // Check if original number is divisible by sum of digits
        if(originalNumber%sum==0)
        {
            System.out.println(originalNumber + " is a Harshad Number");
        }
        else
        {
            System.out.println(originalNumber + " is not a Harshad Number");
        }

        // Close Scanner object
        input.close();
    }
}