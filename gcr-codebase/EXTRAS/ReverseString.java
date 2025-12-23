import java.util.*;
public class ReverseString {

	public static String reverseString(String str)
	{
		String temp=str;
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse+=str.charAt(i);
		}
		return "Reverse of "+temp+" is "+reverse;
	}

	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();
		System.out.println(reverseString(str));
	}
}