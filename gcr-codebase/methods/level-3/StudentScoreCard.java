import java.util.*;
public class StudentScoreCard 
{
    // Method to generate random 2-digit PCM scores
    public static int[][] generatePCMScores(int students)
	{
        int[][] scores = new int[students][3];
        Random rand = new Random();

        for (int i = 0; i < students; i++)
		{
            scores[i][0] = 10 + rand.nextInt(90); 
            scores[i][1] = 10 + rand.nextInt(90); 
            scores[i][2] = 10 + rand.nextInt(90); 
        }
        return scores;
    }

    // Method to calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) 
	{
        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++)
		{
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] scores, double[][] results)
	{
        System.out.println("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) 
		{
            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t\t" +
                    scores[i][2] + "\t" +
                    results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2]);
        }
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] pcmScores = generatePCMScores(students);
        double[][] results = calculateResults(pcmScores);

        displayScoreCard(pcmScores, results);

        sc.close();
    }
}
