import java.util.*;
public class CoffeeCounter
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        String coffeeType;
        double price = 0;
        int quantity;
        double gstRate = 0.05; 

        while (true) 
		{
            System.out.println("\nEnter coffee type (Espresso, Latte, Cappuccino) or type 'exit' to stop:");
            coffeeType = sc.nextLine();

            if (coffeeType.equalsIgnoreCase("exit")) 
			{
                System.out.println("Thank you for visiting Ravi's Café!");
                break;
            }

            System.out.println("Enter quantity:");
            quantity = sc.nextInt();
            sc.nextLine(); 
            switch (coffeeType.toLowerCase()) 
			{
                case "espresso":
				{
                    price = 120;
                    break;
				}
                case "latte":
				{
                    price = 150;
                    break;
				}
                case "cappuccino":
                {
					price = 180;
                    break;
				}
                default:
				{
                    System.out.println("Invalid coffee type!");
                    continue;
				}
            }

            double total = price * quantity;
            double gst = total * gstRate;
            double finalBill = total + gst;

            System.out.println("Total (without GST): ₹" + total);
            System.out.println("GST (5%): ₹" + gst);
            System.out.println("Final Bill Amount: ₹" + finalBill);
        }

        sc.close();
    }
}