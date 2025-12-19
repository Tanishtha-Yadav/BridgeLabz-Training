import java.util.*;
public class StudentAge{
	public static void main(String[]args)
	{
		// user input object scanner
		Scanner sc = new Scanner(System.in);
		
		// user input arrays
		int age[]=new int[10];
		System.out.println("Enter the age of 10 students : ");
		for(int i=0;i<age.length;i++)
		{
			age[i]=sc.nextInt();
			if(age[i]<0)
			{
				System.out.println("An invalid age");
			}
			else if(age[i]>=18)
			{
				System.out.println("The student with the age "+age[i]+" can vote");
			}
			else 
			{
				System.out.println("The student with the age "+age[i]+" cannot vote");
			}
		}
		sc.close();
	}


}