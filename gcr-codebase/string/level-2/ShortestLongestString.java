import java.util.*;
public class ShortestLongestString
{
    // Method to find string length user defined functions
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

        int wordCount = 1;
        for (int i = 0; i < length; i++) 
		{
            if (text.charAt(i) == ' ') 
			{
                wordCount++;
            }
        }
        int[] spaceIndex = new int[wordCount + 1];
        spaceIndex[0] = -1;

        int idx = 1;
        for (int i = 0; i < length; i++)
		{
            if (text.charAt(i) == ' ')
			{
                spaceIndex[idx++] = i;
            }
        }
        spaceIndex[idx] = length;
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

    // Method to create 2D array of word and its length (length stored as String)
    public static String[][] createWordLengthArray(String[] words) 
	{
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) 
		{
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }
        return data;
    }

    // Method to find shortest and longest words WITHOUT parseInt
    public static int[] findShortestAndLongest(String[][] data) {

        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < data.length; i++)
		{
            int currentLength = findLength(data[i][0]);
            int shortestLength = findLength(data[shortestIndex][0]);
            int longestLength = findLength(data[longestIndex][0]);

            if (currentLength < shortestLength) 
			{
                shortestIndex = i;
            }
            if (currentLength > longestLength) 
			{
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter complete text:");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] wordData = createWordLengthArray(words);

        int[] result = findShortestAndLongest(wordData);

        System.out.println("\nShortest word: "+ wordData[result[0]][0] + " (Length: "+ wordData[result[0]][1] + ")");

        System.out.println("Longest word: "  + wordData[result[1]][0] +" (Length: "+ wordData[result[1]][1] + ")");
    }
}
