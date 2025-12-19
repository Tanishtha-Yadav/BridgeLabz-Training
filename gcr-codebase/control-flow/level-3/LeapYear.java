import java.util.*;
public class LeapYear{
    public static void main(String[]args){
		//Scanner Object
        Scanner sc = new Scanner(System.in);
		
		//Year as a input
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		
		//Checking for Gregorian Calendar
		if(year<1582)
		{
			System.out.println("Leap Year calculation is valid only for year greater than or equals to 1582");
		}
		else
		{
			//Multiple if-else statements
			if(year%400==0)
			{
                System.out.println("Year is a Leap Year");
            }
			else if(year%100==0)
			{
                System.out.println("Year is not a Leap Year");
            }
			else if(year%4==0)
			{
                System.out.println("Year is a Leap Year");
            } 
			else
			{
                System.out.println("Year is not a Leap Year");
            }
		}
		//Closing the scanner Object
		sc.close();
	}	
}