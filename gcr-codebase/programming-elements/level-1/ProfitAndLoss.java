import java.util.*;

public class ProfitAndLoss{
	public static void main(String[]args){	
		int costPrice=129 , sellingPrice=191;
		
		// variable for calculation of profit or loss
		int profit=sellingPrice-costPrice;
		
		// variable for calculation of profit percentage
		double profitPercentage = ((double) profit / costPrice) * 100;
		
		//Displaying costprice selling price 
		System.out.println("The Cost Price is INR "+ costPrice+" and Selling Price is INR "+ sellingPrice);
		//displaying profit and profitPercentage
		System.out.println("The Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage);
	}
}