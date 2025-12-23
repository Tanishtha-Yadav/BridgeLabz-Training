import java.util.*;
public class PalindromeStringCheck
{
	public static boolean palindromeCheck(String str1, String str2)
	{
		if(str1.equals(str2)==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static String reverseString(String str)
	{
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse+=str.charAt(i);
		}
		return reverse;
	}
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();
		String temp = str;
		String strLowerCase = str.toLowerCase();
		
		String reverseStr= reverseString(strLowerCase);
		System.out.println("Is String a palindrome : "+palindromeCheck(temp,reverseStr));
		
		
		
	
	}
}