import java.util.*;
public class CountVowelsConsonants
{
	public static String countVowelsConsonants(String str)
	{
		int vowel =0;
		int consonant = 0;
		for (int i = 0; i < str.length(); i++) 
		{
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
			{
                vowel++;
            } 
			else 
			{
				consonant++;
            }
        }
		return ("Vowels : "+vowel+" and Consonants :"+consonant);
		
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		String strLowerCase = str.toLowerCase();
		System.out.println(countVowelsConsonants(strLowerCase));
	}
}