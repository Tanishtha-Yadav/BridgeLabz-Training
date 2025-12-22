import java.util.*;
public class OutOfBoundsDemo
{
    // method to generate exception
    public static void generateException(String text) 
	{
        System.out.println(text.charAt(text.length()));
    }

    // method to handle exception
    public static void handleException(String text) 
	{
        try 
		{
            System.out.println(text.charAt(text.length()));
        } 
		catch (StringIndexOutOfBoundsException e) 
		{
            System.out.println("String Index Out Of Bounds Exception caught");
        }
    }

    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Call method that generates exception
        // generateException(text);  

        // Call method that handles the RuntimeException
        handleException(text);
    }
}
