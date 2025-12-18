import java.util.*;
public class SumNumberZeroNegative{
	public static void main(String[]args){
	// Scanner class object for user input
	Scanner sc = new Scanner(System.in);

	// user input
	double total = 0;
	System.out.println("Enter the number : ");
	int number = sc.nextInt();
	
	// while loop
	while(true)
	{
		if(number<=0)
		{
			break;
		}
		else
		{
			total+=number;
			System.out.println("Enter the number Again : ");
			number = sc.nextInt();
		}
	}
	
	// printing total
	System.out.println("Total Value : "+total);
	
	sc.close();
	}
}