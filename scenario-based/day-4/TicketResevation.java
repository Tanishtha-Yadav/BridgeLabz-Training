import java.util.*;
public class TicketResevation
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int totalSeats = 10;
		boolean flag = true;
		while(true)
		{
			System.out.println("1. Book Ticket");
			System.out.println("2. Show available seats");
			System.out.println("3. Exit");
			System.out.println("Enter your choice: (1,2 or 3)");
			int choice = input.nextInt();
			
			switch(choice)
			{
				case 1:
					if(totalSeats > 0)
					{
	                System.out.println("Your ticket is booked"); 
					totalSeats--;
					}
				break;
				case 2:
					System.out.println("Total seats available : "+totalSeats);
				break;
				case 3:
					System.out.println("Exit program");
				break;
				default:
				{
					System.out.println("Invalid input");
				}
			}
		}
	}
}