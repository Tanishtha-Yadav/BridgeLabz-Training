import java.util.*;
public class UpperCaseCompare
{
    public static String toUpperCaseManual(String text)
	{
        String result = "";

        for (int i = 0; i < text.length(); i++) 
		{
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z')
			{
                ch = (char) (ch - 32); 
            }
            result += ch;
        }
        return result;
    }

    // method to compare two strings using charAt()
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

    public static void main(String[] args)
	{

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter complete text:");
        String text = sc.nextLine();

        // User-defined uppercase conversion
        String manualUpper = toUpperCaseManual(text);

        // Built-in uppercase conversion
        String builtInUpper = text.toUpperCase();

        System.out.println("Uppercase using charAt(): " + manualUpper);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpper);

        // Compare results
        System.out.println("Both results are same: "+ compareStrings(manualUpper, builtInUpper));
    }
}
