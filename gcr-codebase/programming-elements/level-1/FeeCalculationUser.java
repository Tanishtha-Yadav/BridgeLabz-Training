import java.util.Scanner;
public class FeeCalculationUser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // fee input
        System.out.println("Enter Fee Amount:");
        double fee = input.nextDouble();
        // discount percentage input
        System.out.println("Enter Discount Percentage:");
        double discountPercent = input.nextDouble();

        // Calculate discount amount
        double discountAmount = (fee * discountPercent) / 100;
        // Calculate final discounted fee
        double finalFee = fee - discountAmount;

        // Display result
        System.out.println("The discount amount is INR " + discountAmount +" and final discounted fee is INR " + finalFee);

        // close scanner
        input.close();
    }
}
