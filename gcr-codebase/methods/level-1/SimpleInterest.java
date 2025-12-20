import java.util.*;
public class SimpleInterest{
	
	public String calculateSimpleInterest(double principal, double rate, double time)
	{
		double result = (principal*rate*time)/100;
		
		return "The Simple Interest is "+result+" for Principal " +principal+" Rate of Interest "+rate+" and Time "+ time;
	}
	

	public static void main(String[]args)
	{
		// Creating Scanner class input
		Scanner sc = new Scanner(System.in);
		
		// user input of principal, Rate, Time
		System.out.println("Enter principal amount : ");
		double principal = sc.nextInt();
		System.out.println("Enter rate of interest : ");
		double rate = sc.nextInt();
		System.out.println("Enter time : ");
		double time = sc.nextInt();
		
		SimpleInterest simpleInterest = new SimpleInterest();
		
		System.out.println(simpleInterest.calculateSimpleInterest(principal,rate,time));
		
		
		
		
	
	}
}