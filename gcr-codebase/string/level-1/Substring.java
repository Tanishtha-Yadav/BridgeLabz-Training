import java.util.*;
public class Substring
{
	public static String subString(String str,int startIndex,int endIndex)
	{
		String result = "";
		for(int i= startIndex; i<endIndex; i++)
		{
			result += str.charAt(i);
		}
		return result;
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
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.next();
		System.out.println("Enter substring start index : ");
		int startIndex = sc.nextInt();
		System.out.println("Enter substring end index : ");
		int endIndex = sc.nextInt();
		
		String substringUser = subString(str,startIndex,endIndex);
		String substringBuiltIn = str.substring(startIndex,endIndex);
		
		System.out.println(substringUser);
		System.out.println(substringBuiltIn);
		
		System.out.println("Both the substring are same : ");
		System.out.println(compareToStrings(substringUser, substringBuiltIn));
		
		
		
		
	}
}