import java.util.*;
public class CountDigits{
    public static void main(String[] args){
        // Scanner object
        Scanner input = new Scanner(System.in);

        // Taking integer input
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        // Variable to count digits
        int count = 0;

        // Special case when number is 0
        if(number==0)
        {
            count=1;
        }
        else
        {
            // Loop until number becomes 0
            while(number!=0)
            {
                // Remove the last digit
                number=number/10;

                // Increment count
                count++;
            }
        }
		
        // Display result
        System.out.println("Number of digits: " + count);

        // Closing Scanner object
        input.close();
    }
}