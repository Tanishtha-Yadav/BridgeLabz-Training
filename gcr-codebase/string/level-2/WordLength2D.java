import java.util.*;
public class WordLength2D 
{
    // Method to find length of a string user defined 
    public static int findLength(String text) 
	{
        int count = 0;
        try 
		{
            while (true)
			{
                text.charAt(count);
                count++;
            }
        } 
		catch (StringIndexOutOfBoundsException e)
		{
            // stop counting
        }
        return count;
    }

    // Method to split text into words using charAt()
    public static String[] splitText(String text) 
	{
        int length = findLength(text);

        // Count words
        int wordCount = 1;
        for (int i = 0; i < length; i++)
		{
            if (text.charAt(i) == ' ') 
			{
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndex = new int[wordCount + 1];
        spaceIndex[0] = -1;

        int index = 1;
        for (int i = 0; i < length; i++) 
		{
            if (text.charAt(i) == ' ') 
			{
                spaceIndex[index++] = i;
            }
        }
        spaceIndex[index] = length;

        // Extract words
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++)
		{
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) 
			{
                word += text.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    // Method to create 2D array of words and their lengths
    public static String[][] createWordLengthArray(String[] words) 
	{

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++)
		{
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter complete text:");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] wordLength = createWordLengthArray(words);

        System.out.println("\nWord\tLength");
     

        for (int i = 0; i < wordLength.length; i++)
		{
            int length = Integer.parseInt(wordLength[i][1]);
            System.out.println(wordLength[i][0] + "\t" + length);
        }
    }
}
