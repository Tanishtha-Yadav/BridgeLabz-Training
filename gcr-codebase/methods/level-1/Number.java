import java.util.*;
public class Number{

	// method for number checking
	public int numberCheck(int number)
	{
		if(number>0)
		{
			return 1;
		}
		else if(number<0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

	// main method
	public static void main(String[]args)
	{
		// Scanner class object for user input
		Scanner sc = new Scanner(System.in);
		
		// user input 
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		// class oj=bject creation
		Number num = new Number();
		
		// method calling using class object 
		System.out.println(num.numberCheck(number));
	}
}