import java.util.*;
public class ArrayIndexOutOfBounds
{

    // method to generate exception
    public static void generateException(String[] names)
	{
        System.out.println(names[names.length]);
    }

    // method to handle exception
    public static void handleException(String[] names) 
	{
        try 
		{
            System.out.println(names[names.length]);
        }
        catch (ArrayIndexOutOfBoundsException e)
		{
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
        catch (RuntimeException e)
		{
            System.out.println("Generic RuntimeException caught");
        }
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) 
		{
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        // generates exception
        // generateException(names);   

        // handles the RuntimeException
        handleException(names);
    }
}
