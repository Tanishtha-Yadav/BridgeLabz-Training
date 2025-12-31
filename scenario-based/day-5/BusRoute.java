import java.util.*;

public class BusRoute
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int totalDistance = 0;
        char stop;

        while(true)
        {
            System.out.print("Enter distance for next stop (km): ");
            int distance = sc.nextInt();
            totalDistance += distance;

            System.out.print("Do you want to get off? (y/n): ");
            stop = sc.next().charAt(0);

            if(stop == 'y' || stop == 'Y')
                break;
        }

        System.out.println("Total distance travelled: " + totalDistance + " km");
    }
}
