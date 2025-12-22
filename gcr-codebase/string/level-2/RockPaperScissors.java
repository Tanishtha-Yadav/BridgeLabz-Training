import java.util.*;
public class RockPaperScissors
{
    public static String getComputerChoice()
	{
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "Rock";
        else if (choice == 1) return "Paper";
        else return "Scissors";
    }

    // Method to find winner
    public static String findWinner(String user, String computer) 
	{
        if (user.equals(computer)) return "Draw";
        if (user.equals("Rock")) return (computer.equals("Scissors")) ? "User" : "Computer";
        else if (user.equals("Paper")) return (computer.equals("Rock")) ? "User" : "Computer";
        else return (computer.equals("Paper")) ? "User" : "Computer";
    }

    // Method to calculate
    public static String[] calculateStats(int userWins, int computerWins, int draws, int totalGames)
	{
        int userPercent = (userWins * 100) / totalGames;
        int compPercent = (computerWins * 100) / totalGames;
        int drawPercent = (draws * 100) / totalGames;
        return new String[]
		{
            "Total Games: " + totalGames,
            "User Wins: " + userWins + " (" + userPercent + "%)",
            "Computer Wins: " + computerWins + " (" + compPercent + "%)",
            "Draws: " + draws + " (" + drawPercent + "%)"
        };
    }

    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        int userWins = 0, computerWins = 0, draws = 0;
        for (int i = 0; i < n; i++) 
		{
            System.out.print("Enter your choice for game " + (i+1) + " (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine();
            while (!userChoice.equals("Rock") && !userChoice.equals("Paper") && !userChoice.equals("Scissors")) 
			{
                System.out.print("Invalid input. Enter Rock, Paper, or Scissors: ");
                userChoice = sc.nextLine();
            }

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;
            System.out.println("Game " + (i+1) + ": User=" + userChoice + ", Computer=" + computerChoice + ", Winner=" + winner);
        }

        // Display overall
        String[] stats = calculateStats(userWins, computerWins, draws, n);
        System.out.println("Game Statistics:");
        for (String s : stats) 
		{
            System.out.println(s);
        }
    }
}
