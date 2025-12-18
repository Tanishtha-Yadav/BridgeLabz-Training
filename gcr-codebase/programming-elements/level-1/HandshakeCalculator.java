import java.util.Scanner;
public class HandshakeCalculator{
    public static void main(String[] args){
		// Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Formula: (n * (n - 1)) / 2
        // Each of the 'n' people can shake hands with 'n-1' people. 
        // We divide by 2 because a handshake between Person A and B is the same as B and A.
        int handshakes = (n * (n - 1)) / 2;

		// Display message
        System.out.println("The maximum number of possible handshakes among " + n + " students is " + handshakes);
    }
}