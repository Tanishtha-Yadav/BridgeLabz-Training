import java.util.*;
public class ReverseNumber{
    public static void main(String[] args){
		//Scanner class object for user input
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

        int digits[] = new int[count];
        int reverse[] = new int[count];

        // Store digits in array
        for(int i=0;i<count;i++)
		{
            digits[i] = number%10;
            number = number/10;
        }

        // Reverse array
        for(int i=0;i<count;i++)
		{
            reverse[i] = digits[count-1-i];
        }

        // Display reversed number
        System.out.print("Reversed Number: ");
        for(int i=0;i<count;i++)
		{
            System.out.print(reverse[i]);
        } 
        sc.close();
    }
}
