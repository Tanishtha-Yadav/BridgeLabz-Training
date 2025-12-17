import java.util.*;

public class FeeCalculation{
	 public static void main(String[]args){
	 int fee=12500 , discountPercent=10;
	 
	 //created a discount variable to calculate discount
      double discountAmount = (fee * discountPercent) / 100;

     // Calculating final discounted fee
     double finalFee = fee - discountAmount;

	 // Display the result
	 System.out.println("The discount amount is INR " + discountAmount +" and final discounted fee is INR " + finalFee);
	 }
}