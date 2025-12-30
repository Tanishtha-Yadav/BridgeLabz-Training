import java.util.Scanner;
public class Sim 
{

    private String operator;
    private String offer;
    private double mainBalance;

    Sim(String operator, double mainBalance)
	{
        this.operator = operator;
        this.mainBalance = mainBalance;

        if (operator.equalsIgnoreCase("Jio"))
		{
            offer = "1.5GB/day for 28 days";
        } 
		else if (operator.equalsIgnoreCase("Airtel"))
		{
            offer = "Unlimited calls + 2GB/day";
        } 
		else if (operator.equalsIgnoreCase("VI")) 
		{
            offer = "Weekend data rollover";
        } 
		else 
		{
            offer = "No offer available";
        }
    }

    public void showOffer() 
	{
        System.out.println("Operator: " + operator);
        System.out.println("Offer: " + offer);
    }

    public void recharge(double amount) 
	{
        if (amount <= 0) 
		{
            System.out.println("Invalid recharge amount!");
            return;
        }

        if (mainBalance >= amount)
		{
            mainBalance -= amount;
            System.out.println("Recharge of ₹" + amount + " successful!");
            System.out.println("Remaining Main Balance: ₹" + mainBalance);
        } 
		else 
		{
            System.out.println("Insufficient balance in account!");
        }
    }

  
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main account balance: ₹");
        double balance = sc.nextDouble();

        System.out.println("Select SIM:");
        System.out.println("1. Jio");
        System.out.println("2. Airtel");
        System.out.println("3. VI");

        int choice = sc.nextInt();
        Sim sim = null;

        if (choice == 1) 
		{
            sim = new Sim("Jio", balance);
        } 
		else if (choice == 2) 
		{
            sim = new Sim("Airtel", balance);
        } 
		else if (choice == 3) 
		{
            sim = new Sim("VI", balance);
        } 
		else 
		{
            System.out.println("Invalid choice!");
            System.exit(0);
        }

        sim.showOffer();

        while (true) 
		{
            System.out.println("\n1. Recharge");
            System.out.println("2. Exit");
            int option = sc.nextInt();

            if (option == 1) 
			{
                System.out.print("Enter recharge amount: ₹");
                double amt = sc.nextDouble();
                sim.recharge(amt);
            } 
			else
			{
                System.out.println("Thank you! Exiting...");
                break;
            }
        }
        System.out.println("Final Main Balance: ₹" + sim.mainBalance);

        sc.close();
    }
}