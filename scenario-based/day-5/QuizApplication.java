import java.util.*;
public class QuizApplication
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String question[] = {
            "1. What is Tailwind CSS?",
            "2. Which Tailwind class is used to apply padding on all sides?",
            "3. Which class makes text center aligned in Tailwind CSS?",
            "4. How do you apply a background color in Tailwind CSS?",
            "5. Which Tailwind class is used to make text bold?"
        };

        String option[] = {
            "1.A JavaScript framework 2.A component-based CSS library 3.A utility-first CSS framework 4.A CSS preprocessor",
            "1.margin-4 2.p-4 3.pad-4 4.space-4",
            "1.align-center 2.text-middle 3.text-center 4.center-text",
            "1.color-blue-500 2.bg-blue 3.background-blue-500 4.bg-blue-500",
            "1.text-bold 2.font-weight-bold 3.font-bold 4.bold-text"
        };

        int answer[] = {3, 2, 3, 4, 3};
        int score = 0;

        for(int i = 0; i < 5; i++)
        {
            System.out.println(question[i]);
            System.out.println(option[i]);
            System.out.print("Choose the correct option: ");

            int ans = sc.nextInt();

            switch(answer[i])
            {
                case 1:
                    if(ans == 1) score++;
                    break;

                case 2:
                    if(ans == 2) score++;
                    break;

                case 3:
                    if(ans == 3) score++;
                    break;

                case 4:
                    if(ans == 4) score++;
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }

        System.out.println("Your score is: " + score);
    }
}
