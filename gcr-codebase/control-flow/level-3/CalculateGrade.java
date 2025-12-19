import java.util.*;
public class CalculateGrade{
	public static void main(String[] args){
		//Scanner Object
        Scanner input = new Scanner(System.in);
		
		//input marks
		System.out.println("Enter Physics marks: ");
		int physicsMarks = input.nextInt();
		System.out.println("Enter Chemistry marks: ");
		int chemistryMarks = input.nextInt();
		System.out.println("Enter Maths marks: ");
		int mathsMarks = input.nextInt();
		
		//Computing average
		double average=(physicsMarks+chemistryMarks+mathsMarks)/3.0;
		
		char grade;
		String remarks;
		
		//Grade Calculation
		if(average>=80)
		{
			grade='A';
			remarks= "Level 4, above agency-normalized standards";
		}
		else if(average>=70)
		{
			grade = 'B';
			remarks = "Level 3, at agency-normalized standards";
		}
		else if(average>=60)
		{
			grade = 'C';
			remarks = "Level 2, below, but approaching agency-normalized standards";
		}	
		else if(average>=50)
		{
			grade = 'D';
			remarks = "Level 1, well below agency-normalized standards";
		}
		else if(average>=40)
		{
			grade = 'E';
			remarks = "Level 1-, too below agency-normalized standards";
		}
		else
		{
			grade = 'R';
			remarks ="Remedial standards";
		}
		//Output
		System.out.println("\nAverage Marks: "+average);
		System.out.println("Grade: "+grade);
		System.out.println("Remarks: "+remarks);
		
		//Closing the Scanner Object
		input.close();
	}
}