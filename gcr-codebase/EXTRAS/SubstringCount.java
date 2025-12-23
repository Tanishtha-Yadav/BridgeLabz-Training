import java.util.*;
public class SubstringCount 
{
    // method to count occurrences
    static int countOccurrences(String str, String sub)
	{
        int count = 0;
        for (int i = 0; i <= str.length() - sub.length(); i++)
		{
            if (str.substring(i, i + sub.length()).equals(sub))
			{
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String str = sc.nextLine();

        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        int result = countOccurrences(str, sub);
        System.out.println("Occurrences: " + result);
    }
}
