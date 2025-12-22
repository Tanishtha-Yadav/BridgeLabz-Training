import java.util.*;
public class UniqueCharacters
{
    // Method to find string length 
    public static int stringLength(String str)
	{
        int count = 0;
        try 
		{
            while (true) 
			{
                str.charAt(count);
                count++;
            }
        } 
		catch (Exception e) 
		{
            // Reached end of string
        }
        return count;
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueChars(String str) 
	{
        int len = stringLength(str);
        char[] temp = new char[len];
        int uniqueCount = 0;
        for (int i = 0; i < len; i++) 
		{
            char current = str.charAt(i);
            boolean isUnique = true;
           
            for (int j = 0; j < uniqueCount; j++)
			{
                if (temp[j] == current) 
				{
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) 
			{
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Create final array of exact size
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++)
		{
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        char[] unique = findUniqueChars(input);

        System.out.println("Unique characters in the string:");
        for (char c : unique) 
		{
            System.out.print(c + " ");
        }
    }
}
