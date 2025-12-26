import java.util.*;
public class ResultGenerator 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int subjects = 5;

        for (int i = 1; i <= subjects; i++) 
		{
            System.out.print("Enter marks of subject " + i + ": ");
            total += sc.nextInt();
        }

        int average = total / subjects;
        char grade;

        switch (average / 10) 
		{
            case 10:
            case 9: grade = 'A'; break;
            case 8:
            case 7: grade = 'B'; break;
            case 6: grade = 'C'; break;
            case 5:
            case 4: grade = 'D'; break;
            default: grade = 'F';
        }

        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
