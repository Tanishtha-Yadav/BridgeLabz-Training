import java.util.*;
public class CalendarDisplay 
{
    // method to  get month name
    public static String getMonthName(int month) 
	{
        String[] months = {"January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December"};
        if (month >= 1 && month <= 12) 
		{
            return months[month - 1];
        }
        return "";
    }

    // method to check leap year
    public static boolean isLeapYear(int year) 
	{
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // method to get number of days in a month
    public static int getDaysInMonth(int month, int year) 
	{
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) 
		{
            return 29;
        }
        return days[month - 1];
    }

    // method to get 1st day using gregorian calendar
    public static int getFirstDayOfMonth(int month, int year) 
	{
        int y = year;
        int m = month;
        int d = 1;

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0;
    }

    // method to display result
    public static void displayCalendar(int month, int year) 
	{
        System.out.println("     " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        for (int i = 0; i < firstDay; i++) 
		{
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth; day++) 
		{
            System.out.printf("%3d ", day);

            if ((day + firstDay) % 7 == 0) 
			{
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month :");
        int month = sc.nextInt();

        System.out.println("Enter year:");
        int year = sc.nextInt();

        displayCalendar(month, year);

        sc.close();
    }
}
