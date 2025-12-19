import java.util.*;
public class PrimeNumberCheck{
    public static void main(String[] args){
        //Scanner object
        Scanner input = new Scanner(System.in);

        // Taking number as input
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Prime numbers are greater than 1
        boolean isPrime = true;

        if(number<=1)
        {
            isPrime = false;
        }
        else
        {
            // Loop from 2 to number -1
            for(int i=2;i<number;i++)
            {
                if(number%i==0)
                {
                    isPrime = false;
                    break; // Number is divisible by another number
                }
            }
        }

        // Output result
        if(isPrime)
        {
            System.out.println(number + " is a Prime Number");
        }
        else
        {
            System.out.println(number + " is not a Prime Number");
        }

        // Closing Scanner object
        input.close();
    }
}