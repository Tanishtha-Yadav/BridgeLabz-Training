import java.util.*;
public class SpringSeason{

	public boolean season(int month, int day)
	{
		if(month==3 && (day>=20 && day<=31) || 	month==4 && (day>=1 && day<=30) ||
			month==5 && (day>=1 && day<=31) || month==6 && (day>=1 && day<=20))
				{
					return true;
				}
		else
		{
			return false;
		}	
	}
	
	// main method
	public static void main(String[]args)
	{
		// Scanner class object for user input
		Scanner sc = new Scanner(System.in);
		
		// user input 
		System.out.println("Enter month");
		int month = sc.nextInt();
		System.out.println("Enter day: ");
		int day = sc.nextInt();
		
		SpringSeason springSeason = new SpringSeason();
		
		boolean result = springSeason.season(month,day);
		
		if(result==true)
		{
			System.out.println("Its a spring season");
		}
		else
		{
			System.out.println("Not a Spring Season");
		}	
	}
}