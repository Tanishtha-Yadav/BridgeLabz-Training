import java.util.*;
public class MostFrequentChar 
{
    // method to find most frequent character
    static char mostFrequentCharacter(String str) 
	{
        int maxCount = 0;
        char maxChar = str.charAt(0);

        for (int i = 0; i < str.length(); i++) 
		{
            int count = 0;

            for (int j = 0; j < str.length(); j++) 
			{
                if (str.charAt(i) == str.charAt(j)) 
				{
                    count++;
                }
            }

            if (count > maxCount && str.charAt(i) != ' ') 
			{
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }
        return maxChar;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.println("Most Frequent Character: '" + mostFrequentCharacter(str) + "'");
    }
}
