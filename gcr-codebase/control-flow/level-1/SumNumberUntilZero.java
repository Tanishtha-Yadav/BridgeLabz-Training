import java.util.*;
public class SumNumberUntilZero{
	public static void main(String[]args){
	// Scanner class object for user input
	Scanner sc = new Scanner(System.in);

	// user input
	double total = 0;
	System.out.println("Enter the number : ");
	int number = sc.nextInt();
	
	// while loop for input until user enter zero and adding total
	while(number!=0)
	{
		total+=number;
		System.out.println("Enter the number : ");
		number = sc.nextInt();
	}
	
	// printing total
	System.out.println("Total Value : "+total);
	
	sc.close();
	}
}