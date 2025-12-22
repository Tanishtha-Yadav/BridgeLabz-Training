import java.util.*;
public class LowerCaseCompare 
{
    public static String toLowerCaseManual(String text)
	{
        String result = "";
        for (int i = 0; i < text.length(); i++)
		{
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') 
			{
                ch = (char) (ch + 32); 
            }
            result += ch;
        }
        return result;
    }

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

        // User-defined lowercase conversion
        String manualLower = toLowerCaseManual(text);

        // Built-in lowercase conversion
        String builtInLower = text.toLowerCase();

        System.out.println("Lowercase using charAt(): " + manualLower);
        System.out.println("Lowercase using toLowerCase(): " + builtInLower);

        // Compare results
        System.out.println("Both results are same: "+ compareStrings(manualLower, builtInLower));
    }
}
