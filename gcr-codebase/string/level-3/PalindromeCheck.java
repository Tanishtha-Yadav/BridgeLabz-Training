import java.util.*;
public class PalindromeCheck 
{
    public static boolean isPalindrome(String text) 
	{
        int start = 0;
        int end = text.length() - 1;
        while (start < end) 
		{
            if (text.charAt(start) != text.charAt(end)) 
			{
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) 
	{
        if (start >= end) 
		{
			return true;
		}
        if (text.charAt(start) != text.charAt(end))
		{	
			return false;
		}
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeCharArray(String text)
	{
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];

        for (int i = 0; i < original.length; i++) 
		{
            reversed[i] = original[original.length - 1 - i];
        }

        for (int i = 0; i < original.length; i++) 
		{
            if (original[i] != reversed[i]) 
			{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text to check palindrome:");
        String text = sc.nextLine();

        boolean result1 = isPalindrome(text);
        System.out.println("Iterative check: " + (result1 ? "Palindrome" : "Not Palindrome"));

        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Recursive check: " + (result2 ? "Palindrome" : "Not Palindrome"));

        boolean result3 = isPalindromeCharArray(text);
        System.out.println("Char array check: " + (result3 ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}
