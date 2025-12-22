import java.util.*;
public class SplitTextCompare 
{
    // Method to find length user defined method
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
        // Count number of words
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

    // Method to compare two string arrays
    public static boolean compareArrays(String[] a, String[] b)
	{

        if (a.length != b.length)
		{
            return false;
        }

        for (int i = 0; i < a.length; i++) 
		{
            if (!a[i].equals(b[i])) 
			{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter complete text:");
        String text = sc.nextLine();

        // User-defined split
        String[] manualSplit = splitText(text);

        // Built-in split
        String[] builtInSplit = text.split(" ");

        System.out.println(Arrays.toString(manualSplit));
        System.out.println(Arrays.toString(builtInSplit));

        // Compare results
        System.out.println("Both results are same: "+ compareArrays(manualSplit, builtInSplit));
    }
}
