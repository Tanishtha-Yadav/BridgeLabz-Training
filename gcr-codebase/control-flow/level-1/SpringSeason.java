import java.util.*;
public class SpringSeason{
	public static void main(String[]args){
		// Scanner class object for user input
		Scanner sc = new Scanner(System.in);
		
		// User input
		System.out.println("Enter the number of month : ");
		int month = sc.nextInt();
		System.out.println("Enter day : ");
		int day = sc.nextInt();
		
		// Condition check
		if(month==3 && (day>=20 && day<=31) || 	month==4 && (day>=1 && day<=30) ||
			month==5 && (day>=1 && day<=31) || month==6 && (day>=1 && day<=20))
				{
					System.out.println("Its a spring season");
				}
		else
		{
			System.out.println("Not a Spring Season");
		}	

		sc.close();
	}
}