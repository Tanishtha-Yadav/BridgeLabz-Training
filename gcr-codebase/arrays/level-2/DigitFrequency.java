import java.util.*;
public class DigitFrequency{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // Count digits
        while(temp!=0)
		{
            count++;
            temp = temp/10;
        }

        int[] digits = new int[count];
        int[] frequency = new int[10];

        // Storing digits in array
        for(int i=0;i<count;i++)
		{
            digits[i] = number%10;
            number = number/10;
        }

        // Calculate frequency
        for(int i = 0;i<count;i++)
		{
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("Digit Frequency:");
        for(int i = 0;i<10;i++) 
		{
            if(frequency[i]>0)
			{
                System.out.println(i + " : " + frequency[i]);
            }
        }

        sc.close();
    }
}
 