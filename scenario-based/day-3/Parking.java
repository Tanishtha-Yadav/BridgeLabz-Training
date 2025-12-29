import java.util.*;
public class Parking
{
    public static void parkingLot(int vacancy)
	{
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Choose an option:");
            System.out.println("1. Park");
            System.out.println("2. Exit");
            System.out.println("3. Show Occupancy");

            int choice = sc.nextInt();

            switch (choice) 
			{
                case 1:
                    if (vacancy > 0) 
					{
                        vacancy--;
                        System.out.println("Vehicle parked. Vacant slots = " + vacancy);
                    } 
					else
					{
                        System.out.println("Parking Full");
                        flag = false;
                    }
                    break;

                case 2:
                    vacancy++;
                    System.out.println("Vehicle exited, Vacant slots: " + vacancy);
                    break;

                case 3:
                    System.out.println("Vacant slots = " + vacancy);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void main(String[] args) 
	{
        int vacancy = 10;
        parkingLot(vacancy);
    }
}
