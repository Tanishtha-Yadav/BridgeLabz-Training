import java.util.Scanner;
public class PurchasePrice{
    public static void main(String[] args){
		// Scanner object for user input
        Scanner sc = new Scanner(System.in);

		// User input
        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

		//Calculation of total price
        double totalPrice = unitPrice * quantity;

		// Displaying result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}