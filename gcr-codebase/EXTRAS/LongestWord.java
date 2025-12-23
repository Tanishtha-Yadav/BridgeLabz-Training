import java.util.*;
public class LongestWord 
{
    // method to find the longest word
    public static String longestWord(String str)
	{
        String[] words = str.split(" ");
        String longest = words[0];

        for(int i = 1; i < words.length; i++) 
		{
            if(words[i].length() > longest.length()) 
			{
                longest = words[i];
            }
        }
        return longest;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String result = longestWord(str);
        System.out.println("Longest word: " + result);
    }
}
