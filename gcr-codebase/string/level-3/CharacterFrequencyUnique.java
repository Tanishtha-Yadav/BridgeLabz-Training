import java.util.*;
public class CharacterFrequencyUnique 
{
    // method to find unique characters 
    public static char[] uniqueCharacters(String text) 
	{
        String unique = "";
        for (int i = 0; i < text.length(); i++) 
		{
            char ch = text.charAt(i);
            if (unique.indexOf(ch) == -1) 
			{  
                unique += ch;
            }
        }
        return unique.toCharArray(); 
    }

    // method to find frequency of character 
    public static String[][] frequencyOfCharacters(String text) 
	{
        int[] freq = new int[256]; 
        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) 
		{
            freq[text.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) 
		{
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        String[][] freqResult = frequencyOfCharacters(text);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < freqResult.length; i++) 
		{
            System.out.println(freqResult[i][0] + "\t\t" + freqResult[i][1]);
        }

        sc.close();
    }
}
