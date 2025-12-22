import java.util.*;
public class VotingEligibility 
{
    // Method to generate random ages
    public static int[] generateAges(int n)
	{
        int[] ages = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++)
		{
            ages[i] = rand.nextInt(90) + 10; 
        }
        return ages;
    }
    // Method to check voting eligibility
    public static String[][] checkVoting(int[] ages) 
	{
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) 
		{
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) 
			{
                result[i][1] = "false";
            }
			else if (ages[i] >= 18) 
			{
                result[i][1] = "true";
            }
			else 
			{
                result[i][1] = "false";
            }
        }
        return result;
    }

    // Method to display result
    public static void displayResult(String[][] data) 
	{
        System.out.println("Age  Can Vote");
        for (int i = 0; i < data.length; i++) 
		{
            String ageSpace = (data[i][0].length() == 2) ? "    " : "     ";
            System.out.println(data[i][0] + ageSpace + data[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] votingStatus = checkVoting(ages);
        displayResult(votingStatus);
    }
}
