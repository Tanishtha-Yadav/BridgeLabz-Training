import java.util.*;
public class MetroSmartCard 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        int balance = sc.nextInt();

        while (balance > 0) 
		{
            System.out.print("Enter distance: ");
            int distance = sc.nextInt();

            if (distance == 0) 
			{
                System.out.println("Journey ended");
                break;
            }

            int fare = (distance <= 5) ? 10 : 20;

            if (balance >= fare) 
			{
                balance -= fare;
                System.out.println("Fare deducted: " + fare);
                System.out.println("Remaining balance: " + balance);
            } 
			else
			{
                System.out.println("Insufficient balance.");
                break;
            }
        }
        sc.close();
    }
}
