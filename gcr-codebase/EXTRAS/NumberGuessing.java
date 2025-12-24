import java.util.*;
public class NumberGuessing 
{
    static int generateGuess(int low, int high) 
	{
        return new Random().nextInt(high - low + 1) + low;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback;

        System.out.println("Think of a number between 1 and 100");

        while (true) 
		{
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);
            System.out.print("Enter feedback (low/high/correct): ");
            feedback = sc.next();

            if (feedback.equalsIgnoreCase("correct"))
			{
                break;
			}
            else if (feedback.equalsIgnoreCase("low"))
			{
                low = guess + 1;
			}
            else if (feedback.equalsIgnoreCase("high"))
			{
                high = guess - 1;
			}
        }
        System.out.println("Number guessed successfully!");
    }
}
