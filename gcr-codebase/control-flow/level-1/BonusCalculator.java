import java.util.*;
public class BonusCalculator{
	public static void main(String[]args){
	// Scanner class object for user input
	Scanner sc = new Scanner(System.in);

	// user input
	System.out.println("Enter your salary : ");
	int salary = sc.nextInt();
	
	//logic
	System.out.println("Enter your Year of Service : ");
	int yearOfService = sc.nextInt();
	int bonus=5;
 
	if(yearOfService>5)
	{
		int bonusAmount=(salary/100)*bonus;
		System.out.println("Bonus Amount : "+bonusAmount);
	}
	else 
	{
		System.out.println("You are not eligible for bonus");
	}
	
	sc.close();
	}
}