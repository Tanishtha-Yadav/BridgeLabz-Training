import java.util.*;
public class Handshakes{

	// method for maximum handshake calculation
	public int maximumHandshakes(int n)
	{
		System.out.print("Maximum Handshakes : ");
		return (n * (n - 1)) / 2;  
	}	
	
	// main method
	public static void main(String[]args)
	{
		// Scanner object for user input
		Scanner sc = new Scanner(System.in);
		
		// user input
		System.out.println("Enter the number of students : ");
		int numberOfStudents=sc.nextInt();
		
		// class object for method Calling
		
		Handshakes handshake = new Handshakes();
		
		// method calling and printing of returned result
		System.out.println(handshake.maximumHandshakes(numberOfStudents));
		
		
	}
}