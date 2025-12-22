import java.util.*;
public class IllegalArgumentEx{

    // method to generate Illegal Argument exception
    public static void generateException(String text) 
	{
        // start index > end index
        System.out.println(text.substring(5, 2));
    }

    // method to handle Illegal Argument exception
    public static void handleException(String text)
	{
        try 
		{
            System.out.println(text.substring(5, 2));
        }
        catch (IllegalArgumentException e) 
		{
            System.out.println("IllegalArgumentException caught");
        }
        catch (RuntimeException e) 
		{
            System.out.println("Generic RuntimeException caught");
        }
    }

    public static void main(String[] args)
	{

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        // generates exception
        // generateException(text);   

        // handles the RuntimeException
        handleException(text);
    }
}
