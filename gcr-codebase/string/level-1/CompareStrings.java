import java.util.*;
public class CompareStrings
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first string: ");
		String s1 = input.next();
		System.out.println("Enter second string: ");
		String s2 = input.next();
		
		boolean compareUsingCharAt = compareToStrings(s1, s2);
	
		boolean compareUsingEqual = s1.equals(s2);
		
		System.out.println("Compare Using CharAt : " +compareUsingCharAt);
		System.out.println("Compare Using Equal : " +compareUsingEqual);
		
		if(compareUsingCharAt == compareUsingEqual)
		{
			System.out.println("Results are same");
		}
		else
		{
			System.out.println("Results are different");
		}	
	}
	
	public static boolean compareToStrings(String s1, String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) != s2.charAt(i))
			{
				return false;
			}
		}
		return true;
	}
}