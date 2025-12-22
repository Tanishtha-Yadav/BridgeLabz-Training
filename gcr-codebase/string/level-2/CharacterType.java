import java.util.Scanner;
public class CharacterType 
{
    public static String checkCharacter(char ch) 
	{
        if (ch >= 'A' && ch <= 'Z') 
		{
            ch = (char)(ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') 
		{
            if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u') 
			{
                return "Vowel";
            }
			else 
			{
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to create 2D array of character 
    public static String[][] findCharacterTypes(String text) 
	{
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) 
		{
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkCharacter(text.charAt(i));
        }
        return result;
    }

    // Method to display 2D array 
    public static void displayTable(String[][] data) 
	{
        System.out.println("Character\tType");
        for (int i = 0; i < data.length; i++) 
		{
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[][] output = findCharacterTypes(input);
        displayTable(output);
    }
}
