import java.util.*;
public class FirstNonRepeatingChar 
{
    // Method to find the first non-repeating character
    public static char findFirstNonRepeating(String str) 
	{
        int[] freq = new int[256]; 
 
        for (int i = 0; i < str.length(); i++)
		{
            char c = str.charAt(i);
            freq[c]++;
        }

        for (int i = 0; i < str.length(); i++)
		{
            char c = str.charAt(i);
            if (freq[c] == 1) 
			{
                return c;
            }
        }

        return '\0';
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        char result = findFirstNonRepeating(input);

        if (result != '\0') 
		{
            System.out.println("First non-repeating character: " + result);
        } 
		else 
		{
            System.out.println("No non-repeating character found in the string.");
        }
    }
}
