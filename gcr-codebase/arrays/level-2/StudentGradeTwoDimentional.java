import java.util.*;
public class StudentGradeTwoDimentional{
    public static void main(String[]args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];   
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for(int i = 0; i<n;i++)
		{
            System.out.println("Enter marks for student " + (i + 1));

            System.out.println("Enter Physics marks:");
            marks[i][0] = sc.nextInt();

            System.out.println("Enter Chemistry marks:");
            marks[i][1] = sc.nextInt();

            System.out.println("Enter Maths marks:");
            marks[i][2] = sc.nextInt();

            if(marks[i][0]<0||marks[i][1]<0||marks[i][2]<0)
			{
                System.out.println("Marks must be positive. Enter again.");
                i--;
            }
        }

        for(int i = 0; i<n; i++) 
		{
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total/3.0;

            if(percentage[i]>=80)
			{
                grade[i] = 'A';
			}
            else if(percentage[i]>=70)
			{
                grade[i] = 'B';
			}
            else if(percentage[i]>=60)
			{
				grade[i] = 'C';
			}
            else if(percentage[i]>=50)
			{
                grade[i] = 'D';
			}
            else if(percentage[i]>=40)
			{
                grade[i] = 'E';
			}
            else
			{
                grade[i] = 'R';
			}
        }

        for(int i = 0;i<n;i++) 
		{
            System.out.println("Student " + (i + 1));
            System.out.println("Physics Marks: " + marks[i][0]);
            System.out.println("Chemistry Marks: " + marks[i][1]);
            System.out.println("Maths Marks: " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }

        sc.close();
    }
}
