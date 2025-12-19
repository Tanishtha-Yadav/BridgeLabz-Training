import java.util.*;
public class LeapYearLogical{
    public static void main(String[]args){
		//Scanner Object
        Scanner input=new Scanner(System.in);
		
		//Taking Year as a input
		System.out.println("Enter year: ");
		int year=input.nextInt();
		
		//Checking for Gregorian Calendar
		if(year<1582)
		{
			System.out.println("Leap Year calculation is valid only for year greater than or equals to 1582");
		}
		else
		{
			if(year%400==0||(year%100!=0&&year%4==0))
			{
				System.out.println("It is a Leap Year");
			}
			else
			{
				System.out.println("Not a Leap Year");
			}
		}
		//Closing the Scanner Object
		input.close();	
	}	
}