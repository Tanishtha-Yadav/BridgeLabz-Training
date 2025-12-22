import java.util.*;
public class StringLengthDemo
{
    public static int findLength(String text) {
        int count = 0;

        try 
		{
            while (true) 
			{
                text.charAt(count); 
                count++;
            }
        } 
		catch (StringIndexOutOfBoundsException e) 
		{
           // System.out.println("Length Exceeds");
        }
        return count;
    }

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        int userDefinedLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length without using length(): " + userDefinedLength);
        System.out.println("Length using built-in method: " + builtInLength);
    }
}
