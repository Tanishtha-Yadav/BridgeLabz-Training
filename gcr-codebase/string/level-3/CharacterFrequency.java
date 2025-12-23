import java.util.*;
public class CharacterFrequency 
{
    // method to find frequency
    public static String[][] findCharFrequency(String str) 
	{
        int[] freq = new int[256]; 
        for (int i = 0; i < str.length(); i++)
		{
            char c = str.charAt(i);
            freq[c]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) 
		{
            if (freq[i] > 0) uniqueCount++;
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) 
		{
            if (freq[i] > 0) 
			{
                result[index][0] = Character.toString((char)i);
                result[index][1] = Integer.toString(freq[i]);
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        String[][] frequencies = findCharFrequency(input);

        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++)
		{
            System.out.println(frequencies[i][0] + ": " + frequencies[i][1]);
        }
    }
}
