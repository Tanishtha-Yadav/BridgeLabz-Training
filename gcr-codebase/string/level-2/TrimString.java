import java.util.Scanner;
public class TrimString 
{
    // Method to find start and end index 
    public static int[] findTrimIndexes(String text) 
	{
        int start = 0;
        int end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') 
		{
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') 
		{
            end--;
        }
        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) 
	{
        String result = "";
        for (int i = start; i <= end; i++) 
		{
            result = result + text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) 
	{
        if (s1.length() != s2.length()) 
		{
            return false;
        }
        for (int i = 0; i < s1.length(); i++) 
		{
            if (s1.charAt(i) != s2.charAt(i)) 
			{
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with spaces:");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);
        String trimmedText = createSubstring(input, indexes[0], indexes[1]);

        String builtInTrim = input.trim();

        boolean result = compareStrings(trimmedText, builtInTrim);

        System.out.println("Trimmed Text (User Defined): [" + trimmedText + "]");
        System.out.println("Trimmed Text (Built-in):     [" + builtInTrim + "]");
        System.out.println("Are both results same? " + result);
    }
}
