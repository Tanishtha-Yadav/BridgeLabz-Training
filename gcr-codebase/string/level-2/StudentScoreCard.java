import java.util.*;
public class StudentScoreCard 
{
    // Generate random marks 
    public static int[][] generateScores(int n)
	{
        int[][] scores = new int[n][3];
        Random rand = new Random();
        for (int i = 0; i < n; i++) 
		{
            scores[i][0] = rand.nextInt(101); 
            scores[i][1] = rand.nextInt(101); 
            scores[i][2] = rand.nextInt(101); 
        }
        return scores;
    }

    // Calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) 
	{
        int n = scores.length;
        double[][] results = new double[n][3];

        for (int i = 0; i < n; i++) 
		{
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = Math.round((total / 3.0) * 100.0) / 100.0;
            double percentage = Math.round((total / 300.0 * 100) * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Assign grade
    public static String[] calculateGrade(double[][] results)
	{
        int n = results.length;
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) 
		{
            double percent = results[i][2];

            if (percent >= 80)
			{
				grades[i] = "A";
			}
            else if (percent >= 70)
			{
				grades[i] = "B";
			}
            else if (percent >= 60)
			{	
				grades[i] = "C";
			}
            else if (percent >= 50)
			{
				grades[i] = "D";
			}	
            else if (percent >= 40)
			{
				grades[i] = "E";
			}
            else grades[i] = "R";
        }
        return grades;
    }

    public static void main(String[] args)
	{
        int n = 5;
        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrade(results);

        // printout
        for (int i = 0; i < n; i++)
		{
            System.out.println("Student " + (i+1));
            System.out.println("Physics: " + scores[i][0]);
            System.out.println("Chemistry: " + scores[i][1]);
            System.out.println("Maths: " + scores[i][2]);
            System.out.println("Total: " + (int)results[i][0]);
            System.out.println("Average: " + results[i][1]);
            System.out.println("Percentage: " + results[i][2]);
            System.out.println("Grade: " + grades[i]);
            System.out.println(); 
        }
    }
}
