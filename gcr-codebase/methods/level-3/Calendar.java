import java.util.*;
public class Calendar 
{
    // Method to get month name
    public static String getMonthName(int month) 
	{
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August","September", "October", "November", "December"};
        return months[month - 1];
    }

    // Method to check leap year
    public static boolean isLeapYear(int year) 
	{
        if (year < 1582) 
		{
            return false;
        }
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Method to get number of days in month
    public static int getDaysInMonth(int month, int year) 
	{
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) 
		{
            return 29;
        }
        return days[month - 1];
    }

    // Method to get first day of the month (0 = Sunday)
    public static int getFirstDay(int month, int year)
	{
        int d = 1;
        int y = year;
        int m = month;

        if (m < 3) 
		{
            m += 12;
            y--;
        }

        int k = y % 100;
        int j = y / 100;

        int day = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        // Convert Zeller result to Sunday=0
        return (day + 6) % 7;
    }

    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.println("\n   " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        // First loop for indentation
        for (int i = 0; i < firstDay; i++) 
		{
            System.out.print("    ");
        }

        // Second loop to print days
        for (int day = 1; day <= daysInMonth; day++) 
		{
            System.out.printf("%3d ", day);

            if ((day + firstDay) % 7 == 0)
			{
                System.out.println();
            }
        }

        sc.close();
    }
}
