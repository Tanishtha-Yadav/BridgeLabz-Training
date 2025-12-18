import java.util.*;
public class EvenOdd{
	public static void main(String[]args){
	// Scanner class object for user input
	Scanner sc = new Scanner(System.in);

	// user input
	System.out.println("Enter the number : ");
	int number = sc.nextInt();
	
	if(number>0)
	{
		for(int i =1;i<=number;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" is an even number");
			}
			else
			{
				System.out.println(i+" is a odd number");
			}
		}
	}
	sc.close();
	}
}