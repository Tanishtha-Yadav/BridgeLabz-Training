import java.util.*;
public class NumberFormat
{
    // method to generate exception
    public static void generateException(String text) 
	{
        int number = Integer.parseInt(text);
        System.out.println(number);
    }

    // Method to handle exception
    public static void handleException(String text) 
	{
        try 
		{
            int number = Integer.parseInt(text);
            System.out.println(number);
        }
        catch (NumberFormatException e) 
		{
            System.out.println("NumberFormatException caught");
        }
        catch (RuntimeException e)
		{
            System.out.println("Generic RuntimeException caught");
        }
    }

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String text = sc.next();

        // generates exception
        // generateException(text);   // uncomment to see abrupt termination

        //handles the RuntimeException
        handleException(text);
    }
}
