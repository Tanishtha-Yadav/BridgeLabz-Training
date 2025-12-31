import java.util.*;

public class LuckyDraw
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 5; i++)
        {
            System.out.print("Visitor " + i + ", enter your number: ");
            int num = sc.nextInt();

            if(num <= 0)
            {
                System.out.println("Invalid number");
                continue;
            }

            if(num % 3 == 0 && num % 5 == 0)
                System.out.println("Congratulations! You won a gift 🎁");
            else
                System.out.println("Better luck next time");
        }
    }
}
