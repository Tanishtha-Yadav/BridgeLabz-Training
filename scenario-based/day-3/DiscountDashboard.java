// 8. Shopkeeper’s Discount Dashboard 🛍️
// A shopkeeper gives discounts based on total bill:
// ● Input item prices in a for-loop.
// ● Use if-else for discount logic.
// ● Use proper indentation, constants, and comments.

import java.util.*;
public class DiscountDashboard{

	public static void billCalculator()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter quantity: ");
		
		int quantity = sc.nextInt();
		String itemList[] = new String [quantity];
		int priceList[] = new int [quantity];
		int total = 0;
		
		for(int i=0;i<quantity;i++)
		{
			System.out.println("Enter Item : ");
			itemList[i]=sc.next();
			System.out.println("Enter Price : ");
			priceList[i]=sc.nextInt();
			total+=priceList[i];
		}
		int totalBill=0;
		if(total>=500)
		{
			totalBill=((total/100)*90);
		}
		else
		{
			totalBill=total;
		}
		
		System.out.println("No"+"  Items  "+" Price ");
		
		for(int i=0;i<quantity;i++)
		{
			System.out.println(i+1+"   "+itemList[i]+"   "+priceList[i]);
		}
		
		System.out.println("Total Bill : " + totalBill);
		
		
	}
	
	
	public static void main(String[]args)
	{
		billCalculator();
	}
}