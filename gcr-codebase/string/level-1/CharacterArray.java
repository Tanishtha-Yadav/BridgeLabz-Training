import java.util.*;
public class CharacterArray
{
	public static char[] charArray(String str)
	{
		char s1[]=new char[str.length()];
		for(int i = 0 ; i<str.length();i++)
		{
			s1[i]=str.charAt(i);
		}
		return s1;
	}
	
	public static boolean compareArray(char[] str1,char[] str2)
	{
		if(str1.length!=str2.length)
		{
			return false;
		}
		else
		{
			for(int i = 0 ; i<str1.length;i++)
			{
				if(str1[i]!=str2[i])
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = sc.next();
		char s2Array[]= s1.toCharArray();
		char s1Array[]= charArray(s1);
		System.out.println(Arrays.toString(s1Array));
		System.out.println(Arrays.toString(s2Array));
		System.out.println("Both character arrays are equal : "+compareArray(s1Array,s2Array));
		
		
	}
}