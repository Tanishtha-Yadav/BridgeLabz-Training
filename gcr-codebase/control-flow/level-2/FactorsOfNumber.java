import java.util.*;
public class FactorsOfNumber{
    public static void main(String[] args){
		// Scanner class object for user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if (number>0){
            System.out.println("Factors of "+number+" are:");
            for(int i=1;i<=number;i++)
			{
                if(number%i==0)
				{
                    System.out.println(i);
                }
            }
        } 
        else{
            System.out.println("Please enter a positive integer");
        }

        sc.close();
    }
}
